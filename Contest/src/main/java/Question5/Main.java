package Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Please enter the size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Product of highest numbers: "+ max_product(array));
    }

    public  static int max_product(int[] array){
       int product =Integer.MIN_VALUE;
       int length=array.length;
       for(int i=0;i<length;i++){
           for(int j=0;j<length;j++){
               if(i!=j){
                   if(array[i]*array[j]>product){
                       product=array[i]*array[j];
                   }
               }
           }
       }
       return product;
    }
}
