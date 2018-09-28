package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.test.form.Message;

public class MessageMappingDispatchAction extends MappingDispatchAction {
	public ActionForward getLeTime(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Message message = new Message("Il est probablement l'heure d'aller manger");
		request.setAttribute("message", message);
		
		return (mapping.findForward("dispMessage"));
	}
	
	public ActionForward getLeWeather(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Message message = new Message("Je pense qu'il fait beau, mais regardez par la fenêtre pour être sûr");
		request.setAttribute("message", message);
		
		return (mapping.findForward("dispMessage"));
	}
}
