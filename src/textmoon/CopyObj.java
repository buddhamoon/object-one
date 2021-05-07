package textmoon;

public class CopyObj {
    static String aName = "测试名称A";
    static MyObject aNewObj = new MyObject( "测试标题1", 1988, "Look Change", 102, "目前保持原样");
    public void changeValue ( String bName, MyObject dataObj ) {
        System.out.println( aName );
        System.out.println( bName );
        System.out.println( dataObj.newName );
        bName = "对aName进行了修改";
        dataObj.newName = "修改引用类型名";
        System.out.println( aName );
        System.out.println( bName );
        System.out.println( aNewObj.newName );
        System.out.println( dataObj.newName );
    }

    public static void main(String[] args) {
        CopyObj a = new CopyObj();
        a.changeValue( aName, aNewObj );
    }
}


