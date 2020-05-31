package com.company;
import java.io.ObjectStreamClass;
import nl.jqno.equalsverifier.EqualsVerifier;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {



    @org.junit.jupiter.api.Test
    void testEquals() {
        EqualsVerifier.forClass(Person.class).usingGetClass().verify();
    }
}