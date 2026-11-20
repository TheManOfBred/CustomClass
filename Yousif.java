public class Yousif{
   //instance variables
   private int age;
   private double height;
   private String girlfriendName;
   private String favoritePhrase;
   private boolean hasGirlfriend;
   private boolean sayingPhraseCurrently;
   
   //constructors
   public Yousif() {
   age = 16;
   height = .59;
   girlfriendName = "Clementine";
   favoritePhrase = "Veda Veda Veda";
   hasGirlfriend = false;
   sayingPhraseCurrently = false;
   }
   
   public Yousif(int age, double height, String girlfriendName, String favoritePhrase, boolean hasGirlfriend, boolean sayingPhraseCurrently) {
      this.age = age;
      this.height = height;
      this.girlfriendName = girlfriendName;
      this.favoritePhrase = favoritePhrase;
      this.hasGirlfriend = hasGirlfriend;
      this.sayingPhraseCurrently = sayingPhraseCurrently;
   }
}