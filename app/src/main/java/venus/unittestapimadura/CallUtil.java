package venus.unittestapimadura;

/**
 * Created by adicatur on 6/7/17.
 */

public class CallUtil {

    private final IAvServiceCallback iAvServiceCallback;

    public CallUtil(IAvServiceCallback iAvServiceCallback) {
        this.iAvServiceCallback = iAvServiceCallback;
    }

    public void onConnected(String ab,int numberOne, int numberTwo) {
        iAvServiceCallback.onConnected(ab, numberOne, numberTwo);
    }

    public void disconnected() {
        iAvServiceCallback.onDisconnected();
    }
}
