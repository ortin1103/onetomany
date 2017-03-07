package com.nitro;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnetomanyApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(OnetomanyApplicationTests.class);


	@Autowired
	AvtorRepo avtorRepo;
	@Autowired
	BookRepo bookRepo;

	@Before
	@Rollback(false)

	public void setUp(){
		Avtor first = new Avtor("Semen", "Arsenyev");
		Avtor second = new Avtor("Alex", "Jersy");

		first.addBook(new Book("My life"));
		second.addBook(new Book("Second of wins"));
		first.addBook(new Book("My firs of dance"));
		second.addBook(new Book("Seconds of death"));

		avtorRepo.save(Arrays.asList(first,second));
	}







	@Test
	public void countAvtor() {
		logger.info("*****************");
		logger.info("**** counts: "+avtorRepo.count());
		logger.info("*****************");
	}
	@Test
	public  void countBook(){
		logger.info("****************");
		logger.info("**** count books: "+bookRepo.count());
		logger.info("*****************");
	}
	@Test
	public void getAllAvtor(){
		logger.info("*****************");
		logger.info(avtorRepo.findAll().toString());
	}



}
