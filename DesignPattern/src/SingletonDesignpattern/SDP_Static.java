package SingletonDesignpattern;

// similar to eager initialization, except that instance of class is created in the static block that provides option for exception handling.

 public class SDP_Static {
	private static SDP_Static object; 
	static{
		
		try{
			object = new SDP_Static(); 
		}catch(Exception ex){
			System.out.println("Handle the exception");
		}
		
	}
	private SDP_Static(){}
	
	
	
	public static SDP_Static createObject(){
		return object; 
	}
	
	
	public String toprint(){
			return "This method is calling SDP_Static"; 

}
}