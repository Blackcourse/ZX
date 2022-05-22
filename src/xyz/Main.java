package xyz;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = 5;
        int res = (x + y + z) / 3;
        System.out.println(res);
        double res1 = res/2;
        String result = String.format("%.2f",res1);
        if (res1 > 3) {
            System.out.println("Always correct");
        }

    }
    }

