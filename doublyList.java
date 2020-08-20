package list;

public class doublyList {
    Node head;
    public void insert(int data)
    {
        Node node=new Node(data);
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
            node.prev=temp;

        }
    }
    public void show()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is Empty..!");
            return;
        }
        else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
   public void insertAtStart(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;

        }
        node.next=head;
        node.prev=null;
        head=node;

    }
    public void insertAt(int index , int data)
    {
        Node node=new Node(data);
        if(index>getCount())
        {
            System.out.println("Enter size in range..!");
            System.out.println("Currently  " + getCount()+ "  node in list. ");

        }
        if(index==0)
        {
            insertAtStart(data);
        }
        else
        {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next=temp.next;
            node.prev=temp;
            temp.next=node;


        }
    }
    public int getCount()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;

    }
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node temp=head;
            Node node;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            node=temp.next;
            temp.next=node.next;
            temp.next.next.prev=node.prev;


            node=null;
        }
    }
}
