package LinkedList;


public class Executable {
    public static void main(String[] args) {

        Singly nums = new Singly();
        nums.add(2);
        nums.add(3);
        nums.add(6);
        nums.addFirst(1);
        nums.addAt(5,3);
        nums.delete(2);
        nums.show();
    }
}
