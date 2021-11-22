package com.ministryoftesting;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ApprovalCodifiedOracleExample {

    @Test
    public void approvalsCodifiedOracle(){
        ExampleService exampleService = new ExampleService();
        List<String> listOfEntries = exampleService.getListOfEntries();

        Approvals.verify(listOfEntries);
    }

}
