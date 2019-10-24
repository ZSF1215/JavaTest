import static jdk.nashorn.internal.objects.NativeMath.min;

public class TestDemo {
    public static void main(String[] args) {
        //实例化一个对象  new
        Person person = new Person();
        person.name ="li";
        person.age =12;
        person.eat();
        System.out.println(person.name);
    }
}
class Person {
    public String name;//实例成员变量  属性
    public int age;
    //static 静态成员变量    方法区
    public static int count = 20;
    public static final int SIZE = 30;
    //final 修饰后  放哪个区不一定
    public  final int SIZE2 = 30;//实例成员变量
    //行为  方法 实例成员方法
    public void eat(){
        System.out.println(name+"吃饭");
    }
    public void sleep(){
        System.out.println(name+"睡觉");
    }
    public void show(){
        System.out.println();
    }
}


/*
    public  static int binarySearch(int[] array,int key,int left,int right,int mid){
        if(left<right)
        {
            return -1;
        }
        int mid = (left+right)/2;
        if(array[mid]==key)
        {
            return mid;
        }else if((array[mid]>key))
        {
            return binarySearch(array,key,left,right-1);
        }




    }
}

/*
        int[] array = {1, 2, 3};
        System.out.println(max(array));
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static double avg(int[] array){
        int sum=0;
        for(int x:array){
            sum+=x;
        }
        return (double)sum/(double)array.length;
    }


    }







/*
        int[]array = {1,2,3};
        int[] ret =func(array);
        for(int i =0;i<array.length;i++) {
            System.out.println(ret[i]);
        }
    }
        public static int[] func(int[] array){
            int[] tmp = new int[array.length];
            for(int i =0;i<array.length;i++) {
                tmp[i] =  array[i]*2;
            }
            return tmp;


        }
        }


