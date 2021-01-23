package circular;

public class circularList {
    Node head;
    protected void InsertAtLast(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.next=head;
        }
    }
    protected void show()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
