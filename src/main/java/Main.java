public class Main {

    public static void main (String [] args) throws Exception {
        Object object = ObjectFactory.createObject(MyObject.class);
        System.out.println(object.getClass());
    }

}
