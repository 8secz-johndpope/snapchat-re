package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class AmrSpecificBox extends AbstractBox {
    public static final String TYPE = "damr";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    static {
        ajc$preClinit();
    }

    public AmrSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AmrSpecificBox.java", AmrSpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.vendor = aqh.a(bArr);
        this.decoderVersion = aqi.a(byteBuffer.get());
        this.modeSet = aqi.c(byteBuffer);
        this.modeChangePeriod = aqi.a(byteBuffer.get());
        this.framesPerSample = aqi.a(byteBuffer.get());
    }

    public void getContent(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) byteBuffer));
        byteBuffer.put(aqh.a(this.vendor));
        aqk.c(byteBuffer, this.decoderVersion);
        aqk.b(byteBuffer, this.modeSet);
        aqk.c(byteBuffer, this.modeChangePeriod);
        aqk.c(byteBuffer, this.framesPerSample);
    }

    public long getContentSize() {
        return 9;
    }

    public int getDecoderVersion() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.decoderVersion;
    }

    public int getFramesPerSample() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.framesPerSample;
    }

    public int getModeChangePeriod() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.modeChangePeriod;
    }

    public int getModeSet() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.modeSet;
    }

    public String getVendor() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.vendor;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmrSpecificBox[vendor=");
        stringBuilder.append(getVendor());
        stringBuilder.append(";decoderVersion=");
        stringBuilder.append(getDecoderVersion());
        stringBuilder.append(";modeSet=");
        stringBuilder.append(getModeSet());
        stringBuilder.append(";modeChangePeriod=");
        stringBuilder.append(getModeChangePeriod());
        stringBuilder.append(";framesPerSample=");
        stringBuilder.append(getFramesPerSample());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
