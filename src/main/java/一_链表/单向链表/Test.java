package һ_����.��������;

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
		linkedList.delete(3);
		linkedList.print();
	}
}

