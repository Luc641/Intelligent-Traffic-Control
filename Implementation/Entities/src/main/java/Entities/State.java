package Entities;

public interface State {
    //Interface state implementing the functionalities of the different states
    void showSignalOnce(Context context);

    State inverse();
}
