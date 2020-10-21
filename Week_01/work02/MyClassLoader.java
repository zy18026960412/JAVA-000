package work02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zy
 * @Description:作业2
 * @Date 2020/10/20 14:38
 */
public class MyClassLoader extends ClassLoader {

    private static final String FILE_PATH = "./Week_01/work02/Hello.xlass";

    public static void main(String[] args) {

        try {
            Class<?> clazz = new MyClassLoader().findClass("Hello");
            Method method = clazz.getDeclaredMethod("hello");
            method.invoke(clazz.newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        InputStream inputStream = null;
        try {
            //获取文件的二进制字节流
            inputStream = new FileInputStream(FILE_PATH);
            int available = inputStream.available();
            byte[] bytes = new byte[available];
            inputStream.read(bytes);
            for (int i = 0;i<bytes.length;i++){
                bytes[i] = (byte)(255 - bytes[i]);
            }
            return defineClass(name,bytes,0,bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
