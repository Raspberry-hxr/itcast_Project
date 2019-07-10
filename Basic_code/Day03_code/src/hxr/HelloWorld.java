package hxr;

public class HelloWorld  {
    public static void main(String[] args){



        int result = 3>4?(int)2.5:10;//强制转换怎么转换?
        System.out.println(result);

        int num1=33;
        int num2=44;
        int num3=55;
        int max1=num1>num2?num1:num2;
        int max2=num2>num3?num2:num3;
        int max=max1>max2?max1:max2;
        System.out.println("max:"+max);

       /*int a=2;
       int b=4;
       int c=6;

       int result;
       //打赢的人留在擂台
       result=a>b?a:b;
       result=result>c?result:c;
       System.out.println(result);
       //比较大小一步到位
       max=a>b?(a>c?a:c):(b>c?b:c);*/

        //给出两个整数，判断哪个大，打印大的整数。
         /*  int a = 2;
           int b = 3;
           if (a>b) {
               System.out.println(a);
               return;

           }
           System.out.println(b);

           System.out.println("今天天气很好");
           System.out.println("走着走着");
           int age=18;
           if(age>=18){
               System.out.println("打开lol");
               System.out.println("碰到一群猪队友");
               System.out.println("还打个屁");

           }
           System.out.println("回家吃饭");
           //给定两个整数。打印大的整数
       int d=2;
       int e=3;
       if(d>e){
           System.out.println(a);
       }else{
           System.out.println(b);
       }
        System.out.println("==========");
       //打印999次“I Love You”
       for(int i=0;i<=999;i=i+1){
           System.out.println("我第"+i+"次说爱你");
       }
*/
        short s=32767;
        s=(short)(s+10);
        System.out.println("草泥马"+s);
    }

}

