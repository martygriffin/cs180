package edu.ucr.c3.wms.helper.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import edu.ucr.c3.wms.controller.BaseAction;
import edu.ucr.c3.wms.helper.dataholder.LoginManager;

public class GlobalParamInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation invocation) throws Exception {
       BaseAction action = (BaseAction)invocation.getAction();
       
       action.setLoginManager((LoginManager)action.getSession().get("loginManager"));
       
       return invocation.invoke();
    }
}
