package textmoon;

import java.util.Date;

public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("你的名字");
        var name = "Huang";
        long age = 1982938L;
        double see = 28372.3848237F;
        System.out.println( name );
        System.out.println( age );
        System.out.println( see );
        ergodicSomeNum();
    }

    public static void sayHello() {
        long name = 1982938L;
        System.out.println( name );
    }

    public static void contrastStr () {
        String a = "这是一个A";
        String b = new String("这是一个B");
        String c = new String("这是一个A");
        System.out.println( a == b );
        System.out.println( a == c );
        System.out.println( a.equals(b) );
        System.out.println( a.equals(c) );
        int [] cIsArr = c.codePoints().toArray();
        System.out.println( cIsArr[0] - cIsArr[1]  );

        // 一种被推荐的字符串构建方式
        StringBuilder d = new StringBuilder("初始");
        System.out.println( d );
        d.append("增加1个");
        System.out.println( d );
        d.append("增加2个");
        System.out.println( d );
        System.out.println( new Date() );
    }

    public static void ergodicSomeNum () {
        for ( int i = 0; i < 10; i++ ) {
            if ( i == 5 ) continue;
            System.out.println( i );
        }
    };
}