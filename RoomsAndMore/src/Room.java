public class Room {
   private int area;
   public Room(int area) {
       this.area = area;
   }
 
   public int getSquareFeet() {
       return this.area;
   }
  
   public int getCapacity() {
       return (this.area / 9);
   }
   
   /**
    * Sets the area of the room
    */
   public void setSquareFeet(int area) {
	   this.area = area;
   }

   @Override
   public String toString() {
       return "Area: " + this.area + " square feet\tCapacity: " + getCapacity();
   }
}
