package br.edu.cefsa.ftt.ec;

import java.util.Date;

public class MainForest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println(new Date());
		
		try {
			
			Thread.sleep(2000); //Milisegundos 1s = 1000
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(new Date());
		
		//Criando as treads (processos paralelos)
		Thread t1 = new Thread(new RunForest("Thread 1 "), "t1");
		Thread t2 = new Thread(new RunForest("Thread 2 "), "t2");
		Thread t3 = new Thread(new RunForest("Thread 3 "), "t3");
		Thread t4 = new Thread(new RunForest("Thread 4 "), "t4");
		Thread t5 = new Thread(new RunForest("Thread 5 "), "t5");
		
		//Executando os processos paralelos...
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	*/

		VaiCorinthians core1 = new VaiCorinthians();
		VaiCorinthians core2 = new VaiCorinthians();
		VaiCorinthians core3 = new VaiCorinthians();
		VaiCorinthians core4 = new VaiCorinthians();

		core1.start();
		core2.start();
		core3.start();
		core4.start();
		
		System.out.println("Fim!!!!");
		System.out.println(new Date());
		
	}

}
