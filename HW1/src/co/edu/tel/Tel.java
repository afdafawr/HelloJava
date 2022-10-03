package co.edu.tel;

public class Tel {
	private int mainnumber;
	private int telNumber; //전화번호
	private String friend; // 친구이름
	private String bDay;   //생일
	
	public Tel(int mainnumber, int telNumber, String friend, String bDay) {
		super();
		this.mainnumber = mainnumber;
		this.telNumber = telNumber;
		this.friend = friend;
		this.bDay = bDay;
	}

	@Override
	public String toString() {
		return "Tel [mainnumber=" + mainnumber + ", telNumber=" + telNumber + ", friend=" + friend + ", bDay=" + bDay
				+ "]";
	}

	public int getMainnumber() {
		return mainnumber;
	}

	public void setMainnumber(int mainnumber) {
		this.mainnumber = mainnumber;
	}

	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}
	
	
	
}
