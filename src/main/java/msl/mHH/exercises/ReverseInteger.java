package msl.mHH.exercises;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
public class ReverseInteger {
    // [My Answer]
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int result = 0;
        int tmp = x < 0 ? -x : x;
        int sign = x < 0 ? -1 : 1;
        while (tmp > 0) {
            if (result > (Integer.MAX_VALUE - tmp % 10) / 10.0)
                return 0;
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        return sign * result;
    }
}
