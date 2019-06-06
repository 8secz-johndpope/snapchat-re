package com.snap.ui.view.multisnap;

import com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType;

public interface TrimmingListener {
    void onTrimmingHandleDraggingFinished(String str, int i, Integer num, TrimmingType trimmingType);

    void onTrimmingHandleDraggingStart();

    void onTrimmingHandleDraggingUpdated(String str, int i, TrimmingType trimmingType);
}
