package demo16;

import java.util.ArrayList;
import java.util.Random;

import red.OpenMode;

public class RandomMode implements OpenMode {

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		//������䣬�п��ܶ࣬�п�����
		//����1��Ǯ����಻����ʣ�½��ƽ������2��
		//�ȷ�˵10��Ǯ����3����1000�֣���3��
		//��һ�η������1~666
		//��ʱ����ʣ��334
		//�ڶ��η������1~334
		
		//��Χ��ʽ��1+random.nextInt(leftMoney/leftCount*2)
		Random random=new Random();
		int leftMoney=totalMoney,leftCount=totalCount;//ʣ��Ǯ��ʣ����
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
