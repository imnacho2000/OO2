package ar.edu.unlp.info.oo2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestState {
		
		Cliente jira = new Cliente();
		ToDoItem t1;
		ToDoItem t2;
		
		@BeforeEach
		void setUp() throws Exception {
			t1 = new ToDoItem("t1");
			t2 = new ToDoItem("t2");
			jira.agregarAcciones(t1);
			jira.agregarAcciones(t2);
		}
		
	    @Test
	    public void testStates() {
	    	t1.start();
	    	assertEquals("inProgress",t1.getName());
	    	assertEquals("Pending", t2.getName());
	    	t1.togglePause();
	    	assertEquals("Paused",t1.getName());
	    	t1.finish();
	    	assertEquals("Finished",t1.getName());
	    }	
	    
	    @Test
	    public void testAddComments() {
	    	t1.start();
	    	t1.addComment("comment1");
	    	t1.addComment("comment2");
	    	t1.finish();
	    	t1.addComment("comment3");
	    	assertEquals(2, t1.getComments().size());
	    }
	    
	    @Test
	    public void testThrows() {
	    	Exception e = assertThrows(RuntimeException.class,() -> t2.workedTime());
	    	assertEquals("No hay inicio porque el estado es Pending",e.getMessage());
	    	
	    	
	    	e = assertThrows(RuntimeException.class,() -> t2.togglePause());
	    	assertEquals("No se puede poner pause estado en Pending", e.getMessage());
	    	
	    	t1.start();
	    	t1.finish();
	    	
	    	e = assertThrows(RuntimeException.class,() -> t1.togglePause());
	    	assertEquals("No se puede poner pause estado en Finished",e.getMessage());
	    }	
	    	
	  
}
