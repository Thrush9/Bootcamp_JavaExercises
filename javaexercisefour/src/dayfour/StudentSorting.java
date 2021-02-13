package dayfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable {
	
	String name;
	int rollno;
	
	public Student(String name,int num) {
		this.name = name;
		this.rollno = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int compareTo(Object obj) {
		Student nextStu = (Student) obj;
		return this.rollno - nextStu.rollno;
	}
	
}

class NumComp implements Comparator<Student>{
	 
	@Override
	public int compare(Student stu1, Student stu2) {
		if (stu1.getRollno() > stu2.getRollno())
			return -1;
		else if (stu1.getRollno() < stu2.getRollno())
			return 1;
		else
		    return 0;
	}
} 

public class StudentSorting {

	public static void main(String[] args) {
		
		Student stu1 = new Student("Rohit",45);
		Student stu2 = new Student("Virat",17);
		Student stu3 = new Student("Dhoni",7);
		Student stu4 = new Student("Rahul",1);
		
		ArrayList<Student> stuList = new ArrayList<Student>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);
        
        Collections.sort(stuList);
        System.out.println("Ascending Ordered List"); 
        for(Student stu: stuList){
			System.out.println(stu);
	   }
        
        TreeSet<Student> playList = new TreeSet<Student>(new NumComp());
        playList.add(stu4);
        playList.add(stu1);
        playList.add(stu3);
        playList.add(stu2);
        System.out.println("\nDescending Ordered List"); 
        for(Student s:playList){
            System.out.println(s);
        }
	}

}
