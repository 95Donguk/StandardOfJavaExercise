package dayfour;

import java.util.Objects;

public class Exercise4_1 {
    public static void main(String[] args) {
        int x = 15;
        if (10 < x && x < 20) {
            System.out.println("10보다 크고 20보다 작음");
        }
        char ch = 'x';
        if (ch != ' ' && ch != '\t'){
            System.out.println("공백이나 탭이 아님");
        }
        char ch2 = 'x';
        if (ch2 == 'x' || ch2 == 'X'){
            System.out.println("\'x\' or \'X\' 임");
        }
        char ch3 = '0';
        if ('0' <= ch3 && ch3 <= '9'){
            System.out.println("아스키코드 숫자임");
        }
        char ch4 = 'x';
        if ('a' <= ch4 && ch4 <= 'z' || 'A' <= ch4 && ch4 <= 'Z'){
            System.out.println("영문자(대소문자) 임");
        }
        int year = 800;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("윤년임");
        }
        boolean powerOn = false;
        if (!powerOn) {
            System.out.println("powerOn은 false임");
        }
        String str = "yes";
        if (Objects.equals(str, "yes")) {
            System.out.println("yes임");
        }
    }

}
