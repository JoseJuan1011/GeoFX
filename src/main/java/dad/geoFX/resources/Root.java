package dad.geoFX.resources;

public class Root {
	private String ip;
	private String hostname;
	private String type;
	private String continent_code;
	private String continent_name;
	private String country_code;
	private String country_name;
	private String region_code;
	private String region_name;
	private String city;
	private String zip;
	private double latitude;
	private double longitude;
	private Location location;
	private TimeZone time_zone;
	private Currency currency;
	private Connection connection;
	private Security security;

	public String getIp() {
		return ip;
	}

	public String getHostname() {
		return hostname;
	}

	public String getType() {
		return type;
	}

	public String getContinent_code() {
		return continent_code;
	}

	public String getContinent_name() {
		return continent_name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public String getRegion_code() {
		return region_code;
	}

	public String getRegion_name() {
		return region_name;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public Location getLocation() {
		return location;
	}

	public TimeZone getTime_zone() {
		return time_zone;
	}

	public Currency getCurrency() {
		return currency;
	}

	public Connection getConnection() {
		return connection;
	}

	public Security getSecurity() {
		return security;
	}

	@Override
	public String toString() {
		return "Root [ip=" + ip + ", hostname=" + hostname + ", type=" + type + ", continent_code=" + continent_code
				+ ", continent_name=" + continent_name + ", country_code=" + country_code + ", country_name="
				+ country_name + ", region_code=" + region_code + ", region_name=" + region_name + ", city=" + city
				+ ", zip=" + zip + ", latitude=" + latitude + ", longitude=" + longitude + ", location=" + location
				+ ", time_zone=" + time_zone + ", currency=" + currency + ", connection=" + connection + ", security="
				+ security + "]";
	}
}
