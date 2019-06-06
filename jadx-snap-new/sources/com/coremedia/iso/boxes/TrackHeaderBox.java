package com.coremedia.iso.boxes;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.StickerMessageModel;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cet;
import defpackage.cey;
import java.nio.ByteBuffer;
import java.util.Date;

public class TrackHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tkhd";
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
    private static final /* synthetic */ a ajc$tjp_22 = null;
    private static final /* synthetic */ a ajc$tjp_23 = null;
    private static final /* synthetic */ a ajc$tjp_24 = null;
    private static final /* synthetic */ a ajc$tjp_25 = null;
    private static final /* synthetic */ a ajc$tjp_26 = null;
    private static final /* synthetic */ a ajc$tjp_27 = null;
    private static final /* synthetic */ a ajc$tjp_28 = null;
    private static final /* synthetic */ a ajc$tjp_29 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private cey matrix = cey.a;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
    }

    public TrackHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackHeaderBox.java", TrackHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", StickerMessageModel.CREATIONTIME, "", "void"), 196);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, EventType.SET_VOLUME, "com.coremedia.iso.boxes.TrackHeaderBox", "float", Event.VOLUME, "", "void"), 230);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        ajc$tjp_22 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Event.BOOLEAN), 247);
        ajc$tjp_23 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Event.BOOLEAN), 251);
        ajc$tjp_24 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Event.BOOLEAN), 255);
        ajc$tjp_25 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Event.BOOLEAN), 259);
        ajc$tjp_26 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", Event.BOOLEAN, "enabled", "", "void"), 263);
        ajc$tjp_27 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", Event.BOOLEAN, "inMovie", "", "void"), 271);
        ajc$tjp_28 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", Event.BOOLEAN, "inPreview", "", "void"), 279);
        ajc$tjp_29 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", Event.BOOLEAN, "inPoster", "", "void"), 287);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = cet.a(aqi.e(byteBuffer));
            this.modificationTime = cet.a(aqi.e(byteBuffer));
            this.trackId = aqi.a(byteBuffer);
            aqi.a(byteBuffer);
            this.duration = byteBuffer.getLong();
            if (this.duration < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        }
        this.creationTime = cet.a(aqi.a(byteBuffer));
        this.modificationTime = cet.a(aqi.a(byteBuffer));
        this.trackId = aqi.a(byteBuffer);
        aqi.a(byteBuffer);
        this.duration = aqi.a(byteBuffer);
        aqi.a(byteBuffer);
        aqi.a(byteBuffer);
        this.layer = aqi.c(byteBuffer);
        this.alternateGroup = aqi.c(byteBuffer);
        this.volume = aqi.h(byteBuffer);
        aqi.c(byteBuffer);
        this.matrix = cey.a(byteBuffer);
        this.width = aqi.f(byteBuffer);
        this.height = aqi.f(byteBuffer);
    }

    public int getAlternateGroup() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.alternateGroup;
    }

    public void getContent(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, (Object) byteBuffer));
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            aqk.a(byteBuffer, cet.a(this.creationTime));
            aqk.a(byteBuffer, cet.a(this.modificationTime));
            aqk.b(byteBuffer, this.trackId);
            aqk.b(byteBuffer, 0);
            aqk.a(byteBuffer, this.duration);
        } else {
            aqk.b(byteBuffer, cet.a(this.creationTime));
            aqk.b(byteBuffer, cet.a(this.modificationTime));
            aqk.b(byteBuffer, this.trackId);
            aqk.b(byteBuffer, 0);
            aqk.b(byteBuffer, this.duration);
        }
        aqk.b(byteBuffer, 0);
        aqk.b(byteBuffer, 0);
        aqk.b(byteBuffer, this.layer);
        aqk.b(byteBuffer, this.alternateGroup);
        aqk.c(byteBuffer, (double) this.volume);
        aqk.b(byteBuffer, 0);
        this.matrix.b(byteBuffer);
        aqk.a(byteBuffer, this.width);
        aqk.a(byteBuffer, this.height);
    }

    public long getContentSize() {
        return (getVersion() == 1 ? 36 : 24) + 60;
    }

    public Date getCreationTime() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public long getDuration() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public double getHeight() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return this.height;
    }

    public int getLayer() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.layer;
    }

    public cey getMatrix() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.matrix;
    }

    public Date getModificationTime() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getTrackId() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.trackId;
    }

    public float getVolume() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.volume;
    }

    public double getWidth() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.width;
    }

    public boolean isEnabled() {
        cdb.a(akoe.a(ajc$tjp_22, (Object) this, (Object) this));
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        cdb.a(akoe.a(ajc$tjp_23, (Object) this, (Object) this));
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        cdb.a(akoe.a(ajc$tjp_25, (Object) this, (Object) this));
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        cdb.a(akoe.a(ajc$tjp_24, (Object) this, (Object) this));
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, Integer.valueOf(i)));
        this.alternateGroup = i;
    }

    public void setCreationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
        if (cet.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, akoc.a(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        cdb.a(akoe.a(ajc$tjp_26, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 1 : getFlags() & -2);
    }

    public void setHeight(double d) {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this, Double.valueOf(d)));
        this.height = d;
    }

    public void setInMovie(boolean z) {
        cdb.a(akoe.a(ajc$tjp_27, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 2 : getFlags() & -3);
    }

    public void setInPoster(boolean z) {
        cdb.a(akoe.a(ajc$tjp_29, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 8 : getFlags() & -9);
    }

    public void setInPreview(boolean z) {
        cdb.a(akoe.a(ajc$tjp_28, (Object) this, (Object) this, Boolean.valueOf(z)));
        setFlags(z ? getFlags() | 4 : getFlags() & -5);
    }

    public void setLayer(int i) {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this, Integer.valueOf(i)));
        this.layer = i;
    }

    public void setMatrix(cey cey) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, (Object) cey));
        this.matrix = cey;
    }

    public void setModificationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
        if (cet.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setTrackId(long j) {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this, akoc.a(j)));
        this.trackId = j;
    }

    public void setVolume(float f) {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this, Float.valueOf(f)));
        this.volume = f;
    }

    public void setWidth(double d) {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this, Double.valueOf(d)));
        this.width = d;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackHeaderBox[");
        stringBuilder.append("creationTime=");
        stringBuilder.append(getCreationTime());
        String str = ";";
        stringBuilder.append(str);
        stringBuilder.append("modificationTime=");
        stringBuilder.append(getModificationTime());
        stringBuilder.append(str);
        stringBuilder.append("trackId=");
        stringBuilder.append(getTrackId());
        stringBuilder.append(str);
        stringBuilder.append("duration=");
        stringBuilder.append(getDuration());
        stringBuilder.append(str);
        stringBuilder.append("layer=");
        stringBuilder.append(getLayer());
        stringBuilder.append(str);
        stringBuilder.append("alternateGroup=");
        stringBuilder.append(getAlternateGroup());
        stringBuilder.append(str);
        stringBuilder.append("volume=");
        stringBuilder.append(getVolume());
        stringBuilder.append(str);
        stringBuilder.append("matrix=");
        stringBuilder.append(this.matrix);
        stringBuilder.append(str);
        stringBuilder.append("width=");
        stringBuilder.append(getWidth());
        stringBuilder.append(str);
        stringBuilder.append("height=");
        stringBuilder.append(getHeight());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
