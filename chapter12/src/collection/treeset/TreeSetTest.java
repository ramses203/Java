package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("ȫ�浿");
		treeSet.add("�̼���");
		treeSet.add("������");
		
		for(String t : treeSet) {
			System.out.println(t);
		}
		
	}
	
}
