package list;

public class singlyRunner {

	public static void main(String[] args) {
		singlyList ll = new singlyList();
		ll.insertAtLast(1);
		ll.insertAtLast(2);
		ll.insertAtLast(3);
		ll.insertAtLast(4);
		ll.insertAtStart(5);
		ll.insertAtStart(6);
		ll.insertAt(2, 10);
		ll.insertAt(4, 15);
		ll.deleteAt(4);
		ll.getCount();
		ll.show();

	}

	

}
