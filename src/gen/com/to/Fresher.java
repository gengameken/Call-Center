package gen.com.to;

public class Fresher extends Employee {

	public Fresher(String name, Integer lv) {
		super(name, lv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String text) {
		System.out.print("Fresher::"+text);
	}

}
