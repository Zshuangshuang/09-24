package java09_24;

import java.util.Random;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-24
 * Time:8:32
 **/
public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int ret = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

       while(true){
           int num  = scanner.nextInt();
           if (num < ret){
               System.out.println("小了");
           }else if (ret == num){
               System.out.println("对了");
               break;
           }else {
               System.out.println("大了");
           }
       }
    }
    public static void main14(String[] args) {
        int j = 0;
        int sum = 0;
        for (j = 1; j <= 5; j++) {
            int ret = 1;

            for (int i = 1; i <= j; i++) {

                ret *= i;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
    public static void main13(String[] args) {
        int ret =1;
        for (int i = 1; i <= 5 ; i++) {
            ret *= i;
        }
        System.out.println(ret);
    }
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = scanner.nextInt();
        while(num >= 100 && num <= 200){
            if (num % 3 == 0){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
    public static void main11(String[] args) {
        int j = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(j <= num){
            int i = 1;
            int ret = 1;
            while(i <= j){
                ret *= i;
                i++;
            }
            sum += ret;
            j++;
        }
        System.out.println(sum);
    }
    public static void main9(String[] args) {
        int  n = 5;
        int fac = 1;
        int i = 1;
        while( i <= n){
            fac *= i;
            i++;
        }
        System.out.println(fac);
    }
    public static void main8(String[] args) {
        int i = 1;
        int sum = 0;
        int jSum = 0;
        int oSum = 0;
        while (i <= 100){
            jSum += i;
            i+= 2;
        }
        i = 2;
        while (i <=100){
            oSum += i;
            i += 2;
        }
        sum = jSum+oSum;
        System.out.println("奇数和为："+jSum);
        System.out.println("偶数的和为："+oSum);
        System.out.println("1-100的和为:"+sum);

    }
    public static void main7(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;

        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%4 == 0) && (year%1000 != 0) || (year%400) == 0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println(num+"是负数");
        }else if(num == 0){
            System.out.println(num+"既不是正数也不是负数");
        }else {
            System.out.println(num+"是正数");
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"不是偶数");
        }
    }

    public static void main1(String[] args) {
        int a = 10;
        if(a != 10){
            System.out.println("a的值不为10");
        }else {
            System.out.println("a的值是10");
        }
    }
}
