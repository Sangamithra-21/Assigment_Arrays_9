package Assigment_8_Arrays;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int left=0,right=n-1,up=0,down=n-1;
        int val=1;
        while(left<=right && up<=down)
        {
            for(int i=left;i<=right;i++)
            {
               arr[up][i]=val++;
            }
            up=up+1;
            for(int j=up;j<=down;j++)
            {
                arr[j][right]=val++;
            }
            right=right-1;
            for(int k=right;k>=left;k--)
            {
                arr[down][k]=val++;
            }
            down=down-1;
            for(int l=down;l>=up;l--)
            {
                arr[l][left]=val++;
            }
            left=left+1;
        }

        for(int a[] : arr)
        {
            for(int ele : a)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
