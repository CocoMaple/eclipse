package com.imooc;
/*
 * �����ܣ�ʵ�ֽ��������༶��ÿ���༶������ѧ���ĳɼ���Ϣ��������������༶ѧ���ɼ���ƽ��ֵ�����
 */
import java.util.Scanner;
public class Dmeo02 {
   public static void main(String[] args) {
	   int classnum=3;
	   int stunum=3;
	   int sum=0;
	   double avg=0;
	   Scanner input=new Scanner(System.in);//����Scanner����
	   for(int i=1;i<=classnum;i++) {       //���ѭ�����ư༶
		   System.out.println("****�������"+i+"���༶�ĳɼ�***");
		   for(int j=1;j<=stunum;j++) {     //�ڲ�ѭ������ѧ��
			   System.out.print("�������"+j+"��ѧ���ĳɼ�");
			int score=input.nextInt();
			   sum=sum+score;
		   }
		   avg=sum/stunum;
		   System.out.println("��"+i+"��ѧ����ƽ���ɼ���"+avg);
		   sum=0;
	   }
   }
}
