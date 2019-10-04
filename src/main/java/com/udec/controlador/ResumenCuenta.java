/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.LogicaCobro;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author Michael Cardenas
 */
@Named
@ViewScoped
public class ResumenCuenta implements Serializable{
    
    /**
     * atributos para recojer los resultados de las operaciones
     */
    
    private LogicaCobro logica;
    private String estatus;
    private int total;
    
    /**
     * atributo de la clase Formulario para aplicar inyeccion de dependencias
     */
    @Inject
    private Formulario formulario;
    
    /**
     * constructor vacio de la clase
     */
    public ResumenCuenta(){
    }
    
    /**
     * metodo para inicializar todas las operaciones
     */
    @PostConstruct
    public void cuentaTotal(){
        LogicaCobro logica = new LogicaCobro(formulario);
        total = logica.realizarOperacion();
        estatus = logica.definirSexo();
    }

    /**
     * metodos publicos
     * @return 
     */
    public LogicaCobro getLogica() {
        return logica;
    }

    public void setLogica(LogicaCobro logica) {
        this.logica = logica;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
