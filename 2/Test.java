import java.util.Scanner;

public class Test {
    public static void main(String[] args) {   
        
        System.out.println("这是一个自动化排序程序");
        Scanner scanner = new Scanner(System.in);
        int[] inst = new int[10];

        for (int i = 0; i < 10; i ++){
            System.out.print("请输入第" + (i+1) + "个数字：");
            inst[i] = scanner.nextInt();
        }
        System.out.println("核心内容录入完成！");

        for (int s : inst){
            System.out.println(s);
        }


    }

}