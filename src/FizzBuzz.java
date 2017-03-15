/**
 * Created by rickiecashwell on 3/9/17.
 */
public class FizzBuzz {

    public void doIt(int start, int end){
        for (int x = start; x <= end; x++){
            if(x % 5 == 0 && x % 3 == 0){
                System.out.println("FizzBuzz");
            }
           else if(x % 3 == 0){
                System.out.println("Fizz");
            }
           else if(x % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(x);
            }


        }
    }
}
