package xiaomi;

public class testchild extends testFather{

    public testchild(){}
    public testchild(int a) {
        super(a);
    }

    @Override
    public void sing() {
        System.out.println("child sing");
    }
    public void testchild(){
        System.out.println("test child");
    }
}
