

public class Printname {
    public static void main(String[] args) {   
        
        String[] name = new String[3];

        name[0] = "孙鑫宇";
        name[1] = "李益康";
        name[2] = "Oliver";

        for (String nm : name){
            String text = "你好！" + nm;
            System.out.println(text);
        }

    }

}