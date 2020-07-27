import java.util.Iterator;
import java.util.PriorityQueue;

 class Student implements Comparable {
 int id;
 String name;

	public Student(int id, String name)
	{
	
	this.id = id;
	this.name = name;
}

	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		return this.name.compareToIgnoreCase(s.name);
	}
	@Override
		public String toString() {
			return id +" "+name;
		}
     public void show() {
    System.out.println(id+" "+name);
	}
}
public class TreeSetDemo{
	public static void main(String[] args) {
		Student s1 = new Student(1, "adil");
		Student s2 = new Student(2, "bob");
		Student s3 = new Student(3, "adil");
		Student s4 = new Student(4, "sham");
		Student s5 = new Student(5, "adil");
		
		PriorityQueue<Student> t= new PriorityQueue<Student>();
	
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		System.out.println(t);
		
		Iterator<Student>i=t.iterator();
		while (i.hasNext()) {
			Student student = (Student) i.next();
			student.show();
		}
	
	}
}


