package demo16;
import red.OpenMode;
import red.RedPacketFrame;

/*
 * 场景说明：
 * 红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主
 * 
 * 需要做的事情：
 * 1.设置一下程序的标题，通过构造方法的字符串参数
 * 2.设置群主名称，setOwnerName
 * 3.设置分发策略，平均或是随机
 * 
 * 红包分发策略：
 * 1.普通红包（平均）：totalMoney/totalCount,余数放在最后一个红包当中
 * 2.手气红包（随机）：最少一分钱，最多不超多平均数的2倍。余额越发越少
 * 
 * 
 */
public class BootStrap {
	public static void main(String[] args) {
		//设置程序标题
		MyRed myRed=new MyRed("抢红包");
		//设置群主名称，setOwnerName
		myRed.setOwnerName("雷军大大");
		
		/*
		 * 设置分发策略
		 */
		//普通红包
//		OpenMode normal=new NormalMode();
//		myRed.setOpenWay(normal);
		
		//随机红包
		OpenMode random=new RandomMode();
		myRed.setOpenWay(random);
		
	}
}
