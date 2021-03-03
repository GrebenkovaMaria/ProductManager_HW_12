package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    Smartphone smartphone = new Smartphone(9, "P10Pro", 35000, "Huawei");

    @Test
    void shouldTrueWithMatchesProducer() {
        assertTrue(smartphone.matches("Huawei"));
    }

    @Test
    void shouldReturnFalseWithProducer() {
        assertFalse(smartphone.matches("Толстой"));
    }

    @Test
    void shouldTrueWithMatchesName() {
        assertTrue(smartphone.matches("P10Pro"));
    }

    @Test
    void shouldReturnFalseWithName() {
        assertFalse(smartphone.matches("Другое"));
    }
}