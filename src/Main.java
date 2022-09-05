import java.util.Random;

public class Main {
    public static void main(String[] args) {


        System.out.println(walk(100, 10000));
        System.out.println(walk(25, 20));
        System.out.println(walk(15, 20));
        System.out.println(walk(50, 10));
        System.out.println(walk(34, 53));
        System.out.println(generateRandomAge());
        System.out.println(walk(generateRandomAge(), 6));



    }
    public static String walk(int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return ( "Можно идти гулять");}
        else if (age < 20 && temp >0 && temp < 28){
            return ( "Можно идти гулять");
        } else if (age > 45 && temp > -10 && temp < 25 ) {
            return ( "Можно идти гулять");
        }
        return("Оставайтесь дома");
    }


    public static int generateRandomAge(){
        int a = (int) (Math.random()*63);
        return a;


    }
}