package com.hibernate;

/**
 * Feedback entity. @author MyEclipse Persistence Tools
 */

public class Feedback implements java.io.Serializable {

	// Fields

	private Integer feedbackId;
	private String text;
	private String name;
	private Boolean isActive;
	private String reviewName;
	private Integer rating;

	// Constructors

	/** default constructor */
	public Feedback() {
	}

	/** minimal constructor */
	public Feedback(String text, String reviewName, Integer rating) {
		this.text = text;
		this.reviewName = reviewName;
		this.rating = rating;
	}

	/** full constructor */
	public Feedback(String text, String name, Boolean isActive,
			String reviewName, Integer rating) {
		this.text = text;
		this.name = name;
		this.isActive = isActive;
		this.reviewName = reviewName;
		this.rating = rating;
	}

	// Property accessors

	public Integer getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getReviewName() {
		return this.reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}