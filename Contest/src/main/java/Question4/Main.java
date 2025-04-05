package Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of an arraylist: ");
            int size=sc.nextInt();
            System.out.println("Enter the elements:");
            ArrayList<Integer> array = new ArrayList<Integer>(size);
            for(int i=0;i<size;i++){
                array.add(sc.nextInt());
            }

        System.out.println("Increaing order of a negitive number ArrayList:" + negitive_numbers(array));

    }

    public static ArrayList<Integer> negitive_numbers(ArrayList<Integer> array){
        int size=array.size();
        ArrayList<Integer> newarray=new ArrayList<>();
        for(int i=0;i<size;i++){
            if(array.get(i)<0 && array.get(i)%2!=0){
             newarray.add(array.get(i));
            }
        }
        Collections.sort(newarray);
        return newarray;
    }


}
