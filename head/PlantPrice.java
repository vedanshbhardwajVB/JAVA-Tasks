package head;
//import java.Plant;

class PlantPrice {
	public static void main (String [] args) {
		Plant p = new Plant ();
		p.name = "MoneyPlant";
		p.setIsClimber(true);
		p.setGrowthPerDay(10);
		
		System.out.println(p.getName() + " plant grows by "+p.getGrowthPerDay()+" cms everyday");
		System.out.println ("Its cost will be "+ p.calculatePrice());
	}
}


