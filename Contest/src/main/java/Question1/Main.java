package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Please enter the size of 2D array(where rows==columns:");
        int size= sc.nextInt();
        int[][] array=new int[size][size];
        System.out.println("Enter the elements of the 2D array:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Maximum value of a diagonal is: " + primary_diagonal(array));
    }

    public static int primary_diagonal(int[][] array){
        int size=array.length;
        int element=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    if(array[i][j]>element){
                        element=array[i][j];
                    }
                }
            }
        }
        return element;
    }
}
