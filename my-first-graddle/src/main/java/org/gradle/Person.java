package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private final String name;
    Logger logger = LogManager.getLogger(Person.class);  
    
    public static void main(String args[]){
    	Person person=new Person("Andrea");
    	System.out.println(person.getName());
    	
    }

    public Person(String name) {
        this.name =  name;
        new GrowthList();
        logger.error("Anduvo");
    }

    public String getName() {
        return name;
    }
}
