/**
 * @Author: wangren.
 * @Description: 整数反转
 * @Date:Created in 2019-05-31 10:24.
 * @Modified By:
 */
public class Reverse {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int reverse = Reverse.reverse(1563847412);
        System.out.println(reverse);
    }
}
