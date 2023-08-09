import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmployeeManagementSystem {
    private List<Employee> employees;
    private Map<Integer, Employee> employeeMap; // Using HashMap for faster lookups

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employeeMap.put(employee.getId(), employee);
    }

    public Employee findEmployeeById(int id) {
        return employeeMap.get(id);
    }

    public void updateEmployeeName(int id, String name) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setName(name);
            System.out.println("model.Employee name updated successfully.");
        } else {
            System.out.println("model.Employee not found with ID: " + id);
        }
    }

    public void updateEmployeeSalary(int id, double salary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setSalary(salary);
            System.out.println("model.Employee salary updated successfully.");
        } else {
            System.out.println("model.Employee not found with ID: " + id);
        }
    }

    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }

        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary();
        }

        return totalSalaries / employees.size();
    }

    public double findHighestSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }

        double maxSalary = employees.get(0).getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }

        return maxSalary;
    }

    public double findLowestSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }

        double minSalary = employees.get(0).getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }

        return minSalary;
    }

    public int getTotalEmployees() {
        return employees.size();
    }

    public Employee findEmployeeWithHighestSalary() {
        if (employees.isEmpty()) {
            return null;
        }

        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    public void displayEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateTotalSalaries() {
        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary();
        }
        return totalSalaries;
    }
}
