package se.lexicon.carl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

//        storeIntsAndPrint_01();
//        findIndex_02();
//        sortNames_03();
//        copyElementsToNewArray_04();
//        arrayIn2D_05();
//        averageOfValues_06();
//        printOnlyOddNumbers_07();
//        removeDuplicates_08();
        addElementsToArray_09();


    }

    public static void storeIntsAndPrint_01(){

        int[] array1 = {22, 11, 39, 252};

        for (int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
    }

    public static void findIndex_02(){

        int[] array1 = {10, 8, 6, 4, 2};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to find the index position of:");
        int choice = input.nextInt();
        int result = -1;

        for (int i=0; i<array1.length; i++){
            if (choice == array1[i]){
                result = i;
            }
        }
        if (result == -1){
            System.out.println("That number doesn't exist within the array.");
        }
        else
            System.out.println("The index of " + choice + " is " + result + ".");
    }

    public static void sortNames_03(){

        String[] array1 = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(array1);

        for (int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
    }

    public static void copyElementsToNewArray_04(){

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[4];

        for (int i=0; i<array2.length; i++){
            array2[i] = array1[i];
            System.out.println(array2[i]);
        }
    }

    public static void arrayIn2D_05(){

        String[][] locations = new String[2][2];

        locations[0][0] = "Sweden ";
        locations[0][1] = "Stockholm ";
        locations[1][0] = "France ";
        locations[1][1] = "Paris ";

        for (int i=0; i<locations.length; i++){
            for (int j=0; j<locations[i].length; j++){
                System.out.print(locations[i][j]);

                if (j == locations[i].length-1){
                    System.out.println();
                }
            }
        }
    }

    public static void averageOfValues_06(){

        double[] array1 = {43, 5, 23, 17, 2, 14};  // I don't like using int when division is involved.
        double sum = 0;

        for (int i=0; i<array1.length; i++){
            sum = (sum + array1[i]);
            System.out.print(array1[i] + " ");
        }

        double average = (sum/array1.length);
        System.out.println();
        System.out.println("The average of these numbers is " + average);
    }

    public static void printOnlyOddNumbers_07(){

        int[] array1 = {1, 2, 4, 7, 9, 12, 34, 6, 67, 5};

        for (int i=0; i<array1.length; i++){
            if ((array1[i] % 2) != 0){
                System.out.println(array1[i]);
            }
        }
    }

    public static void removeDuplicates_08(){

        int[] array1 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array1);                //Easier (possible) to work with when all the integers are in the right order.
        int uniques = 1;                    //This variable is how many unique numbers there are; this determines the size of the new array.

        for (int i=1; i<array1.length; i++){
            if (array1[i-1] != array1[i]){
                uniques++;
            }
        }

        int[] array2 = new int[uniques];    //New array with the perfect size.
        array2[0] = array1[0];              //The first number is always unique.
        int j=1;                            //As the first number is already set, we start at one instead of zero.

        for (int i=1; i<array1.length; i++){
            if (array1[i-1] != array1[i]){
                array2[j] = array1[i];
                j++;                        //Every time an non-duplicate number is found, it's put in the second array.
            }
        }

        for (int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }                                   //Not fond of the idea of three for-loops in one method, but it works.
    }

    public static void addElementsToArray_09(){

        int[] array1 = new int[0];
        int[] array2 = Arrays.copyOf(array1, array1.length+1);
        array2[0] = 47;

        System.out.println(array2[0]);
    }



}
