package textmoon;

// java 的对象创建构造类
class MyObject {
    // 声明对象属性，利用修饰符来控制公共or私有属性。
    private String title;
    private double age;
    private String say;
    private int salary;
    public String newName;
    // 书写一个与类同名的构造函数，建立构造属性与参数的联系
    MyObject(String title, double age, String say, int salary, String newName) {
        this.title = title;
        this.age = age;
        this.say = say;
        this.salary = salary;
        this.newName = newName;
    }
    // 提供对象方法，当属性是为私有 private 需要通过内部 api 方法来访问。
    // 当书写一个方法表示存在返回值时，内部必须使用return来返回一个值。
    public String getTitle () {
        return title;
    }
    public  String setTitle ( String newTitle ) {
        return title = newTitle;
    };

}
