package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

public static void main(String[] args) {
	MemberTreeMap membertreemap = new MemberTreeMap();
	
	membertreemap.addMember(new Member(1001, "È«±æµ¿"));
	membertreemap.addMember(new Member(1003, "¸í°ÇÈñ"));
	membertreemap.addMember(new Member(1004, "±èÀ¯½Å"));
	membertreemap.addMember(new Member(1002, "ÀÌ¼ø½Å"));
	
	membertreemap.showAllMember();
	
//	membertreemap.removeMember(1004);
//	membertreemap.showAllMember();
	
	
}
	
}
