package com.imooc;
//  ���δ�����ֵ�ķ���
import java.util.Arrays;
public class Dmeo09 {
public static void main(String[] args) {
	Dmeo09 hello=new Dmeo09();
	int[] scores= {79,52,98,81};
	//���÷�����������ɼ�������ȡ�ɼ��ĸ���
	int count=hello.fangFa(scores);
	System.out.println("����"+count+"���ɼ���Ϣ��");
}
/*
 * fangFa���ܣ����ɼ�������������سɼ��ĸ���
 * ����һ������������������ķ���������ɼ�����
 * ʹ��Arrays��Գɼ���������������
 * ����ִ�к󷵻�������Ԫ�صĸ���
 */
public int fangFa(int[] shuZu1) {
	Arrays.sort(shuZu1);
	System.out.println(Arrays.toString(shuZu1));
	return shuZu1.length;
}
}
