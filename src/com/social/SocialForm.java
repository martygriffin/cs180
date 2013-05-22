package com.social;

import java.util.List;

import com.hibernate.Social;

public class SocialForm
{
private List<Social> social_list;
private String name;
private String code;

public void setSocial_list(List<Social> social_list) {
	this.social_list = social_list;
}

public List<Social> getSocial_list() {
	return social_list;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setCode(String code) {
	this.code = code;
}

public String getCode() {
	return code;
}	
}