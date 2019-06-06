package com.snap.ui.view.multisnap;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.common.collect.Sets;
import com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType;
import com.snapchat.android.R;
import defpackage.abmr;
import defpackage.abpf;
import defpackage.abtc;
import defpackage.ajxk;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akca;
import defpackage.akco;
import defpackage.akcr;
import defpackage.jwa;
import defpackage.jwj;
import defpackage.jwz;
import defpackage.kaz;
import defpackage.zfw;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

public final class MultiSnapThumbnailView extends RelativeLayout implements MultiSnapThumbnailViewDelegate, TrimmingListener {
    public static final Companion Companion = new Companion();
    public static final int MIN_SEGMENT_DURATION_MS = 2000;
    public static final String THUMBNAIL_INVALID_KEY = "INVALID";
    private final AnimatorSet animatorSet;
    private final jwa bitmapFactory;
    private final int borderRadius;
    private final int borderThickWidth;
    private final int borderThinWidth;
    private final View borderView;
    private ThumbnailComposingOperation composingOperation;
    private ThumbnailViewState currentViewState;
    private final View deleteButton;
    private ThumbnailDeletedListener deletedListener;
    private Integer endingTimestamp;
    private boolean isDeleting;
    private boolean isDeletionEnabled;
    private boolean isImage;
    private boolean isSplitEnabled = true;
    private boolean isSplitting;
    private final int playheadHeight;
    private final View playheadIndicator;
    private final View playheadView;
    private String segmentKey;
    private final int selectedModeAdditionalMargin;
    private final View splitterView;
    private int startingTimestamp;
    private final NavigableMap<Integer, ThumbnailTileResourceBundle> thumbnailBitmaps;
    private final int thumbnailHeight;
    private final int thumbnailMargin;
    private akca<? super String, ? super Integer, ? super Integer, ajxw> thumbnailViewTrimmingListener;
    private final int thumbnailWidth;
    private final LinearLayout tilesHolderView;
    private final MultiSnapThumbnailTilesViewController tilesViewController;
    private final ThumbnailTrimmingController trimmingController;
    private TrimmingListener trimmingListener;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public static final class ThumbnailTileResourceBundle {
        public static final Companion Companion = new Companion();
        private static final String TAG = "ThumbnailTileResourceBundle";
        private kaz<jwj> baseBitmap;
        private kaz<jwj> compositedBitmap;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(akco akco) {
                this();
            }

            public final void closeSafely(ThumbnailTileResourceBundle thumbnailTileResourceBundle) {
                if (thumbnailTileResourceBundle != null) {
                    kaz.b(thumbnailTileResourceBundle.getBaseBitmap());
                    kaz.b(thumbnailTileResourceBundle.getCompositedBitmap());
                }
            }
        }

        public ThumbnailTileResourceBundle(kaz<jwj> kaz, kaz<jwj> kaz2) {
            String str = TAG;
            this.baseBitmap = kaz.a((kaz) kaz, str);
            this.compositedBitmap = kaz.a((kaz) kaz2, str);
        }

        public final kaz<jwj> getBaseBitmap() {
            return this.baseBitmap;
        }

        public final kaz<jwj> getCompositedBitmap() {
            return this.compositedBitmap;
        }

        public final void setBaseBitmap(kaz<jwj> kaz) {
            this.baseBitmap = kaz;
        }

