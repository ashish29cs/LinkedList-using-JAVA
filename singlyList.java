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
	public void reverse()
	{
		Node prev=null;
		Node curr=head,nextNode=head;
		while(curr!=null)
		{
			nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		head=prev;
		
	}
	public void sumOfNodes() {
		int sum=0;
		Node temp=head;
		while(temp!=null)
		{
			sum=sum+temp.data;
			temp=temp.next;
			
		}
		System.out.println("Sum of Node = "+ sum);
		
	}
	public void maxOfNodes() {
		int max=Integer.MIN_VALUE;
		Node p=head;
		while(p!=null)
		{
			if(p.data>max)
			{
				max=p.data;
			}
			p=p.next;
		}
		System.out.println("Max of Linked list = "+ max);
	}
	public void searchOfNode(int key)
	{
		Node p=head;
		while(p!=null)
		{
			if(key==p.data)
			{
				System.out.println("Key Found = "+key);
				return;
			}
			p=p.next;
			
		}
		System.out.println("Key is not found");;
		
	}
	public void findMiddleElement()
	{
		if(head==null)
			return;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("Middle Element is -> " + slow.data);
		
		
	}
	public void nthNodeFromLast()
	{
		int n=3;
		if(head==null)
			return;
		Node first=head;
		Node second=head;
		for(int i=0;i<n;i++)
		{
			if(first==null)
				return;
			first=first.next;
			
		}
		while(first!=null)
		{
			second=second.next;
			first=first.next;
		}
		System.out.println("Nth Node from last is -> " + second.data);
		
		
	}
	public boolean isLoop()
	{
		Node first=head;
		Node second=head;
		while(first!=null && first.next!=null)
		{
			second=second.next;
			first=first.next.next;
			if(second==first)
				return true;
		}
		return false;
	}

}
