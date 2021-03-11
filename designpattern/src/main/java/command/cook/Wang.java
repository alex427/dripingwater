package command.cook;


import command.cookable.ChieseCook;
import command.utils.ThreadUtil;

public class Wang implements ChieseCook {

	@Override
	public void chaofan() {
		
		ThreadUtil.sleep(1000);
		System.out.println("中国炒饭");
	}
	
	
}
