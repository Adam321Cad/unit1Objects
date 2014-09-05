import java.util.Random;

public class RandomDie {
    public static void main(String[] args) {
        Random generator = new Random();
        int num = generator.nextInt(6);
        num = num+1;
        System.out.println(num);
        
    }
}