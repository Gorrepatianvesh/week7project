
public class DriverClass {

	  public static void main(String args[]){  
	         Person p1=new Student(101,"Sohan Kumar", "", "", "");  
	         Person p2=new Visitor(102,"Mohan Kumar", "", "", "");  
	         Person p3=new Jobseeker(103,"Mahiwal", "", "", "");   
             Person p = new PersonComponent(104,"Seema", "", "", "");
 
	          p.add(p1);
	          p.add(p2);
	          p.add(p3);
	          p.print();  
	        }  

}
