// the Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;
    }
    
    public String getDescription() {
       
        return tempPizza.getDescription();
    }

    public double getCost() {
        
        return tempPizza.getCost();
    }
   
    public String setSize(String string){
        return string;
    }
    
    public String getSize() {
    	
    	return tempPizza.getSize();
    }
}
