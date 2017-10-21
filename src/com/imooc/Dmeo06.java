package com.imooc;
//无参带返回值的方法
public class Dmeo06 {
public static void main(String[] args) {
	//创建对象，对象名为hello
	Dmeo06 hello=new Dmeo06();
	//调用方法并接收方法的返回值，保存在变量sum中
	int sum=hello.calcSum();
	System.out.println("两数之和为："+sum);
}
//定义无参数返回值的方法
public int calcSum() {
	int a=5;
	int b=12;
	int sum=a+b;
	return sum;
}
}
