package rvt;

import java.util.Scanner;

public class Odd_and_even {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


            int input = reader.nextInt();

            if (input % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
            reader.close();
            }
        }

