package com.spacecraft;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.spacecraft.domain.exceptions.EmptyNameException;
import com.spacecraft.domain.exceptions.NullNameException;
import com.spacecraft.domain.spacecraft.Name;

public class NameTests  {

    //TODO: Add more logic to Name and test it
    @Test()
    @DisplayName("""
        When I try to make a NULL name
        Then it throws a NullNameException
    """)
    void name_null_exception() throws Exception {
        assertThrows(NullNameException.class, () -> {
            new Name(null);
        });
    }

    @Test()
    @DisplayName("""
        When I try to make an empty name
        Then it throws an error with the correct message
    """)
    void name_empty_exception() throws Exception {
        assertThrows(EmptyNameException.class, () -> {
            new Name("");
        });
    } 
}
