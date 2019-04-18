
public abstract class PizzaDecorator implements Pizza{
	
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza decoratedPizza) {
		this.decoratedPizza = decoratedPizza;
	}
	
	public void draw() {
		decoratedPizza.cook();
	}
}
