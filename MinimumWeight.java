package Assigment_8_Arrays;

import java.util.Scanner;

public class MinimumWeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        int[][] weights=new int[n][];
        System.out.println("Enter your Number :");
        int id=sc.nextInt();
        enterWeight(id,weights);
        int min=calculateWeights(id,weights);
        System.out.println("Minimum Weight :"+min);

    }

    private static int calculateWeights(int id, int[][] weights) {
        int min=weights[id][0];
        for(int i=1;i<weights[id].length;i++)
        {
            if(min>weights[id][i])
            {
                min=weights[id][i];
            }
        }
        return min;
    }

    private static void enterWeight(int id,int[][] weights) {
        System.out.println("Enter number of weights : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        weights[id]=new int[n];
        for(int i=0;i<n;i++)
        {
            weights[id][i]=sc.nextInt();
        }


    }
}

