package edu.ucr.c3.wms.domain;

/**
 * SystemSetting entity. @author MyEclipse Persistence Tools
 */

public class SystemSetting implements java.io.Serializable {

	// Fields

	private Integer id;
	private String settingName;
	private String settingType;
	private String settingValue;
	private String comments;

	// Constructors

	/** default constructor */
	public SystemSetting() {
	}

	/** minimal constructor */
	public SystemSetting(Integer id, String settingName, String settingType,
			String settingValue) {
		this.id = id;
		this.settingName = settingName;
		this.settingType = settingType;
		this.settingValue = settingValue;
	}

	/** full constructor */
	public SystemSetting(Integer id, String settingName, String settingType,
			String settingValue, String comments) {
		this.id = id;
		this.settingName = settingName;
		this.settingType = settingType;
		this.settingValue = settingValue;
		this.comments = comments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSettingName() {
		return this.settingName;
	}

	public void setSettingName(String settingName) {
		this.settingName = settingName;
	}

	public String getSettingType() {
		return this.settingType;
	}

	public void setSettingType(String settingType) {
		this.settingType = settingType;
	}

	public String getSettingValue() {
		return this.settingValue;
	}

	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}