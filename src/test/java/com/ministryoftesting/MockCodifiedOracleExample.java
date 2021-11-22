package com.ministryoftesting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MockCodifiedOracleExample {

    @Mock
    private SupportService supportService = new SupportService();

    @BeforeEach
    public void initialiseMocks() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void mockingCodifiedOracle(){
        ExampleService exampleService = new ExampleService(supportService);
        exampleService.addEntry("Entry Four");

        verify(supportService, times(1)).validateEntry("Entry Four");
    }

}
