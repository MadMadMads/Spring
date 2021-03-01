package cell;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/14 16:43
 * Modified By:
 */
public class DepdenyIOCTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions("application-ioc.xml");
		BeanA A = defaultListableBeanFactory.getBean("beanA",BeanA.class);
		BeanB B = defaultListableBeanFactory.getBean("beanB",BeanB.class);
		System.out.println(A.getBeanB().getBeanA());
		System.out.println(B.getBeanA());
	}
}
