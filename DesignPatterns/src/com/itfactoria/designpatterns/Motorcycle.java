/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itfactoria.designpatterns;

/**
 *
 * @author jnino
 */
public class Motorcycle {

    private String house;
    private String reference;
    private int horsepower;
    private String color;
    private String fuel;
    
    public Motorcycle(Builder builder){
        this.house = builder.house;
        this.reference = builder.reference;
        this.horsepower = builder.horsepower;
        this.color = builder.color;
        this.fuel = builder.fuel;
    
    
    }
    
    
    public static class Builder {

        private final String house;
        private final String reference;
        private int horsepower;
        private String color;
        private String fuel;

        public Builder(String house, String reference) {
            this.house = house;
            this.reference = reference;

        }

        public Builder setHorsePower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;

        }

        public Builder setFuel(String fuel) {
            this.fuel = fuel;
            return this;

        }
        
        public Motorcycle build(){
            return new Motorcycle(this);
        }

        
    }
    @Override
        public String toString() {
            return this.reference + "+" + this.house + "-" + this.fuel + "" + this.color; //To change body of generated methods, choose Tools | Templates.
        }

}
