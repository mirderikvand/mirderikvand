
public class MirderikvandMesal3 {
   public static void main(String[] args)
   {
	      String str = "Computer science is a dynamic science.";
	      String substr = "science";
	      int count ;
	      count = countSpaces(str);
	      System.out.println("String is: " + str);
	      System.out.println("Number of blanks is: " + count);
	      count = substringCount(str, substr);
	      System.out.println("***");
	      System.out.println("String is: " + str);
	      System.out.println("subString is: " + substr);
	      System.out.println("subString iterates " + count + " times in str.");

   }
   
   public static int countSpaces(String s)
   {
      int count = 0;
      int index = s.indexOf(' ');
      while(index >= 0)
      {
        count ++;
        index = s.indexOf(' ', index + 1);
      }
      return count;
   }
   public static int substringCount(String s, String substring)
   {
      int count = 0;
      int index = s.indexOf(substring);
      while(index >= 0)
      {
        count ++;
        index = s.indexOf(substring, index + 1);
      }
      return count;
   }

}
