package a;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Test {
	// 在任何需要记录日志的类中
	Log log = LogFactory.getLog(this.getClass());

	public void one() {
		log.info("into one method");
		try {
			System.out.println(9 / 0);
		} catch (RuntimeException e) {
			log.error(e.getMessage());
		}
		log.info("out one method");
		log.info("ddddddddddddddd");
	}

	public static void main(String[] args) {
		new Test().one();
	}
}
