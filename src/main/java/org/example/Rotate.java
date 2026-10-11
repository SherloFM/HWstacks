package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,2, arr.length);
        for (int i:arr){
            System.out.print(
                    i
            );
        }
    }

    public static void rotate(int[] arr, int d, int n){

        if (arr.length==0){
            System.out.println("array is empty");
        }
        if (d>n){
            System.out.println("invalid input");
            return;
        }
        for (int i = 0; i < d; i++) {
            int front = arr[i];
            int back = arr[(n-1)-i];
            arr[i] = back;
            arr[(n-1)-i] = front;
        }
    }
}