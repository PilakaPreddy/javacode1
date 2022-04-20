//program to accept and display employee details using setter(Mutators)
//and getter (Accessor) methods

package prcode;
import java.util.Scanner;
class Employinfo
{
  private int empid, salary,annual;
  private String name,desig;
  void setEmpid(int eno)
  {
    empid=eno;
  }
  void setEname(String nam)
  {
    name=nam;
  }
  void setSalary(int sal)
  {
    salary=sal;
  }
  void setDesig(String des)
  {
    desig=des;
  }
  int getEmpid()
  {
    return empid;
  }
  String getEname()
  {
    return name;
  }
  int getSalary()
  {
    return salary;
  }
  String getDesig()
  {
    return desig;
  }
  void setAnnual()
  {
    annual=salary*12;
    
  }
  int getAnnual()
  {
    return annual;
    
  }
}
public class Employ {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int id,salary;
    String ename, desig;
    System.out.println("Enter id, name, desig and salary of the employee");
        id=sc.nextInt();
        ename=sc.next();
        desig=sc.next();
        salary=sc.nextInt();
        Employ e=new Employ();
        e.setEmpid(id);
        e.setEname(ename);
        e.setSalary(salary);
        e.setAnnual();
        System.out.println(e.getEname()+" salary is "+e.getSalary()+" and Annual Salary is "+e.getAnnual());
        sc.close();
        
  }

private String getAnnual() {
	// TODO Auto-generated method stub
	return null;
}

private String getSalary() {
	// TODO Auto-generated method stub
	return null;
}

private String getEname() {
	// TODO Auto-generated method stub
	return null;
}

private void setAnnual() {
	// TODO Auto-generated method stub
	
}

private void setSalary(int salary) {
	// TODO Auto-generated method stub
	
}

private void setEname(String ename) {
	// TODO Auto-generated method stub
	
}

private void setEmpid(int id) {
	// TODO Auto-generated method stub
	
}
}