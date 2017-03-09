/**
 * Created by rickiecashwell on 3/9/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {
    int start = 1;
    int end = 100;
    doIt(start, end);

    }
    public static void doIt(int start, int end){
        for (int x = start; x <= end; x++){
            if(x % 5 == 0 && x % 3 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(x % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(x % 5 == 0){
                System.out.println("Buzz");
                continue;
            }

            System.out.println(x);
        }
    }
}
