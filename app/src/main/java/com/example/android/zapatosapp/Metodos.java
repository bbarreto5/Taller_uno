package com.example.android.zapatosapp;

/**
 * Created by android on 12/03/2018.
 */

public class Metodos {
    public  static double tipo1(int n, int n2, int n3){
        if(n==0){
            return tipo2(n2,n3);
        }else{
            return tipo2_1(n2,n3);
        }
    }
    public static double tipo2(int n, int n2){
        if(n == 0){
            return tipo3(n2);
        }else{
            return tipo4(n2);
        }
    }
    public static double tipo2_1(int n, int n2){
        if(n == 0){
            return tipo5(n2);
        }else{
            return tipo6(n2);
        }
    }

    public  static double tipo3(int n){
        switch (n){
            case 0:
                return 120000;

            case 1:
                return 140000;

            case 2:
                return 130000;

        }
        return 0;
    }
    public static double tipo4(int n){
        switch (n){
            case 0:
                return 50000;

            case 1:
                return 80000;

            case 2:
                return 100000;
        }
        return 0;
    }

    public static double tipo6(int n){
        switch (n){
            case 0:
                return 60000;

            case 1:
                return 70000;

            case 2:
                return 120000;

        }
        return 0;
    }
    public static double tipo5(int n){
        switch (n){
            case 0:
                return 100000;

            case 1:
                return 130000;

            case 2:
                return 110000;
        }
        return 0;
    }
}
