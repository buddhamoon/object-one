package textmoon;

public class AChildClass extends AFatherClass{
    private String title = "我是AChild";
    private String wife = "一个中国女人";
    private String mySay = "我是孩子";

    public int getAge () {
        int a = super.getAge();
        return a;
    }

    public String getWife() {
        return mySay + ",我的妻子是：" + wife;
    }
    public String getMySay() {
        return mySay;
    }

    public  String getFatherSay () {
        return toChildSay;
    }

    public static void main(String[] args) {

    }
}


