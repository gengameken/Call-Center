package gen.com.to;

public abstract class Employee {
	private String name;
	private Integer lv;
	
	Employee(String name, Integer lv){
		this.setName(name);
		this.setLv(lv);
	}
	
	public abstract void print(String text);

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lv
	 */
	public Integer getLv() {
		return lv;
	}

	/**
	 * @param lv the lv to set
	 */
	public void setLv(Integer lv) {
		this.lv = lv;
	}
	
}
