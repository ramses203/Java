package exercise;

import java.util.HashSet;

public class StudentTest {
public static void main(String[] args) {
	HashSet<Student> set = new HashSet<>();
	set.add(new Student("100", "ȫ�浿"));
	set.add(new Student("200", "������"));
	set.add(new Student("300", "�̼���"));
	set.add(new Student("400", "�����"));
	set.add(new Student("100", "���߱�"));
	
	System.out.println(set);
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

	
}