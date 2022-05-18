import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName JdkProxy
 * @Description: TODO
 * @date 2022-05-18 11:44
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

public class JdkProxy implements InvocationHandler {


    private Object object;//被代理

    public JdkProxy() {
    }

    public JdkProxy(Object object) {
        this.object = object;
    }

    /**
     * 当用户调用对象中的每个方法时都通过下面的方法执行，方法必须在接口
     * proxy 被代理后的对象
     * method 将要被执行的方法信息（反射）
     * args 执行方法时需要的参数
     */


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object invoke = null;
        try {
            invoke = method.invoke(object, args);
        } catch (Exception e) {
            System.out.println("异常的信息" + e.getMessage());
        }
        return invoke;//调用被代理对象原来的方法(行为)
    }
}
