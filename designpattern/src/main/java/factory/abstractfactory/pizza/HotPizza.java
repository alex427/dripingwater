package factory.abstractfactory.pizza;


import factory.abstractfactory.ingredient.IngredientFactory;

public class HotPizza extends Pizza{
	
	IngredientFactory ingredientFactory;
	
	public HotPizza(IngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepareIngredient() {
		pepper = this.ingredientFactory.createPepper();
		barbe = this.ingredientFactory.createBarbe();
		garlic = this.ingredientFactory.createGarlic();
		mint = this.ingredientFactory.createMint();
	}
}
