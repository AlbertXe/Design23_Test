package e_prototype.example8;

public class Prototype1 implements Cloneable, Prototype {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() {
		Prototype1 prototype1 = null;
		try {
			prototype1 = (Prototype1) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype1;
	}
	
	

}
