package edu.ucr.c3.phr.domain;

/**
 * Modality entity. @author MyEclipse Persistence Tools
 */

public class Modality implements java.io.Serializable {

	// Fields

	private Integer id;
	private String symbol;
	private String description;

	// Constructors

	/** default constructor */
	public Modality() {
	}

	/** minimal constructor */
	public Modality(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Modality(Integer id, String symbol, String description) {
		this.id = id;
		this.symbol = symbol;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}