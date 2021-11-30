package LAB8;

public class z15 {

    public static void main(String[] args) {
        String s1 = " Welcome ";
        String s2 = " welcome ";
        String s3;
        int x;
        Boolean isEqual, b;
        isEqual = s1.equals(s2);
        System.out.println("isEqual: s1 == s2 - " + isEqual);
        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("isEqual: s1 == s2 без учета регистра - " + isEqual);
        x = s1.compareTo(s2);
        System.out.println("x: s1 == s2 - " + x);
        x = s2.compareToIgnoreCase(s1);
        System.out.println("x: s1 == s2 без учета регистра - " + x);
        b = s1.startsWith("AAA");
        System.out.println("b: префикс - " + b);
        b = s1.endsWith("AAA");
        System.out.println("b: суффикс - " + b);
        x = s1.length();
        System.out.println("x: длина s1 - " + x);
        x = (s1.charAt(0));
        System.out.println("x: Первый символ - " + (char) (x));
        s3 = s1 + s2;
        System.out.println("s3: Новая строка - " + s3);
        System.out.println("s3: Подстрока от 1 - " + s1.substring(1));
        System.out.println("s3: Подстрока от 1 до 4 - " + s1.substring(1, 4));
        s3 = s1.toLowerCase();
        System.out.println("s3: Строчные буквы - " + s3);
        s3 = s1.toUpperCase();
        System.out.println("s3: Заглавные буквы - " + s3);
        s3 = s1.trim();
        System.out.println("s3: Уссеченые пробелы - " + s3);
        x = s1.indexOf("e");
        System.out.println("x: Индекс первого вхождения символа e - " + x);
        x = s1.lastIndexOf("abc");
        System.out.println("x: Индекс последнего вхождения строки abc - " + x);
    }
}
