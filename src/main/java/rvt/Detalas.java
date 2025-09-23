package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int Skruves = reader.nextInt();
        int uzgriezni = reader.nextInt();
        int paplaksni = reader.nextInt();
        int Scena = 5;
        int Suz = 3;
        int Spa = 1;
        if (Skruves == uzgriezni && paplaksni == Skruves * 2 && paplaksni == uzgriezni * 2) {
            System.out.println("Ar pasutijumu viss kartiba");
            Scena = Scena * Skruves;
            Suz = Suz * uzgriezni;
            Spa = Spa * paplaksni;
            int cena = Scena + Suz + Spa;
            System.out.println("Kopeja cena ir:" + cena);
            reader.close();
        } 
        else if (Skruves != uzgriezni && paplaksni != Skruves * 2) {
            System.out.println("Saja pasutijuma ir kluda");
            System.out.println("Uzgriezni vai skruves ir par maz vai pa daudz");
            System.out.println("Paplaksni ir pa maz vai pa daudz");
        }
        else if (Skruves != uzgriezni) {
            System.out.println("Saja pasutijuma ir kluda");
            System.out.println("Uzgriezni vai skruves ir par maz vai pa daudz");
        }
        else if (paplaksni != Skruves * 2) {
            System.out.println("Saja pasutijuma ir kluda");
            System.out.println("paplaksnes ir par maz vai pa daudz");
        }
    }
}
