package demo16;
import red.OpenMode;
import red.RedPacketFrame;

/*
 * ����˵����
 * �������ȥ֮�������˶��к�������������֮�����һ�������Ⱥ��
 * 
 * ��Ҫ�������飺
 * 1.����һ�³���ı��⣬ͨ�����췽�����ַ�������
 * 2.����Ⱥ�����ƣ�setOwnerName
 * 3.���÷ַ����ԣ�ƽ���������
 * 
 * ����ַ����ԣ�
 * 1.��ͨ�����ƽ������totalMoney/totalCount,�����������һ���������
 * 2.��������������������һ��Ǯ����಻����ƽ������2�������Խ��Խ��
 * 
 * 
 */
public class BootStrap {
	public static void main(String[] args) {
		//���ó������
		MyRed myRed=new MyRed("�����");
		//����Ⱥ�����ƣ�setOwnerName
		myRed.setOwnerName("�׾����");
		
		/*
		 * ���÷ַ�����
		 */
		//��ͨ���
//		OpenMode normal=new NormalMode();
//		myRed.setOpenWay(normal);
		
		//������
		OpenMode random=new RandomMode();
		myRed.setOpenWay(random);
		
	}
}
