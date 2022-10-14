package com.luv2code.springdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// IO
		File txtFile = new File("C:\\nin\\Udemy\\workspace-Udemy-hibernate\\RandomFortune.txt");
		FileInputStream fis = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			fis = new FileInputStream(txtFile);
			int reads = 0;
			char c;
			while((reads = fis.read()) != -1) {
				c = (char) reads;
				sb = sb.append(c);
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println(sb.toString());
		
		return sb.toString();
	}

}
