package lab2_1;

public class Main {

	public static void main(String[] args) {
        String[] computers = {"Computer 1", "Computer 2", "Computer 3"};
        Room room1 = new Room("Room 101", "Class with computers (PC)", 150, computers);
        room1.displayData();
        
        Room room2 = new Room("Room 102", "Class with Mac", 200, computers);
        room2.displayData();
        
	

	}

}
