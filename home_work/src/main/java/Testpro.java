import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Testpro {
    public static void main (String[] args) {
        int[] arr={10,4,5,3,24,45,234,1,2,3,4,5};
//        for(int i=0; i<arr.length; i=i+2) {
//            System.out.println(arr[i]); //возвращяет все занчения в array через один
//        }
//
//        for(int i=arr.length-1; i>0; i=i--) {
//            System.out.println(arr[i]); //возвращяет все занчения в array в обратном порядке.
//        }
//        for(int v : arr) {
//            if (v % 2 == 1) {
//                System.out.println(v);
//            }//неченые в array
//        }
//        for(int v : arr) {
//            if (v % 2 == 0) {
//                System.out.println(v);
//            }//ченые в array
//        }
//        for(int i=0; i<arr.length; i++) {
//            if (arr[i] == 5) {
//                System.out.println(i);
//            }//вывод положения значения в Array, еси значение равно 5
//        }
        int max= arr[0];
        for(int v :arr) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println(max); //вывод максимального знаяение в array

        int min= arr[0];
        for(int v :arr) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println(min);//вывод миниипльного знаяение в array
        System.out.println("min = "+min_max(arr)[0] + ", max = "+min_max(arr)[1]);

    }
    //функуия возвразачет минимальное и максимально значение в аррэй.
    public static int[] min_max(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int v: arr){
            if (v>max){
                max=v;
            }
            if(v<min){
                min=v;
            }
        }
        int[] result = {min, max};
        return result;
    }


}