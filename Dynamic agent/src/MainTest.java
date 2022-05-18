import java.lang.reflect.Proxy;

public class MainTest {

    public static void main(String[] args) {
        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数person1.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */


        ClassLoader cl= Thread.currentThread().getContextClassLoader();

        Examable o = (Examable) Proxy.newProxyInstance(
                cl,//类加载器
                new Class[]{Examable.class},//获取被代理对象的所有接口
                new JdkProxy(new Student())//InvocationHandler对象
        );
        o.exam();//代理后的行为

    }

}
