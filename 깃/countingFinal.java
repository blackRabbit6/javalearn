import java.util.Scanner;

public class countingFinal {

    public static void main(String[] args) {
//            2번
//         int x = 10;
//         int y = 20;
//         int z = (++x) + (y--);
//        System.out.println("2번 정답: " + z);
//      예상답: 31 , 출력값: 31

//      4번
//        int pencils = 534;
//        int students = 30;
//        System.out.println("4번 정답 ");
//        int pencilStudent = (pencils / students);
//        System.out.println("1명 당 가져가는 연필 수: " + pencilStudent +"개");
//
//        int pencilLeft = (pencils % students);
//        System.out.println("남은 연필 수: " + pencilLeft +"개");
//        예상답안: (1명당: 17개, 남은수: 24개)
//        출력답안: (1명당: 17개, 남은수: 24개)

//        5번 - 왜 결과가 5가 아닌 4가 나왔나요?
//        int var1 = 5;
//        int var2 = 2;
//        double var31 = var1/var2; -> 앞에(double)이 없어 소수점은 삭제 되었기 때문
//        double var3 = (double) var1/var2;
//        int var41 = (int) (var31*var2);
//        int var4 = (int) (var3*var2);
//        System.out.println("5번 정답: " + var41);
//        System.out.println("5번 정답: " + var4);
//        정답: 5 , 출력값: 5

//        6번 - 십이하 제거
//        int value = 356;
//        System.out.println(value/100 * 100);
//        정답: 300, 출력: 300

//        7번 - '10%입니다' 가 나와야되는데, '10%가 아닙니다' 나오는 이유 및 수정
//        float var1 = 10f;
//        float var2 = var1/100;
//        if(var2 == 0.1){
//            System.out.println("10%입니다.");
//        }else{
//            System.out.println("10%가 아닙니다.");
//        }
        //   float var1 = 10f; - 정확이 0.1f가 0.1이 아니기 때문임
//        수정 코드
//        int var1 = 10;
//        double var2 = (double) var1/100;
//        if(var2 == 0.1){
//            System.out.println("10%입니다.");
//        }else{
//            System.out.println("10%가 아닙니다.");
//        }

//        8번 - 사다리꼴 조건: 소수점까지
//        int lengthTop =  5;
//        int lengthBottom = 10;
//        int height = 7;
//        double area = (double) ((lengthTop+lengthBottom)*height/2.0);
//        System.out.println("8번 사다리꼴 넓이: "+ area);
//        답: 52.5 출력값: 52.5

//        9번
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("첫 번째 수: ");
//        double firstNum = sc.nextDouble();
//        System.out.println("두 번째 수: ");
//        double secondNum = sc.nextDouble();
//
//        double divNum = firstNum/secondNum;
//
//        if (secondNum == 0.0){
//            System.out.println("결과: 무한대");
//        }else{
//            System.out.println("결과: " + divNum);
//        }

//        11번
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("아이디: ");
//        String id = sc.nextLine();
//
//        System.out.println("비밀번호: ");
//        String stPw = sc.nextLine();
//        int pw = Integer.parseInt(stPw);
//
//        if( id.equals("java")){
//            if (pw == 12345){
//                System.out.println("로그인 성공");
//            }
//            else{
//                System.out.println("로그인 실패: 패스워드 오류");
//            }
//        }else{
//            System.out.println("로그인 실패: 아이디 에러");
//        }
    }
}
