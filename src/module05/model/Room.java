package module05.model;

import java.util.Date;

public class Room {
	private long id;
	private int price;
	private int persons;
	private Date dateAvailableFrom;
	private String hotelName;
	private String cityName;
	
	public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
		super();
		this.id = id;
		this.price = price;
		this.persons = persons;
		this.dateAvailableFrom = dateAvailableFrom;
		this.hotelName = hotelName;
		this.cityName = cityName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + persons;
		result = prime * result + price;
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
		Room other = (Room) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (persons != other.persons)
			return false;
		if (price != other.price)
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

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public Date getDateAvailableFrom() {
		return dateAvailableFrom;
	}

	public void setDateAvailableFrom(Date dateAvailableFrom) {
		this.dateAvailableFrom = dateAvailableFrom;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
