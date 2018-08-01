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
public abstract class BeverageDecorator implements Beverage {
    
    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    
    
    @Override
    public int getCost() {
        return this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }
    
    
}
