package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for(int i = 0; i < arrayList.size(); i++) {
//		Member member = arrayList.get(i);
	
	Iterator<Member> ir = arrayList.iterator();
	
	while(ir.hasNext()){
		Member member = ir.next();
		int tempId = member.getMemberId();
		if(tempId == memberId) 
			arrayList.remove(0);
		return true;
	}
	System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index){
		arrayList.add(index, member);
		
	}
	
}
