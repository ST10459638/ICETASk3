/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iceactivity3;

public class ICEActivity3 {

    public static boolean isValid(String s) {
        StringBuilder lu = new StringBuilder();
        for (char green : s.toCharArray()) {
            if (green == '(' || green == '[' ||  green== '{') {
                lu.append(green);
            } else {
                int len = lu.length();
                if (len == 0 || (green == ')' && lu.charAt(len - 1) != '(') || (green == ']' && lu.charAt(len - 1) != '[') || (green == '}' && lu.charAt(len - 1) != '{')) {
                    return false;
                }
                lu.deleteCharAt(len - 1);
            }
        }
        return lu.length() == 0;
    }

    public static void main(String[] args) {
        String firstStringtest= "(){}[]";
        String secondStringtest = "([)]";
        System.out.println(firstStringtest + " validatable: " + isValid(firstStringtest));
        System.out.println(secondStringtest + " validatable: " + isValid(secondStringtest));
    }
}


    
