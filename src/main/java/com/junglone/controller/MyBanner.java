/**
 * 
 */
package com.junglone.controller;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

/**
 * @author JungLone
 *
 */
public class MyBanner implements Banner {

	@Override
	public void printBanner(Environment arg0, Class<?> arg1, PrintStream arg2) {
		arg2.println("here is MyBanner.printBanner!");
	}

}
