package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        //Get scanner! Where did I put that thing?
        Scanner scanner=new Scanner(System.in);
        //there it is

        //defining our userPhoneOne
        CellPhone userPhoneOne = new CellPhone();

        //User input time
        System.out.print("Please enter the following information:\nWhat is the serial number? ");
        double userSerialNumber=scanner.nextDouble();
        scanner.nextLine();//CRLF
        userPhoneOne.setSerialNumber(userSerialNumber);

        //Model
        System.out.print("What is the model of the phone? ");
        String userModel = scanner.nextLine();
        userPhoneOne.setModel(userModel);

        //Carrier
        System.out.print("What carrier is supporting the line? ");
        String userCarrier = scanner.nextLine();
        userPhoneOne.setCarrier(userCarrier);

        //Number
        System.out.print("What is the phone number? ");
        String userPhoneNumber = scanner.nextLine();
        userPhoneOne.setPhoneNumber(userPhoneNumber);

        //Owner
        System.out.print("What is the name of the owner? ");
        String userName = scanner.nextLine();
        userPhoneOne.setOwner(userName);

        userPhoneOne.display();

        //Second phone
        CellPhone userPhoneTwo = new CellPhone();
        userPhoneTwo.setSerialNumber(3002001);
        userPhoneTwo.setModel("Motorolla");
        userPhoneTwo.setCarrier("Verizon");
        userPhoneTwo.setPhoneNumber("(724) 601-9075");
        userPhoneTwo.setOwner("Bosland Electric");

        userPhoneOne.dial(userPhoneTwo.getOwner(),userPhoneTwo.getPhoneNumber());
        userPhoneTwo.dial(userPhoneOne.getOwner(),userPhoneOne.getPhoneNumber());

        //New, overloaded phone
        //let's get the info first
        System.out.printf("\n%s, who are you calling? ",userName);
        String callOwner = scanner.nextLine();
        System.out.printf("\nWhat is %s's phone number? ",callOwner);
        String callPhoneNumber = scanner.nextLine();

        //overloaded method
        CellPhone userPhoneThree = new CellPhone(callPhoneNumber,callOwner);

        userPhoneOne.dial(userPhoneThree.getOwner(),userPhoneThree.getPhoneNumber());
        userPhoneThree.dial(userPhoneOne);




    }
}
