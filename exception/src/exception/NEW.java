package exception;
public class NEW {
public static void main(String[] args) {
for (int i = 0; i < 3; i++){
try{
execute(i);
}
catch (Exception e) 
{
System.out.print("-");
}
}

}
public static void execute(int i) {
p('S');
try
{
p('H');
t(i == 1);
try
{
p('A');
t(i == 3);
}
finally 
{
p('R');
}
}
catch (Exception e) 
{
p('K');
t(i == 3);
} 
}
public static void p(char c)
{
System.out.print(c); }
public static void t(boolean thrw)
{
if (thrw)
throw new RuntimeException(); }
}
