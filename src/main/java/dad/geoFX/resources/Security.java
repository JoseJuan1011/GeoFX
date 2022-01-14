package dad.geoFX.resources;

public class Security {
	private boolean is_proxy;
	private Object proxy_type;
	private boolean is_crawler;
	private Object crawler_name;
	private Object crawler_type;
	private boolean is_tor;
	private String threat_level;
	private Object threat_types;

	public boolean isIs_proxy() {
		return is_proxy;
	}

	public Object getProxy_type() {
		return proxy_type;
	}

	public boolean isIs_crawler() {
		return is_crawler;
	}

	public Object getCrawler_name() {
		return crawler_name;
	}

	public Object getCrawler_type() {
		return crawler_type;
	}

	public boolean isIs_tor() {
		return is_tor;
	}

	public String getThreat_level() {
		return threat_level;
	}

	public Object getThreat_types() {
		return threat_types;
	}

	@Override
	public String toString() {
		return "Security [is_proxy=" + is_proxy + ", proxy_type=" + proxy_type + ", is_crawler=" + is_crawler
				+ ", crawler_name=" + crawler_name + ", crawler_type=" + crawler_type + ", is_tor=" + is_tor
				+ ", threat_level=" + threat_level + ", threat_types=" + threat_types + "]";
	}
}
