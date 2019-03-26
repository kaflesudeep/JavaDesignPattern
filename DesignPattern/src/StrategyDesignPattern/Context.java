package StrategyDesignPattern;

public class Context {
	private Strategy st;
	
	public Context( Strategy st){
		this.st = st; 
	}
	
	public String  execteSt(){
		return st.doOperation();
	}
	

}
