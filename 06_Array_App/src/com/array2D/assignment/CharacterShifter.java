package com.array2D.assignment;

import java.util.*;

public class CharacterShifter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        
        System.out.print("Enter the shift value: ");
        int n = sc.nextInt();

        int length = input.length();
        char[] result = new char[length];

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                char shiftedChar = (char) ((c - 'A' + n) % 26);
                if (shiftedChar < 0) {
                    shiftedChar += 26;
                }
                result[i] = (char) (shiftedChar + 'A');
            } else if (Character.isLowerCase(c)) {
                char shiftedChar = (char) ((c - 'a' + n) % 26);
                if (shiftedChar < 0) {
                    shiftedChar += 26;
                }
                result[i] = (char) (shiftedChar + 'a');
            } else {
                result[i] = c;
            }
        }

        System.out.print("Shifted string: ");
        for (char c : result) {
            System.out.print(c);
        }
        System.out.println();

    }
}
