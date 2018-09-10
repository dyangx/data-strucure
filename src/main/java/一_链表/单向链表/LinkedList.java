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
		Node current = this.first;
		Node nextNode = null;
		while(current.next != null){
			nextNode = current.next;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
