/**
 * @Author: Sami Jr
 * @Date: 9/12/2017
 * @License: GNU
 * @Purpose: Use Delimiters to find the averages
 */

import java.util.Scanner;

public class Delimiters {
    public static void main(String [] args){
        int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
        //allows me to input numbers
            Scanner keyboard1 = new Scanner(System.in);
            keyboard1.useDelimiter(",");
            //separates input with a comma
            System.out.println("Enter 10 numbers separated by commas" + "\t" + "to find the average");
        i1 = (keyboard1.nextInt());//lets the keyboard understand variables
        i2 = (keyboard1.nextInt());
        i3 = (keyboard1.nextInt());
        i4 = (keyboard1.nextInt());
        i5 = (keyboard1.nextInt());
        i6 = (keyboard1.nextInt());
        i7 = (keyboard1.nextInt());
        i8 = (keyboard1.nextInt());
        i9 = (keyboard1.nextInt());
        i10 = (keyboard1.nextInt());
        i11 = ( i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10);//adds all input integers
        i12 = (i11/10);
        //does the final calculation to find average
        System.out.println("The average is" + "\n" + i12);
        //displays the average


    }
}
