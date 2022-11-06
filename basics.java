import java.util.*;//package name util is imported
public class basics{//boilerplate code-> jo hamesha likhna padta hai(ek class or main function)
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);//a scanner object is created
    System.out.print("hello world\n");
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");
  //variables ke naam hote hai identifier
  int a=10;
  int b=5;               //a or b dono variables hai
  System.out.println(a+"\n "+b);
  a=20;//variables ki value aage jake chnage ho skti hai
  System.out.println(a);
  a=b;
  System.out.println(a);
  //primitive datatypes ->jinko khudse nhi banana padta hai jaise->int,char,long,byte,short
  //non primitive datatype ->jinko khudse banana padta hai jaise->sting,array,class,object,interface
  //1byte=8bits
  //byte=boolean=1byte,short=char=2byte,int=float=4byte,long=double=8byte
  a=2;
  b=5;
  int sum=a+b;
  System.out.println(sum);
  System.out.println("enter character");
  String h=sc.next();//takes only first word
  System.out.println(h);
  //boolean bo=sc.nextBoolean();
  //System.out.println(bo);
  System.out.println("enter sentence");
  String name=sc.nextLine();
  System.out.println(name);

                           //sum ,product of 2 number
        System.out.println("enter 2 number for sum and product ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum1=n1+n2;
          System.out.println(sum1);
        int pro=n1*n2;
        System.out.println(pro);

                       //area of circle
          System.out.println("enter radius for circle");
          float r=sc.nextFloat();
          float ac=3.14f*r*r;//3.14 ko java bydefault double samjhta hai isliye 3.14f likha hai
          System.out.println(ac);


                        //type conversion->widening conversion
            int x=25;
            long y=x;//this is possible,kyuki long ka size int se bada hai toh long  int ko apne andar le skta hai
            long g=35;
            //int r=g;//this is not possible,kyuki int chota hai long ko andar nhi le skta
            System.out.println("enter number convert to float");
      float ab=sc.nextInt();
      System.out.println(ab);

                 //type casting->narrowing conversion
      System.out.println("type casting of 23.45 from float to int");
       float s=23.45f;
      int v=(int) s;
      System.out.println(v);

      System.out.println("charcter value appers of a and A ");
      char z='a';
      char z1='A';
      int x1=z;
      int x2=z1;
      System.out.println(x1 +" "+ x2);

  //type promotion
  //byte short char ko int mein convert kr deta hai
byte bt=12;
short st=3;
char c='c';
System.out.println("type promotion\n"+(bt+st+c));
  //long,float,double mein se jo bhi exprssion mein bada hoga uske type ka promotion hoga
  int in=34;
  float fl=23.65f;
  int du=50;
  double du1=in+fl+du;
  System.out.println(du1);

 System.out.println("enter number of item u want");
 float fo=10f;
 float fo1=20f;
 float fo2=15f;
 float it=sc.nextFloat();
 float it1=sc.nextFloat();
 float it2=sc.nextFloat();
 float total=(fo*it)+(fo1*it1)+(fo2*it2);
 System.out.println("your bill is    "+total);

 int $=24;
}

}