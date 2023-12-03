package ru.geekbrains.lesson7.observer;

public class JobVacancy {
    private Company company;
    private int salary;

    public JobVacancy(Company company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
