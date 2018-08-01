/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.decorator;

/**
 *
 * @author JairoNino
 */
public class Sugar extends BeverageDecorator{
        
    Beverage beverage;
    
    
    public Sugar(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + 25; //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Sugar"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
    
    
    
    
}
