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
public class Milk extends BeverageDecorator{
    
    Beverage beverage;
    
    public Milk(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }
    
    @Override
    public int getCost(){
        return this.beverage.getCost()+13;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "** Milk ***";
    }
    
    
}
