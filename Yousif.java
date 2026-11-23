public class Yousif{
   //instance variables
   private int age;
   private double height;
   private String location;
   private String favoritePhrase;
   private boolean sayingPhraseCurrently;
   
   //constructors
   public Yousif() {
   age = 16;
   height = .59;
   location = "Seattle";
   favoritePhrase = "Veda Veda Veda";
   
   sayingPhraseCurrently = false;
   }
   
   public Yousif(int age, double height, String location, String favoritePhrase,   boolean sayingPhraseCurrently) {
      this.age = age;
      this.height = height;
      this.location = location;
      this.favoritePhrase = favoritePhrase;
            this.sayingPhraseCurrently = sayingPhraseCurrently;
   }
   //this constructor is og Yousif
   public Yousif(int age, String location) {
      this.age = age;
      this.location = location;
   }
   
   //methods
   public void sing() {
      //Yousif will sing his favorite phrase
      System.out.println("Yousif says " + favoritePhrase);
      sayingPhraseCurrently = true;
   }
   
   public void stopSing() {
      //Yousif will stop singing his favorite phrase
   }
   
   public void laugh() {
      //Yousif will laugh
   }
   
   public void move(String newLoc) {
      //Yousif will update location to newLoc
   }
   
   public int birthday() {
      //Age will increase by 1
      return 0;
   }
}