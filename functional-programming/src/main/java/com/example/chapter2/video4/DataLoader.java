package com.example.chapter2.video4;

/**
 * This class that will loads our data from the server, if this were a real app.
 * We don't want any of our code outside of this class to have to know about
 * these methods or worry about choosing between them.
 */
public class DataLoader {

    public final NoArgFunction<Person> loadPerson;

    /**
     * @param isDevelopment Flag to determine whether we are running on Development
     *                      mode or Production mode.
     */
    public DataLoader(boolean isDevelopment) {
        this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
    }

    /**
     * This metod will contain the real logic for loading the Person from the
     * server.
     * 
     * @return Real Person object from the server.
     */
    private Person loadPersonReal() {
        System.out.println("Loading Person...");
        return new Person("Real Person", 30);
    }

    /**
     * This method will contain the fake logic for loading the Person for Dev/Test.
     * 
     * @return Fake Person object.
     */
    private Person loadPersonFake() {
        System.out.println("Returning fake person object...");
        return new Person("Fake Person", 100);
    }
}
