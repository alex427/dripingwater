package command.concretecommand;


import command.command.Command;
import command.cook.Wang;

public class ChineseFood implements Command {
	
	private Wang wang;
	
	public ChineseFood(Wang wang){
		this.wang = wang;
	}

	@Override
	public void cook() {
		
		wang.chaofan();
	}

	@Override
	public boolean canCook() {
		
		return false;
	}

}
