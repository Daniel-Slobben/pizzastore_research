// a Concrete Decorator
public class TomatoSauce extends ToppingDecorator {
	public static String size;
    public TomatoSauce(Pizza newPizza, String string) {
        super(newPizza);
        System.out.println("Adding sauce");
        size = string;
		setSize(size);
    }
    
    public String getDescription(){
        
        return tempPizza.getDescription() + ", tomato sauce";
    }
    
    public double getCost(){
        double cost = 0.0;
    	if (size.equals("S")){
    		cost = .30;
    	}
    	else if (size.equals("M")){
    		cost = .35;
    	}
    	else {
    		cost = .40;
    	}
        System.out.println("Cost of " + size + "-size sauce: " + cost);
        return tempPizza.getCost() + cost;
    }
    public String setSize(String string){
        return tempPizza.getSize() + string;
    }
    public String getSize(){
        
        return tempPizza.getSize() + "Tomato sauce size: " + size;
    }
}