package head;

public class Plant {
	public String name;
	private boolean isClimber;
	private int growthPerDay;

	public void setName (String name){
		name = name;
	}

	public void setIsClimber (boolean b) {
		isClimber = b;
	}

	public void setGrowthPerDay (int gpd) {
		growthPerDay = gpd;
	}

	public String getName (){
		return name;
	}

	public boolean getIsClimber () {
		return isClimber;
	}

	public int getGrowthPerDay () {
		return growthPerDay;
	}

	protected double calculatePrice () {
		if(isClimber && growthPerDay > 5)
			return growthPerDay * 100 ;
		
		else if(!isClimber && growthPerDay > 5)
			return 500.00;
		
		else
			return 2500.50;
	}
}