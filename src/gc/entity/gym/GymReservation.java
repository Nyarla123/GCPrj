package gc.entity.gym;

import java.util.Date;

public class GymReservation {
	
	private int id;
	private int price;
	private int userId;
	private int gymId;	
	private int memberId;
	private int number;	
	private Date regdate;
	private Date date;
	
	public GymReservation() {
		
	}

	public GymReservation(int id, int price, int userId, int gymId, int memberId, int number, Date regdate, Date date) {
		super();
		this.id = id;
		this.price = price;
		this.userId = userId;
		this.gymId = gymId;
		this.memberId = memberId;
		this.number = number;
		this.regdate = regdate;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "GymReservation [id=" + id + ", price=" + price + ", userId=" + userId + ", gymId=" + gymId
				+ ", memberId=" + memberId + ", number=" + number + ", regdate=" + regdate + ", date=" + date + "]";
	}
	
}
