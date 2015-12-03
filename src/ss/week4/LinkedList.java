package ss.week4;

public class LinkedList<Element> {

	private /* @ spec_public @ */ int size;
	private Node first;

	// @ ensures \result.size == 0;
	public LinkedList() {
		size = 0;
		first = null;
	}

	public void add(int index, Element element) {
		Node newNode = new Node(element);
		if (index == 0) {
			newNode.next = first;
			first = newNode;
		} else {
			Node p = getNode(index - 1);
			newNode.next = p.next;
			p.next = newNode;
		}
		size = size + 1;
	}

	// @ ensures this.size == \old(size) - 1;
	public void remove(Element element) {
		Node beforeNode = findBefore(element);
		if (beforeNode != null) {
			beforeNode.next = beforeNode.next.next;
		} else {

		}

		size--;
	}

	public Node findBefore(Element element) {
		Node lastNode = null;
		Node tmp = first;
		while (tmp != null && tmp.next != null) {
			if (tmp.next.element == element) {
				lastNode = tmp;
				break;
			} else {
				tmp = tmp.next;
			}
		}

		/*
		 * for (int i = 1; i < size; i++) { if
		 * (getNode(i).element.equals(element)) { lastNode = getNode(-1); } }
		 */
		return lastNode;
	}

	// @ requires 0 <= index && index < this.size();
	public Element get(int index) {
		Node p = getNode(index);
		return p.element;
	}

	// @ requires 0 <= i && i < this.size();
	private /* @ pure @ */ Node getNode(int i) {
		Node p = first;
		int pos = 0;
		while (pos != i) {
			p = p.next;
			pos = pos + 1;
		}
		return p;
	}

	// @ ensures \result >= 0;
	public /* @ pure @ */ int size() {
		return size;
	}

	public class Node {
		private Element element;
		public Node next;

		public Node(Element element) {
			this.element = element;
			this.next = null;
		}

		public Element getElement() {
			return element;
		}
	}
}
