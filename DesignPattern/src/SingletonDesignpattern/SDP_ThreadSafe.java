package SingletonDesignpattern;

public class SDP_ThreadSafe {
	private static SDP_ThreadSafe obj ; 
	private SDP_ThreadSafe() {}
	
	
	//provides thread-safety but it reduces the performance because of cost associated with the synchronized method
	public static  synchronized SDP_ThreadSafe getInstance(){
		if(obj== null ){
			obj= new SDP_ThreadSafe(); 
		}
		return obj;
	}
	
	
//snippet provides the double checked locking implementation
//To avoid this extra overhead every time, double checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of singleton class is created.
	
	public static SDP_ThreadSafe getInstance2(){
			if(obj== null ){
				synchronized(SDP_ThreadSafe.class){
					if(obj== null ){
						obj= new SDP_ThreadSafe(); 
					}
				}
			}
			return obj;
		}
	

}
