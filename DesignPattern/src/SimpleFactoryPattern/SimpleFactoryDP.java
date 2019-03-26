package SimpleFactoryPattern;

public class SimpleFactoryDP {
// This allows interfaces for creating objects without exposing the object creation logic to the client
	pizza pix; 
	public pizza orderPizza(String type){
		if (type=="vegi"){
			pix = new VegiPizza(); 
		}else if(type=="meat"){
			pix = new meatPizza(); 
		}
		else{
			pix = new cheesePizza();
		}
		return pix;
	}
}
