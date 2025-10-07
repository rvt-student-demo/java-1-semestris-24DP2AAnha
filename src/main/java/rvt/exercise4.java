package rvt;

import java.util.Scanner;

public class exercise4 {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi skaitlus");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = s1;

        while (s1 < s2){
            s1 = (s1 + 1);
            s3 = s3 + s1;

        }
        System.out.println(s3);
        }
}
