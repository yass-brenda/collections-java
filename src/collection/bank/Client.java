package collection.bank;

public class Client {
    private String name;
    private String numberCount;
    private double salary;

    public Client(String name,String numberCount,double salary) {
        this.name = name;
        this.numberCount = numberCount;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(String numberCount) {
        this.numberCount = numberCount;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
