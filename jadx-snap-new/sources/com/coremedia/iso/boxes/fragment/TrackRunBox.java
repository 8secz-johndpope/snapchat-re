package com.coremedia.iso.boxes.fragment;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqq;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_10 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_11 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_12 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_13 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_14 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_15 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_16 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_17 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_18 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_19 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_3 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_4 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_5 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_6 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_7 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_8 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_9 = null;
    private int dataOffset;
    private List<a> entries = new ArrayList();
    private aqq firstSampleFlags;

    public static class a {
        long a;
        long b;
        aqq c;
        long d;

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{duration=");
            stringBuilder.append(this.a);
            stringBuilder.append(", size=");
            stringBuilder.append(this.b);
            stringBuilder.append(", dlags=");
            stringBuilder.append(this.c);
            stringBuilder.append(", compTimeOffset=");
            stringBuilder.append(this.d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackRunBox.java", TrackRunBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 120);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Event.BOOLEAN, "v", "", "void"), 271);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Event.BOOLEAN, "v", "", "void"), 279);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Event.BOOLEAN, "v", "", "void"), 287);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Event.BOOLEAN, "v", "", "void"), 296);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Event.BOOLEAN, "v", "", "void"), 304);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 313);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 317);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 321);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 331);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 346);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 242);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 246);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 250);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 255);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 259);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 263);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Event.BOOLEAN), 267);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long a = aqi.a(byteBuffer);
        this.dataOffset = (getFlags() & 1) == 1 ? ces.a(aqi.a(byteBuffer)) : -1;
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new aqq(byteBuffer);
        }
        for (int i = 0; ((long) i) < a; i++) {
            a aVar = new a();
            if ((getFlags() & 256) == 256) {
                aVar.a = aqi.a(byteBuffer);
            }
            if ((getFlags() & RasterSource.DEFAULT_TILE_SIZE) == RasterSource.DEFAULT_TILE_SIZE) {
                aVar.b = aqi.a(byteBuffer);
            }
            if ((getFlags() & Imgproc.INTER_TAB_SIZE2) == Imgproc.INTER_TAB_SIZE2) {
                aVar.c = new aqq(byteBuffer);
            }
            if ((getFlags() & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                aVar.d = getVersion() == 0 ? aqi.a(byteBuffer) : (long) byteBuffer.getInt();
            }
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            aqk.b(byteBuffer, (long) this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.a(byteBuffer);
        }
        for (a aVar : this.entries) {
            if ((flags & 256) == 256) {
                aqk.b(byteBuffer, aVar.a);
            }
            if ((flags & RasterSource.DEFAULT_TILE_SIZE) == RasterSource.DEFAULT_TILE_SIZE) {
                aqk.b(byteBuffer, aVar.b);
            }
            if ((flags & Imgproc.INTER_TAB_SIZE2) == Imgproc.INTER_TAB_SIZE2) {
                aVar.c.a(byteBuffer);
            }
            if ((flags & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
                if (getVersion() == 0) {
                    aqk.b(byteBuffer, aVar.d);
                } else {
                    byteBuffer.putInt((int) aVar.d);
                }
            }
        }
    }

    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12 : 8;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = 0;
        if ((flags & 256) == 256) {
            j2 = 4;
        }
        if ((flags & RasterSource.DEFAULT_TILE_SIZE) == RasterSource.DEFAULT_TILE_SIZE) {
            j2 += 4;
        }
        if ((flags & Imgproc.INTER_TAB_SIZE2) == Imgproc.INTER_TAB_SIZE2) {
            j2 += 4;
        }
        if ((flags & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
            j2 += 4;
        }
        return j + (j2 * ((long) this.entries.size()));
    }

    public int getDataOffset() {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this));
        return this.dataOffset;
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public aqq getFirstSampleFlags() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        long[] jArr = new long[this.entries.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = ((a) this.entries.get(i)).d;
        }
        return jArr;
    }

    public long getSampleCount() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return (getFlags() & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED;
    }

    public boolean isSampleDurationPresent() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return (getFlags() & Imgproc.INTER_TAB_SIZE2) == Imgproc.INTER_TAB_SIZE2;
    }

    public boolean isSampleSizePresent() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return (getFlags() & RasterSource.DEFAULT_TILE_SIZE) == RasterSource.DEFAULT_TILE_SIZE;
    }

    public void setDataOffset(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        setFlags(i == -1 ? getFlags() & 16777214 : getFlags() | 1);
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 1 : getFlags() & 16777214);
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setFirstSampleFlags(aqq aqq) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, (Object) aqq));
        setFlags(aqq == null ? getFlags() & 16777211 : getFlags() | 4);
        this.firstSampleFlags = aqq;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | ItemAnimator.FLAG_MOVED : getFlags() & 16775167);
    }

    public void setSampleDurationPresent(boolean z) {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 256 : getFlags() & 16776959);
    }

    public void setSampleFlagsPresent(boolean z) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | Imgproc.INTER_TAB_SIZE2 : getFlags() & 16776191);
    }

    public void setSampleSizePresent(boolean z) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | RasterSource.DEFAULT_TILE_SIZE : getFlags() & 16776703);
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackRunBox");
        stringBuilder.append("{sampleCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append(", dataOffset=");
        stringBuilder.append(this.dataOffset);
        stringBuilder.append(", dataOffsetPresent=");
        stringBuilder.append(isDataOffsetPresent());
        stringBuilder.append(", sampleSizePresent=");
        stringBuilder.append(isSampleSizePresent());
        stringBuilder.append(", sampleDurationPresent=");
        stringBuilder.append(isSampleDurationPresent());
        stringBuilder.append(", sampleFlagsPresentPresent=");
        stringBuilder.append(isSampleFlagsPresent());
        stringBuilder.append(", sampleCompositionTimeOffsetPresent=");
        stringBuilder.append(isSampleCompositionTimeOffsetPresent());
        stringBuilder.append(", firstSampleFlags=");
        stringBuilder.append(this.firstSampleFlags);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
