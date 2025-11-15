package Stack;

public class Classes {
    public int top=0;
    int[] arr =new int[5];
    public void push(int n){
        if(arr.length-1<=top-1){
            System.out.println("stack is full");
        }
        else {
            arr[top] = n;
            top++;
        }
    }
    public int pop(){
        if(top<=0){
            System.out.println("stack is empty");
            return 0;
        }
        else {
            int data = arr[top - 1];
            arr[top - 1] = 0;
            top--;
            return data;
        }
    }
    public int peek(){
        return arr[top-1];
    }
    public void show(){
        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(top<=0){
            return true ;
        }
        return false;
    }
    public int size(){
        return top;
    }
}
