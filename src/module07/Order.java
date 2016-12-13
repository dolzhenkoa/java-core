package module07;

public class Order implements Comparable {
	private long id;
	private int price;
	private Currency currency;
	private String itemName;
	private String shopIdentificator;
	private User user;
	
	public Order() { }

	public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
		this.id = id;
		this.price = price;
		this.currency = currency;
		this.itemName = itemName;
		this.shopIdentificator = shopIdentificator;
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price+", user.city=" + user.getCity() +"]";
		/*return "Order [id=" + id + ", price=" + price + ", currency=" + currency + ", itemName=" + itemName
				+ ", shopIdentificator=" + shopIdentificator + ", user=" + user + "]";*/
	}

	@Override
	public int compareTo(Object order) {
		if (((Order) order).getPrice()<price)
            return -1;
        else if (((Order) order).getPrice()>price)
            return 1;
        else
            return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + price;
		result = prime * result + ((shopIdentificator == null) ? 0 : shopIdentificator.hashCode());
		//result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (currency != other.currency)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (price != other.price)
			return false;
		if (shopIdentificator == null) {
			if (other.shopIdentificator != null)
				return false;
		} else if (!shopIdentificator.equals(other.shopIdentificator))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getShopIdentificator() {
		return shopIdentificator;
	}

	public void setShopIdentificator(String shopIdentificator) {
		this.shopIdentificator = shopIdentificator;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
