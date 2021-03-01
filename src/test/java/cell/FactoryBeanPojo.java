package cell;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/20 14:24
 * Modified By:
 */
public class FactoryBeanPojo implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Student();
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
