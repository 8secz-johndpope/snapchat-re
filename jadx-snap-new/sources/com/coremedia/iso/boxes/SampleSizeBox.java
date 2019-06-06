package com.coremedia.iso.boxes;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes = new long[0];

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SampleSizeBox.java", SampleSizeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", Event.INDEX, "", "long"), 59);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = aqi.a(byteBuffer);
        this.sampleCount = ces.a(aqi.a(byteBuffer));
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[this.sampleCount];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleSizes[i] = aqi.a(byteBuffer);
            }
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.sampleSize);
        if (this.sampleSize == 0) {
            aqk.b(byteBuffer, (long) this.sampleSizes.length);
            for (long b : this.sampleSizes) {
                aqk.b(byteBuffer, b);
            }
            return;
        }
        aqk.b(byteBuffer, (long) this.sampleCount);
    }

    public long getContentSize() {
        return (long) ((this.sampleSize == 0 ? this.sampleSizes.length << 2 : 0) + 12);
    }

    public long getSampleCount() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return (long) (this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length);
    }

    public long getSampleSize() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, Integer.valueOf(i)));
        long j = this.sampleSize;
        return j > 0 ? j : this.sampleSizes[i];
    }

    public long[] getSampleSizes() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, akoc.a(j)));
        this.sampleSize = j;
    }

    public void setSampleSizes(long[] jArr) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleSizeBox[sampleSize=");
        stringBuilder.append(getSampleSize());
        stringBuilder.append(";sampleCount=");
        stringBuilder.append(getSampleCount());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
