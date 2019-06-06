package com.snap.ui.view.multisnap;

import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajvv;
import defpackage.ajxm;
import defpackage.akco;
import defpackage.akcr;
import defpackage.jwj;
import defpackage.kaz;
import defpackage.zmy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class MultiSnapThumbnailViewModel extends zmy {
    private final NavigableMap<Integer, kaz<jwj>> baseBitmaps;
    private final ThumbnailComposingOperation composingOperation;
    private final ThumbnailViewState displayMode;
    private final Integer endTimestampMs;
    private final boolean isDeletionEnabled;
    private boolean isDisposed;
    private final boolean isImage;
    private final boolean isSplitEnabled;
    private final AbstractThumbnailPlayheadPresenter playheadPresenter;
    private final String segmentKey;
    private final int startTimestampMs;
    private final String thumbnailKey;
    private final Integer trimEndTimestampMs;
    private final Integer trimStartTimestampMs;
    private final TrimmingListener trimmingListener;

    public MultiSnapThumbnailViewModel(String str, NavigableMap<Integer, kaz<jwj>> navigableMap, ThumbnailViewState thumbnailViewState, String str2, Integer num, List<? extends ajxm<? extends kaz<jwj>, Integer>> list) {
        akcr.b(str, "thumbnailKey");
        akcr.b(navigableMap, "baseBitmaps");
        akcr.b(thumbnailViewState, "displayMode");
        super(MultiSnapThumbnailViewType.THUMBNAIL_VIEW, (long) str.hashCode());
        this.thumbnailKey = str;
        this.displayMode = thumbnailViewState;
        this.segmentKey = str2;
        this.endTimestampMs = num;
        this.baseBitmaps = list == null ? MultiSnapThumbnailViewModelKt.copyAtLeastOne$default(navigableMap, null, null, toString(), 3, null) : MultiSnapThumbnailViewModelKt.extend(navigableMap, list, toString());
        this.isSplitEnabled = true;
    }

    public /* synthetic */ MultiSnapThumbnailViewModel(String str, NavigableMap navigableMap, ThumbnailViewState thumbnailViewState, String str2, Integer num, List list, int i, akco akco) {
        this(str, navigableMap, thumbnailViewState, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list);
    }

    public final void addTo(ajei ajei) {
        akcr.b(ajei, "compositeDisposable");
        Map map = this.baseBitmaps;
        Collection arrayList = new ArrayList(map.size());
        for (Entry value : map.entrySet()) {
            Object value2 = value.getValue();
            akcr.a(value2, "it.value");
            arrayList.add(ajvv.a((ajej) value2, ajei));
        }
        ThumbnailComposingOperation composingOperation = getComposingOperation();
        if (composingOperation != null) {
            ajvv.a((ajej) composingOperation, ajei);
        }
    }

    public boolean areContentsTheSame(zmy zmy) {
        if (zmy != null && (zmy instanceof MultiSnapThumbnailViewModel)) {
            MultiSnapThumbnailViewModel multiSnapThumbnailViewModel = (MultiSnapThumbnailViewModel) zmy;
            if (multiSnapThumbnailViewModel.baseBitmaps.equals(this.baseBitmaps) && akcr.a(multiSnapThumbnailViewModel.getComposingOperation(), getComposingOperation()) && multiSnapThumbnailViewModel.displayMode == this.displayMode && akcr.a(multiSnapThumbnailViewModel.segmentKey, this.segmentKey) && akcr.a(multiSnapThumbnailViewModel.endTimestampMs, this.endTimestampMs) && multiSnapThumbnailViewModel.getStartTimestampMs() == getStartTimestampMs() && multiSnapThumbnailViewModel.isDeletionEnabled() == isDeletionEnabled() && multiSnapThumbnailViewModel.isSplitEnabled() == isSplitEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void dispose() {
        MultiSnapThumbnailViewModelKt.dispose(this.baseBitmaps);
        ThumbnailComposingOperation composingOperation = getComposingOperation();
        if (composingOperation != null) {
            composingOperation.dispose();
        }
        this.isDisposed = true;
    }

    public final NavigableMap<Integer, kaz<jwj>> getBaseBitmaps() {
        return this.baseBitmaps;
    }

    public ThumbnailComposingOperation getComposingOperation() {
        return this.composingOperation;
    }

    public final ThumbnailViewState getDisplayMode() {
        return this.displayMode;
    }

    public final Integer getEndTimestampMs() {
        return this.endTimestampMs;
    }

    public AbstractThumbnailPlayheadPresenter getPlayheadPresenter() {
        return this.playheadPresenter;
    }

    public final String getSegmentKey() {
        return this.segmentKey;
    }

    public int getStartTimestampMs() {
        return this.startTimestampMs;
    }

    public final String getThumbnailKey() {
        return this.thumbnailKey;
    }

    public Integer getTrimEndTimestampMs() {
        return this.trimEndTimestampMs;
    }

    public Integer getTrimStartTimestampMs() {
        return this.trimStartTimestampMs;
    }

    public TrimmingListener getTrimmingListener() {
        return this.trimmingListener;
    }

    public boolean isDeletionEnabled() {
        return this.isDeletionEnabled;
    }

    public final boolean isDisposed() {
        return this.isDisposed;
    }

    public boolean isImage() {
        return this.isImage;
    }

    public boolean isSplitEnabled() {
        return this.isSplitEnabled;
    }

    public final void setDisposed(boolean z) {
        this.isDisposed = z;
    }
}
