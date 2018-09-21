package j_flyweight.example3;

public class Flyweight_Authorization implements Flyweight {
	
	private String securityEntity;
	
	private String permit;
	
	

	public Flyweight_Authorization(String securityEntity, String permit) {
		this.securityEntity = securityEntity;
		this.permit = permit;
	}



	@Override
	public boolean match(String securityEntity, String permit) {
		if (securityEntity.equals(this.securityEntity)&&permit.equals(this.permit)) {
			return true;
		}
		return false;
	}



	@Override
	public String toString() {
		return "Flyweight_Authorization [securityEntity=" + securityEntity + ", permit=" + permit + "]";
	}
	
	
}
