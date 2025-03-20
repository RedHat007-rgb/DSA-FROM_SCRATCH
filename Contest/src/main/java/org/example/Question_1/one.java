package org.example.Question_1;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns=sc.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("maximum of an array is:"+max(array));
    }

    public static int max(int[][] A){
        int rows=A.length;
        int columns=A[0].length;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    if(A[i][j]>maximum){
                        maximum=A[i][j];
                    }
                }
            }
        }
        return maximum;
    }


}
