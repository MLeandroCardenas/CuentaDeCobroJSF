/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Michael Cardenas
 * clase que recoje los datos de la vista del formulario
 */
@Named
@RequestScoped
public class Formulario implements Serializable {
    /**
     * atributos del formulario
     */
    private String nombre,apellido;
    private String genero;
    private String profesiones;
    private String[] idiomas; 
    private String ubicacion;
    private int diasLaborados;

    /**
     * metodo para navegar a la otra pagina
     * @return 
     */
    public String redireccionar(){
        return "resumenCuenta";
    }

    /**
     * metodos publicos
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(String profesiones) {
        this.profesiones = profesiones;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }    
}
