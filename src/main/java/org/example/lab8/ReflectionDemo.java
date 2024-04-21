package org.example.lab8;

import org.example.lab8.classes.Human;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReflectionDemo {
    public static int searchHumanObj(List<Object> listObj){
        int resultCount = 0;
        for(Object obj: listObj){
            if(obj instanceof Human){
                resultCount++;
            }
        }
        return resultCount;
    }
    public static List<String> getPublicMethodNames(Object obj) {

        List<String> resultListNamesMethods = new ArrayList<>();

        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (!method.isBridge() && method.getDeclaringClass() != Object.class) {
                resultListNamesMethods.add(method.getName());
            }
        }
        Collections.sort(resultListNamesMethods);

        return resultListNamesMethods;
    }
    public static List<String> getSuperclassNames(Object obj) {
        List<String> resultListSuperClassNames = new ArrayList<>();
        Class<?> clazz = obj.getClass();

        resultListSuperClassNames.add(clazz.getSimpleName());

        while (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
            clazz = clazz.getSuperclass();
            resultListSuperClassNames.add(clazz.getSimpleName());
        }
        resultListSuperClassNames.add(Object.class.getSimpleName());

        return resultListSuperClassNames;
    }

}
