package com.addlive.impl.video;

public interface VideoFrameReceiverLifecycle {
    void onReceiverActivated(VideoFrameReceiver videoFrameReceiver);

    void onReceiverDeactivated(VideoFrameReceiver videoFrameReceiver);
}
