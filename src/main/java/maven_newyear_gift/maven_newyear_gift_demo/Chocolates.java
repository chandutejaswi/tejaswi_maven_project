package maven_newyear_gift.maven_newyear_gift_demo;

public class Chocolates extends Sweets{
	//constructor of chocolates
	public Chocolates(String n,double w,double c,double s_l,String c_t)
	{
		name=n;
        weight=w;
		cost=c;
		sugar_level=s_l;
		choco_type=c_t;
	}
	//return name of chocolate
	public String getName()
	{
		return name;
	} 
	//return cost of chocolate
	public double getCost()
	{
		return cost;
	}
	//return weight of chocolate
	public double getWeight()
	{
		return weight;
	}


}
