// a Concrete Component
public class PlainPizza implements Pizza {
	public static String size;
    public PlainPizza(String string) {
		size = string;
		setSize(size);
	}

	public String getDescription() {
        
        return "Just a plain pizza";
    }

    public double getCost() {
    	double cost = 0.0;
    	if (size.equals("S")){
    		cost = 3.50;
    	}
    	else if (getSize().equals("M")){
    		cost = 4.00;
    	}
    	else {
    		cost = 4.50;
    	}
    	System.out.println("Cost of a " + size + "-size plain pizza: " + cost);
        return cost;
    }
    public String setSize(String string){
        return string;
    }
    public String getSize(){
        
        return "Plainpizza size: " + size + ", ";
    }
}
