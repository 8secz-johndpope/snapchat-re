package com.snap.ui.view.multisnap;

public interface MultiSnapThumbnailViewDelegate {
    MultiSnapThumbnailTileView createSnapThumbnailTileView();

    Integer getEndingTimestamp();

    String getSegmentKey();

    int getStartingTimestamp();

    int getThumbnailViewOffset();

    int getThumbnailViewWidth(boolean z);

    boolean isDeleting();

    boolean isSplitting();

    boolean isTrimming();

    void setEndingTimestamp(Integer num);

    void setSegmentKey(String str);

    void setStartingTimestamp(int i);

    void updateButtonVisibility(boolean z);
}
