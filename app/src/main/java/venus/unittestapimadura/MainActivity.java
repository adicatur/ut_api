package venus.unittestapimadura;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends Activity implements IAvService, IAvServiceCallback {

    private CallPresenter callPresenter;
    private CallUtil callUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callPresenter = new CallPresenter(this);

        startCall();
        endedCall();
    }

    private void startCall() {
        CallRequestInfo callRequestInfo = new CallRequestInfo();
        callPresenter.startCall(callRequestInfo);
    }

    public void endedCall() {
        callPresenter.endCall();
    }

    @Override
    public void startCall(CallRequestInfo callRequestInfo) {
        callUtil = new CallUtil(this);
        callUtil.onConnected("ab", 1, 1);
    }

    @Override
    public void endCall() {
        callUtil.disconnected();
    }

    @Override
    public void muteAudio(boolean mute) {

    }

    @Override
    public boolean isAudioMuted() {
        return false;
    }

    @Override
    public void muteVideo(boolean mute) {

    }

    @Override
    public boolean isVideoMuted() {
        return false;
    }

    @Override
    public void enableVideo(boolean enable) {

    }

    @Override
    public void switchCamera() {

    }

    @Override
    public void setSpeakerOn(boolean speakerOn) {

    }

    @Override
    public boolean isSpeakerOn() {
        return false;
    }

    @Override
    public SurfaceView getRendererView(Context context, int uid, boolean local) {
        return null;
    }

    @Override
    public void preview(boolean start, SurfaceView view, int uid) {

    }

    @Override
    public void registerCallback(IAvServiceCallback avServiceCallback) {

    }

    @Override
    public void unregisterCallback(IAvServiceCallback avServiceCallback) {

    }

    @Override
    public int getCallState() {
        return 0;
    }

    @Override
    public CallType getCallType() {
        return null;
    }

    @Override
    public boolean isInActiveCall() {
        return false;
    }

    @Override
    public CallRequestInfo getCallRequestInfo() {
        return null;
    }

    @Override
    public void onConnected(String ab, int numberOne, int numberTwo) {

    }

    @Override
    public void onDisconnected() {

    }
}
