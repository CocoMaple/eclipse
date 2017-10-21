package com.imooc;
//带参无返回值的方法
public class Dmeo08 {
public static void main(String[] args) {
	//创建对象，对象名为hello
	Dmeo08 hello=new Dmeo08();
	//调用方法，传入两门课程的成绩
	hello.calcAvg(94,81);
}
//特别注意 无返回值时  方法中应该用 void！
public void calcAvg(double num1,double num2) {
	double num3=(num1+num2)/2;
	System.out.println("平均分是："+num3);
}
}
