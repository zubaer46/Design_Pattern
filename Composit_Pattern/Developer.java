package Composit_Pattern;

public class Developer implements Employee{
    private String name;
    private long id;
    private String position;

    public Developer(long id,String name,String position){
        this.id=id;
        this.name=name;
        this.position=position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id+" "+name+" "+position);
    }
}
