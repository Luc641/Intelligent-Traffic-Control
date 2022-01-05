package Entities;

public interface State {
    /**
     *
     * @param context shows the signal given by the context
     *  inverse used to return the inverse of the signal
     */
    void showSignalOnce(Context context);

    State inverse();
}
