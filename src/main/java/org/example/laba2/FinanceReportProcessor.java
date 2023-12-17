package org.example.laba2;

import java.util.ArrayList;

public class FinanceReportProcessor {
    static public FinanceReport getNamePeopleWithFirstSymbol(FinanceReport report, char symbol){

        ArrayList<Payment> sortedPayments = new ArrayList<>();
        for (int i = 0; i < report.getArrayPayments().length; i++) {
            if (report.getPaymentByIndex(i).getNameHuman().charAt(0) == symbol) {
                sortedPayments.add(report.getPaymentByIndex(i));
            }
        }
        Payment[] newPayments = new Payment[sortedPayments.size()];
        newPayments = sortedPayments.toArray(newPayments);

        return new FinanceReport(report.getNameFinance(),
                report.getDayDate(),
                report.getMonthDate(),
                report.getYearsDate(),
                newPayments
                );
    }
    public static FinanceReport getAllPaymentsSum(FinanceReport report, int value) {

        ArrayList<Payment> sortedPayments = new ArrayList<>();
        for (int i = 0; i < report.getArrayPayments().length; i++) {
            if (report.getPaymentByIndex(i).getSumPayment() < value) {
                sortedPayments.add(report.getPaymentByIndex(i));
            }
        }
        Payment[] newPayments = new Payment[sortedPayments.size()];
        newPayments = sortedPayments.toArray(newPayments);

        return new FinanceReport(
                report.getNameFinance(),
                report.getDayDate(),
                report.getMonthDate(),
                report.getYearsDate(),
                newPayments
        );
    }
}
