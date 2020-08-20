package list;
public class doublyRunner {
    public static void main(String args[])
    {
        doublyList list =new doublyList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(0);
        list.insertAt(3,500);
        list.insertAt(1,600);
        list.deleteAt(2);
        list.deleteAt(0);
        System.out.println("Count:" + list.getCount());
        list.show();
    }
}
