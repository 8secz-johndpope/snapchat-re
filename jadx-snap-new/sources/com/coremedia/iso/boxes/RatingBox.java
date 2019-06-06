package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class RatingBox extends AbstractFullBox {
    public static final String TYPE = "rtng";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        ajc$preClinit();
    }

    public RatingBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("RatingBox.java", RatingBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.ratingEntity = aqi.j(byteBuffer);
        this.ratingCriteria = aqi.j(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.ratingInfo = aqi.d(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqh.a(this.ratingEntity));
        byteBuffer.put(aqh.a(this.ratingCriteria));
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.ratingInfo));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) (aqn.b(this.ratingInfo) + 15);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.language;
    }

    public String getRatingCriteria() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.ratingInfo;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setRatingCriteria(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.ratingCriteria = str;
    }

    public void setRatingEntity(String str) {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this, (Object) str));
        this.ratingEntity = str;
    }

    public void setRatingInfo(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.ratingInfo = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RatingBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("ratingEntity=");
        stringBuilder.append(getRatingEntity());
        stringBuilder.append(";ratingCriteria=");
        stringBuilder.append(getRatingCriteria());
        stringBuilder.append(";language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";ratingInfo=");
        stringBuilder.append(getRatingInfo());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
