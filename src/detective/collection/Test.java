package detective.collection;

import detective.Subject;

/**
 * <br>创建时间：2021/3/25.
 *
 * @author 5k5k
 */
public class Test extends Subject {

    @Override
    public void run() {
        super.run();
        testAddDigits();
        testPower();
        testAnd();
    }

    /**
     * 正整数所有位数相加，直到结果为个位数
     *
     * @param num 正整数
     * @return 结果
     */
    private int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    private void testAddDigits() {
        System.out.println(addDigits(123));
        System.out.println(addDigits(6422));
        System.out.println(addDigits(89));
        System.out.println(addDigits(345));
        System.out.println(addDigits(9000));
        System.out.println(addDigits(2222));
    }

    private void testPower() {
        System.out.println(1 << 1);
        System.out.println(1 << 30);
        System.out.println(Math.pow(2, 30));
    }

    private void testAnd() {
        int h = 5;
        int l = 32;
        System.out.println(h & (l - 1));
        System.out.println(h % l);
    }
}
