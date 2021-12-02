
public class Wilder {
	String firstname;
	boolean aware;
	
	
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public boolean isAware() {
		return aware;
	}
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	
	public String whoAmI(boolean isAware){
		if(isAware){
			return "Je m'apelle " + getFirstname() + " et je suis aware.";
		}
		else {
			return "Je m'apelle " + getFirstname() + " et je ne suis pas aware.";
		}
	};
	
}
