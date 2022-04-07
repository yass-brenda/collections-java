package collection.bank;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(numberCount, client.numberCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCount);
    }
}
