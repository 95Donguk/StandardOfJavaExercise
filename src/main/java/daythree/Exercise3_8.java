package daythree;

public class Exercise3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3F / 2F;

        long l = 3000L * 3000L * 3000L;

        float f2 = 0.1f;
        double d = 0.1f;
        boolean result = d==f2;
        System.out.println("c="+c);
        System.out.printf("ch=%c\n", ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}

