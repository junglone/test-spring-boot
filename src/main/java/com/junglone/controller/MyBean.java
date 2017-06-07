/**
 * 
 */
package com.junglone.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author JungLone
 *
 */
@Component
public class MyBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Invoke MyBean.run() hello world~");
	}

}
