package FacadeDesignPattern;

public class Veggi {
	public Menus getMenu(){
		Menus nv = new VegMenu();
		return nv; 
	}
}
