package org.example.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class FinanceReportProcessorTest {
    private FinanceReport testReport;
    @BeforeEach
    void setTestReport(){
        Payment[] payments = {
                new Payment("Oleg", 8, 11, 2023, 30098),    // 08.11.23
                new Payment("Dmitri", 2, 2, 2023, 25031),    // 02.02.23
                new Payment("Mark", 30, 3, 2023, 20019),  // 30.03.23
                new Payment("Dasha", 11, 1, 2023, 25099),    // 11.01.23
                new Payment("Margarita", 5, 9, 2023, 30020),    // 05.09.23
                new Payment("Misha", 17, 12, 2023, 11111)     // 17.12.23
        };
        testReport = new FinanceReport("Test" , 12,12,23, payments);
    }
    @Test
    void getNamePeopleWithFirstSymbol(){
        FinanceReport searchTest1 = FinanceReportProcessor.getNamePeopleWithFirstSymbol(testReport, 'M');
        Assertions.assertEquals(3, searchTest1.getArrayPayments().length);
        FinanceReport searchTest2 = FinanceReportProcessor.getNamePeopleWithFirstSymbol(testReport, 'k');
        Assertions.assertEquals(0, searchTest2.getArrayPayments().length);
    }
    @Test
    void getAllPaymentsLesserAmount() {
        FinanceReport sumTest1 = FinanceReportProcessor.getAllPaymentsSum(testReport,15000);
        Assertions.assertEquals(1,sumTest1.getArrayPayments().length);
        FinanceReport sumTest2 = FinanceReportProcessor.getAllPaymentsSum(testReport, 30000);
        Assertions.assertEquals(4,sumTest2.getArrayPayments().length);
        FinanceReport sumTest3 = FinanceReportProcessor.getAllPaymentsSum(testReport, 5000);
        Assertions.assertEquals(0, sumTest3.getArrayPayments().length);
    }
    @Test
    void FinanceReport(){
        FinanceReport newCopyReportTest = new FinanceReport(testReport);
        Assertions.assertEquals(newCopyReportTest.equals(testReport), testReport.equals(newCopyReportTest));
        newCopyReportTest.setPayment(newCopyReportTest.getPaymentByIndex(0), 3);
        Assertions.assertNotEquals(testReport, newCopyReportTest);
        System.out.println(testReport.toString());
        System.out.println(newCopyReportTest);
    }
}