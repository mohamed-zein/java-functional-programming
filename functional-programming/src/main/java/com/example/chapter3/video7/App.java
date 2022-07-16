package com.example.chapter3.video7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bert", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f)
        };

        List<Employee> employees = Arrays.asList(employeesArr);

        // From the above dataset, we need to compare the average salary of a developer
        // compared to other jobs

        // First we will calculate the total salaries of developers
        Float totalDeveloperSalaries = employees
                .stream()
                .filter((employee) -> employee.jobTitle == "developer")
                .map((developer) -> developer.salary)
                .reduce(0f, (acc, salary) -> acc + salary);

        // Then we get the count of developers
        Long numberOfDevelopers = employees
                .stream()
                .filter((employee) -> employee.jobTitle == "developer")
                .collect(Collectors.counting());

        // We calculate the average developer salary
        Float averageDeveloperSalary = totalDeveloperSalaries / numberOfDevelopers;
        System.out.println("Avergae Developer Salary = " + averageDeveloperSalary);

        // We will caculate total salaries of other jobs
        Float totalOtherSalaries = employees
                .stream()
                .filter((employee) -> employee.jobTitle != "developer")
                .map((other) -> other.salary)
                .reduce(0f, (acc, salary) -> acc + salary);

        // Then we count the other jobs
        Long numberOfOthers = employees
                .stream()
                .filter((employee) -> employee.jobTitle != "developer")
                .collect(Collectors.counting());

        // We calculate the average of other jobs
        Float averageOtherSalary = totalOtherSalaries / numberOfOthers;
        System.out.println("Avergae Others Salary = " + averageOtherSalary);
    }
}
