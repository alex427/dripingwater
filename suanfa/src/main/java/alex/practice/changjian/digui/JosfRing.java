package alex.practice.changjian.digui;

import java.util.ArrayList;

public class JosfRing {

	public static void main(String[] args) {
		System.out.println(getTheQ(8));
	}

	public static int getTheQ(int num) {
		ArrayList<Integer> list = new ArrayList<>();		//创建集合, 存储这些人
		for(int i = 1; i <= num; i++) {
			list.add(i);
		}
		
		int baohao = 1;										//用来数数的,只要是3的倍数就杀人
		for(int i = 0; list.size() != 1; i++) {				//这个判断条件非常重要：只要集合中人数超过1,就要不断的杀
			if(i == list.size()) {							//如果i增长到集合最大的索引+1时
				i = 0;										//重新归零
			}
			
			if(baohao % 3 == 0) {							//如果是3的倍数
				list.remove(i);								//就杀人
				i--;										//list的size-1，索引减少一位
			}
			baohao++;
		}
		
		return list.get(0);
	}
}
