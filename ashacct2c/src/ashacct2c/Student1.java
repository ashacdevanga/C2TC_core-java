package ashacct2c;

public class Student1 {
	int rollno;
	String name;
	 String collage;
	Student1(int r,String n, String c )
	{
		 rollno=r;
		  name=n;
	      collage=c;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+collage);
	}
 public static void main(String[] args) {
	 Student1 s1=new Student1(111,"aniketh","JNNCE SHIMOGA");
	 Student1 s2=new Student1(222,"anil","JNNCE SHIMOGA");
	 s1.display();
	 s2.display();
	}
}
