package maven_newyear_gift.maven_newyear_gift_demo;

public class Candies extends Sweets{
	//constructor of candies
	public Candies(String n,double w,double c,double s_l,String f)
    {
      name=n;
      weight=w;
      cost=c;
      sugar_level=s_l;
      flavour=f;
    }
	//return the name of candy
    public String getName()
    {
    	return name;
    }
    //return the weight of candy
    public double getWeight()
    {
    	return weight;
    }
    //return the cost of candy
    public double getCost()
    {
    	return cost;
    }

}
