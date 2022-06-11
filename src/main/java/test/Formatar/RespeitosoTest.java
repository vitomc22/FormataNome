package test.Formatar;

import Formatar.Respeitoso;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Respeitoso Tester.
 *
 * @author <Victor Oliveira>
 * @version 1.0
 * @since <pre>jun 11, 2022</pre>
 */
public class RespeitosoTest {
    /**
     * Method: FormatarNome(String nome, String sobrenome)
     */
    @Test
    public void testFormatarNomeMasculino() throws Exception {
        Respeitoso respeitoso = new Respeitoso("masculino");
        String nome = respeitoso.FormatarNome("Victor", "Oliveira");
        assertEquals(nome, "Sr.Victor Oliveira");

    }

    @Test
    public void testFormatarNomeFeminino() throws Exception {
        Respeitoso respeitoso = new Respeitoso("feminino");
        String nome = respeitoso.FormatarNome("Victor", "Oliveira");
        assertEquals(nome, "Sra.Victor Oliveira");

    }

    @Test
    public void testFormatarNomeIndefinido() throws Exception {
        Respeitoso respeitoso = new Respeitoso("ornitorrinco");
        String nome = respeitoso.FormatarNome("Victor", "Oliveira");
        assertEquals(nome, "Insira um sexo válido!");

    }


} 
