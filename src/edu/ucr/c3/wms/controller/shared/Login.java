package edu.ucr.c3.wms.controller.shared;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.business.admin.UserService;
import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.controller.admin.forms.LoginForm;
import edu.ucr.c3.wms.domain.Manager;
import edu.ucr.c3.wms.helper.dataholder.LoginManager;
import com.hibernate.*;

public class Login extends BaseAction  implements ModelDriven, Preparable {
	private LoginForm form = new LoginForm();
	
	public String execute() throws SBRException {
		if(session.containsKey("loggedInUser")){
			return "user";
		}
		//AdminLevelService svc = (AdminLevelService)getService("adminLevelService");
		String username = form.getName();
		String password = form.getPassword();
	CCRService dao=(CCRService)getService("CCRService");		
		//System.out.println(dao.findById(1));
	//	System.out.println(username + password);
		String returnVal = "error";		
		HttpSession sess =  req.getSession();
		LoginManager login = (sess.getAttribute("loginManager") != null) ? (LoginManager)sess.getAttribute("loginManager") : null;
		
		
	//	System.out.println(username+ " name");
	//	System.out.println(password +" password");
		LoginManager loginMgr = new LoginManager();
		User userLogin = null;
		//List<User> allUser = dao.getAllUsers();
		if ( dao.findByUsername(username) !=null)
		{
		try{
			 userLogin = (User) dao.findByUsername(username).get(0);
		}
		catch(Exception e)
		{
			addActionError("Invalid Username or Password");
			return "error";
		}
	
		if (userLogin.getPassword().equals(password))
		{

		//	System.out.println("login success");
			//retrieve information for default actor on account
			String temp = userLogin.getUsername()+ " Logged in";
			 java.util.Date date= new java.util.Date();
			Timestamp t = new Timestamp(date.getTime());
			Log l = new Log (temp, t);
			dao.saveLogEntry(l);
			session.put("loggedInUser", userLogin);
			return "user";
			
		}
		else
		{
			addActionError("Invalid Username or Password");
			return "error";
		}
		
		}
		else
		{
			addActionError("Invalid Username or Password");
			return "error";
		}
		/*for(User checkLogin : allUser){
			if(username != null && password != null){
				if(checkLogin.getUsername().toLowerCase().equals(username.toLowerCase()) &&
						checkLogin.getPassword().equals(password) &&
						checkLogin.getIsActive()){
					userLogin = checkLogin;
					
					loginMgr.setLogin(userLogin);
					//When we put /user in its own class, then we will use this loginPath.
					//For now, there is not /user/
					//loginMgr.getLoginPaths().put("/user/"+BaseAction.class.getName()+"/LOGGED_IN", Boolean.TRUE);
					loginMgr.getLoginPaths().put("/" + BaseAction.class.getName()+"/LOGGED_IN", Boolean.TRUE);
					
				
					System.out.println("login success");
					//retrieve information for default actor on account
	
					
					session.put("loggedInUser", userLogin);
					
					
					returnVal = "user";
					break;
				}
				
			}
			
		}*/
	}
	
	@Override
	public Boolean isLoginRequired() {
		return false;
	}
	
	public Object getModel() {
		return form;
	}
	public void setForm(LoginForm form) {
		this.form = form;
	}
	public LoginForm getForm() {
		return form;
	}

	public void prepare() throws SBRException {
		
		
	}
}
