/**
 * Creates a Room object.
 * 
 * @author Carlos Osorio
 * Course: CSC151.0002
 */
public class Room {
   
   //INSTANCE VARS
   private int area;
   
   
   //CONSTRUCTORS
   
   /**
    * Creates a new room with a given area
    */
   public Room(int area) {
       this.area = area;
   }
   
   
   //ACCESSORS
   
   /**
    * Returns area of the room
    */
   public int getSquareFeet() {
       return this.area;
   }
  
   /**
    * Returns room capacity
    */
   public int getCapacity() {
       return (this.area / 9);
   }
   
   
   //MUTATORS
   /**
    * Sets the area of the room
    */
   public void setSquareFeet(int area) {
	   this.area = area;
   }
   

   //OTHER METHODS
   
   /**
    * Returns room information in a formatted string
    */
   public String toString() {
       return "Area: " + this.area + " square feet\tCapacity: " + getCapacity();
   }
}
