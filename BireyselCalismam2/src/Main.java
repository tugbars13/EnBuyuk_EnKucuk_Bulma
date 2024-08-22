import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println("En büyük ve en küçük elemanı bulma");
        System.out.println("****************************");

        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz");
        int boyut = input.nextInt();

        int [] array = new int[boyut];

        for (int i = 0; i< boyut;i++){
            System.out.print((i+1)+" degeri : ");
            array[i] = input.nextInt();
        }


        int min = array[0];
        for (int i = 0; i< boyut;i++){
                if (min>array[i]){
                    min=array[i];

            }
        }
        System.out.println("En küçük elemanı : "+min);

        int max = array[0];
        for (int i = 0; i< boyut;i++){
            if (max<array[i]){
                max=array[i];

            }
        }
        System.out.println("En büyük elemanı : "+max);

    }
}