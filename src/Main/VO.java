package Main;

public class VO {

	private String id;
	private String pw;
	private String name;
	private int age;

	public VO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public VO(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public VO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
