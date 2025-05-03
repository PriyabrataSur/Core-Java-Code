package all.ex;

import java.util.Scanner;

public class CountdigNoRpt {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[4] ;
            System.out.print("Enter the elements of the array :");
            for(int i = 0 ; i< arr.length ; i++)
            {
                arr[i] = sc.nextInt();
            }

            int size = arr.length;

            int[] newarr = new int [size];

            for(int i = 1 ; i< arr.length ; i++)
            {
                if(arr[i-1]!=arr[i])
                {
                    newarr[i-1] = arr[i];
                }
            }

            System.out.println("The digits of the number:");
            for(int i = 0 ; i< newarr.length ; i++)
            {
                System.out.println(newarr[i]);
            }

        }
    }

