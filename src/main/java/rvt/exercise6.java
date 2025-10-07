package rvt;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi vardu");
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(s1);
        
        int i = 0;
        while(i < 30){
            System.out.println(s2);
            i = i + 1;
        }
        System.out.println(s2);
       }
}
