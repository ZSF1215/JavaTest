public class javaTest {
    public static void main(String[] args) {
       //实现交换两个变量的值。要求：需要交换实参的值
        Exchange change = new Exchange(12,2);
        change.exchange();
    }
}
class Exchange{
    int num1;
    int num2;
    public Exchange(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void exchange(){
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 =temp;
        System.out.println(num1);
        System.out.println(num2);
    }

}


        /*
        // 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象
        Person person = new Person("xz","男",18);
        person.eat();
        person.sleep();
    }
}
class Person {
    public String name;
    public int age;
    public String sex;
    public Person(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void eat(){
        System.out.println(name+age+sex+ "吃饭");
    }
    public void sleep(){
        System.out.println(name+age+sex+"睡觉");
    }
}




        //写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，、
        // 最后实现加减乘除四种运
        Calculator calculator = new Calculator(2,2);
        System.out.println(calculator.getDiv());
        System.out.println(calculator.getSub());
        System.out.println(calculator.getAdd());
        System.out.println(calculator.getMul());
    }
}
 class Calculator {
      private double num1;
      private double num2;

     public Calculator(double num1, double num2) {
         this.num1 = num1;
         this.num2 = num2;
     }
      public double getAdd() {
          return this.num1 + this.num2;
      }
      public double getSub() {
          return this.num1 - this.num2;
      }
      public double getMul() {
          return this.num1 *this.num2;
      }
      public double getDiv() {
          return this.num1 / this.num2;
      }
  }
  */




