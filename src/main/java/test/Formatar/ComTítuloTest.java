package test.Formatar; 

import Formatar.ComTítulo;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** 
* ComTítulo Tester. 
* 
* @author <Victor Oliveira>
* @since <pre>jun 11, 2022</pre> 
* @version 1.0 
*/ 
public class ComTítuloTest { 

/**
* 
* Method: FormatarNome(String nome, String sobrenome) 
* 
*/ 
@Test
public void testFormatarNome() throws Exception {

    ComTítulo comTítulo = new ComTítulo("Mister fodão, ");
    String nome = comTítulo.FormatarNome("Victor", "Oliveira");
    assertEquals(nome,"Mister fodão,  Victor Oliveira");


} 


} 
