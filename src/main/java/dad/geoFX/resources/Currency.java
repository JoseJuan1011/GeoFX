package dad.geoFX.resources;

public class Currency {
	private String code;
	private String name;
	private String plural;
	private String symbol;
	private String symbol_native;

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getPlural() {
		return plural;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getSymbol_native() {
		return symbol_native;
	}

	@Override
	public String toString() {
		return "Currency [code=" + code + ", name=" + name + ", plural=" + plural + ", symbol=" + symbol
				+ ", symbol_native=" + symbol_native + "]";
	}
}
