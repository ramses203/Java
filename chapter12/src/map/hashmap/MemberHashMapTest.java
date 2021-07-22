package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberhashmap = new MemberHashMap();
		
		memberhashmap.addMember(new Member(1001, "이지원"));
		memberhashmap.addMember(new Member(1002, "김유신"));
		memberhashmap.addMember(new Member(1003, "최원영"));
		memberhashmap.addMember(new Member(1004, "홍길동"));
		memberhashmap.showAllMember();
		
		memberhashmap.removeMember(1004);
		memberhashmap.showAllMember();
		
	}
	
}
