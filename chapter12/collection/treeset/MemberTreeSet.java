package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeset;
	
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeset.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
				if(tempId == memberId) {
					treeset.remove(member);
					return true;
				}
			}
			System.out.println(memberId + "�������� �ʽ��ϴ�.");
			return false;
	}

	public void showAllMember() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
