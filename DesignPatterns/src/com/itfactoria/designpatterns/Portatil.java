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
public class Portatil extends Computer{
    
    private String ram;
    private String hdd;
    private String cpu;

    public Portatil(String RAM, String HDD, String CPU) {
        this.ram = RAM;
        this.hdd = HDD;
        this.cpu = CPU;
    }

    
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
    
}
