package com.km.arrays;

import java.sql.Array;
import java.util.Scanner;

public class ArrayInOrder
{
    public static void main(String[] args)
    {
        int array[]={4,3,5,6,1,2};

        for (int i=0; i<=array.length-1;i++)
        {
            for (int j=1; j<=array.length-1;j++)
            {
              int smallest=array[i];
                if (array[i] > array[j])
                {
                     smallest=array[j];

                }
                System.out.println(smallest);
            }

        }

    }
}
