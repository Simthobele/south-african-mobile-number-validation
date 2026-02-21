/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputvalidation;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class InputValidation {

    public static void main(String[] args) {
        //To read input from keyboard
        Scanner input = new Scanner(System.in);
        
        //Regular expression for validating mobile phone number
        String regx = "0(6|7|8)\\d{8}";
        
        //prompt user to enter the phone number
        System.out.println("\n Please eneter your phone number:");
        String phoneNumber = input.nextLine();
        
        //test if you can printout phoneNumber
        System.out.println("Phone number is:\n "+ phoneNumber);
        
        //initialize counter for counting number of user attempts
        int counter = 2;
        
        //loop to give users three times to enter valid phone numbers
        while(!(phoneNumber.matches(regx))&& counter >=1)
        {
            System.out.println("\nInvalid input. Please enter the phone number in format of 10 digits, e.g. 0712345678(attempts left):"+ counter);
            phoneNumber = input.nextLine();
            counter -= 1;
        }
        
        //terminate program if user entered invalid phone number three times
        if(!(phoneNumber.matches(regx)))
        {
            System.out.println("\nNumber of attempts exceeded. Terminating program");
            System.exit(0);
        }
        else
        {
            System.out.println("\nThe phone number is valid\n"+ phoneNumber); 
        }
        //split number into components
        //String[] phoneNumbersParts = phoneNumber.split("-");
        //extract the 1st 3 digits of phone number for determining network to which the number belongs
        String prefix = phoneNumber.substring(0, 3);

        System.out.println("\nCode: " + phoneNumber.substring(0, 3));
        System.out.println("Number: " + phoneNumber.substring(3));
        
        // Network is determined by original prefix allocation.
        // Due to number portability, actual current network may differ.
        switch (prefix) {
            case "060":
            case "061":
            case "062":
            case "063":
                System.out.println("Network: Telkom");
                break;

            case "071":
            case "072":
            case "076":
            case "079":
                System.out.println("Network: Vodacom");
                break;

            case "073":
            case "078":
            case "083":
                System.out.println("Network: MTN");
                break;

            case "074":
            case "084":
                System.out.println("Network: Cell C");
                break;

            default:
                System.out.println("Network: Unknown or Ported Number");
                break;
        }
        
        
        
        
        
    }
}
