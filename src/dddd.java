import java.util.Scanner;

public class dddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("돈의 핵수를 입력하세요 >> ");
        int money = scanner.nextInt();

//        원금 / 50000 해서 5만원권 수 확인
        int m50000 = money / 50000;
//        5만원 뺀 12,245원을 변수 money에 저장
        money = money % 50000;
        int m10000 = money / 10000;//1만원권을 수를 확인하기 위해서 10000으로 나눔
        money = money % 10000;//1만원권 제외한 금액을 저장하기 위해서 10000으로 나머지 연산
        int m1000 = money / 1000;//5,245에서 1천원권의 수를 확인하기 위해서 1000으로 나눔
        money = money % 1000;//5000원을 뺀 나머지 금액을 계산하기 위해서 나머지 연산
        int m500 = money / 500;
        money = money % 500;
        int m100 = money / 100;
        money = money % 100;
        int m10 = money / 10;
        money = money % 10;

        System.out.println("오만원 " + m50000 + "개");
        System.out.println("만원 " + m10000 + "개");
        System.out.println("천원 " + m1000 + "개");
        System.out.println("500원 " + m500 + "개");
        System.out.println("100원 " + m100 + "개");
        System.out.println("10원 " + m10 + "개");
        System.out.println("1원" + money + "개");


        System.out.println("숫자를 입력하세요 : ");
        int number = scanner.nextInt();//사용자 숫자 입력
//        2자리 숫자 중 10의 자리 숫자와 1의 자리 숫자를 분리
        int finst = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0; // 3,6,9 의 수를 저장하기 위한 변수

        if((finst % 3 == 0) && (second % 3 == 0)){
            System.out.println("박수 짝짝");
        }
        else if ((finst % 3 == 0) ^ (second % 3 ==0)) {
            System.out.println("박수 짝");
        }
        else {
            System.out.println("박수 없음");
        }

//
////        10의 자리 숫자가 3의 배수인지 학인
//        if (finst % 3 == 0) {
//            count++;// 3의 배수이면  변수 count의 값 1증가
//        }
////        1의 자리 숫자가 3의 배수인지 확인
//        if (second % 3 == 0) {
//            count++; //3의 배수이면  변수 count의 값 1증가
//        }
//
//        if (count == 1) {
//            System.out.println("박수 짝");
//        }
//        else if (count == 2) {
//            System.out.println("박수 짝짝");
//        }
//        else if (count == 3) {
//            System.out.println("박수 없음");
//        }


    }
}
