package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberhashset = new MemberHashSet();
		
		memberhashset.addMember(new Member(1001, "������"));
		memberhashset.addMember(new Member(1002, "�豤��"));
		memberhashset.addMember(new Member(1003, "�ֿ���"));
		memberhashset.addMember(new Member(1003, "�ֿ���"));
		memberhashset.showAllMember();
		
		memberhashset.addMember(new Member(1003, "ȫ�浿"));
		memberhashset.showAllMember();
	}
	
}
