package week3.day1.studentinfo;

public class Students {
	public int id;
	public String name;
	public String email;
	public double phoneNumber;
	
	public void getStudentInfo(int id)
	{
		 id=id+10;	
	}
	public void getStudentInfo(int id, String name)
	{
		this.id = id;
		this.name=name;		
	}
	public void getStudentInfo(long phoneNumber, String email)
	{
		this.phoneNumber=phoneNumber;
		this.email=email;	
	}
	public void display()
	{
		System.out.println("Student Name is :"+name+"\n"+"Student Id is :"+id+"\n"+"Student email :"+email+"\n"+"Student PhoneNumber is :"+phoneNumber);
	}

	public static void main(String[] args) {			
		Students obj = new Students();
		obj.getStudentInfo(10);
		//System.out.println("Static Id is:" + id);;	
		obj.getStudentInfo(2038, "Manon");
		//System.out.println("Student Id is :" + id);
		//System.out.println("Student Name is :" + name);
		obj.getStudentInfo(73854754648l, "manonraj26@gmail.com");
		//System.out.println("Student Phone Number is :" + phoneNumber);
		obj.display();
	}

}
