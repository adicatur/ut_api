package venus.unittestapimadura;

import android.content.Context;
import android.text.TextUtils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by adicatur on 6/7/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class IAvServiceTest {

    @Mock IAvServiceCallback iAvServiceCallback;

    @Mock CallRequestInfo callRequestInfo;

    @Mock IAvService iAvService;


    private CallPresenter callPresenter;
    private CallUtil callUtil;

    @Before
    public void setUp() throws Exception {
        callPresenter = new CallPresenter(iAvService);
        callUtil = new CallUtil(iAvServiceCallback);
    }

    @Test
    public void callingOnConnectedWhenSuccessStartCall() throws Exception {
        callPresenter.startCall(callRequestInfo);
        callUtil.onConnected("ab", 1 ,1);
        verify(iAvService).startCall(callRequestInfo);
        verify(iAvServiceCallback).onConnected("ab", 1, 1);
    }

    @Test
    public void callingOnDisconnectedWhenSuccessEndCall() throws Exception {
        callPresenter.endCall();
        callUtil.disconnected();
        verify(iAvService).endCall();
        verify(iAvServiceCallback).onDisconnected();
    }
}