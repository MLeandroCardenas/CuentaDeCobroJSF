/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;

import com.udec.controlador.Formulario;
/**
 *
 * @author michl
 */
public class LogicaCobro {
    
    
    private Formulario formulario;
    private int resultado;
    
    
    public LogicaCobro(Formulario formulario) {
        this.formulario = formulario;
        definirSexo();
        realizarOperacion();
    }
    
    public String definirSexo(){
        String resultado = "";
        if(formulario.getGenero().equals("masculino"))
            resultado=" Señor: ";
        else
            resultado="Señora: ";
        
        return resultado;
    } 
    
    public int realizarOperacion(){
        resultado = sueldoProfesiones();
        resultado = sueldoIngenieroIngles();
        resultado = sueldoTecnologoIngles();
        resultado = sueldoAuxiliarIngles();
        resultado = sueldoIngenieroIdiomas();
        resultado = sueldoTecnologoIdiomas();
        resultado = sueldoTecnicoIdiomas();
        resultado = sueldoAuxiliarIdiomas();
        resultado = sueldoIngenieroInglesFaca();    
        resultado = sueldoTecnicoInglesFaca();
        resultado = sueldoAuxiliarInglesFaca();
        resultado = sueldoTecnologoInglesFaca();
        return resultado;
    }
    
    public int sueldoProfesiones(){
        if(formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*200000;
        else if(formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000;
        else if(formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000;
        else if(formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*50000;
        return resultado;
    }
    
    public int sueldoIngenieroIngles(){
          if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("ingeniero") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*50000+250000+80000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("ingeniero") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*200000+330000+80000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("ingeniero") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*200000+500000+80000;  
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Ingles")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*200000+250000+500000+80000;
         
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("ingeniero") )
            resultado = formulario.getDiasLaborados()*200000+330000+500000+80000;
         
         else if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("ingeniero") )
            resultado = formulario.getDiasLaborados()*200000+250000+330000+80000;
          return resultado;
    }
    
    public int sueldoTecnologoIngles(){
         if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("tecnologo") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*150000+250000+80000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("tecnologo") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*150000+330000+80000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("tecnologo") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*150000+500000+80000;
        
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Ingles")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000+250000+500000+80000;
         
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnologo") )
            resultado = formulario.getDiasLaborados()*150000+330000+500000+80000;
         
         else if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnologo") )
            resultado = formulario.getDiasLaborados()*150000+250000+330000+80000;
         
         return resultado;
    }
    
    public int sueldoTecnicoIngles(){
         if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("tecnico") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*100000+250000+80000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("tecnico") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*100000+330000+80000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("tecnico") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*100000+500000+80000; 
         
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Ingles")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000+250000+500000+80000;
         
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnico") )
            resultado = formulario.getDiasLaborados()*100000+330000+500000+80000;
         
         else if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("tecnico") )
            resultado = formulario.getDiasLaborados()*100000+250000+330000+80000;
         return resultado;
    }
    
    public int sueldoAuxiliarIngles(){
          if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("auxiliar") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*50000+250000+80000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("auxiliar") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*50000+330000+80000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("auxiliar") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*50000+500000+80000;  
          
        
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Ingles")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*50000+250000+500000+80000;
         
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("auxiliar") )
            resultado = formulario.getDiasLaborados()*50000+330000+500000+80000;
         
         else if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Frances")&& formulario.getUbicacion().equals("afueras") && formulario.getProfesiones().equals("auxiliar") )
            resultado = formulario.getDiasLaborados()*50000+250000+330000+80000;
          
          return resultado;
    }
    
    public int sueldoIngenieroIdiomas(){
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("ingeniero") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*200000+250000+330000+500000+80000;
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*200000+250000+330000+500000;
        return resultado;
    }
    
    public int sueldoTecnologoIdiomas(){
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("tecnologo") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*150000+250000+330000+500000+80000;
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000+250000+330000+500000;
        return resultado;
    }
    
    public int sueldoTecnicoIdiomas(){
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("tecnico") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*100000+250000+330000+500000+80000;
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000+250000+330000+500000;
        return resultado;
    }
    
    public int sueldoAuxiliarIdiomas(){
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("auxiliar") && formulario.getUbicacion().equals("afueras"))
            resultado = formulario.getDiasLaborados()*50000+250000+330000+500000+80000;
        if(formulario.getIdiomas().equals("Ingles") && formulario.getIdiomas().equals("Aleman") && formulario.getIdiomas().equals("Frances")&& formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*50000+250000+330000+500000;
        return resultado;
    }
    
    public int sueldoIngenieroInglesFaca(){
          if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*50000+250000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*200000+330000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("ingeniero"))
            resultado = formulario.getDiasLaborados()*200000+500000;
          return resultado;
    }

    public int sueldoTecnologoInglesFaca(){
         if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000+250000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000+330000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("tecnologo"))
            resultado = formulario.getDiasLaborados()*150000+500000;   
         
         return resultado;
    }
    
    public int sueldoTecnicoInglesFaca(){
         if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000+250000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000+330000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("tecnico"))
            resultado = formulario.getDiasLaborados()*100000+500000; 
         return resultado;
    }
    
    public int sueldoAuxiliarInglesFaca(){
          if(formulario.getIdiomas().equals("Ingles") && formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*100000+250000;
        else if(formulario.getIdiomas().equals("Frances") && formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*100000+330000;
        else if(formulario.getIdiomas().equals("Aleman") && formulario.getProfesiones().equals("auxiliar"))
            resultado = formulario.getDiasLaborados()*100000+500000;  
          
          return resultado;
    }

    
    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
}

