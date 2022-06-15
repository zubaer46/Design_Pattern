package state_Pattern;

public class AlertStateContext {
    MobileAlertState currentState;
    public AlertStateContext(){
        currentState=new Vibration();
    }
    public void setState(MobileAlertState state){
        currentState=state;
    }

    public void alert(){
        currentState.alert(this);
    }
}
