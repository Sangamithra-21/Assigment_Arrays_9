package Assigment_8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k :");
        int k=sc.nextInt();
        k=k%n;
        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
        System.out.println(Arrays.toString(arr));


    }
    private static void reverse(int i,int j,int[] arr)
    {
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
