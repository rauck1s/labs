package org.example.lab7;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceClassTest {

    @Test
    void serializeAndDeserialize() throws IOException, ClassNotFoundException {
        Person firstPerson = new Person("Oleg", "olegov", "olegovich", 112304);
        Person secondPerson = new Person("rita", "ritka", "ritovich", 121204);
        Person thirdPerson = new Person("mark", "markov", "markich", 112304);
        Person forthPerson = new Person("dima", "dimov", "dimovich", 112304);
        Person fifthPerson = new Person("dany", "danov", "danovich", 112304);

        List<Person> firstFlat = new ArrayList<>();
        firstFlat.add(firstPerson);
        firstFlat.add(thirdPerson);

        List<Person> secondFlat = new ArrayList<>();
        secondFlat.add(secondPerson);
        secondFlat.add(forthPerson);

        List<Person> thirdFlat = new ArrayList<>();
        thirdFlat.add(fifthPerson);

        Flat flat22 = new Flat(22, 75,firstFlat);
        Flat flat33 = new Flat(33, 75,secondFlat);
        Flat flat77 = new Flat(77, 105, thirdFlat);

        List<Flat> listFlat = new ArrayList<>();
        listFlat.add(flat22);
        listFlat.add(flat33);
        listFlat.add(flat77);

        House housefirst = new House("23:553:341:11", "Mira 55a", new Person("buk", "buki", "gibe", 111100),listFlat);

        ServiceClass.serializeHouse(housefirst, "house.ser");

        House deserializedHouseFirst = ServiceClass.deserializeHouse("house.ser");

        assertEquals(housefirst, deserializedHouseFirst);

    }

    @Test
    void json() throws IOException {
        Person firstPerson = new Person("Oleg", "olegov", "olegovich", 112304);
        Person secondPerson = new Person("rita", "ritka", "ritovich", 121204);
        Person thirdPerson = new Person("mark", "markov", "markich", 112304);
        Person forthPerson = new Person("dima", "dimov", "dimovich", 112304);
        Person fifthPerson = new Person("dany", "danov", "danovich", 112304);

        List<Person> firstFlat = new ArrayList<>();
        firstFlat.add(firstPerson);
        firstFlat.add(thirdPerson);

        List<Person> secondFlat = new ArrayList<>();
        secondFlat.add(secondPerson);
        secondFlat.add(forthPerson);

        List<Person> thirdFlat = new ArrayList<>();
        thirdFlat.add(fifthPerson);

        Flat flat22 = new Flat(22, 75,firstFlat);
        Flat flat33 = new Flat(33, 75,secondFlat);
        Flat flat77 = new Flat(77, 105, thirdFlat);

        List<Flat> listFlat = new ArrayList<>();
        listFlat.add(flat22);
        listFlat.add(flat33);
        listFlat.add(flat77);

        House house = new House("23:553:341:11", "Mira 55a", new Person("buk", "buki", "gibe", 111100),listFlat);
        String jsonString = ServiceClass.serializeHouseToJson(house);

        House deserializedHouseSecond = ServiceClass.deserializeJsonToHouse(jsonString);

        assertEquals(house, deserializedHouseSecond);

    }

}