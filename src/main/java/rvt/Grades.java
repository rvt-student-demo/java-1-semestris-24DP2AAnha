package rvt;
import java.util.Scanner;

public class Grades {
        public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Input grades");

            int input = reader.nextInt();

            if (input == 0) {
                System.out.println("Impossible");
            }
            else if (input >= 1 && input <= 49) {
                System.out.println("failed");
            }
            else if (input >= 50 && input <= 59) {
                System.out.println("1");
            }
            else if (input >= 60 && input <= 69) {
                System.out.println("2");
            }
            else if (input >= 70 && input <= 79) {
                System.out.println("3");
            }
            else if (input >= 80 && input <= 89) {
                System.out.println("4");
            }
            else if (input >= 90 && input <= 99) {
                System.out.println("5");
            }
            else if (input == 100) {
                System.out.println("Incredible");
            }

            reader.close(); 
        }
    }
