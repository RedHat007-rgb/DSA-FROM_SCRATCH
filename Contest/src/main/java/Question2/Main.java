package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Please enter the size of an Array: ");
        int size= sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println(increasing_order(array));
    }


    public static ArrayList<Integer> increasing_order(int[] newArray){
        ArrayList<Integer> arrayList=new ArrayList<>();
        int length=newArray.length;
        for(int i=0;i<length;i++){
            if(newArray[i]%3==0){
                arrayList.add(newArray[i]);
            }
        }
        Collections.sort(arrayList);

        return arrayList;
    }
}
