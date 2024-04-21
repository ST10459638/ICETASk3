/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iceactivity3;
 
import java.util.Iterator;

public class OddSquaresSum
implements Iterable<Integer> {
        
   public Iterator<Integer>
 iterator() {
            return new
Iterator<Integer>() {
    private int number=1;
    private int totalamount=0;
    
    public boolean
hasNext() {
    return true;
}

public Integer next(){
    totalamount+=number*number;
    number+=2;
    return totalamount;
} 
}; 
}
      
        
        public static void main(String[] args)
        {
            OddSquaresSum generator= new OddSquaresSum();
            Iterator<Integer>iterator= generator.iterator();
               for (int i=0; i<9;i++){
                  System.out.println(iterator.next()); 
               }
        }
                
}