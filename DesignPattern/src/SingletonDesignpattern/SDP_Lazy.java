package SingletonDesignpattern;
//works fine incase of single threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if loop at the same time. 

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
