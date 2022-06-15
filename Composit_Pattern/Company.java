package Composit_Pattern;

public class Company {
    public static void main(String[] args) {
        Developer d1=new Developer(1,"Efto","Pro Developer");
        Developer d2=new Developer(2,"mahi","Developer");
        CompanyDirectory engDirectory=new CompanyDirectory();
        engDirectory.addEmployee(d1);
        engDirectory.addEmployee(d2);

        engDirectory.showEmployeeDetails();


        Manager m1=new Manager(11,"Noor","SEO Manager");
        Manager m2=new Manager(12,"Anindo","bal er Manager");

        CompanyDirectory accDirectory=new CompanyDirectory();
        accDirectory.addEmployee(m1);
        accDirectory.addEmployee(m2);
        accDirectory.showEmployeeDetails();

        CompanyDirectory directory=new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();

    }
}
