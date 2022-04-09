package HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[] args){
        System.out.println("Hello, студент!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("THX");
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        if (a + b >= 0){
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 1;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers(){
        int a = 1;
        int b = 2;
        if (a >= b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}


