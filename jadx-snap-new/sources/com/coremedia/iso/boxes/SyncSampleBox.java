package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    public SyncSampleBox() {
        super("stss");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SyncSampleBox.java", SyncSampleBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = ces.a(aqi.a(byteBuffer));
        this.sampleNumber = new long[a];
        for (int i = 0; i < a; i++) {
            this.sampleNumber[i] = aqi.a(byteBuffer);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.sampleNumber.length);
        for (long b : this.sampleNumber) {
            aqk.b(byteBuffer, b);
        }
    }

    public long getContentSize() {
        return (long) ((this.sampleNumber.length << 2) + 8);
    }

    public long[] getSampleNumber() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] jArr) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) jArr));
        this.sampleNumber = jArr;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SyncSampleBox[entryCount=");
        stringBuilder.append(this.sampleNumber.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
