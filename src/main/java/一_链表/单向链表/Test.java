package 一_链表.单向链表;

import java.util.*;

public class Test {

	@org.junit.Test
	public void test(){
		List<Node> list = new ArrayList<>();
		for(int i=1;i<=5;i++){
			String name = "name_"+i;
			Node node = new Node(i,name);
			list.add(node);
		}
		
		LinkedList linkedList = new LinkedList();
		for(Node  node: list){
			linkedList.insert(node.num,node.name);
		}
		linkedList.delete(2);
		linkedList.print();
		System.out.println(linkedList.size());
		
		System.out.println("-----------------");
		linkedList.reverse();
		linkedList.print();
		System.out.println(linkedList.size());
		System.out.println(linkedList.getLast().name);
	}
}

