package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.test.form.Message;

public class MultipleMessageAction extends DispatchAction {
	public ActionForward insult(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Message message = new Message("Vous n'�tes qu'un ramassis de d�tritus de raton-laveur");
		request.setAttribute("message", message);
		
		return (mapping.findForward("dispMessage"));
	}
	
	public ActionForward greet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Message message = new Message("Vous, vous �tes sympa !");
		request.setAttribute("message", message);
		
		return (mapping.findForward("dispMessage"));
	}
}
