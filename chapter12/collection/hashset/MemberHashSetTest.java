package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberhashset = new MemberHashSet();
		
		memberhashset.addMember(new Member(1001, "ÀÌÁö¿ø"));
		memberhashset.addMember(new Member(1002, "±è±¤±Ô"));
		memberhashset.addMember(new Member(1003, "ÃÖ¿ø¿µ"));
		memberhashset.addMember(new Member(1003, "ÃÖ¿ø¿µ"));
		memberhashset.showAllMember();
		
		memberhashset.addMember(new Member(1003, "È«±æµ¿"));
		memberhashset.showAllMember();
	}
	
}
