public class Elevator extends Room {

   private int currentFloor;

   public Elevator(int area) {
       super(area);
   }
  
   public void up(int floors) {
       this.currentFloor += floors;
   }
  
   public void down(int floors) {
       this.currentFloor -= floors;
   }
  
   @Override
   public String toString() {
       return "Elevator:\n" + super.toString() + "\nCurrent Floor: " + this.currentFloor + "\n";
   }
}
