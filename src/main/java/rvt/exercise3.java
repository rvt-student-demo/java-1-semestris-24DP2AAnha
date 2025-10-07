package rvt;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("ievadi skaitlus");
        int sss = input.nextInt();
        int s3 = 1;
        int s4 = 0;
        while (s3 < sss + 1){
            s4 += s3 * s3;
            s3 = s3 + 1;
            System.out.print(s4 + "\n");
        }
    }

}
