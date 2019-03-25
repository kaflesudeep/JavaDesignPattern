package SingletonDesignpattern;

public class SDP_Lazy {
	
	private static SDP_Lazy obj ; 
	private SDP_Lazy() {}
	
	public static SDP_Lazy getInstance(){
		if(obj== null ){
			obj= new SDP_Lazy(); 
		}
		return obj;
	}
	
	

}
