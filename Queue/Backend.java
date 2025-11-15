package Queue;

public class Backend {
    int[] Queue =new int [5];
    int rear;
    int front;
    int size;
    public void EnQueue(int n){
        Queue[rear]=n;
        rear++;
        size++;
    }
    public void Show(){
        System.out.print("Elements = ");
        for(int i=0;i<=size-1;i++){
            System.out.print(Queue[i] + " ");
        }
        System.out.println();
    }
    public int DeQueue(){
        int n=front;
        int bsize=Queue.length;
        int data=Queue[front];
        for(int j=0;j<size-1;j++) {
            if(j==size-2){
                Queue[n] = Queue[n + 1];
                Queue[n+1]=0;
            }
            else {
                Queue[n] = Queue[n + 1];
                n++;
            }
        }
        size--;
        rear--;
        System.out.println();
        System.out.print(data + " is removed successfully ! --> ");
        System.out.println();
        return data;
    }
}
