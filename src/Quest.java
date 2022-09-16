import java.util.Scanner;


public class Quest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("돈의 핵수를 입력하세요 >> ");
        int money = scanner.nextInt();
        int money1 = money / 50000;
        int money2 = (money % 50000) / 10000;
        int money3 = (money % 10000) / 1000;
        int money4 = (money % 1000) / 500;
        int money5 = (money % 500) / 100;
        int money6 = (money % 100) / 10;
        int money7 = (money % 10) / 1;

        System.out.print("오만원" + money1 + "개");
        System.out.print("만원" + money2 + "개");
        System.out.print("천원" + money3 + "개");
        System.out.print("500원" + money4 + "개");
        System.out.print("100원" + money5 + "개");
        System.out.print("10원" + money6 + "개");
        System.out.print("1원" + money7 + "개");

        System.out.println("\n------7번 ------\n");


        System.out.print("학점을 입력하세요 >> ");

        String level = scanner.next();

        switch (level) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;

            case "C":
            case "D":
                System.out.println("Good");
                break;

            case "F":
                System.out.println("Bye");
                break;

            default:
                System.out.println("잘못된 입력입니다");
                break;
        }
    }
}
