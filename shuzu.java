import java.util.Arrays;
public class TestDemo {
    //
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum / array.length;
    }
// 数组中  奇数在前  偶数在后
    public static void func2(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (array[mid] > key) {
                right = mid - 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch1(int[] array,int key,int left,int right){
        if(left>right){
            return  -1;
        }
        int mid = (left + right) / 2;
        if(array[mid]>key){
            return  binarySearch1(array,key,left,mid-1) ;
        }else if(array[mid]<key){
            return binarySearch1(array,key,mid+1,right) ;
        }
        return -1;
    }
    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            int tmp =array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(avg(array));
    }
}





        /*
        //数组的拷贝
        int[] array = {1,2,3,4,5};
        int[] array2 =new int[array.length];
        System.out.println(Arrays.toString(array2));
        /*
        for (int i = 0; i <array.length ; i++) {
            array2[i] = array[i];
        }
        */
        /*
        原数组  从原数组哪个地方拷
        拷贝数组   拷到那个地方  拷多长
        System.arraycopy(array,0,array2,4,
                array.length);//没有返回值 需要new
        System.out.println(Arrays.toString(array2));
        */
        //array2 = Arrays.copyOf(array,array.length);
        //有返回值 不需new
        //System.out.println(Arrays.toString(array2));


    /*
    public static String toString(int[] array){
        String str ="[";
        for (int i = 0; i <array.length ; i++) {
            str += array[i];
            if (i != array.length - 1) {
                str += ",";
            }
        }
            str+="}";
        return str;
    }
    public static int[] func1(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] ret = func1(array);
        for (int i = 0; i <array.length ; i++) {
         System.out.print(array[i]);
        System.out.println(Arrays.toString(array));
    }
    }
}
    /*
    public static void main2(String[] args) {
        int[] array = {1,2,3};
        System.out.println(array[0]);
        func1(array);
        System.out.println(array[0]);
        int a= 10;
        System.out.println(a);

    }
    public static void main1(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = new int[]{1,2,3};
        int[] array3 = new int[3];
        System.out.println(array1[2]);
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i:array1
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }
    */
