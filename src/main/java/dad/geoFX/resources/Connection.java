package dad.geoFX.resources;

public class Connection {
	
	private int asn;
    private String isp;
	
    public int getAsn() {
		return asn;
	}
	public String getIsp() {
		return isp;
	}
	
	@Override
	public String toString() {
		return "Connection [asn=" + asn + ", isp=" + isp + "]";
	}  
}
