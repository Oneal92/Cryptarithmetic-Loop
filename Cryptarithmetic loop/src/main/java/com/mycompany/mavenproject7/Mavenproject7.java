/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author bapti
 */
public class Mavenproject7 { 
    public static void main(String[] args)
	{
	 int t, o, g, d;
         int left_side=0,right_side=0;

	 // Compute all values for "T", "O", "G", and "D"
         //{0,0,0,0},{0,0,0,1},...,{1,1,1,1}
	 for (t = 0; t <= 9; t++)
	   for (o = 0; o <=9; o++)
            for (g = 0; g <= 9; g++)
              for (d = 0; d <= 9; d++)
               {
               // Ensure the uniqueness for each digit
               if ((t != o) && (t != g) && (t != d) &&(o != g) && (o != d) &&(g != d))
               {
                   left_side = (int)(( (t*Math.pow(10,2)) +(o*Math.pow(10,1)) +(o*Math.pow(10,0))) * 4);//TOO + TOO + TOO + TOO
                  right_side = (int)( (g*Math.pow(10,3)) +(o*Math.pow(10,2)) +(o*Math.pow(10,1)) + (d*Math.pow(10,0)));//GOOD

                  //Check if the left side of the equation is equal to the right side
                  //TOO + TOO + TOO + TOO = GOOD
                  if(left_side == right_side)
                  {
                     System.out.println("The values are: T = " + t + " O = " + o + " G = " + g + " D = " + d);
                  }

                }//END if ((t != o) && (t != g) && (t != d) &&(o != g) && (o != d) &&(g != d))
               
               }//END for (d = 0; d <= 9; d++)
	 System.out.println();
	}
}
               