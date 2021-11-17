/**
 * Creates an elevator object, a subclass of Room.
 * 
 * @author Carlos Osorio
 * Course: CSC151.0002
 */
public class Elevator extends Room {
   
   //INSTANCE VARS
	
   private int currentFloor;
   
   
   //CONSTRUCTORS
   
   /**
    * Creates a new elevator with given area
    */
   public Elevator(int area) {
       super(area);
       currentFloor = 0;
   }
   
   
   //ACCESSORS
   
   /**
    * Returns current floor elevator is on
    */
   public int getCurrentFloor() {
	   return currentFloor;
   }
  
   
   //MUTATORS
   
   /**
    * Moves elevator up the given amount of floors
    */
   public void up(int floors) {
       this.currentFloor += floors;
   }
  
   /**
    * Moves elevator down the given amount of floors
    */
   public void down(int floors) {
       this.currentFloor -= floors;
   }
  

   //OTHER METHODS
   
   /**
    * Returns elevator information in formatted string
    */
   @Override
   public String toString() {
       return "Elevator:\n" + super.toString() + "\nCurrent Floor: " + this.currentFloor + "\n";
   }
}
