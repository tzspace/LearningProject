package com.tz.learning.march.conditional;

public class SwitchTesting {
    public static void main(String [] args){
        int[] scoreArray = new int[]{100,5,70,90,45,80,60};
        char level;
        for (int j : scoreArray) {
            switch (j / 10) {
                case 10:
                case 9:
                    level = 'S';
                    break;
                case 8:
                    level = 'A';
                    break;
                case 7:
                    level = 'B';
                    break;
                case 6:
                    level = 'C';
                    break;
                default:
                    level = 'D';
                    break;

            }
            //System.out.println("The score is: " + scoreArray[i]);
            System.out.printf("The result is %s%n", j + ":" + level);
        }
    }
}
