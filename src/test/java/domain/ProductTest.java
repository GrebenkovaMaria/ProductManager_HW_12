package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


 @Test
    void shouldReturnTrue () {
     Product product = new Product(7, "P10", 25000);
     assertTrue(product.matches("P10"));
    }

    @Test
    void shouldReturnFalse () {
        Product product = new Product(7, "P20", 25000);
        assertFalse(product.matches("P10"));
    }

}