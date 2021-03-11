package command.concretecommand;


import command.command.Command;

public class AmericanFood implements Command {

	@Override
	public void cook() {
		
		
	}

	@Override
	public boolean canCook() {
		
		return false;
	}

}
