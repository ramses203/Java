package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

public static void main(String[] args) {
	MemberTreeMap membertreemap = new MemberTreeMap();
	
	membertreemap.addMember(new Member(1001, "ȫ�浿"));
	membertreemap.addMember(new Member(1003, "�����"));
	membertreemap.addMember(new Member(1004, "������"));
	membertreemap.addMember(new Member(1002, "�̼���"));
	
	membertreemap.showAllMember();
	
//	membertreemap.removeMember(1004);
//	membertreemap.showAllMember();
	
	
}
	
}
