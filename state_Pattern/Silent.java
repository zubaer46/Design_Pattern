package state_Pattern;

public class Silent implements MobileAlertState{
    @Override
    public void alert(AlertStateContext ASC) {
        System.out.println("silent mode on...");
    }
}
