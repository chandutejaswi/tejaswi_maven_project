package maven_newyear_gift.maven_newyear_gift_demo;
import java.util.ArrayList;
public class Gift {
	ArrayList<Chocolates> ch;
	ArrayList<Candies> c;
    double weight;
    String name_of_child;
    double cost;
    //constructor of Gift class
    Gift(String s,ArrayList<Chocolates> ch,ArrayList<Candies> c)
    {
          name_of_child=s;
          this.ch=ch;
          this.c=c;
          weight=0.0;
    }
    //calculating the total weight of child gift
    void calculate_weight()
    {
    	  System.out.println("---------------"+name_of_child+"---------------");
          for(int i=0;i<ch.size();i++)
          {
               weight+=ch.get(i).getWeight();
          }
          for(int i=0;i<c.size();i++)
          {
               weight+=c.get(i).getWeight();
           }
        System.out.println("Total weight of children's gift is :"+weight);
   }
   //sorting the chocolates by cost
   void sortbyCost()
   {
         for(int i=0;i<ch.size();i++)
         {
             for(int j=0;j<ch.size();j++)
              {
                    if(ch.get(i).getCost()>ch.get(i).getCost())
                    {
                            Chocolates temp=ch.get(i);
                             ch.set(i,ch.get(j));
                             ch.set(j,temp);
                    }
              }
         }
         System.out.println("Sorting order if chocolates by cost is:");
        for(int i=0;i<ch.size();i++)
        {
                System.out.println("Chocolate name: "+ch.get(i).name+"\t\tCost:"+ch.get(i).getCost());
        }
   }
   //finding the candies within the specified range
   void findCandies()
   {
         System.out.println("Candies whose weight between 5.0gm and120.00gm are");
         for(int i=0;i<c.size();i++)
         {
               if(c.get(i).getWeight()>5.0 && c.get(i).getWeight()<120.0)
               {
                         System.out.println("Candy name:"+c.get(i).name+"\t\tWeight:"+c.get(i).getWeight());
                }
         }
   }
}
