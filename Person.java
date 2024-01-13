import java.util.Scanner;

public class Person {

	private int age =18;
	private String name;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void displayPerson()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Person p= new Person("pavithra",18);
				p.displayPerson();
		}
}
