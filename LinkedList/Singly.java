package LinkedList;
public class Singly{
    Node head;
    public void add(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.print(n.data);
    }
    public void addFirst(int data){
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void addAt(int data,int index) {
        Node node = new Node();
        Node n = head;
        if (index == 0) {
            addFirst(data);
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.data = data;
            node.next = n.next;
            n.next = node;
        }
    }
    public void delete(int index){
        Node n=head;
        Node n1=null;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
        n1=null;
    }
}