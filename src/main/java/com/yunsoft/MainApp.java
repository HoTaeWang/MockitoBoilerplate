package com.yunsoft;

public class MainApp {
    public String getGreeting(){
        return " === Start MainApp === ";
    }

    public static void main(String[] args) {
        System.out.println(new MainApp().getGreeting());
    }
}
