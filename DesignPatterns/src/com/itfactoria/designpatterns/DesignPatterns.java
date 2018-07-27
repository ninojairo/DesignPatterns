/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

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
        
        
        
        
    }
    
}
