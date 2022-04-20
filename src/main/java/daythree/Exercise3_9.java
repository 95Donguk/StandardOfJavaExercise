package daythree;

class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ((String.valueOf(ch)).matches("[0-9A-Za-z]"));
        System.out.println(b);
    }
}
