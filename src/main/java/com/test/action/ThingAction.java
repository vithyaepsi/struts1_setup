package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.test.form.Thing;


public class ThingAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		Thing thing = new Thing();
		thing.setName("Philippe Risoli");
		
		request.setAttribute("thing", thing);
		return mapping.findForward("success");
	}
}
