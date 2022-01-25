package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main1 {
public static void main(String[] args) throws IOException {
FileInputStream fis = null;
try {
	fis = new FileInputStream("D:/myfile.txt");
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
int k;
while(( k = fis.read() ) != -1)
{
System.out.print((char)k);
}
fis.close();
}
}
