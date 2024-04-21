/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iceactivity3;

/**
 *
 * @author christopheredwardlinington
 */
public class Question3 {
    
    public static int
   GreatComDiv(int green, int red)
   {
       if (green<red){
           int yellow=green;
           green=red;
           red=yellow;
       }
       while (red!=0){
           int remain=green%red;
           green=red;
           red= remain;
           
       }
       
       return green;
   }
   
   public static void
           main(String[] args){
               int firstnumber=48;
               int secondnumber=18;
               System.out.println("the greatest common denominator of "+firstnumber+" as well as "+ secondnumber+ " is: "+ GreatComDiv(firstnumber,secondnumber));
           }
            
}
