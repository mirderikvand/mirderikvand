import java.util.*;
public class MirderikvandMesal2 {
	static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
   {
	      System.out.print("reshte aval ra vared konid:");
	      String str1 = console.next();
	      System.out.print("reshte dovom ra vared konid:");
	      String str2 = console.next();
	      if(str1.compareTo(str2) == 0)
	         System.out.println("do reshte ba ham barabarand.");
	      if(str1.compareTo(str2) < 0)
	         System.out.println("reshte dovom bozorgtar ast.");
	      if(str1.compareTo(str2) > 0)
	         System.out.println("reshte aval bozorgtar ast.");
	}
}
