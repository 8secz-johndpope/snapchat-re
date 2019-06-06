package com.coremedia.iso.boxes;

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
import java.nio.ByteBuffer;
import java.util.Date;

public class MediaHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mdhd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private Date creationTime = new Date();
    private long duration;
    private String language = "eng";
    private Date modificationTime = new Date();
    private long timescale;

    static {
        ajc$preClinit();
    }

    public MediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("MediaHeaderBox.java", MediaHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", StickerMessageModel.CREATIONTIME, "", "void"), 79);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
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
        this.language = aqi.i(byteBuffer);
        aqi.c(byteBuffer);
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
        aqk.a(byteBuffer, this.language);
        aqk.b(byteBuffer, 0);
    }

    public long getContentSize() {
        return ((getVersion() == 1 ? 32 : 20) + 2) + 2;
    }

    public Date getCreationTime() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.creationTime;
    }

    public long getDuration() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.duration;
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.language;
    }

    public Date getModificationTime() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.modificationTime;
    }

    public long getTimescale() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) date));
        this.creationTime = date;
    }

    public void setDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, akoc.a(j)));
        this.duration = j;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setModificationTime(Date date) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, (Object) date));
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, akoc.a(j)));
        this.timescale = j;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaHeaderBox[");
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
        stringBuilder.append("language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
