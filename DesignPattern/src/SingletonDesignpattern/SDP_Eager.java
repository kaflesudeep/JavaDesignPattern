package SingletonDesignpattern;

public class SDP_Eager {
	
	private SDP_Eager(){}
	
	private static SDP_Eager object = new SDP_Eager(); 
	
	public static SDP_Eager createObject(){
		return object; 
	}
	
	
	public String toprint(){
			return "This method is calling DP_Eage"; 

}
}