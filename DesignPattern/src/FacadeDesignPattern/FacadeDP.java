package FacadeDesignPattern;
//Facade design pattern is used to help client applications to easily interact with the system

//Facade IMP Points: 
//	1. its more like the helper to the client. it doesnt hide the subsystem from the client. Weather to use Facade or not is completly dependedt on client. 
//	2. It can be applied at any point of development phase. When the subsystem grow and become comples it sused, subsystem shouldnt have any reference about it. 
//	3. should be applied to similar kind of interface, its purpose is to provide single interface rather that multiple interface. 

public class FacadeDP {
public Menus getVegMenu(){
	Veggi vg = new Veggi(); 
	return vg.getMenu();
	
}

public Menus getnonVegMenu(){
	nonVeggi vg = new nonVeggi(); 
	return vg.getMenu();
	
}

public Menus getbothMenu(){
	VnNBoth vg = new VnNBoth(); 
	return vg.getMenu();
	
}
}
