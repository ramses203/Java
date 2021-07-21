package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {
public static void main(String[] args) {
	
	MemberTreeSet membertreeset = new MemberTreeSet();
	
	
	Member memberLee = new Member(1001, "ÀÌ½ÂÁØ");
	Member memberKim = new Member(1002, "±èÀ¯½Å");
	Member memberPark = new Member(1003, "¹Ú¼­ÁØ");
	
	
	
	membertreeset.addMember(memberLee);
	membertreeset.addMember(memberKim);
	membertreeset.addMember(memberPark);
	membertreeset.showAllMember();
	
	
}
}
