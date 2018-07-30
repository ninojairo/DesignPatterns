/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

import java.util.ArrayList;

/**
 *
 * @author jaironino
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Factory Pattern
        Computer pc = ComputerFactory.getComputer("PORTATIL", "16gb", "1tb", "256");
        Computer server  = ComputerFactory.getComputer("SERVER", "16gb", "1tb", "256");
        System.out.println("Factory PORTATIL Config: " +pc);
        System.out.println("Factory SERVER Config: " +server);
        
        
        //Singleton Pattern
        ArrayList <String> listaProfesoresIng= new ArrayList();
        ArrayList <String> listaEstudiantesIng= new ArrayList();
        ArrayList <String> listaAsignaturasIng= new ArrayList();
        ArrayList <String> listaMatriculasIng= new ArrayList();
        
        listaProfesoresIng.add("Pibe");
        listaProfesoresIng.add("Redin");
        listaEstudiantesIng.add("Camilo");
        listaProfesoresIng.add("Jason");
        listaAsignaturasIng.add("Matematicas");
        listaAsignaturasIng.add("Ciencias");
        listaMatriculasIng.add("Camilo");
        listaMatriculasIng.add("Jason");
        
        ArrayList <String> listaProfesoresEco= new ArrayList();
        ArrayList <String> listaEstudiantesEco= new ArrayList();
        ArrayList <String> listaAsignaturasEco= new ArrayList();
        ArrayList <String> listaMatriculasEco= new ArrayList();
        
        listaProfesoresEco.add("PibeEco");
        listaProfesoresEco.add("RedinEco");
        listaEstudiantesEco.add("CamiloEco");
        listaProfesoresEco.add("JasonEco");
        listaAsignaturasEco.add("MatematicasEco");
        listaAsignaturasEco.add("CienciasEco");
        listaMatriculasEco.add("CamiloEco");
        listaMatriculasEco.add("JasonEco");
        
        Facultad ingeneria = Facultad.getSingletonInstance(listaProfesoresIng, listaEstudiantesIng, listaAsignaturasIng);
        Facultad economia = Facultad.getSingletonInstance(listaProfesoresEco, listaEstudiantesEco, listaAsignaturasEco);
        
        System.out.println("Profesores Ingenieria: "+ingeneria.getListaProfesores());
        System.out.println("Profesores Economia: "+economia.getListaProfesores());
        
        
        
    }
    
}
