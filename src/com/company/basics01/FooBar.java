package com.company.basics01;

public class FooBar {
//Todo better
    public String compute(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                sb.append("FooBarQix");
            } else if (i % 3 == 0 && i % 7 == 0) {
                sb.append("FooQix");
            } else if (i % 3 == 0 && i % 5 == 0) {
                sb.append("FooBar");
            }
            else if(i % 5 == 0 && i % 7 == 0) {
                sb.append("BarQix");
            }
            else if(i % 3 == 0) {
                sb.append("Foo");
            }
            else if(i % 5 == 0) {
                sb.append("Bar");
            }
            else if(i % 7 == 0) {
                sb.append("Qix");
            }
             if (contains3(i)){
                sb.append("Foo");
            }
            if (contains5(i)){
                sb.append("Bar");
            }
             if (contains7(i)){
                sb.append("Qix");
            }
             if (contains0(i)){
                sb.append("*");
            }

             sb.append(i);

            sb.append(" ");
        }
        return sb.toString();
    }

    private int reverseNumber(int n){
        int result = 0;
        while (n > 0){
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }

    public boolean contains3 (int n){
        int x = reverseNumber(n);
        boolean result = false;
        while (x > 0){
            if (x % 10 == 3){
                result = true;
            }
            x = x / 10;
        }
        return result;

    }

    public boolean contains5 (int n){

        int x = reverseNumber(n);
        boolean result = false;
        while (x > 0){
            if (x % 10 == 5){
                result = true;
            }
            x = x / 10;
        }
        return result;

    }

    public boolean contains7 (int n){

        int x = reverseNumber(n);
        boolean result = false;
        while (x > 0){
            if (x % 10 == 7){
                result = true;
            }
            x = x / 10;
        }
        return result;

    }

    public boolean contains0(int n){
        boolean result = false;
        while (n > 0){
            if (n % 10 == 0){
                result = true;
            }
            n = n / 10;
        }
        return result;
    }


    public static void main(String[] args) {
        FooBar fooBar = new FooBar();
        System.out.println(fooBar.compute(100));
    }


    }

