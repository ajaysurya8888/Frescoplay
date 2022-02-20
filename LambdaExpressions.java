import java.io.*;
import java.util.*;

class Employee
{
    int id;
    String name;
    int age;
    //Create the Constructor here
    
    Employee(String name , int id , int age ){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}

class SortEmployees 
{
    void sortEmployees(ArrayList<Employee> empList) 
    {
       empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(i -> System.out.println(i.getName()+" "+i.getId()+" "+i.getAge()));
        //Enter your Code here
        
        
    }
}

public class SortEmployeesMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> empList=new ArrayList<>();
		
		 int n=Integer.parseInt(br.readLine().trim());
		 for(int i=0;i<n;i++)
		 {
			 String inp=br.readLine();
	         String inparr[]=inp.split(" ");
			 
			 Employee ws=new Employee(inparr[0],Integer.parseInt(inparr[1]), Integer.parseInt(inparr[2]));
			 empList.add(ws);
		 }
		
		SortEmployees s1=new SortEmployees();
		s1.sortEmployees(empList);
    }
}
