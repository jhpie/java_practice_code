package com.example.enumexample;

public class enum_00 {
    /*
    보통 public static final을 선언하게 되면 상수로 선언으 되어지는데 아래의
    코드를 살펴보면 public static final변수를  선언하였을때 문제점을 살펴볼수 있다.
    gender1 은 상수의 값만이 할당이 되어지는 변수인데 중간에 원치않는 값이 들어갈수도 있는 경우이다.
    이와같은 경우 enum변수는 enum변수안에 선언되어진 상수외에 값이 들어간다면 error가 발생하는것을 확인할수있다.

    +)추가로 enum으로 선언되어진 변수안에 따로 초기화가 되지않을경우 열거형 상수가 들어가는것을 알수있다. ex) MALE = 0, FEMALE = 1
    */

    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = enum_00.MALE;
        gender1 = enum_00.FEMALE;
        // MALE, FEMALE이 아닌 상수 값이 할당 될 때 //컴파일시 에러가 나지 않음. -> 문제점 발생.
        gender1 = "boy";
        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMAL;
        // 컴파일 시 의도하지 않는 상수 값을 체크할 수 있음.
        // Enum으로 정의한 상수값만 할당 받을 수 있음.
//        gender2 = "boy";

        // ordinal() -> 원소의 열거된 순서 반환
        System.out.println(gender2.ordinal());

        // EnumType가져오는 방법 - .valueOf()
        gender2 = Gender.valueOf("MALE");

        // 연관된 값반환하기
        for (Gender gender : Gender.values()){
            System.out.println(gender.getName());
        }

        //
    }
    // enum class를 이용해 Gender라는 새로운 상수들의 타입을 정의한다.
    // enum 변수들은 모두 대문자로 선언해준다.
    enum Gender {
        MALE("남자"),
        FEMAL("여자");

        final String name ;

        public String getName(){
            return name;
        }

        Gender(String name) {
            this.name = name;
        }
    }
    //실제 Enum변수를 선언하게되면 내부적으로 아래 코드와같다. ->기대하지않은 상수값을 사전에 체크가 가능해진다.
//    class Gender{
//
//        public static final Gender MALE = new Gender();
//        public static final Gender FEMALE = new Gender();
//
//    }
}
