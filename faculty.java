//Faculty example 


package ThursdayLabTest;

class Faculty
{
	String name;
	int salary;
	int basic;

	Faculty(String name,int basic)
	{
		this.name=name;
		this.basic=basic;
	}


	public int getSalary() {
		salary=basic;
		return salary;
	}


	public String getDetails()
	{
		return name+ " " +getSalary();
	}
	
}
class AssistantProfessor extends Faculty
{
	int DA;
	public AssistantProfessor(String name,int basic,int DA)
	{
		super(name,basic);
		this.DA=DA;
	}
	public int getSalary()
	{
		return super.getSalary()+((super.getSalary()*DA)/100);
		
	}
	public String getDetails()
	{
		return "Assistant Professor:" +name+" "+this.getSalary();
	}

}
class AssociateProfessor extends AssistantProfessor
{
	public int medAllowance;
	public AssociateProfessor(String name,int basic,int DA,int medAllowance)
	{
		super(name,basic,DA);
		
	}
	public int getSalary()
	{
		return super.getSalary()+medAllowance;
	}
	public String getDetails()
	{
		return "AssociateProfessor" +name+" "+getSalary();
	}
}
class Professor extends AssociateProfessor
{
	public int otherAllowance;
	public Professor(String name,int basic ,int DA,int medAllowance,int otherAllowance)
	{
		super(name,basic,DA,medAllowance);
		this.otherAllowance=otherAllowance;
	}
	public int getSalary()
	{
		return super.getSalary()+((otherAllowance*super.getSalary())/100);
	}
	public String getDetails()
	{
		return "prof" +name+ " "+getSalary();
	}
}

public class TestFaculty {

	public static void main(String[] args) {
		AssistantProfessor a=new AssistantProfessor("kalgi",20000,13000);
		System.out.println(a.getDetails());
		AssistantProfessor a1=new AssistantProfessor("kalgi",20000,13000);
		System.out.println(a.getDetails());
		
		
		

	}

}
