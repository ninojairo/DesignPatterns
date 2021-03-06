/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

import com.itfactoria.decorator.Beverage;
import com.itfactoria.decorator.Sugar;
import com.itfactoria.decorator.Milk;
import java.util.ArrayList;

/**
 *
 * @author jaironino
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    
    public void buildPattern(){
        
        System.out.println("***** Builder Pattern *****");
        Motorcycle motorcycleHonda = new Motorcycle.Builder("kawasaky", "enduro").build();
        //motorcycleHonda.toString();
        System.out.println("Moto:" +motorcycleHonda);
    }
    
    public void decoratorPattern(){
        Beverage coffee = new Sugar(new Milk(new PlainBeverage()));
        System.out.println("*** Description: " +coffee.getDescription() + "  Price: " + coffee.getCost());
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        DesignPatterns designPatterns = new DesignPatterns();
        
        //Factory Pattern
        /*
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
        */
        
        

        //Builder Pattern
        //designPatterns.buildPattern();
        
        //Decorator Pattern
        designPatterns.decoratorPattern();
        
                
        
        
        
        
    }
    
}
