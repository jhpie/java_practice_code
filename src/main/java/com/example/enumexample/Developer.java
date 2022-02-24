package com.example.enumexample;

public class Developer {
    public String name;
    public int career;
    public DevType type;

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.name = "홍길동";
        developer.career = 3;
        developer.type = DevType.WEB;
        System.out.println("개발자 이름 : " + developer.name);
        System.out.println("개발자 경력 : " + developer.career);
        System.out.println("직무파트 : " + developer.type);
    }
}

enum DevType {
    MOBILE, WEB, SERVER
}