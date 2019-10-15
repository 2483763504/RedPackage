package demo16;

import java.util.ArrayList;

import red.OpenMode;

public class NormalMode implements OpenMode {

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int avg=totalMoney/totalCount;//平均值
		int mod=totalMoney%totalCount;//零头
		for (int i = 0; i < totalCount-1; i++) {
			list.add(avg);
		}
		list.add(avg+mod);
		return list;
		
	}

}
