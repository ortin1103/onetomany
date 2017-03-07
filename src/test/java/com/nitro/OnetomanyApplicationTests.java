package com.nitro;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnetomanyApplicationTests {


	@Autowired
	AvtorRepo avtorRepo;
	@Autowired
	BookRepo bookRepo;

	@Before
	@Rollback(false)

	public void setUp(){
		Avtor first = new Avtor("Semen", "Arsenyev");
		Avtor second = new Avtor("Alex", "Jersy");

	}







	@Test
	public void contextLoads() {
	}

}
