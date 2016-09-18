/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author rodrigo
 */
public class ModelCalculator implements Serializable {
    
    private Float primeiroConjunto;
    private Float segundoConjunto;
    private String operador;
    
    public static final String PROP_SAMPLE_PROPERTY = "Calculadora";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public ModelCalculator() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

    public Float getPrimeiroConjunto() {
        return primeiroConjunto;
    }

    public void setPrimeiroConjunto(Float primeiroConjunto) {
        this.primeiroConjunto = primeiroConjunto;
    }

    public Float getSegundoConjunto() {
        return segundoConjunto;
    }

    public void setSegundoConjunto(Float segundoConjunto) {
        this.segundoConjunto = segundoConjunto;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador.replaceAll("\\"+operador, " "+operador).replaceAll(" ", "");
    }
    
    public String calcular(){
        Float resposta = 0f;
        switch(operador){
            case "/":
                resposta = primeiroConjunto / segundoConjunto;
                break;
            case "+":
                resposta = primeiroConjunto + segundoConjunto;
                break;
            case "-":
                resposta = primeiroConjunto - segundoConjunto;
                break;
            case "*":
                resposta = primeiroConjunto * segundoConjunto;
                break;
        }
        primeiroConjunto = null;
        segundoConjunto = null;
        operador = null;
        return resposta.toString();
    }
    
}
