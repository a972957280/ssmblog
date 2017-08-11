package com.lanou;

public class HomeWork {
	
	/*
	 * 主函数（入口函数）
	 */
	
	public static void main(String[] args) {
		
		/*
		 *1:熟练创建Java工程，Main方法，以及打印helloworld
		 *	要求：至少三遍 
		 */
		
		System.out.println("1:熟练创建Java工程，Main方法，以及打印helloworld");
		System.out.println("	要求：至少三遍 ");
		System.out.println();
		
		//打印helloworld
		System.out.println("helloworld");
		
		System.out.println();
		System.out.println();
		
	
		/*
		 *2:在控制台打印如下：
		 *   ************
		 *   ****JAVA****
		 *   ************
		 */
	
		System.out.println("2:在控制台打印如下：");
		System.out.println("  ************");
		System.out.println("  ****JAVA****");
		System.out.println("  ************");
		System.out.println();
		
		//打印
		System.out.println("************");
		System.out.println("****JAVA****");
		System.out.println("************");
		
		System.out.println();
		System.out.println();
		
		
		/*
		 * 1.189元如何使用最少的100元，50元，20元，10元，5元，1元组成，并输出个面值钱币的张数
		 */
		
		System.out.println("1.189元如何使用最少的100元，50元，20元，10元，5元，1元组成，并输出个面值钱币的张数");
		System.out.println();
		
		//定义变量并赋值i=189，j
		int i=189,j;		
		//i/100即为100元面值数量	
		j=i/100;
		System.out.println("100面值钱币："+j);
		//i%100/50即为50元面值数量
		j=i%100/50;
		System.out.println("50面值钱币："+j);
		//i%100%50/20即为20元面值数量
		j=i%100%50/20;
		System.out.println("20面值钱币："+j);
		//i%100%50%20/10即为10元面值数量
		j=i%100%50%20/10;
		System.out.println("10面值钱币："+j);
		//i%100%50%20%10/5即为5元面值数量
		j=i%100%50%20%10/5;
		System.out.println("5面值纸币："+j);
		//i%100%50%20%10%5即为1元面值数量
		j=i%100%50%20%10%5;
		System.out.println("1面值钱币："+j);
		
		System.out.println();
		System.out.println();
				
		
		/*
		 * 2.55除以2，86除以2，56除以10
		 *   要求结果是四舍五入后的
		 */
		
		System.out.println("2.55除以2，86除以2，56除以10");
		System.out.println("  要求结果是四舍五入后的");
		System.out.println();
		
		int l=55,m=86,n=56,r,s,t;
		//将l对2求余赋值给r
		r=l%2;
		System.out.println("55除以2的余数是："+r);
		//run as之后余数为1，由于1/2=0.5，等于0.5，则将l除以2加1赋值给r
		r=l/2+1;
		System.out.println("55除以2约等于："+r);
		//将m对2求余赋值给s
		s=m%2;
		System.out.println("86除以2的余数是："+s);
		//run as之后余数为0，则将m除以2赋值给s
		s=m/2;
		System.out.println("86除以2约等于："+s);
		//将n对10求余赋值给t
		t=n%10;
		System.out.println("56除以10的余数是："+t);
		//run as之后余数为6，由于6/10=0.6,大于0.5，则将n除以10加1赋值给t
		t=n/10+1;
		System.out.println("56除以10约等于:"+t);
		
		System.out.println();
		System.out.println();
		
		
		/*
		 * 3.交换两个int变量的值（不借助第三个int变量）
		 */
		
		System.out.println("3.交换两个int变量的值（不借助第三个int变量）");
		System.out.println();
		
		//定义两个变量a和b并赋值为a=3,b=5
		int a=3,b=5;
		//将a+b的值赋值给a
		a=a+b;
		//将a-b的值赋值给b
		b=a-b;
		//将a-b的值赋值给a
		a=a-b;
		//打印
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
