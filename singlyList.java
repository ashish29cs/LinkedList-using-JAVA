package list;

public class singlyList {
	Node head;
	public void insertAtLast(int data)
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
		}
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{System.out.println(temp.data);
			
			temp=temp.next;
		}
	}
	 public void getCount()
	    {
	        Node temp=head;
	        int count=0;
	        while(temp!=null)
	        {
	            count++;
	            temp=temp.next;
	        }
	        System.out.println("Count = " +count);;

	    }
	public void insertAtStart(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=null;
        }
        node.next=head;
        head=node;
    }
	public void insertAt(int index , int data)
    {
        Node node=new Node(data);
       if(index==0)
        {
            insertAtStart(data);
        }
        else
            {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
            }
    }
	public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n=head;
            Node n1;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            n1=null;
        }
    }

}
