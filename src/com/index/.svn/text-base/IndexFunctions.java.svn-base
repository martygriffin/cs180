package com.index;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.hibernate.Item;
import com.hibernate.ItemDAO;
import com.hibernate.Log;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.wms.business.SBRException;
import edu.ucr.c3.wms.controller.BaseAction;

public class IndexFunctions extends BaseAction implements ModelDriven,
		Preparable {
	private IndexForm form = new IndexForm();

	public String execute() throws SBRException {
		CCRService svc = (CCRService)getService("CCRService");	
		form.setSidebar(svc.getAllSocial());
		//System.out.println(form.getSidebar());
		return "success";
	}

	@Override
	public Boolean isLoginRequired() {
		return false;
	}

	public Object getModel() {
		return form;
	}

	public IndexForm getForm() {
		return form;
	}

	public void setForm(IndexForm form) {
		this.form = form;
	}

	public void prepare() throws SBRException {

	}
}
