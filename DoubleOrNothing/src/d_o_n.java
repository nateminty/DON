
public class d_o_n {
public static void main(String args[])
{
	double total_money = 1000;
	
	for(int i = 0; i < 4; i++)
	{
		 double x = randomX();
		 double bet = betAmnt(total_money, x);
		 boolean wonlost = made(x);
		
		 total_money = updateMoney(total_money, wonlost, bet);
		 
		
		 
	}
	
	 if(total_money < 1000)
	 {
		 System.out.println("You win!");
	 }
	 else
	 {
		 System.out.println("You lose.");
	 }
	
}


static double randomX()
{
return Math.random();
}

static double betAmnt(double total_money, double x)
{
	return total_money * x;
}

static boolean made(double x)
{
	boolean madeMoney;
	
	if(x < Math.random())
	{
	  madeMoney = true;
	}
	else
	{
	 madeMoney = false;
	}
	 return madeMoney;
}

static double updateMoney(double total_money, boolean winlose, double bet)
{
	
	if(winlose)
	{
		total_money += bet;
	}
	
	else
	{
		total_money -= bet;
	}
	
return total_money;
}

}



