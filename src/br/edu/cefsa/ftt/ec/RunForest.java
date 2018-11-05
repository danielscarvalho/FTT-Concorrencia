package br.edu.cefsa.ftt.ec;

import java.util.Date;

public class RunForest implements Runnable { //Com Runnable a classe pode extender outra...

	private String name = "Thread X";
	private int loopVal = 100;
	
	public RunForest() {
		
	}
	
	public RunForest(String n) {
		this.name = n;
	}
	
	public void run() {
		//Magic!!! Código a ser executado em paralelo...
		for (int c=0; c < this.loopVal; c++)			
			System.out.println(this.name + " - " + c + " - "+ new Date());
	
	}
}
