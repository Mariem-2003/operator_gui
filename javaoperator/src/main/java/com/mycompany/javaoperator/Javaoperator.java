/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaoperator;

/**
 *
 * @author STAR TOP
 */
public class Javaoperator {

    public static void main(String[] args) {
        
         operator m = new operator();
        m.setCustomerName("mariam");
        System.out.println(m.getCustomerName());
        System.out.println(m.getNoOfHours());
        m.setdeparturetime(5);
        m.setarrivetime(2);
              //  System.out.println(m.getNoOfHours());

           m.displayDetails();
           System.out.println(m.getPrice());
           m.setKind("bus");
    m.getKind()  
            }
}
