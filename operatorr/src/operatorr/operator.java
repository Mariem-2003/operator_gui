/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operatorr;

/**
 *
 * @author STAR TOP
 */

public class operator {
      private String customerName ;
    private int ssn ;
    private final double hourRate=50 ;
    private int noOfHours ;
    private double price ;
    
    private double arriveTime;
    private double departureTime;
    

    
    //CONSTRUCTOR
    public operator() {
    }

    //CONSTRUCTOR
//    public operator(String customerName, int ssn,double arriveTime) {
//        this.customerName = customerName;
//        this.ssn = ssn;
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

    
    // TO GET THE CUSTOMER NAME
    public String getCustomerName() {
        return customerName;
    }

    //TO GET THE SSN
    public int getSsn() {
        return ssn;
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
        return  " The customer name is " + customerName + "\n ssn = " + ssn + "\n number of hours = " + (int)(departureTime - arriveTime) + "\n and the price is " + (int)(departureTime - arriveTime)*hourRate ;
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

    
    
}
