package rvt;
import java.util.Scanner;

public class exerecise1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi skaitlus");
        int s1 = input.nextInt();
        int s2 = input.nextInt();

        while (s1 < s2){
        
            System.out.print(s1 + "\n");
            s1 = (s1 + 1);
        }
        System.out.println(s2);
    }
}
