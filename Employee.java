public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(){

    }
    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters:
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    // setters:
    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary() * 12;
    }

    public int raisedSalary(int percent){
        int salaryIncrease = (getSalary() * percent)/100;
        int newSalary = getSalary() + salaryIncrease;
        setSalary(newSalary);
        return newSalary;
    }

    public String toString(){
        return "Your Name: " + getName()
                + "\nYour ID: " + getID()
                + "\nYour Salary: " + getSalary()
                + "\nYour Annual Salary: " + getAnnualSalary();
    }


}
