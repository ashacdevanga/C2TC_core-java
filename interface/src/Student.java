
interface Writeable{
void writes();
}
interface Readable {
void reads();
}
public class Student implements Readable,Writeable
{
public void reads() {
System.out.println("Student reads.. ");
}
public void writes(){
System.out.println("Student writes..");
}
public static void main(String args[]){
Student s = new Student();
s.reads();
s.writes();
} }
