package com.ministryoftesting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicCodifiedOracleExample {

    @Test
    public void classicCodifiedOracle(){
        ExampleService exampleService = new ExampleService();
        List<String> listOfEntries = exampleService.getListOfEntries();

        assertEquals(listOfEntries.size(), 3);
    }

}
