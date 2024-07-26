package Assigment_8_Arrays;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m :");
        int m=sc.nextInt();
        System.out.println("Enter n :");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[i][j]=arr[j][i];
            }
        }
        for(int[] a : res)
        {
            for(int ele : a)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
