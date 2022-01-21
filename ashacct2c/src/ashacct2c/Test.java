package ashacct2c;
class Student
   {
     int rollno;
     String name;
     float fee;
   Student(int rollno,String name,float fee)
     {
    	 this.rollno=rollno;
    	 this.name=name;
    	 this.fee=fee;
     }
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+fee);
     }

     public class Test {
     public static void main(String[] args) {
		Student s1=new Student(111,"aniketh",1000f);
		Student s2=new Student(221,"rao aniketh",2000f);
		s1.display();
		s2.display();
	}
		
	}

}
