package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
private int memberId;
private String memberName;

public Member2(int memberId, String memberName){
	this.memberId = memberId;
	this.memberName = memberName;
}


@Override
public int compare(Member2 mem1, Member2 mem2) {
	
	return mem1.memberId - mem2.memberId;
}
}