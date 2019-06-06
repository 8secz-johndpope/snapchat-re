package com.coremedia.iso.boxes;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = aqi.c(byteBuffer);
        this.avgPduSize = aqi.c(byteBuffer);
        this.maxBitrate = aqi.a(byteBuffer);
        this.avgBitrate = aqi.a(byteBuffer);
        aqi.a(byteBuffer);
    }

    public long getAvgBitrate() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.avgPduSize;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.maxPduSize);
        aqk.b(byteBuffer, this.avgPduSize);
        aqk.b(byteBuffer, this.maxBitrate);
        aqk.b(byteBuffer, this.avgBitrate);
        aqk.b(byteBuffer, 0);
    }

    public long getContentSize() {
        return 20;
    }

    public long getMaxBitrate() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.maxPduSize;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("HintMediaHeaderBox{maxPduSize=");
        stringBuilder.append(this.maxPduSize);
        stringBuilder.append(", avgPduSize=");
        stringBuilder.append(this.avgPduSize);
        stringBuilder.append(", maxBitrate=");
        stringBuilder.append(this.maxBitrate);
        stringBuilder.append(", avgBitrate=");
        stringBuilder.append(this.avgBitrate);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
