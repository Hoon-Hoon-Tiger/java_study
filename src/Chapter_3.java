import javax.sound.sampled.SourceDataLine;
import java.util.Arrays;
// 2. 불(boolean)

// 1. 숫자
public class Chapter_3{
    // 1. 숫자
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        int i = 0;
        int j = 0;

        // 사칙연산
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // 몫이 출력

        // 증감 연산자
        System.out.println(i++); // 연산자의 위치에 따라 결과가 차이 존재 
        System.out.println(++j);
        // System.out.println(i); 
        
        // boolean 자료
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        } 
        
        //문자열(string)
        /* int, long, double, float, boolean, char 등을 자바에서는 원시(primitive) 자료형이라고 부른다. 이런 primitive 자료형은 'new'키워드로 값을 생성할 수 없다.  
        int, long, double, float, boolean, char 등과 같은 원시(primitive) 자료형은 다음처럼 각각에 대응하는 Wrapper 클래스들이 존재한다.
        ArrayList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신 그에 대응하는 Wrapper 클래스들을 사용해야한다. 원시 자료형 대신 Wrapper 클래스를 사용하면 값 대신 객체를 
        주고 박을 수 있어 코드를 객체 중심적으로 작성하는데 유리하다. 또한 멀티스레딩 환경에서 동기화를 지원하기 위해서는 Wrapper 클래스가 반드시 필요하다. */
        String A = "hello java";
        String B = new String("hello");
        
        // equals
        System.out.println(A.equals(B)); // 두 문자열 모두 'hello'로 같은 값을 가지기 때문에 True return
        System.out.println(A == B); // == 은 두 개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false return
        //indexOf
        System.out.println(A.indexOf("java")); //indexOf : 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다. 자바는 숫자를 0부터 세기 때문에 출력이 6이 나오게 된다.
        //contains
        System.out.println(A.contains("java")); //contains : 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다. 포함할 경우 true값을 리턴
        //charAt
        System.out.println(A.charAt(6)); //charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
        //replaceAll 
        System.out.println(A.replaceAll("java", "World")); //replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
        //substring
        System.out.println(A.substring(0,4)); //substing은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다. 시작위치 <= a < 끝위치
        //toUpperCase
        System.out.println(A.toUpperCase()); //toUppercase는 문자열을 모두 대문자로 변경할 때 사용한다. (소문자로 변경할때는 toLowercase를 사용한다.)
        //split
        String C = "a,b,c,d"; // 정규식 문자열을 파라미터로 받아서, 정규식 문자열과 일치하는 부분을 중심으로 문자열을 잘라서, 잘려진 문자열들을 배열로 return한다. 
        String[] result = C.split(",");
        System.out.println(Arrays.toString(result)); // array 형태로 반환되기 때문에 string형태로 바꾸어 주어야한다.

        // 문자열 포매팅
        int number = 3;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days", number, day));
        //%s의 경우 %d, %f 형태에 대해서 모두 사용 가능 > 자동으로 문자열로 바꾸기 때문에 
        // %를 출력하고 싶을 경우 %%으로 입력
        System.out.println(String.format("Error is %d%%", 98));
    }
}
