package list;

public class doublyList {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;

        }
    }

    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty..!");
            return;
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;

        }
        node.next = head;
        node.prev = null;
        head = node;

    }

    public void insertAt(int index, int data) {
        Node node = new Node(data);
        if (index > getCount()) {
            System.out.println("Enter size in range..!");
            System.out.println("Currently  " + getCount() + "  node in list. ");

        }
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next = node;


        }
    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            Node node;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node = temp.next;
            temp.next = node.next;
            temp.next.next.prev = node.prev;


            node = null;
        }
    }

    public void findMiddle() {
        /*if(head==null)
            return;
        int count=0;
        for(Node temp=head; temp!=null;temp=temp.next)
            count++;
        Node temp=head;
        for(int i=0;i<count/2;i++)
        {
            temp=temp.next;
        }
        System.out.println("Middle Element of list = "+ temp.data);
        */
        //Efficient Solution
        if (head == null)
            return;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element of List = " + slow.data);

    }

    public void NthNodeFromEnd() {
       /* int n=2;
        getCount();
        if(count<n)
            return;
        Node temp=head;
        for(int i=0;i<=count-n+1;i++)
            temp=temp.next;
        System.out.println("Nth Node from End = " + temp.data);
    }*/
        //Using Two pointer
       int n = 4;
        if (head == null)
            return;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println("Node= " + second.data);

    }
}
