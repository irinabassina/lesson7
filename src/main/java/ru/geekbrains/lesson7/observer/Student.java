package ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    private int salary = 2000;

    @Override
    public void receiveOffer(JobVacancy jobVacancy) {
        if (this.salary <= jobVacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, jobVacancy.getCompany().getName(), jobVacancy.getSalary());
            this.salary = jobVacancy.getSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, jobVacancy.getCompany().getName(), jobVacancy.getSalary());
        }
    }
}
