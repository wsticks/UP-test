package com.williams.uppertest.exercises;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

        private static final int NO_OF_CHARACTERS = 150;
        private static char count[] = new char[NO_OF_CHARACTERS];

        private static void getCharCountArray(String str)
        {
            for (int i = 0; i < str.length(); i++)
                count[str.charAt(i)]++;
        }

        private static int firstNonRepeating(String str)
        {
            getCharCountArray(str);
            int index = -1, i;
            for (i = 0; i < str.length(); i++) {
                if (count[str.charAt(i)] == 1) {
                    index = i;
                    break;
                }
            }
            return index;
        }

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter String: ");
            String str = s.nextLine();
            int index = firstNonRepeating(str);
            System.out.println(
                    index == -1
                            ? "All characters are repeating or the string "
                            + "is empty"
                            : "First non-repeating character is : "
                            + str.charAt(index));
        }
    }
