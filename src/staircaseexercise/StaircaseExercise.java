/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircaseexercise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class StaircaseExercise {
    
    
    public static void staircase(int n)
    {
        String a="#";
        int ws=n;
        
        for (int i = 1; i <= n; i++) {
           
            ws=n-i;
              //White spaces
             for (int x = 0; x < ws; x++) 
             {
                 System.out.print(" ");
             }
            
            //character
             for (int j = 0; j < i; j++) {
                 System.out.print(a);
            }
             
             //go to next line
             System.out.println();
        }

    } 

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        StaircaseExercise g=new StaircaseExercise();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        g.staircase(n);

        scanner.close();
    }
}
