package com.ministryoftesting;

import java.util.ArrayList;
import java.util.List;

public class ExampleService {

    private SupportService supportService;
    public ExampleService(SupportService supportService) {
        this.supportService = supportService;
    }

    public ExampleService() {
    }

    public List<String> getListOfEntries() {
        ArrayList<String> entriesToReturn = new ArrayList<>();
        entriesToReturn.add("Entry One");
        entriesToReturn.add("Entry Two");
        entriesToReturn.add("Entry Three");

        return entriesToReturn;
    }

    public void addEntry(String entry) {
        if(entry.contains("Four")){
            supportService.validateEntry("Entry Four");
        } else {
            supportService.validateEntry(null);
        }
    }
}
