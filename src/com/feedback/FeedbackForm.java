package com.feedback;

import java.util.ArrayList;
import java.util.List;
import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;
import com.hibernate.Feedback;

public class FeedbackForm {
	private List<Feedback> feedback;
	private String name;
	private String text;
	private String reviewName;
	private Integer rating;
	private ArrayList ratingList;
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRatingList(ArrayList ratingList) {
		this.ratingList = ratingList;
	}
	public ArrayList getRatingList() {
		return ratingList;
	}

}
