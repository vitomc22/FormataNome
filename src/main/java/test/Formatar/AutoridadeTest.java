package test.Formatar;

import Formatar.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Autoridade Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>jun 11, 2022</pre>
 */
public class AutoridadeTest {


    @Test
    public void testGetInformal() throws Exception {
        FormatadorNome fn = new Informal();
        Autoridade a = new Autoridade("Victor", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Victor");
    }

    @Test
    public void testGetRespeitoso() throws Exception {
        FormatadorNome fn = new Respeitoso("masculino");
        Autoridade a = new Autoridade("Victor", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Sr.Victor Oliveira");
    }

    @Test
    public void testGetComTitulo() throws Exception {
        FormatadorNome fn = new ComTítulo("Mister fodão,");
        Autoridade a = new Autoridade("Victor", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Mister fodão, Victor Oliveira");
    }


} 
