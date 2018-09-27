package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.test.form.User;

public class AskLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		User user = (User) form;
		//user.setLogin("prout");
		
		request.setAttribute("user", user);
		return mapping.findForward("success");
	}
}