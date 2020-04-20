package se.lexicon.carl;

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

    }

}
