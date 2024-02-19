import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class example_18_10 {
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int Size = id.nextInt();

        System.out.println("Размер массива равен "+ Size);

        Integer arr[] = new Integer[Size];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 10000);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nотсортированный массив: \n");
        int a=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + arr[i]);
        }
    }
}
