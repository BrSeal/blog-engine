package main.common;

import org.springframework.core.annotation.AliasFor;

import javax.persistence.Column;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Unique{
    @AliasFor(annotation = Column.class)
   boolean unique() default true;
}
