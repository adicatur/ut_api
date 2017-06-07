package venus.unittestapimadura;

import android.content.Context;

/**
 * Created by adicatur on 6/7/17.
 */


    public interface IAvService {


//        /**
//
//         *
//
//         * Start the process of audio/video call initialization.
//
//         * Register for callbacks using {@link #registerCallback(IAvServiceCallback)}
//
//         *
//
//         * {@link IAvServiceCallback#onConnected(String, int, int)} will called back on success
//
//         *
//
//         * @param callRequestInfo
//
//         */
        void startCall(CallRequestInfo callRequestInfo);

//
//        /**
//
//         *
//
//         * Initiate the process to disconnected,
//
//         * {@link IAvServiceCallback#onDisconnected(AvCallStats)} will called after success
//
//         *
//
//         */

        void endCall();



        /**

         * Toggle local audio

         *

         * @param mute

         */

        void muteAudio(boolean mute);



        /**

         * local audio muted

         *

         * @return

         */

        boolean isAudioMuted();



        /**

         *

         * Toggle local video

         *

         * @param mute

         */

        void muteVideo(boolean mute);



        /**

         *

         * Local video muted

         *

         * @return

         */

        boolean isVideoMuted();



        /**

         *

         * Toggle video the current session

         *

         * @param enable

         */

        void enableVideo(boolean enable);



        /**

         *

         * Switch/toggle camera(back/front)

         *

         */

        void switchCamera();



        /**

         *

         * Route auto to speaker

         *

         * @param speakerOn

         */

        void setSpeakerOn(boolean speakerOn);



        /**

         * is SpeakerOn

         * @return

         */

        boolean isSpeakerOn();



        /**

         *

         * Prepare and return the view to render video

         *

         * @param context UI context(Activity) in which this view will be created

         * @param uid Unique identifier of the user

         * @param local Local/remote

         * @return

         */

        SurfaceView getRendererView(Context context, int uid, boolean local);



        /**

         *

         * Start/Stop the video preview

         *

         * @param start

         * @param view

         * @param uid

         */

        void preview(boolean start, SurfaceView view, int uid);



        /**

         * Register for service callbacks

         *

         * @param avServiceCallback

         */

        void registerCallback(IAvServiceCallback avServiceCallback);



        /**

         * Unregister service callback

         *

         * @param avServiceCallback

         */

        void unregisterCallback(IAvServiceCallback avServiceCallback);



//        /**
//
//         *
//
//         * Returns the one of following states of the audio/video service
//
//         *
//
//         * {@link State#IDLE}
//
//         * {@link State#INSUFFICIENT_PERMISSIONS}
//
//         * {@link State#CONNECTING}
//
//         * {@link State#RECONNECTING}
//
//         * {@link State#READY}
//
//         * {@link State#IN_CALL}
//
//         * {@link State#DISCONNECTING}
//
//         * {@link State#DISCONNECTED}
//
//         *
//
//         * @return
//
//         */

//        @State

        int getCallState();



        /**

         *

         * Type of the call(audio/video)

         *

         * @return

         */

        CallType getCallType();



        /**

         *

         * Convenient method to determine call is active state

         *

         * @return

         */

        boolean isInActiveCall();



        /**

         * Call request information passed to {@link #startCall(CallRequestInfo)}

         *

         * @return

         */

        CallRequestInfo getCallRequestInfo();



    }
