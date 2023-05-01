package MenstrualCycle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cycle {
    private List<LocalDate> ovulationDates = new ArrayList<>();
    private List<LocalDate> safePeriodDates = new ArrayList<>();
    private LocalDate expectedMentrualDate;



    public List<LocalDate> getOvulationDates() {
        return ovulationDates;
    }

    public void setOvulationDates(int cycleDays, LocalDate menstrualDate) {
        int count = 2;
        int peakOvulationDay = cycleDays/2;
        for (int i = 0; i < 5; i++) {
            this.ovulationDates.add(menstrualDate.plusDays(peakOvulationDay-count));
            count--;}
    }


    public List<LocalDate> getSafePeriodDates() {
        return safePeriodDates;
    }

    public void setSafePeriodDates(LocalDate menstrualDate, int flowDays, int cycleDays) {
        int peakOvulationDay = cycleDays/2;
        LocalDate firstSafePeriodDate = menstrualDate.plusDays(flowDays);
        int lastSafePeriod = peakOvulationDay - 2;

        int safedaysCount = 0;
        for (int i = flowDays; i < lastSafePeriod ; i++) {
            safePeriodDates.add(firstSafePeriodDate.plusDays(safedaysCount));
            safedaysCount++;}

        int lastOvulationDate = peakOvulationDay + 2;
        LocalDate lastSafePeriodDate = menstrualDate.plusDays(lastOvulationDate);
        int counter = 0;
        for (int i = lastOvulationDate; i < cycleDays; i++) {
            safePeriodDates.add(lastSafePeriodDate.plusDays(counter));
            counter++;}
    }


    public LocalDate getExpectedMentrualDate() {
        return expectedMentrualDate;
    }


    public void setExpectedMentrualDate(LocalDate menstrualDate, int daysOfCycle) {
        this.expectedMentrualDate  = menstrualDate.plusDays(daysOfCycle);
    }

    @Override
    public String toString() {
        return "Monthly Cycle \n {" +
                "Month::  " + expectedMentrualDate.getMonth()+"\n"+
                "Your Ovulation Dates:: \n" + ovulationDates + "\n"+
                "Your safe period Dates, but please be guided:: \n" + safePeriodDates +"\n"+
                "Your next expected Drip Date:: \n" + expectedMentrualDate + "\n"+
                '}';
    }

}
