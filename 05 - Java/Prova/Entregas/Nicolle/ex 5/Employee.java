public class Employee{

	String name;
	int age;

	Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void display(Manager employee)
	{
		System.out.println(employee.name);
		System.out.println(employee.age);
	}
}



