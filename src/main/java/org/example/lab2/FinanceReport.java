package org.example.lab2;

public class FinanceReport {
    private Payment [] arrayPayments;
    private String nameFinance;
    private int dayDate;
    private int monthDate;
    private int yearsDate;

    public Payment[] getArrayPayments() {
        return arrayPayments;
    }

    public void setArrayPayments(Payment[] arrayPayments) {
        this.arrayPayments = arrayPayments;
    }

    public String getNameFinance() {
        return nameFinance;
    }

    public void setNameFinance(String nameFinance) {
        this.nameFinance = nameFinance;
    }

    public int getDayDate() {
        return dayDate;
    }

    public void setDayDate(int dayDate) {
        this.dayDate = dayDate;
    }

    public int getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(int monthDate) {
        this.monthDate = monthDate;
    }

    public int getYearsDate() {
        return yearsDate;
    }

    public void setYearsDate(int yearsDate) {
        this.yearsDate = yearsDate;
    }
    public Payment getPaymentByIndex(int index){
        return arrayPayments[index];
    }
    public void setPayment(Payment payment, int numberPayment){
        arrayPayments[numberPayment] = payment;
    }
    /*default constructor*/
    public FinanceReport(
            String name,
            int dayDate,
            int monthDate,
            int yearsDate,
            Payment[] payments
    ){
        this.arrayPayments = payments;
        this.dayDate = dayDate;
        this.monthDate = monthDate;
        this.yearsDate = yearsDate;
        this.nameFinance = name;
    }
    /*coping constructor*/
    public FinanceReport(FinanceReport financeReport) {
        nameFinance = financeReport.getNameFinance();
        dayDate = financeReport.getDayDate();
        monthDate = financeReport.getMonthDate();
        yearsDate = financeReport.getYearsDate();
        arrayPayments = financeReport.arrayPayments.clone();
    }
    /*functions print payments in console*/
    public void readingPayment(int numberPayment){
        System.out.println(arrayPayments[numberPayment].toString());
    }
    /*to string*/
    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder(String.format("[Автор: %s, дата: %d.%d.%d, Платежи:[\n",
                nameFinance, dayDate, monthDate, yearsDate));

        for (int i = 0; i < arrayPayments.length; i++) {
            if (i != arrayPayments.length - 1) {
                String str = String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.,\n",
                        arrayPayments[i].getNameHuman(), arrayPayments[i].getDayDate(), arrayPayments[i].getMonthDate(),
                        arrayPayments[i].getYearDate(), arrayPayments[i].getSumPayment() / 100,
                        arrayPayments[i].getSumPayment() % 100);
                resultString.append(str);
            } else {
                String lastString = String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.]]",
                arrayPayments[i].getNameHuman(), arrayPayments[i].getDayDate(), arrayPayments[i].getMonthDate(),
                        arrayPayments[i].getYearDate(), arrayPayments[i].getSumPayment() / 100,
                        arrayPayments[i].getSumPayment() % 100);
                resultString.append(lastString);
            }
        }
        return resultString.toString();
    }
}