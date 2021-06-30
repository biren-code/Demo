package Demo.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
class Dog implements Serializable
{
int i=10;
int j=20;
}
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException
    {
    	Dog d1=new Dog();
//    	System.out.println("Serialization started");
//    	FileOutputStream fos=new FileOutputStream("C://Users//biredas//Desktop//AAE//obj.ser.txt");
//    	ObjectOutputStream oos=new ObjectOutputStream(fos);
//    	oos.writeObject(d1);
//    	System.out.println("Serialization ended");
    	System.out.println("Deserialization started");
    	FileInputStream fis=new FileInputStream("C://Users//biredas//Desktop//AAE//obj.ser.txt");
    	ObjectInputStream ois=new ObjectInputStream(fis);
    	Dog d2=(Dog)ois.readObject();
    	System.out.println("Deserialization ended");
    	System.out.println(d2.i+"................"+d2.j);
    }
}
