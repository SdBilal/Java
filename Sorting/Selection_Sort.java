package Sorting;
public class Selection_Sort {
    public static void main(String[] args) {
        int nums[]={6,5,3,2,8};
        int size=nums.length;
        int temp=0;
        int MinIndex=0;
        for(int num:nums){
            System.out.print(num+" ");
        }
        for(int i=0;i<size;i++) {
            MinIndex=i;
            for (int j=i+1; j < size; j++) {
                if (nums[MinIndex] > nums[j]) {
                    MinIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[MinIndex];
            nums[MinIndex] = temp;
        }
        System.out.println();
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
