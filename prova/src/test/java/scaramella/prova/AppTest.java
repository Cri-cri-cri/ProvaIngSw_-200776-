package scaramella.prova;


import static org.junit.Assert.assertEquals;
import scaramella.prova.MyListUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.*;


public class AppTest 
{
	List<Integer> tester;

   @Before
	public void initialize() {
	   tester= new ArrayList<Integer>();
    Collections.addAll(tester, 2,4,7,6,8,9,3,1,0,5,10);
   }
	
	
    @Test
    public void ordinaCrescenteTester()
    {
    	List<Integer> crescente = new ArrayList<Integer>();
    	   Collections.addAll(crescente , 0,1,2,3,4,5,6,7,8,9,10);
    	   
    	 java.util.Date dt = new Date();
    	  DateTime inizio = new DateTime(dt);
      	System.out.println("inizio test crescente:" + inizio.toString());

 	 

        assertEquals(MyListUtil.ordinaCrescente(tester), crescente);
        
        java.util.Date st = new Date();
        DateTime fine = new DateTime(st);
      	System.out.println("fine test crescente:" + fine.toString());

    }
    
    @Test
    public void ordinaDecrescenteTester() {
    	List<Integer> decrescente = new ArrayList<Integer>();
    	   Collections.addAll(decrescente , 10,9,8,7,6,5,4,3,2,1,0);
    	   
    	   java.util.Date dt = new Date();
     	  DateTime inizio = new DateTime(dt);
       	System.out.println("inizio test decrescente:" + inizio.toString());

        assertEquals(MyListUtil.ordinaDecrescente(tester), decrescente);
           
           java.util.Date st = new Date();
           DateTime fine = new DateTime(st);
         	System.out.println("fine test decrescente:" + fine.toString());
    }
}
