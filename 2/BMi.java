import java.util.Scanner;

public class BMi {
    public static void main(String[] args) {
        System.out.println("这是一个BMI体重计算器");
        System.out.print("请输入你的身高（M）：");
        Scanner scanner = new Scanner(System.in);
        Double h = scanner.nextDouble();
        System.out.print("请输入你的体重（KG）：");
        Double w = scanner.nextDouble();

        Double s = w/(h*h);
        
        if (s > 32){
            System.out.println("卧槽！，你他妈怎么长得这么胖的！死人了");
            String p = "你的BMI指数：" + s;
            System.out.println(p);

        } else if (s > 28){
            System.out.println("恭喜你！失去了找女朋友的机会");
            String p = "你的BMI指数：" + s;
            System.out.println(p);

        } else if (s > 25){
            System.out.println("还是胖");
            String p = "你的BMI指数：" + s;
            System.out.println(p);
            
        } else if (s > 18.5){
            System.out.println("你是个正常人");
            String p = "你的BMI指数：" + s;
            System.out.println(p);

        } else {
            System.out.println("瘦成这样，买棺材吧，火葬场一条龙安排上");
            String p = "你的BMI指数：" + s;
            System.out.println(p);

        }


    }
}