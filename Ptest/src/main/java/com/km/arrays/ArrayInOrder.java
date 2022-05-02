package com.km.arrays;

import java.sql.Array;
import java.util.Scanner;

public class ArrayInOrder
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the flag: ");
         Boolean flag=scanner.nextBoolean();
        int array[]={4,3,5,6,1,2};

        if (flag) {
            for (int i = 0; i <= array.length - 1; i++) {
                for (int j = i + 1; j <= array.length - 1; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                    }
                }
                System.out.println(array[i]);
            }
        }
        else
        {
            for (int i = 0; i <= array.length - 1; i++) {
                for (int j = i + 1; j <= array.length - 1; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                    }
                }
                System.out.println(array[i]);
            }
        }
    }
}
