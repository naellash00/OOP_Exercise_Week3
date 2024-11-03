public class MainEmployee {
    public static void main(String[]args){
        Employee employee1 = new Employee("112233", "fatimah", 8000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getID());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1.getName() + "'s Salary before Raise: " + employee1.getSalary());
        employee1.raisedSalary(30);
        System.out.println(employee1.getName() +"'s New Salary After Raise: " + employee1.getSalary());

        Employee employee2 = new Employee();
        employee2.setName("ibrahim");
        employee2.setID("987987");
        employee2.setSalary(7000);
        System.out.println(employee2.toString());
    }
}
