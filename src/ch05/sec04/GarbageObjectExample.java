package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;   //"여행"에 해당하는 String 객체를 쓰레기로 만듦

        String Kind1 = "자동차";
        String Kind2 = Kind1;   //Kind1 변수에 저장되어 있는 번지를 Kind2 변수에 대입
        Kind1 = null; //"자동차"에 해당하는 String 객체는 쓰레기가 아님
        System.out.println("Kind2: " + Kind2);
    }
}
