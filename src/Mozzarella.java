// a Concrete Decorator
public class Mozzarella extends ToppingDecorator {
	public static String size;
    public Mozzarella(Pizza newPizza, String string) {
        super(newPizza);
        System.out.println("Adding Mozzarella");
        size = string;
		setSize(size);
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", mozzarella";
    }
    
    public double getCost(){
    	double cost = 0.0;
    	if (size.equals("S")){
    		cost = .25;
    	}
    	else if (size.equals("M")){
    		cost = .50;
    	}
    	else {
    		cost = .75;
    	}
    	System.out.println("Cost of " + size + "-size mozzarella: " + cost);
        
        return tempPizza.getCost() + cost;
    }
    public String setSize(String string){
    	return tempPizza.getSize() + string;
    }
    public String getSize(){
        
        return tempPizza.getSize() + "Mozzarella size: " + size + ", ";
    }
}
