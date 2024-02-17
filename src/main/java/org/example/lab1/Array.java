package org.example.lab1;

public class Array {

    public void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public double sumArr(int [] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double evenNumber(int [] arr)  {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;

    }

    public int interval(int [] arr, int a, int b){
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i] && arr[i] < b) {
                cnt++;
            }
        }
        return cnt;

    }
    public boolean checkNumber(int [] arr){
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                cnt++;
            }
        }
        if(cnt == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void permutation(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
