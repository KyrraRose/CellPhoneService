package com.pluralsight;

public class CellPhone {
    //what are our categories?
    private double serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    //Construction!
    public CellPhone(){

        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
        //I name you PARAMETERLESS
    }
    //Serial Number get/set
    public double getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(double serialNumber){
        this.serialNumber=serialNumber;
    }

    //Model get/set
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //Carrier get/set
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //Phone # get/set
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Owner get/set
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Dial tone!

    public void dial(String phoneNumber) {
        System.out.printf("\n%s's phone is calling %s\n",this.owner,phoneNumber);
    }

    //End Result
    public void display(){
        System.out.printf("\n=== Caller Information: ===\nSerial Number: %.0f\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s",this.serialNumber,this.model,this.carrier,this.phoneNumber,this.owner);
    }
}

