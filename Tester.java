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
    }
}