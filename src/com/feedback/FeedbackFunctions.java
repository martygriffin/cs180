package com.feedback;

import net.tanesha.recaptcha.ReCaptchaImpl;
import net.tanesha.recaptcha.ReCaptchaResponse;

import com.hibernate.Feedback;
import com.hibernate.FeedbackDAO;
import com.hibernate.Item;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;

import com.hibernate.Log;
import com.menu.MenuForm;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;

import java.sql.Timestamp;
import java.util.List;
import java.util.regex.Pattern;



public class FeedbackFunctions extends BaseAction  implements ModelDriven, Preparable {

	private FeedbackForm form = new FeedbackForm();
	private FeedbackDAO FeedbackForm  = new FeedbackDAO();
	private Feedback feedback = new Feedback();
	private ArrayList ratingList;
	
	public String execute() throws SBRException {
		return "success";
	}
	
	public String viewActiveFeedback() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setFeedback(svc.getAllActiveFeedback());
		return "view";
	}
	
	public String viewPublicFeedback() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setFeedback(svc.getAllActiveFeedback());
		return "public_view";
	}
	
	public String viewDeletedFeedback() {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setFeedback(svc.getAllDeletedFeedback());
		return "view_deleted";
	}
	
	public String feedbackActive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Feedback tempfeedback = svc.getFeedbackByID(id);
		tempfeedback.setIsActive(true);
		svc.saveFeedback(tempfeedback);
		String temp = "Feedback " + id + " undeleted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "undeleted";
	}
	
	public String feedbackInactive() {
		int id = Integer.valueOf(getParameter("id"));
		CCRService svc = (CCRService)getService("CCRService");
		Feedback tempfeedback = svc.getFeedbackByID(id);
		tempfeedback.setIsActive(false);
		svc.saveFeedback(tempfeedback);
		String temp = "Feedback " + id +" delted";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
		return "deleted";
	}
	
	public String addFeedback()throws SBRException
	{
		

		if(checkAddFormForErrors())
       	{	
			ratingList = new ArrayList<Integer>();
			for( int i = 1; i<=5; i++) {
				ratingList.add(i);
			}
			form.setRatingList(ratingList);

			return "erroradd";
       	}
		String name = form.getName();
		String text = form.getText();
		String reviewName = form.getReviewName();
		Integer rating = form.getRating();
	
		
		CCRService svc = (CCRService)getService("CCRService");	

		//update for rating field
		com.hibernate.Feedback to_insert = new com.hibernate.Feedback(text,name, true, reviewName,rating);

	
		to_insert.setName(name);

		svc.saveFeedback(to_insert);
		String temp = "Review " + reviewName +" added";
		 java.util.Date date= new java.util.Date();
		Timestamp t = new Timestamp(date.getTime());
		Log l = new Log (temp, t);
		svc.saveLogEntry(l);
			
		return "added";
	}
	
	public boolean checkAddFormForErrors()
	{
		// Validate the reCAPTCHA
		
		String remoteAddr = req.getRemoteAddr();
		ReCaptchaImpl reCaptcha = new ReCaptchaImpl();
		String challenge = req.getParameter("recaptcha_challenge_field");
        String uresponse = req.getParameter("recaptcha_response_field");
        
		// Probably don't want to hardcode your private key here but
		// just to get it working is OK...
		reCaptcha.setPrivateKey("6Lcrys4SAAAAAJ7LMCzywQjcAMv4PQHqMqmJu2JZ");

		ReCaptchaResponse reCaptchaResponse =
		reCaptcha.checkAnswer(remoteAddr, challenge, uresponse);
		
		
		boolean error = false;
		String reviewName = form.getReviewName();
		String name = form.getName();
		String text = form.getText();
		
		if (!reCaptchaResponse.isValid() ) {
			addActionError("Captcha Entered Incorrectly");
			if(!error) {
				error = true;
			}
		}
		if(reviewName.isEmpty())
		{
			 addActionError("Feedback Subject must be filled out");
			 if(!error)
			 {
				 error=true;
			 }
		}
		else if (reviewName.length() > 500 ) {
			addActionError("Feedback Subject must be less than 500 characters");
			if (!error) {
				error=true;
			}
		}
		
		if(text.isEmpty())
		{
			 addActionError("Feedback must be filled out");
			 if(!error)
			 {
				 error=true;
			 }
		}
		
		else if (text.length() > 1000 ) {
			addActionError("Feedback must be less than 1000 characters");
			if (!error) {
				error=true;
			}
		}
		if(!name.isEmpty() && name.length() > 40 ) {
			addActionError("Name is optional but must be less than 40 characters");
			if (!error) {
				error=true;
			}
		}
		return error;
	}

	
	public String populate() {

		ratingList = new ArrayList<Integer>();
		for( int i = 1; i<=5; i++) {
			ratingList.add(i);
		}
		form.setRatingList(ratingList);

		return "populate";
	}



	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(FeedbackForm  form) {
		this.form = form;
	}
	public FeedbackForm  getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}

}

