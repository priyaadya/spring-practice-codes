package Autowiring;

public class Certificate {
	private String cName;
	private double cDuration;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getcDuration() {
		return cDuration;
	}
	public void setcDuration(double cDuration) {
		this.cDuration = cDuration;
	}
	public Certificate() {
		
	}
	@Override
	public String toString() {
		return "Certificate [cName=" + cName + ", cDuration=" + cDuration + "]";
	}
	
	
	

}
