package Trianglearea;


    public class UchBurchtuk {
        int a;
        int b;
        int c;

        double area() {
            double p = (a + b + c) / 2;
            double ar = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Уч бурчтуктун аянты " + ar);
            return p;
        }
    }
