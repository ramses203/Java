package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
public static void main(String[] args) {
	
	MemberTreeSet membertreeset = new MemberTreeSet();
	
	
	Member memberLee = new Member(1001, "�̽���");
	Member memberKim = new Member(1002, "������");
	Member memberPark = new Member(1003, "�ڼ���");
	
	
	
	membertreeset.addMember(memberLee);
	membertreeset.addMember(memberKim);
	membertreeset.addMember(memberPark);
	membertreeset.showAllMember();
	
	
}
}
