package dad.geoFX.resources;

import java.util.Date;

public class TimeZone {
	private String id;
	private Date current_time;
	private int gmt_offset;
	private String code;
	private boolean is_daylight_saving;

	public String getId() {
		return id;
	}

	public Date getCurrent_time() {
		return current_time;
	}

	public int getGmt_offset() {
		return gmt_offset;
	}

	public String getCode() {
		return code;
	}

	public boolean isIs_daylight_saving() {
		return is_daylight_saving;
	}

	@Override
	public String toString() {
		return "TimeZone [id=" + id + ", current_time=" + current_time + ", gmt_offset=" + gmt_offset + ", code=" + code
				+ ", is_daylight_saving=" + is_daylight_saving + "]";
	}
}
