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
public class ComputerFactory {
    
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        
        if ("SERVER".equalsIgnoreCase(type)){
            return new Server(ram, hdd, cpu);
        
        }else if ("PORTATIL".equalsIgnoreCase(type)){
            return new Portatil(ram, hdd, cpu);
        
        }
        
        else
            return null;
    
        
    }
    
}
