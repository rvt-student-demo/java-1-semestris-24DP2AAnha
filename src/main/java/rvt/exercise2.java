package rvt;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi skaitlus");
        int sss = input.nextInt();
        int s2 = 0;
        int s3 = 1;
        while (s3 < sss + 1){
            s2 = s2 + s3;
            s3 = s3 + 1;
            System.out.print(s2 + "\n");
        }
    }
}
