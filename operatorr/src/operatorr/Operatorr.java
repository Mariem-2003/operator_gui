/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operatorr;

/**
 *
 * @author STAR TOP
 */
import java.util.Scanner;

public class Operatorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        operator m = new operator();

       // System.out.println(m.getCustomerName());
        
        Scanner input = new Scanner(System.in);
        int h = input.nextInt() ;
        int mi = input.nextInt();
        
        int min = mi + (h*60) ;
        
        int hour = min /60 ;
        
        int minute = min% 60 ;
        
        System.out.println(hour+"   " + minute );
    }
    
}






//
//int arriveMin =Integer.parseInt(jTextFieldarm.getText());
//        // int arrive =Integer.parseInt(jTextFieldarm.getText());
//         
//         int departureMin =Integer.parseInt(jTextFielddem.getText());
//         //int daparture =Integer.parseInt(jTextFielddem.getText());
//         
//        int arriveTime= Integer.parseInt(jTextFieldsetarrivetime.getText());
//       int departureTime= Integer.parseInt(jTextFieldsetdeparturetime.getText());
//       //int noOfHours= departureTime-arriveTime;
//       //int price =  noOfHours*50;
//
//
//
//
//
// int arrive= (arriveTime *60) + arriveMin ;
//     int departure=(departureTime*60)+departureMin;
//     int noOfHours = departure -arrive;
//     int hour = noOfHours /60 ;
//     int min = noOfHours %60 ;
//       if(min >10 && min<=40){
//         int  price =  (hour*50)+25 ;
//       }
//       
//       if(min >40 && min<=60){
//         int  price =  (hour*50)+50 ;
//       }
//        
