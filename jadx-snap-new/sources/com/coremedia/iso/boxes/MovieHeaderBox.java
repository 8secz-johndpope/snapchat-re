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
import org.opencv.imgproc.Imgproc;

public class MovieHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mvhd";
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
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private cey matrix = cey.a;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate = 1.0d;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume = 1.0f;

    static {
        ajc$preClinit();
    }

    public MovieHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("MovieHeaderBox.java", MovieHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, EventType.SET_VOLUME, "com.coremedia.iso.boxes.MovieHeaderBox", "float", Event.VOLUME, "", "void"), 226);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        ajc$tjp_22 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        ajc$tjp_23 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        ajc$tjp_24 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        ajc$tjp_25 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        ajc$tjp_26 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        ajc$tjp_27 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        ajc$tjp_28 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), (int) Imgproc.COLOR_COLORCVT_MAX);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", StickerMessageModel.CREATIONTIME, "", "void"), 195);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        long e;
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = cet.a(aqi.e(byteBuffer));
            this.modificationTime = cet.a(aqi.e(byteBuffer));
            this.timescale = aqi.a(byteBuffer);
            e = aqi.e(byteBuffer);
        } else {
            this.creationTime = cet.a(aqi.a(byteBuffer));
            this.modificationTime = cet.a(aqi.a(byteBuffer));
            this.timescale = aqi.a(byteBuffer);
            e = aqi.a(byteBuffer);
        }
        this.duration = e;
        this.rate = aqi.f(byteBuffer);
        this.volume = aqi.h(byteBuffer);
        aqi.c(byteBuffer);
        aqi.a(byteBuffer);
        aqi.a(byteBuffer);
        this.matrix = cey.a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = aqi.a(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            aqk.a(byteBuffer, cet.a(this.creationTime));
            aqk.a(byteBuffer, cet.a(this.modificationTime));
            aqk.b(byteBuffer, this.timescale);
            aqk.a(byteBuffer, this.duration);
        } else {
            aqk.b(byteBuffer, cet.a(this.creationTime));
            aqk.b(byteBuffer, cet.a(this.modificationTime));
            aqk.b(byteBuffer, this.timescale);
            aqk.b(byteBuffer, this.duration);
        }
        aqk.a(byteBuffer, this.rate);
        aqk.c(byteBuffer, (double) this.volume);
        aqk.b(byteBuffer, 0);
        aqk.b(byteBuffer, 0);
        aqk.b(byteBuffer, 0);
        this.matrix.b(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        aqk.b(byteBuffer, this.nextTrackId);
    }

    public long getContentSize() {
        return (getVersion() == 1 ? 32 : 20) + 80;
    }

    public Date getCreationTime() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        cdb.a(akoe.a(ajc$tjp_27, (Object) this, (Object) this));
        return this.currentTime;
    }

    public long getDuration() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public cey getMatrix() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.matrix;
    }

    public Date getModificationTime() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this));
        return this.previewTime;
    }

    public double getRate() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.rate;
    }

    public int getSelectionDuration() {
        cdb.a(akoe.a(ajc$tjp_25, (Object) this, (Object) this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        cdb.a(akoe.a(ajc$tjp_23, (Object) this, (Object) this));
        return this.selectionTime;
    }

    public long getTimescale() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.timescale;
    }

    public float getVolume() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
        if (cet.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i) {
        cdb.a(akoe.a(ajc$tjp_28, (Object) this, (Object) this, Integer.valueOf(i)));
        this.currentTime = i;
    }

    public void setDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this, akoc.a(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(cey cey) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, (Object) cey));
        this.matrix = cey;
    }

    public void setModificationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
        if (cet.a(date) >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j) {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this, akoc.a(j)));
        this.nextTrackId = j;
    }

    public void setPosterTime(int i) {
        cdb.a(akoe.a(ajc$tjp_22, (Object) this, (Object) this, Integer.valueOf(i)));
        this.posterTime = i;
    }

    public void setPreviewDuration(int i) {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this, Integer.valueOf(i)));
        this.previewDuration = i;
    }

    public void setPreviewTime(int i) {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this, Integer.valueOf(i)));
        this.previewTime = i;
    }

    public void setRate(double d) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Double.valueOf(d)));
        this.rate = d;
    }

    public void setSelectionDuration(int i) {
        cdb.a(akoe.a(ajc$tjp_26, (Object) this, (Object) this, Integer.valueOf(i)));
        this.selectionDuration = i;
    }

    public void setSelectionTime(int i) {
        cdb.a(akoe.a(ajc$tjp_24, (Object) this, (Object) this, Integer.valueOf(i)));
        this.selectionTime = i;
    }

    public void setTimescale(long j) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, akoc.a(j)));
        this.timescale = j;
    }

    public void setVolume(float f) {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this, Float.valueOf(f)));
        this.volume = f;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MovieHeaderBox[");
        stringBuilder.append("creationTime=");
        stringBuilder.append(getCreationTime());
        String str = ";";
        stringBuilder.append(str);
        stringBuilder.append("modificationTime=");
        stringBuilder.append(getModificationTime());
        stringBuilder.append(str);
        stringBuilder.append("timescale=");
        stringBuilder.append(getTimescale());
        stringBuilder.append(str);
        stringBuilder.append("duration=");
        stringBuilder.append(getDuration());
        stringBuilder.append(str);
        stringBuilder.append("rate=");
        stringBuilder.append(getRate());
        stringBuilder.append(str);
        stringBuilder.append("volume=");
        stringBuilder.append(getVolume());
        stringBuilder.append(str);
        stringBuilder.append("matrix=");
        stringBuilder.append(this.matrix);
        stringBuilder.append(str);
        stringBuilder.append("nextTrackId=");
        stringBuilder.append(getNextTrackId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
