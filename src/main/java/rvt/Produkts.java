package rvt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Produkts {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Izveido savu produktu grozu!");

            String nosaukums = reader.nextLine();
            int skaits = reader.nextInt();
            double cena = reader.nextDouble();

            System.out.println(nosaukums);
            System.out.println(skaits);
            System.out.println(cena);
            System.out.println("Summa:");
            double totalprice = skaits * cena;
            DecimalFormat pie = new DecimalFormat("#.##");
            System.out.println("Izveido savu produktu grozu!" + pie.format(totalprice));
            reader.close(); 
    }

    
}
