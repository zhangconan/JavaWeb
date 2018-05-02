package springutils;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.util.ClassUtils;

import java.util.Arrays;

/**
 * Created by zkn on 2018/3/22.
 */
public class ClassUtilsTest {

    @Test
    public void testGetAllInterfacesForClass() {
        Class<?>[] clazzs = ClassUtils.getAllInterfacesForClass(AspectJProxyFactory.class);
        System.out.println(Arrays.toString(clazzs));
    }

    @Test
    public void testCompleteProxiedInterfaces() {
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        Class<?>[] clazzs = AopProxyUtils.completeProxiedInterfaces(proxyFactory);
        System.out.println(Arrays.toString(clazzs));
    }
}
