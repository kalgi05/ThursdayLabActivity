package ThursdayLabTest;
import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.*;
public class TestThread2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread ("thread1:");
		MyThread t2 = new MyThread ("thread2:");
		t1.start ( );
		t2.start ( );
		boolean thread1IsAlive = true;
		boolean thread2IsAlive = true ;
		do
		{
		if (thread1IsAlive && !t1.isAlive ( ) )
		{
		thread1IsAlive = false;
		System.out.println ("thread1 is alive");
		}
		if (thread2IsAlive && ! t2.isAlive ( ))
		{
		thread2IsAlive = false;
		System.out.println ("thread2 is alive");
		}
		}while (thread1IsAlive || thread2IsAlive);
		}
		}
		class MyThread extends Thread
		{
		static String message [ ] = {"hello", "my", "name", "is",
		"kalgi"};
		public MyThread (String id)
		{
		super (id);
		}
		public void run ( )
		{
		String name = getName ( );
		for (int i=0;i<message.length; ++i )
		{

		
		System.out.println (name + message[i] );
		}
		}
		void randomwait ( )
		{
		try
		{
		sleep ((long)(3000*Math.random ( ) ) );
		}
		catch (InterruptedException x )
		{
		System.out.println (x);
		}
		}
		
	}


