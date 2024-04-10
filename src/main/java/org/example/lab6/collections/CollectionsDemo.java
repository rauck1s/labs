package org.example.lab6.collections;

import org.example.lab6.classes.Human;

import java.util.*;

public class CollectionsDemo {

    /* First task:*/
    public static int sortByFirstSymbol(List<String> strings, char symbol){

        int result = 0;

        for(String str: strings){
            if (symbol == str.charAt(0)) {
                result++;
            }
        }

        return result;
    }

    /*Third task:*/
     public static List<Human> deleteHumanInList(List<Human> listHuman, Human human){

        List<Human> resultList = new ArrayList<>(listHuman);

        for (int i = 0; i < resultList.size(); i++) {
                Human people = resultList.get(i);
            if (people.equals(human)) {
                resultList.remove(people);
            }
        }

        return resultList;
    }

    /*Fourth task:*/
    public static List<Set<Integer>> deletingSetsIntegerNumbers(List<Set<Integer>> setsIntNumber, Set <Integer> arrayNumber){

        List<Set<Integer>> result = new ArrayList<>();

        for(Set<Integer> set: setsIntNumber){
            if(Collections.disjoint(set, arrayNumber)){
                result.add(set);
            }
        }
        return result;
    }

    /*Seventh task: */
    public static Set<Human> humanById (Map<Integer,Human> map, Set<Integer> set){

        Set<Human> result= new HashSet<>();

        for(int id: set){
            if(map.containsKey(id)){
                result.add(map.get(id));
            }
        }

        return result;
    }

    /*Eight task:*/
    public static List<Human> sortAdultsHuman (Map<Integer,Human> map){

        List<Human> result= new ArrayList<>();

        for(int id: map.keySet()){
            if(map.get(id).getAge()>=18){
                result.add(map.get(id));
            }
        }

        return result;
    }

    /*Ninth task*/
    public static Map<Integer, Integer> buildAgeMap (Map<Integer,Human> map){

        Map<Integer,Integer> result = new HashMap<>();

        for(Map.Entry<Integer, Human> entry: map.entrySet()){
            int id = entry.getKey();
            Human human = entry.getValue();
            int age = human.getAge();
            result.put(id, age);
        }

        return result;
    }

    /*Tenth task*/
    public static Map<Integer, List<Human>> buildAgeToHumansMap(Set<Human> humans) {

        Map<Integer, List<Human>> result = new HashMap<>();

        for (Human human : humans) {
            int age = human.getAge();
            List<Human> list = result.getOrDefault(age, new ArrayList<>());
            list.add(human);
            result.put(age, list);
        }

        return result;
    }

}