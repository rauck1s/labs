package org.example.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringProcessorTest {

    /*Виды тестов:
     * 1 обычный
     * 2 пустая строка
     * 3 добавление слова 0 раз
     * 4 исключение, когда строка явлеяется ничем
     * 5 исключение, когда < 0 */
    @Test
    void returnNewLine() {
        Assertions.assertEquals("dima", StringProcessor.returnNewLine("dima", 1));
        Assertions.assertEquals("", StringProcessor.returnNewLine("", 4));
        Assertions.assertEquals("", StringProcessor.returnNewLine("dima", 0));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.returnNewLine(lineTest, 10);});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.returnNewLine("dima", -1);});
    }
    /*Виды тестов:
     * 1 обычный
     * 2 поиск в пустой строке
     * 3 исключение: вторая строка является ничем
     * 4 исключение:вторая строка пустая
     * 5 исключение: первая строка является ничем*/
    @Test
    void inputLine() {
        Assertions.assertEquals(3, StringProcessor.inputLine(" AVavksndgAVklnldgpsjgoipAV ", "AV"));
        Assertions.assertEquals(0, StringProcessor.inputLine("", "Dima"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.inputLine("sdf", lineTest);});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.inputLine("sdf", "");});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.inputLine(lineTest, "dima");});
    }
    /*Виды тестов:
     * 1,2,3 обычные
     * 4 поиск одной цифры в других символах
     * 5 поиск цифр,которые нам нужны в символах
     * 6 пустая строка
     * 7 строчка с символами, которые нам не нужны
     * 8 исключение: строчка является ничем*/
    @Test
    void remove() {
        Assertions.assertEquals("One", StringProcessor.remove("1"));
        Assertions.assertEquals("OneTwo", StringProcessor.remove("12"));
        Assertions.assertEquals("OneTwoThree", StringProcessor.remove("123"));
        Assertions.assertEquals("dsfrvOne  sdferf", StringProcessor.remove("dsfrv1  sdferf"));
        Assertions.assertEquals("UJYHTGFThree5674IKUJYGOneOJK___Two4444  Two ", StringProcessor.remove("UJYHTGF35674IKUJYG1OJK___24444  2 "));
        Assertions.assertEquals("", StringProcessor.remove(""));
        Assertions.assertEquals("OPIJGIJWRMLG:im094l-0t", StringProcessor.remove("OPIJGIJWRMLG:im094l-0t"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.remove(lineTest);});
    }
    /*Виды тестов:
     * 1 обыный
     * 2 обычная, но с учетом пробелов
     * 3 пустая строка
     * 4 исключение: строка я вляется ничем
     *  */
    @Test
    void delete() {
        Assertions.assertEquals("dm",StringProcessor.delete("dima"));
        Assertions.assertEquals("     ",StringProcessor.delete(" a s d f  "));
        Assertions.assertEquals("", StringProcessor.delete(""));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->{StringProcessor.delete(lineTest);});
        Assertions.assertEquals("     ",StringProcessor.delete(" a s d f  "));
    }
    /*Виды тестов:
     * 1 обычный
     * 2 обычный, из самого задания
     * 4 обычный, набор символов без пробелов
     * 3 исключение: строчка является ничем*/
    @Test
    void reverseString() {
        Assertions.assertEquals("amid dima", StringProcessor.reverseString("dima amid"));
        Assertions.assertEquals(" dd cc bbb aaa", StringProcessor.reverseString(" aaa bbb cc dd"));
        Assertions.assertEquals("wwwrgwr896-01wcfehcklw", StringProcessor.reverseString("wwwrgwr896-01wcfehcklw"));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () ->{StringProcessor.reverseString(lineTest);});
    }
    /*Виды тестов:
    * 1 обычный, из задания
    * 2 обычный, но есть
    * 3 строчка без 16-ричной цифры
    * 4 пустая строчка
    * 5 исключение: строка является ничем*/
    @Test
    void hexNewString() {
        Assertions.assertEquals("Васе 16 лет", StringProcessor.searchHex("Васе 0x00000010 лет"));
        Assertions.assertEquals("19 12 012714x1034", StringProcessor.searchHex("0x00000013 0x0000000C 012714x1034"));
        Assertions.assertEquals("23082389fhdfuwhxxx1x2x3x4x6x7x8x9xfhdfhs", StringProcessor.searchHex("23082389fhdfuwhxxx1x2x3x4x6x7x8x9xfhdfhs"));
        Assertions.assertEquals("", StringProcessor.searchHex(""));
        String lineTest = null;
        Assertions.assertThrows(IllegalArgumentException.class, () ->{StringProcessor.searchHex(lineTest);});

    }
}