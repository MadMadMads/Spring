package cell;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/17 9:35
 * Modified By:
 */
public class IOCAnnotationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		annotationConfigApplicationContext.getBean(AppService.class);
	}
}
