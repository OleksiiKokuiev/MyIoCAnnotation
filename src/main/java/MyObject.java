public class MyObject {
    private int value = 0;

    public MyObject() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @RunThisMethod(repeat = 5)
    public void thisMethod(){
        System.out.println("Run this method ");
    }
}
