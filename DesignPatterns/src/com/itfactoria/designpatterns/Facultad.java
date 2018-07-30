/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author jnino
 */
public class Facultad {
    private ArrayList listaProfesores;
    private ArrayList listaEstudiantes;
    private ArrayList listaAsignaturas;
    private static Facultad facultad;

    private  Facultad(ArrayList listaProfesores, ArrayList listaEstudiantes, ArrayList listaAsignaturas) {
        this.listaProfesores = listaProfesores;
        this.listaEstudiantes = listaEstudiantes;
        this.listaAsignaturas = listaAsignaturas;
        
    }
    
    public static Facultad getSingletonInstance(ArrayList listaProfesores, ArrayList listaEstudiantes, ArrayList listaAsignaturas){
        if(facultad == null){
            facultad = new Facultad(listaProfesores, listaEstudiantes, listaAsignaturas);
        }
        else{
            System.out.println("Error, la instancia Facultad ya existe");
        }
        return facultad;
        
    }

    public ArrayList getListaProfesores() {
        return listaProfesores;
    }

    public ArrayList getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList getListaAsignaturas() {
        return listaAsignaturas;
    }

    public static Facultad getFacultad() {
        return facultad;
    }
    
}
