package com.imooc;
//�޲δ�����ֵ�ķ���
public class Dmeo06 {
public static void main(String[] args) {
	//�������󣬶�����Ϊhello
	Dmeo06 hello=new Dmeo06();
	//���÷��������շ����ķ���ֵ�������ڱ���sum��
	int sum=hello.calcSum();
	System.out.println("����֮��Ϊ��"+sum);
}
//�����޲�������ֵ�ķ���
public int calcSum() {
	int a=5;
	int b=12;
	int sum=a+b;
	return sum;
}
}
