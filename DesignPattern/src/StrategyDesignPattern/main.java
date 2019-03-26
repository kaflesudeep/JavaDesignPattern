package StrategyDesignPattern;

public class main {
	
	public static void main (String [] args){
		
	Context c = new Context(new subStrategyA2() ); 
	 
	 System.out.println(c.execteSt()); 
	}

}
