import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeDemo {

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);

        String demo1 = "I love dogs and they Love me! My dogs name is Bulka. She is 10 month old. Bulo4ka likes to Sleep and to eat!";
        String demo2 = "2000";
        String demo3 = "  I     love    100  dogs and  they   Love me! My dogs      name is Bulka. She is     10 month old. Bulo4ka     likes to Sleep and to eat!  ";
        String demo4 = "26/11/2018";
        String demo5 = "Mama mama mila mila ramu ramu";
        String demo6 = "1123333455qwe667";
        String demo7 = "Helllo sstupid worldd ever";

        while(true) {

            System.out.println("\n\nEnter number of practice:");
            num = scan.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("String: " + demo1);
                    practice1(demo1);
                    break;
                }
                case 2: {
                    System.out.println("String: " + demo2);
                    practice2(demo2);
                    break;
                }
                case 3: {
                    System.out.println("String: " + demo3);
                    practice3(demo3);
                    break;
                }
                case 4: {
                    System.out.println("String: " + demo4);
                    practice4(demo4);
                    break;
                }
                case 5: {
                    System.out.println("String: " + demo5);
                    practice5(demo5);
                    break;
                }
                case 6: {
                    System.out.println("String: " + demo6);
                    practice6(demo6);
                    break;
                }
                case 7: {
                    System.out.println("String: " + demo7);
                    practice7(demo7);
                    break;}
                default:
                {
                    System.out.println("\nNo such case. ReEnter 1-7 = ");
                    num = scan.nextInt();
                }
            }
        }
    }

    public static void practice1(String demo) {

        Pattern upperCase = Pattern.compile("\\b([A-Z]\\w*)\\b");
        Matcher matcher = upperCase.matcher(demo);

        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
        }
    }

    public static void practice2(String demo) {

        System.out.print(demo.matches("2\\d(1[3-9]|[2-9]\\d)|[3,4]\\d{3}|50([0-3]\\d|4[0-3])" ));


    }

    public static void practice3(String demo) {

        String temp = demo.replaceAll("\\A\\s+|\\s+\\z", "");
        System.out.print(temp.replaceAll("\\s+", " "));



    }

    public static void practice4(String demo) {

        System.out.print(demo.matches("^([0-2]\\d|3[0-1])[/](0\\d|1[0-2])[/]\\d{4}"));

    }

    public static void practice5(String demo) {

        /*String[] arr = new String[50];
        Pattern duplicates = Pattern.compile("(\\w+)");
        Matcher matcher = duplicates.matcher(demo);
        Set<String> hash = new LinkedHashSet<String>();

        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                demo = demo.toLowerCase();
                arr[i] = demo.substring(matcher.start(), matcher.end()) + " ";
                hash.add(arr[i]);
            }
            }

         System.out.print(hash);*/

        Pattern pattern = Pattern.compile("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(demo);

        System.out.println( matcher.replaceAll( "$1") );

    }

    public static void practice6(String demo) {

        demo = demo.replaceAll("(.)\\1", "*");
        System.out.print(demo);

    }

    public static void practice7(String demo) {


        System.out.print(demo.replaceAll("\\w*(.)\\1\\w*", ""));

    }
}

