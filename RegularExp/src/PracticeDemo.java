import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeDemo {

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);


        String demo1 = "I love dogs and they Love me! My dogs name is Bulka. She is 10 month old. Bulo4ka likes to Sleep and to eat!";
        String demo2 = "2000";
        String demo3 = "I love     dogs and they Love me! My dogs   name is Bulka. She is 10 month   old. Bulocika    likes to Sleep and to eat!";
        String demo4 = "26/11/2018";


        /*while(true) {

            System.out.println("Enter number of practice:");
            num = scan.nextInt();

            switch (num) {
                case 1: System.out.println(demo1); practice1(demo1);
                case 2: System.out.println(demo2); practice2(demo2);
                case 3: System.out.println(demo3); practice3(demo3);
                case 4: System.out.println(demo4); practice4(demo4);
                case 5: System.out.println(demo5); practice4(demo5);
                case 6: System.out.println(demo6); practice4(demo6);
                case 7: System.out.println(demo7); practice4(demo7);

            }
        }*/






    }

    public static void practice1(String demo) {

        Pattern upperCase = Pattern.compile("\\b([A-Z]\\w*?)\\b");
        Matcher matcher = upperCase.matcher(demo);

        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }
    }

    public static void practice2(String demo) {

        System.out.print(demo.matches("\\b0*(201[3-9]|2[1-9][0-9][0-9]|20[2-9][0-9]|[3-4][0-9][0-9][0-9]|50[0-3][0-9]|504[0-3])\\b" ));

    }

    public static void practice3(String demo) {

        Pattern extraSpace = Pattern.compile("[a-z]+|[A-Z][.]|[A-Z][!]|[a-z][.]|[a-z][!]|[A-z][a-z]+|[A-Z]");
        Matcher matcher = extraSpace.matcher(demo);

        while (matcher.find()) {
                System.out.print(demo.substring(matcher.start(), matcher.end()) + " ");
        }

    }

    public static void practice4(String demo) {

        System.out.print(demo.matches("^([0-2][0-9]|3[0-1])[/](0[0-9]|1[0-2])[/][0-9]{4}"));

    }


    public static void practice5(String demo) {
        
    }


}

