package ss.week4;

public class DoublyLinkedList<Element> {

	private /* @ spec_public @ */ int size;
	private Node head;

	// @ ensures this.size == 0;
	public DoublyLinkedList() {
		size = 0;
		head = new Node(null);
		head.next = head;
		head.previous = head;
	}

	// @ requires element != null;
	// @ requires 0 <= index && index <= this.size;
	// @ ensures this.size == \old(size) + 1;
	// @ ensures this.getNode(index).equals(element);
	public void add(int index, Element element) {
		Node newNode = new Node(element);
		if (size >= 1) {
			Node p = getNode(index - 1);
			newNode.next = p.next;
			newNode.next.previous = newNode;
			newNode.previous = p;
			p.next = newNode;
		} else {
			Node p = getNode(-1);
			p.next = newNode;
			p.previous = newNode;
			newNode.next = p;
			newNode.previous = p;
		}
		size++;
	}

	// @ requires 0 <= index && index < this.size;
	// @ ensures this.size == \old(size) - 1;
	public void remove(int index) {
		Node pastNode = getNode(index);
		pastNode.previous.next = pastNode.next;
		pastNode.next.previous = pastNode.previous;
		size--;
	}

	// @ requires 0 <= index && index < this.size;
	/* @ pure */ public Element get(int index) {
		Node p = getNode(index);
		return p.element;
	}

	/**
	 * The node containing the element with the specified index. The head node
	 * if the specified index is -1.
	 */
	// @ requires -1 <= i && i < this.size;
	// @ pure
	public Node getNode(int i) {
		Node p = head;
		int pos = -1;
		while (pos < i) {
			p = p.next;
			pos = pos + 1;
		}
		return p;
	}

	public int size() {
		return this.size;
	}

	public class Node {
		public Node(Element element) {
			this.element = element;
			this.next = null;
			this.previous = null;
		}

		private Element element;
		public Node next;
		public Node previous;

		public Element getElement() {
			return element;
		}
	}
}
