package textmoon;

public class AFatherClass {
    private String title = "我是AFather";
    private int age = 58;
    private String wife = "luck";
    public String mySay = "我是父亲";
    String toChildSay = "You is sun";

    public AFatherClass () {

    }


    public String getTitle () {
        return this.title;
    }
    public int getAge () {
        return age;
    }
    public String getMySay() {
        return mySay;
    }
    public String getWife() {
        return mySay + ",我的妻子是：" + wife;
    }

    public final String checkWife ( String data) {
        System.out.println(title + "修改了自己的wife");
       return wife = data;
    }
}
