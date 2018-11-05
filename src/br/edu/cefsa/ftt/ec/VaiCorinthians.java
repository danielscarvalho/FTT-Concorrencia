package br.edu.cefsa.ftt.ec;

import java.util.Date;

public class VaiCorinthians extends Thread {
	
	public void run() {
		
		for(int c=0;  c<100; c++)
		System.out.println("Vai Corinthians!! - " 
						+ this.toString() 
						+ " "
						+ c
						+ " "
						+ new Date());
		
	} //run
	
} //VaiCorinthians
