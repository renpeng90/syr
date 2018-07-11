package common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ java.lang.annotation.ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {

	int length() default Integer.MAX_VALUE;// 长度

	boolean required() default false;// 是否必填

	boolean fixed() default false;// 是否固定长度

	boolean numberic() default false;// 是否数字

	String regular() default "";// 正则
}