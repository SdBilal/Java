package Queue;

public class Execute {
    public static void main(String[] args) {
        Backend q = new Backend();
        q.EnQueue(5);
        q.EnQueue(4);
        q.EnQueue(3);
        q.EnQueue(2);
        q.EnQueue(1);
        q.Show();
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        q.Show();
        q.EnQueue(5);
        q.EnQueue(4);
        q.EnQueue(3);
        q.EnQueue(2);
        q.DeQueue();
        q.Show();
    }

}
