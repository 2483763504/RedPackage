package demo16;

import java.util.ArrayList;
import java.util.Random;

import red.OpenMode;

public class RandomMode implements OpenMode {

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		//随机分配，有可能多，有可能少
		//最少1分钱，最多不超过剩下金额平均数的2倍
		//比方说10块钱，发3个。1000分，发3个
		//第一次发红包，1~666
		//此时至少剩下334
		//第二次发红包，1~334
		
		//范围公式：1+random.nextInt(leftMoney/leftCount*2)
		Random random=new Random();
		int leftMoney=totalMoney,leftCount=totalCount;//剩下钱，剩下人
		for(int i=0;i<totalCount-1;i++) {
			int money=random.nextInt(leftMoney/leftCount*2)+1;
			leftMoney-=money;
			leftCount--;
			list.add(money);
		}
		list.add(leftMoney);
		return list;
	}

}
