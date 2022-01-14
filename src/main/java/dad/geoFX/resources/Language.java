package dad.geoFX.resources;

public class Language {
	
	private String code;
	
    private String name;
    
    private String mynative;

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getMynative() {
		return mynative;
	}

	@Override
	public String toString() {
		return "Language [code=" + code + ", name=" + name + ", mynative=" + mynative + "]";
	}
}
