// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(countEars(10));

    }

    public static int countEars(int n){
        if (n == 1){
            return 2;
        }
        int ears;
        if (n % 2 == 0){
            ears = 3;
        } else {
            ears = 2;
        }
        return ears + countEars(n - 1);
    }

}

