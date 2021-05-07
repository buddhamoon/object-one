package textmoon;

import datestudy.StudyDate;

public class MyShowNumber {
    /**@
     */
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        var test01 = 9801;
        var test02 = "数据分析";
        HelloWorld c = new HelloWorld();
        StudyDate time = new StudyDate();
        System.out.println(a + b);
        System.out.println(c);
        System.out.println( test01 );
        String [] nowArr = { "Hello", "who", "are", "you" };
        // java 中的for each 循环
        for ( String element : nowArr ) { System.out.println(element); };
        c.sayHello();
        c.contrastStr();
        c.ergodicSomeNum();
        time.getADate();
        MyObject seeObj = new MyObject( "peipa", 98, "你的名字", 1902, "gogoing");
        System.out.println( seeObj );
        System.out.println( seeObj.getTitle() );
        System.out.println( seeObj.newName );
        seeObj.newName = "一个新的名字";
        System.out.println( seeObj.newName );
        seeObj.setTitle("api取新title");
        System.out.println( seeObj.getTitle() );

    }
}