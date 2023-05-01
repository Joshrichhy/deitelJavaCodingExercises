package MenstrualCycle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class YearlyCycle {
    private int cycleDays;
    private int flowDays;
    private LocalDate menstrualDate;
    private List<Cycle> monthlyCycle = new ArrayList<>();

    public YearlyCycle(int cycleDays, int flowDays, String menstrualDate) {
        this.menstrualDate = LocalDate.parse(menstrualDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.cycleDays = cycleDays;
        this.flowDays = flowDays;
        yearlyCycleCalculation();
    }

    private void yearlyCycleCalculation(){
        Cycle cycle = new Cycle();
        cycle.setExpectedMentrualDate(menstrualDate, cycleDays);
        cycle.setOvulationDates(cycleDays, menstrualDate);
        cycle.setSafePeriodDates(menstrualDate, flowDays,cycleDays);
        monthlyCycle.add(cycle);
        for (int i = 0; i < 11; i++) {
            Cycle newCycle = new Cycle();
           newCycle.setExpectedMentrualDate(monthlyCycle.get(i).getExpectedMentrualDate(), cycleDays);
            newCycle.setSafePeriodDates(monthlyCycle.get(i).getExpectedMentrualDate(),flowDays, cycleDays);
            newCycle.setOvulationDates(cycleDays,monthlyCycle.get(i).getExpectedMentrualDate());
            monthlyCycle.add(newCycle);}

    }

    @Override
    public String toString() {
        return "Hi, this is your supposed menstrual cycle for the next One Year " +"\n"+
                "{" +"\n"+
                "Your Cycle Days:: " + cycleDays +"\n"+
                "Your Dripping  Days:: " + flowDays +"\n"+
                "Your Current Menstrual Date:: " + menstrualDate + "\n"+
                "The following are your cycle each month::  \n " + monthlyCycle +"\n"+
                '}';
    }
}
