/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoperator;


/**
 *
 * @author STAR TOP
 */
//final hourRate 50
enum kindCar {car,motor,van,bus}
public class  operator {
    private String customerName ;
    private int ssn ;
    private kindCar kind ;
    private double hourRate=50 ;
    private int noOfHours ;
    private double price ;
    
    private double arriveTime;
    private double departureTime;
    
    //CONSTRUCTOR
    public operator() {
    }

    //CONSTRUCTOR
//    public operator(String customerName, int ssn, kindCar kind ,double arriveTime) {
//        this.customerName = customerName;
//        this.ssn = ssn;
//        this.kind = kind;
//        this.arriveTime = arriveTime;
//    }

    // TO SET THE CUSTOMER NAME
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //TO SET THE SSN
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    // TO SET THE KIND OF CAR
    
    public void setKind(kindCar kind) {
        this.kind = kind;
    }

    // TO GET THE CUSTOMER NAME
    public String getCustomerName() {
        return customerName;
    }

    //TO GET THE SSN
    public int getSsn() {
        return ssn;
    }

    // TO GET THE KIND OF CAR
    public kindCar getKind() {
        return kind;
    }
     
    
    // TO CALCULATE AND DISPLAY THE NO. OF HOURS
    public int getNoOfHours() {
        noOfHours= (int)(departureTime - arriveTime);
        return noOfHours ;
    }

    // DISPLAY THE TOTAL PRICE
    public double getPrice() {
       noOfHours= (int)(departureTime - arriveTime); 
        price = noOfHours*hourRate ;
        return price;
    }

    // TO DISPLAY THE BILL DETAILS TO CUSTOMER AND OPERATOR
    // HIS NAME / SSN / KIND / NO. OF HOURS / TOTAL PRICE
    @Override
    public String toString() {
        return  " The customer name is " + customerName + "\n ssn = " + ssn + "\n kind = " + kind + "\n number of hours = " + (int)(departureTime - arriveTime) + "\n and the price is " + (int)(departureTime - arriveTime)*hourRate ;
    }
     
    public void displayDetails(){

  System.out.println (toString());
    }
 
     public void setarrivetime(double s){
        this.arriveTime=s;
    }
    
    public void setdeparturetime(double s){
        this.departureTime=s;
    }
    
     
 
     
    public double getarriveTime(){
        return this.arriveTime;
    }
     
    public double getdepartureTime(){
         return this.departureTime;
     }

    void setKind(String bus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
