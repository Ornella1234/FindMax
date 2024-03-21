import java.util.Random;

public class FindMax {
    public static void main(String[] args) {

        int[] array = new int[10];
        int Max=0,Min=100;
        Random r=new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
            System.out.println(array[i]+" ," );
            if (array[i] < Min) {
                Min = array[i];
            }
            if (array[i] > Max) {
                Max = array[i];
            }
        }


            System.out.println("The smallest number is : " + Min);
            System.out.println("The largest number is: " + Max);
        }
    }