        public final void setCompositedBitmap(kaz<jwj> kaz) {
            this.compositedBitmap = kaz;
        }
    }

    public enum ThumbnailViewState {
        NEUTRAL,
        SELECTED,
        DEMOTED,
        SINGLE_DEMOTED
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThumbnailViewState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ThumbnailViewState.SELECTED.ordinal()] = 1;
            $EnumSwitchMapping$0[ThumbnailViewState.SINGLE_DEMOTED.ordinal()] = 2;
            $EnumSwitchMapping$0[ThumbnailViewState.DEMOTED.ordinal()] = 3;
            $EnumSwitchMapping$0[ThumbnailViewState.NEUTRAL.ordinal()] = 4;
        }
    }

    public MultiSnapThumbnailView(Context context, zfw zfw, int i, Integer num, String str, int i2, int i3, int i4, jwa jwa) {
        akcr.b(context, "context");
        akcr.b(zfw, "schedulers");
        akcr.b(str, "segmentKey");
        akcr.b(jwa, "bitmapFactory");
        super(context);
        this.startingTimestamp = i;
        this.thumbnailWidth = i2;
        this.thumbnailHeight = i3;
        this.thumbnailMargin = i4;
        this.bitmapFactory = jwa;
        this.endingTimestamp = num;
        this.segmentKey = str;
        LayoutInflater.from(context).inflate(R.layout.snap_thumbnail_overlay_placeholder, this, true);
        Object duration = new AnimatorSet().setDuration(75);
        akcr.a(duration, "AnimatorSet().setDuratio…LE_ANIMATION_DURATION_MS)");
        this.animatorSet = duration;
        this.borderThickWidth = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_border_width);
        this.borderThinWidth = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_border_width_thin);
        this.borderRadius = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_border_radius) - 1;
        this.selectedModeAdditionalMargin = context.getResources().getDimensionPixelSize(R.dimen.multi_snap_thumbnail_selected_mode_additional_margin);
        this.thumbnailBitmaps = new ConcurrentSkipListMap();
        this.playheadHeight = this.thumbnailHeight + context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_scissors_extra_height);
        LayoutParams layoutParams = new LayoutParams(-2, this.playheadHeight);
        int i5 = this.thumbnailMargin;
        layoutParams.rightMargin = i5;
        layoutParams.topMargin = (int) (((float) i5) * 3.0f);
        layoutParams.bottomMargin = (int) (((float) i5) * 3.0f);
        setLayoutParams(layoutParams);
        duration = findViewById(R.id.thumbnail_overlay_image_holder);
        akcr.a(duration, "findViewById(R.id.thumbnail_overlay_image_holder)");
        this.tilesHolderView = (LinearLayout) duration;
        MultiSnapThumbnailViewDelegate multiSnapThumbnailViewDelegate = this;
        this.tilesViewController = new MultiSnapThumbnailTilesViewController(this.tilesHolderView, multiSnapThumbnailViewDelegate, (float) this.borderRadius, zfw);
        Object findViewById = findViewById(R.id.thumbnail_border_view);
        akcr.a(findViewById, "findViewById(R.id.thumbnail_border_view)");
        this.borderView = findViewById;
        RelativeLayout relativeLayout = this;
        View view = this.borderView;
        Object newHashSet = Sets.newHashSet(this);
        akcr.a(newHashSet, "Sets.newHashSet(this)");
        this.trimmingController = new ThumbnailTrimmingController(relativeLayout, view, (Set) newHashSet, multiSnapThumbnailViewDelegate, this.bitmapFactory);
        this.tilesViewController.setTrimmingPositionProvider(this.trimmingController);
        findViewById = findViewById(R.id.thumbnail_delete_button);
        akcr.a(findViewById, "findViewById(R.id.thumbnail_delete_button)");
        this.deleteButton = findViewById;
        initDeleteButton();
        ViewGroup.LayoutParams layoutParams2 = this.deleteButton.getLayoutParams();
        if (layoutParams2 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.rightMargin = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_delete_button_right_margin);
            layoutParams3.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_delete_button_top_margin);
            Object findViewById2 = findViewById(R.id.thumbnail_playhead);
            akcr.a(findViewById2, "findViewById(R.id.thumbnail_playhead)");
            this.playheadView = findViewById2;
            findViewById2 = this.playheadView.findViewById(R.id.thumbnail_splitter);
            akcr.a(findViewById2, "playheadView.findViewById(R.id.thumbnail_splitter)");
            this.splitterView = findViewById2;
            findViewById2 = this.playheadView.findViewById(R.id.thumbnail_playhead_indicator);
            akcr.a(findViewById2, "playheadView.findViewByI…bnail_playhead_indicator)");
            this.playheadIndicator = findViewById2;
            setOnLongClickListener(AnonymousClass1.INSTANCE);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private final void animateScale(float f) {
        this.animatorSet.cancel();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", new float[]{getScaleX(), f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{getScaleY(), f});
        this.animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.animatorSet.start();
    }

    private final void configureDeleteButtonLayout(int i) {
        this.deleteButton.setVisibility(this.isDeletionEnabled ? i : 8);
        ViewGroup.LayoutParams layoutParams = this.tilesHolderView.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i2 = 0;
            layoutParams2.leftMargin = i == 0 ? this.selectedModeAdditionalMargin : 0;
            if (i == 0) {
                i2 = this.selectedModeAdditionalMargin;
            }
            layoutParams2.rightMargin = i2;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private final void configureStateLayout(ThumbnailViewState thumbnailViewState, boolean z, boolean z2) {
        if (thumbnailViewState != null) {
            Context context = getContext();
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                abmr.a();
                this.currentViewState = thumbnailViewState;
                int i = 0;
                float stateScale = getStateScale(thumbnailViewState, false);
                if (z) {
                    animateScale(stateScale);
                } else {
                    setScaleX(stateScale);
                    setScaleY(stateScale);
                }
                float f = (thumbnailViewState == ThumbnailViewState.DEMOTED || thumbnailViewState == ThumbnailViewState.SINGLE_DEMOTED) ? 0.8f : 1.0f;
                setAlpha(f);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    int visibleTileCount;
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (thumbnailViewState == ThumbnailViewState.DEMOTED || thumbnailViewState == ThumbnailViewState.SINGLE_DEMOTED) {
                        visibleTileCount = (int) (((((float) this.tilesViewController.getVisibleTileCount(thumbnailViewState, this.isImage)) * ((float) this.thumbnailWidth)) * (1.0f - stateScale)) / 2.0f);
                        marginLayoutParams.leftMargin = -visibleTileCount;
                        marginLayoutParams.rightMargin = this.thumbnailMargin - visibleTileCount;
                    } else {
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = this.thumbnailMargin;
                    }
                    visibleTileCount = (int) (((float) this.thumbnailMargin) * 3.0f);
                    if (thumbnailViewState == ThumbnailViewState.SINGLE_DEMOTED) {
                        i = (int) ((((float) marginLayoutParams.height) * (1.0f - stateScale)) / 2.0f);
                    }
                    marginLayoutParams.bottomMargin = visibleTileCount - i;
                    i = thumbnailViewState == ThumbnailViewState.SELECTED ? R.drawable.snap_thumbnail_border_thick : R.drawable.snap_thumbnail_border_thin;
                    this.tilesHolderView.setBackgroundResource(i);
                    this.borderView.setBackgroundResource(i);
                    updatePlayheadLayout();
                    updateButtonVisibility(true);
                    if (z2) {
                        this.tilesViewController.configureStateLayout(thumbnailViewState, this.thumbnailBitmaps, this.composingOperation, z, this.isImage);
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    private final float getStateScale(ThumbnailViewState thumbnailViewState, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[thumbnailViewState.ordinal()];
        float f = 1.0f;
        if (i != 1) {
            float f2 = 0.7f;
            float f3 = 0.9f;
            if (i == 2) {
                if (getEndingTimestamp() == null) {
                    f2 = 1.0f;
                }
                if (z) {
                    f = 0.9f;
                }
                return f2 * f;
            } else if (i == 3) {
                if (z) {
                    f = 0.9f;
                }
                return f * 0.7f;
            } else if (i == 4) {
                if (!z) {
                    f3 = 1.0f;
                }
                return f3 * 1.0f;
            } else {
                throw new ajxk();
            }
        }
        return (z ? 1.1f : 1.0f) * 1.0f;
    }

    private final void initDeleteButton() {
        abtc abtc = new abtc(this.deleteButton);
        this.deleteButton.setOnTouchListener(abtc);
        abtc.a((OnTouchListener) new MultiSnapThumbnailView$initDeleteButton$1(this));
    }

    private final void setSplitterVisibility(int i) {
        this.splitterView.setVisibility(i);
        if (i == 0) {
            this.playheadIndicator.getLayoutParams().width = this.borderThickWidth;
            this.playheadIndicator.setBackground(getResources().getDrawable(R.drawable.multi_snap_dashed_line));
            return;
        }
        this.playheadIndicator.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.multi_snap_thumbnail_playhead_width);
        this.playheadIndicator.setBackgroundColor(-1);
    }

    private final void updatePlayheadLayout() {
        int intValue;
        boolean z = false;
        if (getEndingTimestamp() != null) {
            Integer trimmingEndTimestamp = this.trimmingController.getTrimmingEndTimestamp();
            if (trimmingEndTimestamp != null) {
                intValue = trimmingEndTimestamp.intValue() - this.trimmingController.getTrimmingStartTimestamp();
                if (this.isSplitEnabled && this.currentViewState == ThumbnailViewState.SELECTED && intValue > 4000) {
                    z = true;
                }
                updatePlayheadLayout(z);
            }
        }
        intValue = 0;
        z = true;
        updatePlayheadLayout(z);
    }

    private final void updatePlayheadLayout(boolean z) {
        this.playheadView.setClickable(z);
        this.playheadView.getLayoutParams().width = getResources().getDimensionPixelSize(z ? R.dimen.multi_snap_thumbnail_scissors_width : R.dimen.multi_snap_thumbnail_playhead_width);
    }

    public final MultiSnapThumbnailTileView createSnapThumbnailTileView() {
        Object context = getContext();
        akcr.a(context, "context");
        return new MultiSnapThumbnailTileView(context, this.thumbnailWidth, this.thumbnailHeight, (float) this.borderRadius);
    }

    public final Integer getEndingTimestamp() {
        return this.endingTimestamp;
    }

    public final View getPlayheadView() {
        return this.playheadView;
    }

    public final int getPlayheadVisibility() {
        return this.playheadView.getVisibility();
    }

    public final int getPlayheadWidth() {
        return this.playheadView.getWidth();
    }

    public final float getPlayheadX() {
        return this.playheadView.getX();
    }

    public final String getSegmentKey() {
        return this.segmentKey;
    }

    public final View getSplitterView() {
        return this.splitterView;
    }

    public final int getSplitterVisibility() {
        return this.splitterView.getVisibility();
    }

    public final int getStartingTimestamp() {
        return this.startingTimestamp;
    }

    public final int getThumbnailViewOffset() {
        ViewGroup.LayoutParams layoutParams = this.tilesHolderView.getLayoutParams();
        if (layoutParams != null) {
            return ((RelativeLayout.LayoutParams) layoutParams).leftMargin;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final akca<String, Integer, Integer, ajxw> getThumbnailViewTrimmingListener() {
        return this.thumbnailViewTrimmingListener;
    }

    public final int getThumbnailViewWidth(boolean z) {
        return z ? (this.tilesViewController.getVisibleTileCount(this.currentViewState, this.isImage) * this.thumbnailWidth) + ((this.currentViewState == ThumbnailViewState.SELECTED ? this.borderThickWidth : this.borderThinWidth) * 2) : this.tilesHolderView.getWidth();
    }

    public final LinearLayout getTilesHolderView() {
        return this.tilesHolderView;
    }

    public final TrimmingListener getTrimmingListener() {
        return this.trimmingListener;
    }

    public final ThumbnailTrimmingPositionProvider getTrimmingPositionProvider() {
        return this.trimmingController;
    }

    public final boolean isDeleting() {
        return this.isDeleting;
    }

    public final boolean isDeletionEnabled() {
        return this.isDeletionEnabled;
    }

    public final boolean isImage() {
        return this.isImage;
    }

    public final boolean isSplitEnabled() {
        return this.isSplitEnabled;
    }

    public final boolean isSplitting() {
        return this.isSplitting;
    }

    public final boolean isTrimming() {
        return this.trimmingController.isDragging();
    }

    public final void load(int i, kaz<jwj> kaz, boolean z) {
        Object a;
        akcr.b(kaz, "thumbnailBitmapRef");
        try {
            a = kaz.a((kaz) kaz, "MultiSnapThumbnailView");
        } catch (Exception unused) {
            a = null;
        }
        if (a != null) {
            akcr.a(a, "try {\n            RefCou… null\n        } ?: return");
            if (z) {
                try {
                    this.tilesViewController.animateInThumbnailTile(i, a);
                } catch (Throwable th) {
                    a.dispose();
                }
            }
            ThumbnailTileResourceBundle thumbnailTileResourceBundle = (ThumbnailTileResourceBundle) this.thumbnailBitmaps.get(Integer.valueOf(i));
            if (thumbnailTileResourceBundle != null) {
                Bitmap a2 = jwz.a(a);
                kaz baseBitmap = thumbnailTileResourceBundle.getBaseBitmap();
                if (a2 == (baseBitmap != null ? jwz.a(baseBitmap) : null)) {
                    a.dispose();
                    return;
                }
                ThumbnailTileResourceBundle.Companion.closeSafely(thumbnailTileResourceBundle);
            }
            this.thumbnailBitmaps.put(Integer.valueOf(i), new ThumbnailTileResourceBundle(a, null));
            a.dispose();
        }
    }

    public final void onTrimmingHandleDraggingFinished(String str, int i, Integer num, TrimmingType trimmingType) {
        akcr.b(str, "segmentKey");
        akcr.b(trimmingType, "type");
        if (this.isDeletionEnabled) {
            this.deleteButton.setVisibility(0);
        }
        akca akca = this.thumbnailViewTrimmingListener;
        if (akca != null) {
            akca.invoke(str, Integer.valueOf(i), num);
        }
        TrimmingListener trimmingListener = this.trimmingListener;
        if (trimmingListener != null) {
            trimmingListener.onTrimmingHandleDraggingFinished(str, i, num, trimmingType);
        }
        this.playheadView.setVisibility(0);
    }

    public final void onTrimmingHandleDraggingStart() {
        if (this.isDeletionEnabled) {
            this.deleteButton.setVisibility(8);
        }
        this.playheadView.setVisibility(4);
        TrimmingListener trimmingListener = this.trimmingListener;
        if (trimmingListener != null) {
            trimmingListener.onTrimmingHandleDraggingStart();
        }
    }

    public final void onTrimmingHandleDraggingUpdated(String str, int i, TrimmingType trimmingType) {
        akcr.b(str, "segmentKey");
        akcr.b(trimmingType, "type");
        TrimmingListener trimmingListener = this.trimmingListener;
        if (trimmingListener != null) {
            trimmingListener.onTrimmingHandleDraggingUpdated(str, i, trimmingType);
        }
    }

    public final void recycle() {
        for (ThumbnailTileResourceBundle closeSafely : this.thumbnailBitmaps.values()) {
            ThumbnailTileResourceBundle.Companion.closeSafely(closeSafely);
        }
        ThumbnailComposingOperation thumbnailComposingOperation = this.composingOperation;
        if (thumbnailComposingOperation != null) {
            thumbnailComposingOperation.dispose();
        }
        this.composingOperation = null;
        this.thumbnailBitmaps.clear();
        this.tilesViewController.clear();
        this.currentViewState = null;
    }

    public final void setDeleteButtonVisibility(int i) {
        if (this.isDeletionEnabled) {
            this.deleteButton.setVisibility(i);
        }
    }

    public final void setDeleting(boolean z) {
        this.isDeleting = z;
    }

    public final void setDeletionEnabled(boolean z) {
        this.isDeletionEnabled = z;
    }

    public final void setEndingTimestamp(Integer num) {
        this.endingTimestamp = num;
        configureStateLayout(this.currentViewState, false, false);
    }

    public final void setImage(boolean z) {
        this.isImage = z;
    }

    public final void setPlayheadOnTouchListener(OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.playheadView.setOnTouchListener(null);
            return;
        }
        this.playheadView.setOnTouchListener(onTouchListener);
        this.playheadView.setLayoutParams(new RelativeLayout.LayoutParams(getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_playhead_width), this.playheadHeight - this.borderThickWidth));
    }

    public final void setPlayheadVisibility(int i) {
        if (!isTrimming()) {
            this.playheadView.setVisibility(i);
        }
    }

    public final void setPlayheadX(float f) {
        View view = this.playheadView;
        view.setX((f - (((float) view.getWidth()) / 2.0f)) + ((float) getThumbnailViewOffset()));
    }

    public final void setPlayheadXPercentage(float f) {
        Integer endingTimestamp = getEndingTimestamp();
        if (endingTimestamp != null) {
            float intValue = (float) (endingTimestamp.intValue() - getStartingTimestamp());
            float trimmingStartTimestamp = ((float) (this.trimmingController.getTrimmingStartTimestamp() - getStartingTimestamp())) / intValue;
            Integer trimmingEndTimestamp = this.trimmingController.getTrimmingEndTimestamp();
            if (trimmingEndTimestamp != null) {
                float intValue2 = ((float) (trimmingEndTimestamp.intValue() - getStartingTimestamp())) / intValue;
                setPlayheadX((this.currentViewState == ThumbnailViewState.SELECTED ? abpf.a(f, trimmingStartTimestamp, intValue2) : (f - trimmingStartTimestamp) / (intValue2 - trimmingStartTimestamp)) * ((float) getThumbnailViewWidth(false)));
            }
        }
    }

    public final void setSegmentKey(String str) {
        akcr.b(str, "<set-?>");
        this.segmentKey = str;
    }

    public final void setSplitEnabled(boolean z) {
        this.isSplitEnabled = z;
    }

    public final void setSplitting(boolean z) {
        this.isSplitting = z;
    }

    public final void setStartingTimestamp(int i) {
        this.startingTimestamp = i;
    }

    public final void setThumbnailDeletedListener(ThumbnailDeletedListener thumbnailDeletedListener) {
        akcr.b(thumbnailDeletedListener, "deletionListener");
        this.deletedListener = thumbnailDeletedListener;
    }

    public final void setThumbnailViewTrimmingListener(akca<? super String, ? super Integer, ? super Integer, ajxw> akca) {
        this.thumbnailViewTrimmingListener = akca;
    }

    public final void setTrimmingListener(TrimmingListener trimmingListener) {
        this.trimmingListener = trimmingListener;
    }

    public final void setTrimmingTimestamps(Integer num, Integer num2) {
        this.trimmingController.setTrimmingTimestamp(TrimmingType.LEFT, num);
        this.trimmingController.setTrimmingTimestamp(TrimmingType.RIGHT, num2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    public final void updateButtonVisibility(boolean r7) {
        /*
        r6 = this;
        r0 = r6.getEndingTimestamp();
        r1 = 0;
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        r0 = 0;
        goto L_0x001a;
    L_0x0009:
        r0 = r6.getEndingTimestamp();
        if (r0 == 0) goto L_0x0007;
    L_0x000f:
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r2 = r6.getStartingTimestamp();
        r0 = r0 - r2;
    L_0x001a:
        r2 = r6.getEndingTimestamp();
        if (r2 != 0) goto L_0x0022;
    L_0x0020:
        r2 = 0;
        goto L_0x0037;
    L_0x0022:
        r2 = r6.trimmingController;
        r2 = r2.getTrimmingEndTimestamp();
        if (r2 == 0) goto L_0x0020;
    L_0x002a:
        r2 = (java.lang.Number) r2;
        r2 = r2.intValue();
        r3 = r6.trimmingController;
        r3 = r3.getTrimmingStartTimestamp();
        r2 = r2 - r3;
    L_0x0037:
        r3 = r6.isSplitEnabled;
        r4 = 8;
        if (r3 == 0) goto L_0x0049;
    L_0x003d:
        r3 = r6.currentViewState;
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SELECTED;
        if (r3 != r5) goto L_0x0049;
    L_0x0043:
        r3 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        if (r2 <= r3) goto L_0x0049;
    L_0x0047:
        r2 = 0;
        goto L_0x004b;
    L_0x0049:
        r2 = 8;
    L_0x004b:
        r6.setSplitterVisibility(r2);
        r2 = r6.trimmingController;
        r3 = r6.currentViewState;
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SELECTED;
        if (r3 != r5) goto L_0x0060;
    L_0x0056:
        r3 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        if (r0 <= r3) goto L_0x0060;
    L_0x005a:
        r0 = r6.isImage;
        if (r0 != 0) goto L_0x0060;
    L_0x005e:
        r0 = 1;
        goto L_0x0061;
    L_0x0060:
        r0 = 0;
    L_0x0061:
        r2.setTrimmingEnabled(r0, r7);
        r7 = r6.currentViewState;
        r0 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SELECTED;
        if (r7 != r0) goto L_0x006b;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        r1 = 8;
    L_0x006d:
        r6.configureDeleteButtonLayout(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailView.updateButtonVisibility(boolean):void");
    }

    public final void updateThumbnailComposingOperation(ThumbnailComposingOperation thumbnailComposingOperation) {
        ThumbnailComposingOperation thumbnailComposingOperation2 = this.composingOperation;
        if (thumbnailComposingOperation2 == null || !thumbnailComposingOperation2.equals(thumbnailComposingOperation)) {
            thumbnailComposingOperation2 = this.composingOperation;
            if (thumbnailComposingOperation2 != null) {
                thumbnailComposingOperation2.dispose();
            }
            this.composingOperation = thumbnailComposingOperation;
            for (ThumbnailTileResourceBundle compositedBitmap : this.thumbnailBitmaps.values()) {
                kaz compositedBitmap2 = compositedBitmap.getCompositedBitmap();
                if (compositedBitmap2 != null) {
                    compositedBitmap2.dispose();
                }
            }
        }
    }

    public final void updateViewState(ThumbnailViewState thumbnailViewState) {
        akcr.b(thumbnailViewState, "viewState");
        configureStateLayout(thumbnailViewState, true, true);
    }
}
