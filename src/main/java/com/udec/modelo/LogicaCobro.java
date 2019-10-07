/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

import com.udec.controlador.Formulario;
/**
 *
 * @author Michael Cardenas
 */
public class LogicaCobro {  
    /**
     * atributo de la clase Formulario para acceder a sus metodos
     */
    private Formulario formulario;

    /**
     * constructor de la clase
     * @param formulario para lograr acceder a las variables
     */
    public LogicaCobro(Formulario formulario) {
        this.formulario = formulario;
        definirSexo();
        realizarOperacion();
    }
    
    /**
     * define si es señor o señora dependiendo del genero
     * @return devuelve el resultado
     */
    public String definirSexo(){
        String resultado = "";
        if(formulario.getGenero().equals("masculino"))
            resultado=" Señor: ";
        else
            resultado="Señora: ";
        
        return resultado;
    } 
    
    /**
     * calcula el monto final
     * @return  el resultado final
     */
    public int realizarOperacion(){
        int valorProfesion = identificarProfesion()*formulario.getDiasLaborados();
        int valorIdiomas = identificarIdiomas();
        int valorUbicacion = identificarUbicacion();
        
        return valorProfesion+valorIdiomas+valorUbicacion;
    }
    
    /**
     * calcula el valor segun la profesion
     * @return 
     */
    public int identificarProfesion(){
        if(formulario.getProfesiones().equals("ingeniero"))
            return 200000;
        else if(formulario.getProfesiones().equals("tecnologo"))
            return 150000;
        else if(formulario.getProfesiones().equals("tecnico"))
            return 100000;
        else
            return 50000;
    }
    
    /**
     * identifica el valor de los idiomas
     * @return  el valor de los idiomas
     */
    public int identificarIdiomas(){
        int acumulador=0;
        for(String aux:formulario.getIdiomas()){
            if(formulario.getIdiomas().equals("Ingles"))
                acumulador+=250000;
            else if(formulario.getIdiomas().equals("Frances"))
                acumulador+=330000;
            else
                acumulador+=500000;
        }
        return acumulador;
    }
    
    /**
     * identifica el valor de la ubicacion
     * @return el valor segun la ubicacion
     */
    public int identificarUbicacion(){
        if(formulario.getUbicacion().equals("afueras"))
            return 80000;
        else 
            return 0;
    }
    
    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }    
}