//from array of numbers and given sum of two integers, find the two integers that add up to the sum
package Assignment_2;

import java.util.*;

public class Adder {

    public int[] getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] != arr[i]) {
                } else {
                    System.out.println("Duplicate, re-enter number.");
                    i = i - 1;
                    break;
                }
            }
        }
        return arr;
    }

    static int[] numsum(int[] arr, int target) {
        int[] newarr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    newarr[0] = arr[i];
                    newarr[1] = arr[j];
                    return newarr;
                }
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        Adder obj = new Adder();
        int[] arr = obj.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum: ");
        int targetsum = sc.nextInt();
        System.out.println("The numbers are: ");
        int[] a = numsum(arr, targetsum);
        for (int i = 0; i < a.length; i++) { 
            System.out.println(a[i]);
        }
    }
}
