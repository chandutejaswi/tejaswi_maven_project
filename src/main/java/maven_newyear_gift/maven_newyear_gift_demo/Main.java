package maven_newyear_gift.maven_newyear_gift_demo;
import java.util.ArrayList;
public class Main {
	 public static void main(String[] args)
     {
		   //objects for Chocolates
           Chocolates ch1=new Chocolates("KitKat",5.2,10,2.2,"nestle");
           Chocolates ch2=new Chocolates("5star",4.4,20,4.5,"Cadbury");
           Chocolates ch3=new Chocolates("Munch",6.0,20,6.5,"Nuts");
           //chocolates objects for Gift1
           ArrayList<Chocolates> choco1=new ArrayList<Chocolates>(2);
           choco1.add(ch1);
           choco1.add(ch2);
           //objects for Candies
           Candies ca1=new Candies("Lollypop",6.0,10,2.2,"Strawberry");
           Candies ca2=new Candies("Gems",4.4,20,4.5,"Coffee");
           Candies ca3=new Candies("Jelly",8.2,5,6.1,"Mango");
           //Candies objects for Gift1
           ArrayList<Candies> candy1=new ArrayList<Candies>(2);
           candy1.add(ca1);
           candy1.add(ca2);
           //Gift1
           Gift g1=new Gift("Sri Ram",choco1,candy1);
           g1.calculate_weight();
           g1.sortbyCost();
           g1.findCandies();
           //Chocolates objects for Gift2
           ArrayList<Chocolates> choco2=new ArrayList<Chocolates>(2);
           choco2.add(ch2);
           choco2.add(ch3);
           //Candies objects for Gift2
           ArrayList<Candies> candy2=new ArrayList<Candies>(2);
           candy2.add(ca2);
           candy2.add(ca3);
           //Gift2
           Gift g2=new Gift("Bhuvana",choco2,candy2);
           g2.calculate_weight();
           g2.sortbyCost();
           g2.findCandies();
           
    }
}
