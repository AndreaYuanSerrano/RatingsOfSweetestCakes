public enum SweetestCake{
     CHOCOLATE(80), 
	 BLUEBERRY(100), 
	 STRAWBERRY(70), 
	 CARROT(50); 
    
    private final int RatingsOfCakes;

   SweetestCake(int RatingsOfCakes){
	   this.RatingsOfCakes = RatingsOfCakes;
   }
	   public int getRatingsOfCakes() {
        return RatingsOfCakes;
    
   }
}