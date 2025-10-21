package rvt;

import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();   
        int result = random.nextInt(7);
        System.out.println("ievadi skaitlus");
        System.out.println(result);
        int pipars = 0;
        while (pipars != 3){
            int sss = input.nextInt();
            pipars += 1;
            if (result == sss) {
                System.out.println("Pareizi");
                break;
            }
            else{
                System.out.println("nepareizi");
                continue;
            }
        
        }
        if (pipars == 3) {
            System.out.println("games gone");
            System.out.println("pareizais skaitlis bij " + result);
        }
    }
}
