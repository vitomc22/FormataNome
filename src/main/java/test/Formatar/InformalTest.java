package test.Formatar;

import Formatar.Informal;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Informal Tester.
 *
 * @author <Victor Oliveira>
 * @version 1.0
 * @since <pre>jun 11, 2022</pre>
 */
public class InformalTest {

    /**
     * Method: FormatarNome(String nome, String sobrenome)
     */
    @Test
    public void testFormatarNome() throws Exception {

        Informal informal = new Informal();
        String nome = informal.FormatarNome("Victor", "Oliveira");
        assertEquals(nome, "Victor");

    }


} 
