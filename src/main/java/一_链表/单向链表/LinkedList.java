package 一_链表.单向链表;

class Node{
	int num;
	String name;
	Node next;
	public Node(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
}
public class LinkedList {
	private Node first;
	private Node last;
	
	public boolean isEmpty(){
		return this.first == null;
	}
	
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public void print(){
		Node node = this.first;
		while(node != null){
			System.out.println("学号："+node.num+"   姓名："+node.name);
			node = node.next;
		}
	}
	
	public void insert(int num,String name){
		Node node = new Node(num,name);
		if(this.first == null){
			this.first = node;
			this.last = node;
		}else{
			this.last.next = node;
			this.last = node;
		}
	}
	
	public void delete(int num){
		Node node = this.first;
		Node preNode = null;
		while(node != null){
			if(node.num == num){
				if(this.first.num == num){
					this.first = this.first.next;
				}else if(node.next == null){
					preNode.next = null;
				}else{
					preNode.next = node.next;
				}
			}
			preNode = node;
			node = node.next;
		}
	}
	
	public void reverse(){
		Node last_ = this.first;
		Node current = this.first;
		Node before = null;
		while(current != null){
			this.last = before;
			before = current;
			current = current.next;
			before.next = last;
		}
		this.first = before;
		this.last = last_;
		
	}
	
	public Node reverse(Node head){
		if(head == null || head.next == null){
			first = head;
			return head;
		}
		Node newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		last = head;
		return newHead;
	}
	
	public Node reverse2(Node head){
		if(head == null){
			return head;
		}
		last = head;
		Node curr = head.next;
		Node prev = head;
		Node temp = null;
		while(curr != null){
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head.next = null;
		first = prev;
		return prev;
	}
	
	public int size(){
		Node node= first;
		int size = 0;
		while(node != null){
			node = node.next;
			size++;
		}
		return size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
