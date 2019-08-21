import java.lang.Integer;

public class ReverseInt {

    public ReverseInt() {

    }

    public int reverse(int x){
        int rev = 0;
        while (x!=0){
            int t = x%10;
            x = x/10;
            if (rev >Integer.MAX_VALUE || (rev == Integer.MAX_VALUE&& rev == 7)) return 0;
            if (rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE && rev == -8)) return 0;
            rev = rev*10 + t;
        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        ReverseInt revInt = new ReverseInt();
        revInt.reverse(134);

    }

}