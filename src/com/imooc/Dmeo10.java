package com.imooc;
//����Arrays��
import java.util.Arrays;
public class Dmeo10 {
   public static void main(String[] args) {
	   //����һ���������齫�ɼ��ȴ���������
	   int[] scores= {89,-23,64,91,119,52,73};
	   System.out.println("���Գɼ�ǰ�����ĳɼ�Ϊ��");
	   //�������󣬶�����Ϊhello
	   Dmeo10 hello=new Dmeo10();
	   //���÷���
	   hello.num(scores);
   }
   /*
    * ����һ������ʹ�������¼�������
    * 1���ɶ������гɼ���������
    * 2���������еĳɼ������жϣ���С��0�����100���������޳���
    *   �����Խ��ɼ�����ǰ�����Ľ������
    */
   //���巽����Ϊnum��һ����������scores1
   public void num(int[] scores1) {
	   //ʹ��Arrays���score1�����������Ĭ��Ϊ��С����
	   Arrays.sort(scores1);
	   //����һ������������ͳ��ǰ�����ɼ�������
	   int count=0;
	     /*
	      * ʹ��forѭ�����������е���,
	      * ע�⣺��������ǰ������С�������У����ڴ���Ҫ��ǰ�����ĳɼ��������ʱ
	      * ���õ�����������������±��Ǵ�0��ʼ�ġ����forѭ���б���i�ĳ�ʼ
	      * ֵӦΪscores1.length-1
	      */
	   for(int i=scores1.length-1;i>=0;i--) {
		   //ʹ��if�������Գɼ���Ч�Խ����ж�ͬʱ�Գɼ���������ѡ��
		   if(scores1[i]>0&&scores1[i]<100&&count<3) {
			   //�Է��������ĳɼ��������
			   System.out.println(scores1[i]);
			   //ѡ����ɼ�������
			   count++;
		   }
	   }
   }
}
