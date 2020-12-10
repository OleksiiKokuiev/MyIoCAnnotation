import java.lang.reflect.Method;

public class ObjectFactory {

    public static <T> T createObject(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();

        Object newObject = clazz.newInstance();

        for (Method method : methods){
            if (method.isAnnotationPresent(RunThisMethod.class)){
                int count = method.getAnnotation(RunThisMethod.class).repeat();
                while (count > 0){
                    method.invoke(newObject);
                    count--;
                }
            }
        }

        return (T) newObject;
    }

}
