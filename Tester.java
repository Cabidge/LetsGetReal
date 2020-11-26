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
        RationalNumber HALF = new RationalNumber(-1, -2);
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

        RationalNumber TWO = HALF.reciprocal();
        System.out.println(TWO.getValue() == 2);
        System.out.println(NOT_INF.reciprocal().equals(NOT_INF));
        System.out.println(NEGATIVE.reciprocal().equals(NEGATIVE));

        System.out.println("1/2".equals("" + HALF));
        System.out.println("0/1".equals("" + NOT_INF));
        System.out.println("-1/1".equals("" + NEGATIVE));
        System.out.println(!"WOWOW".equals("" + NEGATIVE));
        
        RationalNumber REDUCED_HALF = new RationalNumber(3,6);
        RationalNumber REDUCED_TWO = new RationalNumber(200,100);
        System.out.println(REDUCED_HALF.equals(HALF));
        System.out.println(REDUCED_TWO.equals(TWO));

        RationalNumber z = new RationalNumber(-3, -2);
        RationalNumber y = new RationalNumber(9, 4);
        System.out.println(y.equals(z.multiply(z)));
        System.out.println(HALF.multiply(HALF.reciprocal()).getValue() == 1);

        RationalNumber x = new RationalNumber(2, 3);
        System.out.println(x.equals(z.divide(y)));
        System.out.println(HALF.divide(HALF).getValue() == 1);

        RationalNumber w = new RationalNumber(13, 6);
        System.out.println(w.equals(z.add(x)));
        System.out.println(TWO.add(NOT_INF).equals(TWO));
        System.out.println(HALF.add(HALF).getValue() == 1);

        x = new RationalNumber(-3, 4);
        w = new RationalNumber(3, 4);
        System.out.println(z.subtract(y).equals(x));
        System.out.println(y.subtract(z).equals(w));
        System.out.println(TWO.subtract(NOT_INF).equals(TWO));
        System.out.println(HALF.subtract(HALF).equals(NOT_INF)); // equals zero
    
        a = new RealNumber(-24.44);
        b = new RealNumber(36.3);
        c = new RealNumber(36.3);
        d = new RealNumber(2);
        e = new RealNumber(0.5);
        System.out.println(a.compareTo(b) < 0);
        System.out.println(b.compareTo(c) == 0);
        System.out.println(d.compareTo(TWO) == 0); // Testing compareTo between RealNumbers and RationalNumbers
        System.out.println(e.compareTo(HALF) == 0);
        System.out.println(TWO.compareTo(e) > 0);
        System.out.println(x.compareTo(w) < 0);

        z = new RationalNumber(6, 9);
        y = new RationalNumber(3, 0);
        x = new RationalNumber(24, -6);
        w = new RationalNumber(222, 1);
        RationalNumber v = new RationalNumber(0, 99999999);
        RationalNumber u = new RationalNumber(0, -99999999);
        System.out.println(z.toString().equals("2/3"));
        System.out.println(y.toString().equals("0"));
        System.out.println(x.toString().equals("-4"));
        System.out.println(w.toString().equals("222"));
        System.out.println(v.toString().equals("0"));
        System.out.println(u.toString().equals("0"));
    }
}