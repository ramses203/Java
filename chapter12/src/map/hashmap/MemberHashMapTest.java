package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberhashmap = new MemberHashMap();
		
		memberhashmap.addMember(new Member(1001, "������"));
		memberhashmap.addMember(new Member(1002, "������"));
		memberhashmap.addMember(new Member(1003, "�ֿ���"));
		memberhashmap.addMember(new Member(1004, "ȫ�浿"));
		memberhashmap.showAllMember();
		
		memberhashmap.removeMember(1004);
		memberhashmap.showAllMember();
		
	}
	
}
