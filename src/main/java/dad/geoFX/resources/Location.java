package dad.geoFX.resources;

import java.util.ArrayList;

public class Location {
	private int geoname_id;
	private String capital;
	private ArrayList<Language> languages;
	private String country_flag;
	private String country_flag_emoji;
	private String country_flag_emoji_unicode;
	private String calling_code;
	private boolean is_eu;
	
	public int getGeoname_id() {
		return geoname_id;
	}
	public String getCapital() {
		return capital;
	}
	public ArrayList<Language> getLanguages() {
		return languages;
	}
	public String getCountry_flag() {
		return country_flag;
	}
	public String getCountry_flag_emoji() {
		return country_flag_emoji;
	}
	public String getCountry_flag_emoji_unicode() {
		return country_flag_emoji_unicode;
	}
	public String getCalling_code() {
		return calling_code;
	}
	public boolean isIs_eu() {
		return is_eu;
	}
	
	@Override
	public String toString() {
		return "Location [geoname_id=" + geoname_id + ", capital=" + capital + ", languages=" + languages
				+ ", country_flag=" + country_flag + ", country_flag_emoji=" + country_flag_emoji
				+ ", country_flag_emoji_unicode=" + country_flag_emoji_unicode + ", calling_code=" + calling_code
				+ ", is_eu=" + is_eu + "]";
	}
}
