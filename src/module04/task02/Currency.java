package module04.task02;

public enum Currency {
	USD("usd"),
	EUR("eur");
	
	private String currency;
	
	private Currency(String currency){
		this.currency=currency;
	}

	public String getCurrency() {
		return currency;
	}
}
