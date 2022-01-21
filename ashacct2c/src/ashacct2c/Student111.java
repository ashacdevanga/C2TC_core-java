package ashacct2c;

public class Student111 {
			int rollno;
			String name;
			 static String collage="JNNCE SHIMOGA";
			Student111(int r,String n)
			{
				 rollno=r;
				  name=n;
			}
			static void change()
			{
			  String collage ="MALNAD";
			}
			void display()
			{
				System.out.println(rollno+" "+name+" "+collage);
			}
		 public static void main(String[] args) {
			 Student111 s1=new Student111(111,"aniketh");
			 Student111 s2=new Student111(222,"anil");
			 change();
			 s1.display();
			 s2.display();
			}
		
	}


