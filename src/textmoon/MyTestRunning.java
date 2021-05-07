package textmoon;

import java.util.ArrayList;

public class MyTestRunning {
    private StudyEnum testEnumVal = StudyEnum.RED;
    public static void main(String[] args) {
        AChildClass test01 = new AChildClass();
        System.out.println(test01.getTitle());
        System.out.println(test01.getAge());
        System.out.println(test01.getMySay());
        System.out.println(test01.getFatherSay());
        System.out.println(test01.getWife());
        System.out.println(test01.checkWife("lili"));
        System.out.println(test01.getWife());
        AFatherClass test02 = new AFatherClass();
        AFatherClass test03 = new AChildClass();
        AFatherClass test04 = new AOtherChild();
        System.out.println(test01.getMySay());
        System.out.println(test02.getMySay());
        System.out.println(test03.getMySay());
        System.out.println(test01.getWife());
        System.out.println(test02.getWife());
        System.out.println(test03.getWife());
        System.out.println(test04.getWife());
        System.out.println(test04.getTitle());
        AOtherChild test05 = new AOtherChild();
        test05.overTestLoad();
        test05.overTestLoad("刘德华");
        test05.overTestLoad("周星驰","吴孟达");
        test05.overTestLoad( 101 );
        ArrayList testArr = new ArrayList();
        testArr.add( 1 );
        testArr.add( "就是这样" );
        testArr.add(new int[] {101,930});
        testArr.add( 343.234 );
        System.out.println(testArr);
        testArr.forEach( item -> System.out.println( item ));
        System.out.printf("%x", 1, 2, 3, 4 );
        System.out.println( StudyEnum.YELLOW );
        System.out.println( StudyEnum.values() );

    }

    public StudyEnum testEnum () {
        return testEnumVal;
    }
}
