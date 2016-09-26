package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		int d1=(int)(Math.random()*6)+1;     // 1-6
		return d1;		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) // i has to be zero, in order to count the first roll 
		{
			System.out.print(roll() + " ");
		}		
	}
}
