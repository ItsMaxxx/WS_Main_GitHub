package Semester_1;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toCharArray();
        char[] reversed = new char[chars.length];

        for(int i = 0; i < chars.length; i++){
            reversed[chars.length - 1 - i] = chars[i];
        }

        for(int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i]);
        }


    }



}
