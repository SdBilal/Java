package Sorting;

import static Sorting.quick.partition;

class quick{
    static int partition(int[] arr, int low, int high) {
        int i=low-1;
        int pi=arr[high];
        int temp;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={7,6,8,9,4,3};
        int low=0;
        int high= arr.length-1;
        sort(arr,low,high);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
