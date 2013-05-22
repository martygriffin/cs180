package edu.ucr.c3.phr.domain;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */

public class Login implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String email;
	private String questions;
	private String answer;
	private Short active;

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** minimal constructor */
	public Login(String username, String password, String email) {
		
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/** full constructor */
	public Login(Integer id, String username, String password, String email,
			String questions, String answer, Short active) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.questions = questions;
		this.answer = answer;
		this.active = active;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuestions() {
		return this.questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

}