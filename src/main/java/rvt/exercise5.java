package rvt;

import java.util.Scanner;

public class exercise5 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi vardu");
        String s1 = input.next();
        int s2 = s1.length();

        for (int i = 0; i < s2; i++){
            System.out.println(s1);
        }
        }
}
