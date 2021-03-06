import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Visitor implements Person{
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneno;

    List<Person> persons = new ArrayList<Person>();  

	public Visitor(int id, String name, String email, String address, String phoneno)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
	}

	@Override
	public int getId() {

		return id;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public String getEmail() {

		return email;
	}

	@Override
	public String getAddress() {

		return address;
	}

	@Override
	public String getPhoneno() {

		return phoneno;
	}

	@Override
	public void print() {
		 System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("==========================");  
	        
	      Iterator<Person> it = persons.iterator();  
	        
	          while(it.hasNext())  {  
	        	  Person p = it.next();  
	            p.print();  
	         }  
	     }  
	

	@Override
	public void add(Person p) {
		persons.add(p);
	}

	@Override
	public void remove(Person p) {
		persons.remove(p);
	}

	@Override
	public Person getChild(int i) {
		return persons.get(i);
	}

}
