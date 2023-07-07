package com.example.hellojacoco;

public class HelloJacoco {
    public static String translation(String str) {
        switch (str) {
            case "human":
                return "인간";
            case "dog":
                return "강아지";
            case "cat":
                return "고양이";
            default:
                return "알수없음";
        }
    }
}
