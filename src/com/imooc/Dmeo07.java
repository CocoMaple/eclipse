package com.imooc;
//�޲δ�����ֵ�ķ���
public class Dmeo07 {
public static void main(String[] args) {
	//����������Ϊhello
	Dmeo07 hello = new Dmeo07();
	//���÷�����������ֵ�����ڱ�����
	int maxScore=hello.getMaxAge();
	//����������
	System.out.println("�������Ϊ��"+maxScore);
}
public int getMaxAge() {
	//����һ������ages����������
	int[] ages= {18,23,21,19,25,29,17};
	//����һ��������������������ȼٶ��������Ϊages[0]
	int max=ages[0];
	/*ʹ��for���������������е�������ͨ��if���Ƚ��ҳ�
	 * ���ֵ
	 */
	for(int i=0;i<ages.length;i++) {
		if(max<ages[i]) {
			max=ages[i];
		}
	}
	//����return�����ط���ֵ max
	return max;
}
}
