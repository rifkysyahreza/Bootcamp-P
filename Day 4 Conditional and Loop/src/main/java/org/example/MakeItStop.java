package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class MakeItStop {
    Scanner myObjString = new Scanner(System.in);
    Scanner myObjInteger = new Scanner(System.in);
    ArrayList<Integer> userInputNumber = new ArrayList<Integer>();

    public void stopItDude(){
        boolean status = true;

        while (status){
            System.out.print("Enter Number: ");
            int numberInputInString = myObjInteger.nextInt();
            userInputNumber.add(numberInputInString);

            System.out.print("Press 'y' to Continue or 'n' to Stop: ");
            String statusInput = myObjString.nextLine();
            switch (statusInput){
                case "y", "Y":
                    continue;
                case "n", "N":
                    status = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println(userInputNumber);
    }
}
