package com.coremedia.iso.boxes.fragment;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqq;
import defpackage.cdb;
import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_14 = null;
    private static final /* synthetic */ a ajc$tjp_15 = null;
    private static final /* synthetic */ a ajc$tjp_16 = null;
    private static final /* synthetic */ a ajc$tjp_17 = null;
    private static final /* synthetic */ a ajc$tjp_18 = null;
    private static final /* synthetic */ a ajc$tjp_19 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_20 = null;
    private static final /* synthetic */ a ajc$tjp_21 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private long baseDataOffset = -1;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration = -1;
    private aqq defaultSampleFlags;
    private long defaultSampleSize = -1;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 126);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 130);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 170);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 174);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 178);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 182);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 191);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), (int) Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 205);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 210);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Event.BOOLEAN, "durationIsEmpty", "", "void"), 215);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), (int) Imgproc.COLOR_BGRA2YUV_YV12);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Event.BOOLEAN, "defaultBaseIsMoof", "", "void"), 220);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 226);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 138);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Event.BOOLEAN), 142);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 146);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), (int) MapboxConstants.ANIMATION_DURATION_SHORT);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 154);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 158);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 162);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = aqi.a(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = aqi.e(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = aqi.a(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = aqi.a(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = aqi.a(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new aqq(byteBuffer);
        }
        if ((getFlags() & Imgproc.FLOODFILL_FIXED_RANGE) == Imgproc.FLOODFILL_FIXED_RANGE) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & Imgproc.FLOODFILL_MASK_ONLY) == Imgproc.FLOODFILL_MASK_ONLY) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.baseDataOffset;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.trackId);
        if ((getFlags() & 1) == 1) {
            aqk.a(byteBuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            aqk.b(byteBuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            aqk.b(byteBuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            aqk.b(byteBuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.a(byteBuffer);
        }
    }

    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 16 : 8;
        if ((flags & 2) == 2) {
            j += 4;
        }
        if ((flags & 8) == 8) {
            j += 4;
        }
        if ((flags & 16) == 16) {
            j += 4;
        }
        return (flags & 32) == 32 ? j + 4 : j;
    }

    public long getDefaultSampleDuration() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.defaultSampleDuration;
    }

    public aqq getDefaultSampleFlags() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j) {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this, akoc.a(j)));
        setFlags(j == -1 ? getFlags() & 2147483646 : getFlags() | 1);
        this.baseDataOffset = j;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(getFlags() | Imgproc.FLOODFILL_MASK_ONLY);
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this, akoc.a(j)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(aqq aqq) {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this, (Object) aqq));
        setFlags(getFlags() | 32);
        this.defaultSampleFlags = aqq;
    }

    public void setDefaultSampleSize(long j) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, akoc.a(j)));
        setFlags(getFlags() | 16);
        this.defaultSampleSize = j;
    }

    public void setDurationIsEmpty(boolean z) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(getFlags() | Imgproc.FLOODFILL_FIXED_RANGE);
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long j) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, akoc.a(j)));
        setFlags(j == -1 ? getFlags() & 2147483645 : getFlags() | 2);
        this.sampleDescriptionIndex = j;
    }

    public void setTrackId(long j) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, akoc.a(j)));
        this.trackId = j;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackFragmentHeaderBox");
        stringBuilder.append("{trackId=");
        stringBuilder.append(this.trackId);
        stringBuilder.append(", baseDataOffset=");
        stringBuilder.append(this.baseDataOffset);
        stringBuilder.append(", sampleDescriptionIndex=");
        stringBuilder.append(this.sampleDescriptionIndex);
        stringBuilder.append(", defaultSampleDuration=");
        stringBuilder.append(this.defaultSampleDuration);
        stringBuilder.append(", defaultSampleSize=");
        stringBuilder.append(this.defaultSampleSize);
        stringBuilder.append(", defaultSampleFlags=");
        stringBuilder.append(this.defaultSampleFlags);
        stringBuilder.append(", durationIsEmpty=");
        stringBuilder.append(this.durationIsEmpty);
        stringBuilder.append(", defaultBaseIsMoof=");
        stringBuilder.append(this.defaultBaseIsMoof);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
