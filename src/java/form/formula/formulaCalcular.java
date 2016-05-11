/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.formula;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Named (value="formula")
@RequestScoped
/**
 *
 * @author Fer_l
 */
public class formulaCalcular {
    @NotNull
    private double b;
    @NotNull
    private double c;

    public double getB() {
        return b;
        
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void calcular() {
        double result=b*c/2;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("a= "+result));
    }
    
}
