package com.kmc.pa;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInOrder
{
    int array[]={4,3,6,5,1,2};

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the flag: ");
        Boolean flag = scanner.nextBoolean();
        ArrayInOrder arrayInOrder=new ArrayInOrder();
        arrayInOrder.flags(flag);

    }
    public void flags(boolean flag)
    {
            for (int i = 0; i <= array.length - 1; i++) {
                for (int j = i + 1; j <= array.length - 1; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                    }
                }

            }
        if (flag)
        {
            for (int a:array)
            {
                System.out.println(a);
            }
        }
        else
        {
            for (int k=array.length-1; k>=0; k--)
            {
                System.out.println(array[k]);
            }
        }
        }

}
