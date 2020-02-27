import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my third Java program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("你的名字是啥？你个憨逼：");
        String name = scanner.nextLine();
        System.out.println("我知道你个逼就是Ethan！");
        String news = "你个逼还装成" + name;
        System.out.println(news);
        System.out.println("放弃你的伪装吧 憨逼！");
    }
}