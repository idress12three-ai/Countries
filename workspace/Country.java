public class Country
{
  // add private instance variables for the name, capital, language, and image file.
      private String name;
      private String capital;
      private String language;
      private String imagefile;
  // add constructors
      public Country (String name,String capital,String language,String imagefile){
              this.name=name;
              this.capital=capital;
              this.language=language;
              this.imagefile=imagefile;
      }
      public Country(){
            name="default";
            capital="default";
            language="default";
            imagefile="default";
      }
  // Write accessor/get methods for each instance variable that returns it.
      public String getname(){
        return name;
      }
      public String getcapital(){
        return capital;
      }
      public String getlanguage(){
        return language;
      }
      public String getimagefile(){
        return imagefile;
      }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
      public String toString(){
            return (name + "'s capital is " + capital + " and its primary language is " + language + ".");
      }


  
}

