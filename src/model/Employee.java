class Employee {
    private String name;
    private final int id;
    private double salary;
    private static int nextId = 1; // Starting ID for employees

    public Employee(String name, double salary) {
        this.name = name;
        this.id = nextId++;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}