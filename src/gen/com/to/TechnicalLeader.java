package gen.com.to;

public class TechnicalLeader extends Employee {

	public TechnicalLeader(String name, Integer lv) {
		super(name, lv);
	}

	@Override
	public void print(String text) {
		System.out.print("TechnicalLeader::"+text);
	}

}
