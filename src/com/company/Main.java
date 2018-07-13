package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een tekst van minstens 8 karakteres: ");
        String sInput = scanner.nextLine();
        int iLengte = sInput.trim().length();

/*
        if (iLengte >= 8) {
            sInput=sInput.toUpperCase();
            System.out.println("Je tekst is \"" + sInput+"\"");
        } else {
*/
            while (iLengte < 8) {
                System.out.println("Kieken, ik zei minstens 8. Opnieuw: ");
                sInput = scanner.nextLine();
                iLengte = sInput.trim().length();
            }
            sInput=sInput.toUpperCase();
            System.out.println("De tekst in hoofdletters is \"" + sInput+"\"");
//        }
    }
}
