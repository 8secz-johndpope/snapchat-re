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

public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = "clsf";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ajc$preClinit();
    }

    public ClassificationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ClassificationBox.java", ClassificationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.classificationEntity = aqh.a(bArr);
        this.classificationTableIndex = aqi.c(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.classificationInfo = aqi.d(byteBuffer);
    }

    public String getClassificationEntity() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.classificationTableIndex;
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqh.a(this.classificationEntity));
        aqk.b(byteBuffer, this.classificationTableIndex);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.classificationInfo));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) ((aqn.b(this.classificationInfo) + 8) + 1);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setClassificationEntity(String str) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        this.classificationEntity = str;
    }

    public void setClassificationInfo(String str) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, (Object) str));
        this.classificationInfo = str;
    }

    public void setClassificationTableIndex(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.classificationTableIndex = i;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassificationBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append("classificationEntity=");
        stringBuilder.append(getClassificationEntity());
        stringBuilder.append(";classificationTableIndex=");
        stringBuilder.append(getClassificationTableIndex());
        stringBuilder.append(";language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";classificationInfo=");
        stringBuilder.append(getClassificationInfo());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
