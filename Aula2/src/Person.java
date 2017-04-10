
public class Person {
	
	private int age;
	private String name;
	private String course;
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(){
		
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCourse(String course){
		this.course = course;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCourse(){
		return course;
	}
	
	public void show(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Course: "+course);
	}
}
