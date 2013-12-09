package com.java.struts.hola.mundo.action;

import com.java.struts.hola.mundo.form.HolaMundoForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Omar
 */
public class HolaMundoAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, 
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        HolaMundoForm holaMundoForm = (HolaMundoForm) form;
        holaMundoForm.setMessage("Hola Mundo! Struts");
        
        return mapping.findForward("success");
    }

}
