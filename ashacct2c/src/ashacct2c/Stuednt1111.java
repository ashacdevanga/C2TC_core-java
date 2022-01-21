package ashacct2c;

public class Stuednt1111 {
			int rollno;
			String name;
			 static String collage;
			 static
			 {
				 collage="JNNCE SHIMOGA";
			 }
			void Student1111(int r,String n)
			{
				 rollno=r;
				  name=n;
			}
			static void change()
			{
			   collage ="MALNAD";
			}
			void display()
			{
				System.out.println(rollno+" "+name+" "+collage);
			}
		 public static void main(String[] args) {
			 Student1111 s1=new Student1111(111,"aniketh");
			 Student1111 s2=new Student1111(222,"anil");
			 change();
			 s1.display();
			 s2.display();
			}
		
	




	}

}
