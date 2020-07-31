package com.springboot.vue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.Calendar;

@SpringBootTest
class SpringbootVueApplicationTests {

	@Test
	void contextLoads() {
		Calendar calendar = Calendar.getInstance();
		String relativePath = File.separator + "uploads" + File.separator + calendar.get(Calendar.YEAR)+"_"+(calendar.get(Calendar.MONTH) + 1);
		System.out.println(relativePath);
	}

}
