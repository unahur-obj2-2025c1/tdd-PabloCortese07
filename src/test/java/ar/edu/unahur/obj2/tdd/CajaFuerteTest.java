package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {

    final private CajaFuerte nuevaCaja = new CajaFuerte();

    void abrirLaCaja(){
        nuevaCaja.abrir(1234);
        assertTrue(nuevaCaja.estaAbierta());
    }

}
