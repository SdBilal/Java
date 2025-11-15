package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array ={1,5,6,7,4,3};
        int size= array.length;;

        for(int num:array){
            System.out.print(num+" ");
        }

        for(int i=1;i<size;i++){

            int key=array[i];
            int j=i-1;

            while(array[j]>key&&j>=0){
                array[j+1]=array[j];
                j--;
            }

            array[j+1]=key;

        }

        System.out.println();

        for(int num:array){
            System.out.print(num+" ");}

    }
}
