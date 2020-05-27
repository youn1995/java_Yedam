
public class Exercise_Lotto {
    public static void main(String[] args) {
        System.out.println("로또번호를 자동으로 생성합니다...");
        autoMakeNumber();
        System.out.println("번호 생성 완료...");
    }

    public static void autoMakeNumber() {

        int num1 = (int) (Math.random() * 45) + 1;
        System.out.print(num1 + ", ");

        int num2 = (int) (Math.random() * 45) + 1;
        if (num2 == num1) {
            while (true) {
                num2 = (int) (Math.random() * 45) + 1;
                if (num2 != num1) {
                    break;
                }
            }
            System.out.print(num2 + ", ");
        } else {
            System.out.print(num2 + ", ");
        }

        int num3 = (int) (Math.random() * 45) + 1;
        if (num3 == num1 || num3 == num2) {
            while (true) {
                num3 = (int) (Math.random() * 45) + 1;
                if (num3 != num1 && num3 != num2) {
                    break;
                }
            }
            System.out.print(num3 + ", ");
        } else {
            System.out.print(num3 + ", ");
        }

        int num4 = (int) (Math.random() * 45) + 1;
        if (num4 == num1 || num4 == num2 || num4 == num3) {
            while (true) {
                num4 = (int) (Math.random() * 45) + 1;
                if (num4 != num1 && num4 != num2 && num4 != num3) {
                    break;
                }
            }
            System.out.print(num4 + ", ");
        } else {
            System.out.print(num4 + ", ");
        }

        int num5 = (int) (Math.random() * 45) + 1;
        if (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {
            while (true) {
                num5 = (int) (Math.random() * 45) + 1;
                if (num5 != num1 && num5 != num2 && num5 != num3 && num5 != num4) {
                    break;
                }
            }
            System.out.print(num5 + ", ");
        } else {
            System.out.print(num5 + ", ");
        }

        int num6 = (int) (Math.random() * 45) + 1;
        if (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5) {
            while (true) {
                num6 = (int) (Math.random() * 45) + 1;
                if (num6 != num1 && num6 != num2 && num6 != num3 && num6 != num4 && num6 != num5) {
                    break;
                }
            }
            System.out.println(num6);
        } else {
            System.out.println(num6);
        }

//        int num7 = (int) (Math.random() * 45) + 1;
//        if (num7 == num1 || num7 == num2 || num7 == num3 || num7 == num4 || num7 == num5 || num7 == num6) {
//            while (true) {
//                num7 = (int) (Math.random() * 45) + 1;
//                if (num7 != num1 && num7 != num2 && num7 != num3 && num7 != num4 && num7 != num5 && num7 != num6) {
//                    break;
//                }
//            }
//            System.out.print("보너스 번호: ");
//            System.out.println(num7);
//        } else {
//            System.out.print("보너스 번호: ");
//            System.out.println(num7);
//        }
    }

}