interface Sayable{
default void say(){
System.out.println("Hello, this is default method");
}
void sayMore(String msg);
}
public class Interface implements Sayable{
public void sayMore(String msg){
System.out.println(msg);
}
public static void main (String[] args) {
Interface dm = new Interface();
dm.say();
dm.sayMore("Work is worship");
}
} 

