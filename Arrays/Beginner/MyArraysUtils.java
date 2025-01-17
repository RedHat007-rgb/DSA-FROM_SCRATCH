/*
## Problem 1: Print in Reverse

**Description**:
Given an array of integers, print the elements of the array in reverse order.

**Input**:
- The first line contains an integer `N` (1 \<= N \<= 1000), the size of the array.
- The second line contains `N` space-separated integers.

**Output**:
- Print the elements of the array in reverse order, separated by spaces.

**Example**:
```
Input:
5
1 2 3 4 5
Output:
5 4 3 2 1
```

*/
package Beginner;

import java.util.Scanner;

public class MyArraysUtils {

    public static void main(String[] args){
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array1=new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<size;i++){
            array1[i]=sc.nextInt();
        }
        // System.out.print(sum(array1));
        System.out.println(MinMAx(array1));
        //  System.out.println("Enter the Number to find:");
        // int number=sc.nextInt();
        // yes2(array1,number);
        //problem2(array1,number);
        //array1();
    }

    // public static void   array1(){
    //     System.out.println("Enter the size of an array:");
    //     Scanner sc=new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int[] array1=new int[size];
    //     System.out.println("Enter the elements of an array:");
    //     for(int i=0;i<size;i++){
    //         array1[i]=sc.nextInt();
    //     }
    //     int[] array2 = new int[size];
    //     for(int i=0;i<size;i++){
    //         array2[size - 1 - i] = array1[i];
    //     }
    //     System.out.println("The reversed array is:");
    //     for (int i = 0; i < size; i++) {
    //         System.out.print(array2[i] + " ");
    //     }
    // }

/*
## Problem 2: Position of Element B

**Description**:
Find the first occurrence of the element `B` in the array. If the element does not exist, print `-1`.

**Input**:
- The first line contains an integer `N` (1 \<= N \<= 1000), the size of the array.
- The second line contains `N` space-separated integers.
- The third line contains the integer `B`.

**Output**:
- Print the 1-based index of the first occurrence of `B`. If `B` is not found, print `-1`.

**Example**:
```
Input:
6
1 3 5 7 9 11
7
Output:
4
*/


    // public static int  problem2(int[] A,int B){
    //     for(int i=0;i<A.length;i++){
    //         if(A[i]==B){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

/*
Check whether a given integer `X` is present in the array.

**Input**:
- The first line contains an integer `N` (1 \<= N \<= 1000), the size of the array.
- The second line contains `N` space-separated integers.
- The third line contains the integer `X`.

**Output**:
- Print `Yes` if `X` is present, otherwise print `No`.

**Example**:
```
Input:
5
4 8 15 16 23
15
Output:
Yes 
*/
    // public static String yes2(int[] A, int X){
    //     for(int i=0;i<A.length;i++){
    //         if(A[i]==X){
    //             System.out.print("Yes");
    //         }
    //     }
    //     return "No";
    // }

    /*
    Compute the sum of all elements in the array.

**Input**:
- The first line contains an integer `N` (1 \<= N \<= 1000), the size of the array.
- The second line contains `N` space-separated integers.

**Output**:
- Print the sum of all elements in the array.

**Example**:
```
Input:
4
5 10 15 20
Output:
50
     */


    // public static int sum(int[] A){
    //     int sum=0;
    //     for(int i=0;i<A.length;i++){
    //         sum=sum+A[i];
    //     }
    //     return sum;
    // }

    /*
    **Description**:
Find the maximum and minimum values in the array.

**Input**:
- The first line contains an integer `N` (1 \<= N \<= 1000), the size of the array.
- The second line contains `N` space-separated integers.

**Output**:
- Print two space-separated integers: the maximum and minimum values in the array.

**Example**:
```
Input:
5
12 3 45 7 8
Output:
45 3
    */


    public static int   MinMAx(int[] A){
        int min=1001;
        for(int i=0;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        return min;
    }
}

