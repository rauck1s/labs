package org.example.lab6.collections;

import org.example.lab6.classes.Human;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

    /*Second task:*/
    public static List<Human> EqualsSecondName(List<Human> list, Human human){

        List<Human> resultList = new ArrayList<>();

        for(Human people: list){

            if(people.getSecondName().equals(human.getSecondName())){
                resultList.add(people);
            }
        }

        return resultList;
    }

    /*Fifth task:*/
    public static Set<Human> MaxAged(List<? extends Human> humanList){

        int maxAge = 0;
        Set<Human> result = new HashSet<>();

        for(Human human: humanList){

            if(human.getAge() > maxAge){
                result.clear();
                maxAge = human.getAge();
                result.add(human);
                continue;
            }

            if(human.getAge() == maxAge){
                result.add(human);
            }
        }

        return result;
    }
}
