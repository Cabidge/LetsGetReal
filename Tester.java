public class Tester {
    public static void main(String[] abcdefghijklmnopqrstuvwxyz) {
        System.out.println("Must all be true:");
        
        RealNumber a = new RealNumber(0);
        RealNumber b = new RealNumber(0);
        System.out.println(a.equals(b));

        a = new RealNumber(0.1);
        System.out.println(!a.equals(b));

        b = new RealNumber(0.10000001);
        System.out.println(a.equals(b));

        a = new RealNumber(3);
        b = new RealNumber(5.2);
        RealNumber c = a.add(b);
        RealNumber d = new RealNumber(8.2);
        System.out.println(c.equals(d));

        c = a.multiply(b);
        d = new RealNumber(15.6);
        System.out.println(c.equals(d));

        c = c.divide(b);
        System.out.println(c.equals(a));

        c = a.subtract(b);
        d = new RealNumber(-2.2);
        System.out.println(c.equals(d));

        // RationalNumber
        RationalNumber HALF = new RationalNumber(1, 2);
        RationalNumber NOT_INF = new RationalNumber(5, 0);
        RationalNumber NEGATIVE = new RationalNumber(1, -1);
        
        c = new RealNumber(0.5);
        d = new RealNumber(0);
        RealNumber e = new RealNumber(-1);
        System.out.println(c.equals(HALF));
        System.out.println(d.equals(NOT_INF));
        System.out.println(e.equals(NEGATIVE));
        System.out.println(HALF.getValue() == 0.5);

        System.out.println(HALF.getDenominator() == 2);
        System.out.println(NOT_INF.getNumerator() == 0);
        System.out.println(NOT_INF.getDenominator() == 1);
        System.out.println(NEGATIVE.getNumerator() == -1);

        RationalNumber z = HALF.reciprocal();
        System.out.println(z.getValue() == 2);
        System.out.println(NOT_INF.reciprocal().equals(NOT_INF));
        System.out.println(NEGATIVE.reciprocal().equals(NEGATIVE));

        System.out.println("1/2".equals("" + HALF));
        System.out.println("0/1".equals("" + NOT_INF));
        System.out.println("-1/1".equals("" + NEGATIVE));
        System.out.println(!"WOWOW".equals("" + NEGATIVE));
    }
}