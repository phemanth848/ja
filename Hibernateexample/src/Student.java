// Change for Git 
public class Student {
	
	private int sid ;
	private String name;
    private int rollno; 
    public Student() {
    }
    public Student(int sid, String name, int rollno) {
		super();
		this.sid = sid;
		this.name = name;
		this.rollno = rollno;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
    

}
