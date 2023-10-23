package lab2_1;

public class Room {
	private String roomNo;
	private String roomType;
	private int roomSquareArea;
	private String[] computers;
	
    public Room(String roomNo, String roomType, int roomSquareArea, String[] computers) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomSquareArea = roomSquareArea;
        this.computers = computers;
    }
	
	   public void setData(String roomNo, String roomType, int roomSquareArea, String[] computers) {
	        this.roomNo = roomNo;
	        this.roomType = roomType;
	        this.roomSquareArea = roomSquareArea;
	        this.computers = computers;
	    }
	   
	   public void displayData() {
		   System.out.println("Room No: " + roomNo);
		   System.out.println("Room type: " + roomType);
		   System.out.println("Room square area: " + roomSquareArea);
		   System.out.println("Computers available: " + computers);
		   
		   System.out.println();
	   }

	/**
	 * @return the roomNo
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return the roomSquareArea
	 */
	public int getRoomSquareArea() {
		return roomSquareArea;
	}

	/**
	 * @param roomSquareArea the roomSquareArea to set
	 */
	public void setRoomSquareArea(int roomSquareArea) {
		this.roomSquareArea = roomSquareArea;
	}

	/**
	 * @return the computers
	 */
	public String[] getComputers() {
		return computers;
	}

	/**
	 * @param computers the computers to set
	 */
	public void setComputers(String[] computers) {
		this.computers = computers;
	}
	
	
	

}
