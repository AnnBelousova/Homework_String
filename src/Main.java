import java.awt.print.Book;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    static String firstName = "";
    static String middleName = "";
    static String lastName = "";
    static String fullName = "";

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5Star();
        task6Star();
        task7Star();
        task8Star();
    }

    public static void task1() {
        System.out.println("Task 1:");
        firstName = "Ivan";
        middleName = "Ivanovich";
        lastName = "Ivanov";
        fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);
    }

    public static void task2() {
        System.out.println("\nTask 2:");
        System.out.println("The employee's full name data for filling out the report is : " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("\nTask 3:");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
        }
        System.out.println("The employee's full name data is : " + fullName);
    }

    public static void task5Star() {
        System.out.println("\nTask 5*:");
        fullName = "Ivanov Ivan Ivanovich";
        int indexFirstSpace = fullName.indexOf(" ");
        int indexLastSpace = fullName.lastIndexOf(" ");
        lastName = fullName.substring(0, indexFirstSpace);
        firstName = fullName.substring(indexFirstSpace+1, indexLastSpace);
        middleName = fullName.substring(indexLastSpace+1);

        System.out.printf("First name - %s", firstName);
        System.out.printf("\nLast name - %s", lastName);
        System.out.printf("\nMiddle name - %s", middleName);

    }

    public static void task6Star() {
        System.out.println("\n\nTask 6*:");
        fullName = "ivanov ivan ivanovich";
        char[] fullNameChar = fullName.toCharArray();

        for (int i = 0; i < fullNameChar.length; i++) {
            fullNameChar[0] = Character.toUpperCase(fullNameChar[0]);
            if(fullNameChar[i] == ' '){
                fullNameChar[i+1] = Character.toUpperCase(fullNameChar[i+1]);
            }
        }
        System.out.print(fullNameChar);
    }

    public static void task7Star() {
        System.out.println("\n\nTask 7*:");
        String str1 = "135";
        char[] str1char = str1.toCharArray();
        String str2 = "246";
        char[] str2char = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str1char.length ; i++) {
            sb = sb.append(str1char[i]).append(str2char[i]);
        }
        System.out.println(sb);
    }

    public static void task8Star() {
        System.out.println("\nTask 8*:");
        String str = "aabccddefgghiijjkk";
        char[] strChar = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strChar.length-1; i++) {
            if(strChar[i] == strChar[i+1]){
              strChar[i+1] = strChar[i];
                sb.append(strChar[i]);
            }
        }
        System.out.println(sb);
    }
}