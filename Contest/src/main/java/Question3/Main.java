package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enther the DIvisor: ");
        int divisor= sc.nextInt();
        System.out.println("Please enter the size of an Array: ");
        int size= sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The number of divisors: " +divisor(array,divisor));
    }

    public static  int divisor(int[] array,int number){
        int length=array.length;
        int count =0;
        for(int i=0;i<length;i++){
            if(array[i]==1){
                count=count+1;
            }else{
                if(array[i]!=0 && number% array[i]==0){
                    count=count+1;
                }
            }
        }
        return count;
    }
}


