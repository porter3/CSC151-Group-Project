/**
 * Creates a classroom object, a subclass of Room.
 * 
 * @author Carlos Osorio
 * Course: CSC151.0002
 */
public class Classroom extends Room {
	
   //INSTANCE VARS
	
   private int noOfChairs;
  
   
   //CONSTRUCTORS
   
   /**
    * Creates a classroom with a given area
    */
   public Classroom(int area) {
       super(area);
       noOfChairs = 0;
   }

   /**
    * Creates a new classroom with a given area and number of chairs
    */
   public Classroom(int area, int noOfChairs) {
       super(area);
       this.noOfChairs = noOfChairs;
   }
   
   
   //ACCESSORS

   /**
    * Returns number of chairs
    */
   public int getNoOfChairs() {
       return noOfChairs;
   }

   /**
    * Returns the room capacity
    */
   @Override
   public int getCapacity() {
       return this.noOfChairs;
   }
   

   //MUTATORS
   
   /**
    * Sets the classroom's number of chairs
    */
   public void setNoOfChairs(int noOfChairs) {
       this.noOfChairs = noOfChairs;
   }

   
   //OTHER METHODS
   
   /**
    * Returns classroom information in formatted string
    */
   @Override
   public String toString() {
       return "Classroom:\n" + super.toString() + "\n# of Chairs: " + this.noOfChairs + "\n";
   }
}

