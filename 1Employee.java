package Employe;

public class Employee {
	String name;
	int id;
	long salary;
	Employee(String name,int id,long salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
}
void display() {
	System.out.println("employee name"+name);
	System.out.println("employee id"+id);
	System.out.println("employee salary"+salary);	
}
void increase_salary(int n) {
	double increment=(salary*n)/100;
	salary+=increment;
	System.out.println("increased salary is"+salary);
}
}
