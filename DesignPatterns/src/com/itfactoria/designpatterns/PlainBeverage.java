/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

import com.itfactoria.decorator.Beverage;

/**
 *
 * @author JairoNino
 */
public class PlainBeverage implements Beverage {

    @Override
    public int getCost() {
        return 45; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        return "Plain Beverage"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
