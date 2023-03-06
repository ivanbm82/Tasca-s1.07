package n2exercici1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
	public @interface Anotacio {
		String archivo() default"Hotel.json";
	}