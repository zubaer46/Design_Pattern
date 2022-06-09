package Chain_of_Responsibility_Pattern;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Console Logger ✅ Normal:: Logger "+message);
    }
}
