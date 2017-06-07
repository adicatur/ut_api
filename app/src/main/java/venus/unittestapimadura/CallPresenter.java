package venus.unittestapimadura;

/**
 * Created by adicatur on 6/7/17.
 */

public class CallPresenter  {

    private final IAvService iAvService;

    CallPresenter(IAvService iAvService) {
        this.iAvService = iAvService;
    }

    public void startCall(CallRequestInfo callRequestInfo) {
        iAvService.startCall(callRequestInfo);
    }

    public void endCall(){
        iAvService.endCall();
    }
}
