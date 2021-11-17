/**
 * Tests the Elevator, Room, and Classroom classes.
 * 
 * @author Jessica Miller, CSC151 Faculty
 * Course: CSC151.0002
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);

		// declare an ArrayList containing Room elements
		ArrayList<Room> rooms = new ArrayList<>();
		
		//create Random object
		Random rand = new Random();
		
		//offer user menu choice
		System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
		int inp = kybd.nextInt();
		while (inp != 3) {
			//creating new classroom
			if (inp == 1) {
				System.out.println("How many chairs? ");
				int ch = kybd.nextInt();
				//create new classroom with a random area
				Room current = new Classroom(rand.nextInt(1000) + 100, ch);
				// add current to the ArrayList
				rooms.add(current);
			//creating new elevator
			} else if (inp == 2) {
				//create new elevator with a random area
				Elevator current = new Elevator(rand.nextInt(100) + 10);
				//randomly moves elevator up or down
				if (rand.nextInt(2) == 0) {
					current.up(rand.nextInt(10));
				} else {
					current.down(rand.nextInt(10));
				}
				// add current to the ArrayList
				rooms.add(current);
			}
			System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" + "\n\t3: exit");
			inp = kybd.nextInt();
		}
		kybd.close();
		
		// create a for loop to walk through the ArrayList its elements, one per line
		for(Room room: rooms) {
			System.out.println(room.toString());
		}

	}

}
