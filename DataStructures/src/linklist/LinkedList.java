package linklist;

/**
 * @author Saurabh
 *
 */
public class LinkedList {

	Node head;

	/**
	 * Method adds new node to the beginning of list
	 * 
	 * @param value
	 */
	public void addNode(String value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
	}

	/**
	 * Method adds new node at the last of the list
	 * @param value
	 */
	public void addNodeAtLast(String value) {
		Node node = head;
		while(node.getNext() != null) {
			node = node.getNext();
		}
		Node newNode = new Node(value);
		node.setNext(newNode);
	}
	
	/**
	 * Adds node at given index position
	 * @param value
	 * @param index
	 */
	public void addNodeAtIndex(String value, int index) {
		
		int currentCount = 0;
		Node node = head;
		while(currentCount-1 != index) {
			node = node.getNext();
			currentCount++;
		}
		
		Node newNode = new Node(value);
		newNode.setNext(node.getNext());
		node.setNext(newNode);
	}
	
	/**
	 * Prints LinkedList on system console
	 */
	public void displayList() {
		Node node = head;
		while(node != null) {
			System.out.print(node.getValue()+"->");
			node = node.getNext();
		}
	}

}
