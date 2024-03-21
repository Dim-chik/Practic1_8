/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktica1_8;



    class Telephones {
    String model;
    String serialNumber;
    String color;
    String isMobile;

    public Telephones(String model, String serialNumber, String color, String isMobile) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.isMobile = isMobile;
    }

    
    @Override
    public String toString() {
        return "Telephone{" + "model='" + model + '\'' + ", serialNumber='" + serialNumber + '\'' + ", color='" + color + '\'' + ", isMobile= " + isMobile +'}';
    }
}

