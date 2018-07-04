package org.urjc.isi.travis;

import static org.junit.Assert.*;
import java.io.*;
import java.util.*;
import org.junit.*;

public class PrintPrimesTest 
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() {
        System.setOut(new PrintStream(outContent));
	}
	
	//test que visite el arco que va de la sentencia while al for
	//pero sin ejecutar el cuerpo del bucle while.
	//printPrimes(n), donde n tiene que ser menor que numPrimes = 1
	@Test					 
	public void testPath1() {
		PrintPrimes.printPrimes(1);
		assertEquals("Prime: 2\n", outContent.toString());
	}
	
	
	@Test
	public void testPath2() {
		PrintPrimes.printPrimes(3);
		assertEquals("Prime: 2\nPrime: 3\nPrime: 5\n", outContent.toString());
	}
	
}
