package B_Uebung.uebung02_NS.Aufgabe_06;

import java.util.Scanner;

public class Aufgabe_06b_neu {

    public static void main (String[] args){
        Scanner myScanner = new Scanner (System.in);

        int n;

        System.out.println("Zahl eingeben:");

        if (myScanner.hasNextInt()) {

            if ((n = myScanner.nextInt()) <= 50 && n >= 0){

                n = myScanner.nextInt();

                System.out.println(n);

            }

        }

        else {
            System.err.println("Falsche Eingabe");
            System.exit(1);
        }

        myScanner.close();


    }
    
}

