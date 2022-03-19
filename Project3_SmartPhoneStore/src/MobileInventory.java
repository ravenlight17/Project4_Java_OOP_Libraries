//Project 3 - Final Submission without the Challenge portion completed.

import java.util.Scanner;

public class MobileInventory {

    public static void main(String[] args) {
        SmartPhone iPhone12 = new SmartPhone("Apple", "iPhone 12",
                "iOS", 128, "black", 2, 699.00, 6.1);
        SmartPhone note20 = new SmartPhone("Samsung", "Galaxy Note",
                "Android", 256, "mystic bronze", 3, 349.00, 6.7);
        SmartPhone iPhone13_pro_max = new SmartPhone("Apple",
                "iPhone13 pro max", "iOS", 128, "blue", 3, 1099.00, 6.7);
        SmartPhone googlePixel = new SmartPhone("Google",
                "Google Pixel", "Android", 128, "very silver", 2, 899, 5);
        SmartPhone OnePlus = new SmartPhone("OnePlus", "OnePlus 9", "Android", 256,
                "black", 3, 500.00, 6.1);
        SmartPhone iPhone_se = new SmartPhone("Apple",
                "iPhone SE", "iOS", 64, "rose gold", 2, 650, 6.1);
        SmartPhone OneP = new SmartPhone("OnePlus", "OnePlus 10 Pro", "Android", 256, "silver", 3, 700.00, 6.7);
        SmartPhone iPhone8 = new SmartPhone("Apple",
                "iPhone 8", "ios", 128, "Red", 2, 499, 6.1);


        //This method will display all the values in any Smartphone object that we create.

        PhoneType mobileInventory = new PhoneType();
        mobileInventory.addSmartPhone(iPhone12);
        mobileInventory.addSmartPhone(note20);
        mobileInventory.addSmartPhone(iPhone13_pro_max);
        mobileInventory.addSmartPhone(googlePixel);
        mobileInventory.addSmartPhone(OnePlus);
        mobileInventory.addSmartPhone(OneP);
        mobileInventory.addSmartPhone(iPhone8);
        mobileInventory.addSmartPhone(iPhone_se);

        System.out.println("Hi, welcome to Sesame's Mobile, " + "here is a list of the phones in stock: \n");

        iPhone12.toString();
        note20.toString();
        iPhone13_pro_max.toString();
        googlePixel.toString();
        OnePlus.toString();
        OneP.toString();
        iPhone8.toString();
        iPhone_se.toString();


        System.out.println("\n \nWould you like to purchase a phone? (Enter Yes or No) ");


        Scanner myInput = new java.util.Scanner(System.in);
        String input = myInput.next();

        if (input.equalsIgnoreCase("yes")) {

            while (true) {
                System.out.println("\nTo better serve you, please select the operating system of your choice. (Enter Android or iOS or quit to stop) ");
                String OS = myInput.next();

                if (OS.equalsIgnoreCase("Android")) {

                    SmartPhone aPhoneType = mobileInventory.getPhoneByType("android");

                } else if (OS.equalsIgnoreCase("ios")) {

                    SmartPhone aPhoneType = mobileInventory.getPhoneByType("ios");

                } else if (OS.equalsIgnoreCase("quit")) {

                    System.out.println("\nThank you for visiting Sesame's Mobile");

                    break;
                }


            }


        } else if (input.equalsIgnoreCase("no")) {

            System.out.println("Thank you for visiting Sesame's Mobile");
        }


    }

}