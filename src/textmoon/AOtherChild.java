package textmoon;

public class AOtherChild extends AFatherClass{
    private String mySay = "我是张三";
    private String wife = "山口百惠";

    public String getWife() {
        return mySay + ",我的妻子是：" + wife;
    }
    public String getNewWife() {
        return mySay + ",我的妻子是：" + wife;
    }

    public void overTestLoad () {
        System.out.println("执行了默认方案");
    }

    public void overTestLoad ( String data ) {
        System.out.println("执行了字符串入参方案：" + data);
    }

    public void overTestLoad ( String data, String str ) {
        System.out.println("执行了拼接字符串方案：" + data + str);
    }

    public void overTestLoad ( int num ) {
        System.out.println("数字方案：" + num);
    }
}
