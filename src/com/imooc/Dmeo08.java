package com.imooc;
//�����޷���ֵ�ķ���
public class Dmeo08 {
public static void main(String[] args) {
	//�������󣬶�����Ϊhello
	Dmeo08 hello=new Dmeo08();
	//���÷������������ſγ̵ĳɼ�
	hello.calcAvg(94,81);
}
//�ر�ע�� �޷���ֵʱ  ������Ӧ���� void��
public void calcAvg(double num1,double num2) {
	double num3=(num1+num2)/2;
	System.out.println("ƽ�����ǣ�"+num3);
}
}
