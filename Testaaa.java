import java.util.Scanner;
public class Testaaa {

    public static void main(String[] args) {

        int n = 0;
        int count = 0;
        for(n = 1;n <= 100;n++){
            if(n%10==9)
            {
                count++;
            }
            if (n / 10 == 9)
            {
                count++;
            }
        }
        System.out.println(count);
    }

}


