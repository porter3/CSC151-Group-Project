public class Classroom extends Room {

   private int noOfChairs;
  
   public Classroom(int area) {
       super(area);
       noOfChairs = 0;
   }

   public Classroom(int area, int noOfChairs) {
       super(area);
       this.noOfChairs = noOfChairs;
   }

   public int getNoOfChairs() {
       return noOfChairs;
   }


   public void setNoOfChairs(int noOfChairs) {
       this.noOfChairs = noOfChairs;
   }

   public int getCapacity() {
       return this.noOfChairs;
   }

   @Override
   public String toString() {
       return "Classroom:\n" + super.toString() + "\n# of Chairs: " + this.noOfChairs + "\n";
   }
}

