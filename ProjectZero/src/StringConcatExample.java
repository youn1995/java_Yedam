
public class StringConcatExample {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2;
        System.out.println(str3);

        System.out.println("result: " + (3 + 30)); //앞에 나온게 문자열이면 뒤에도 문자열로 인식함 ()치면 먼저함
        System.out.println(3 + 30 + "result: ");

        

    }
}