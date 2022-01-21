package ashacct2c;

public class Student11 {
			int rollno;
			String name;
			static String collage="JNNCE SHIMOGA";
			Student11(int r,String n)
			{
				int rollno=r;
				String  name=n;
			      
			}
			void display()
			{
				System.out.println(rollno+" "+name+" "+collage);
			}
		 public static void main(String[] args) {
			 Student11 s1=new Student11(111,"aniketh");
			 Student11 s2=new Student11(222,"anil");
			 s1.display();
			 s2.display();
			}
		


	}


