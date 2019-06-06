package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("BitRateBox.java", BitRateBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 74);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"), 82);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 90);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"), 98);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 106);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"), 114);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = aqi.a(byteBuffer);
        this.maxBitrate = aqi.a(byteBuffer);
        this.avgBitrate = aqi.a(byteBuffer);
    }

    public final long getAvgBitrate() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.avgBitrate;
    }

    public final long getBufferSizeDb() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.bufferSizeDb;
    }

    public final void getContent(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, this.bufferSizeDb);
        aqk.b(byteBuffer, this.maxBitrate);
        aqk.b(byteBuffer, this.avgBitrate);
    }

    public final long getContentSize() {
        return 12;
    }

    public final long getMaxBitrate() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.maxBitrate;
    }

    public final void setAvgBitrate(long j) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, akoc.a(j)));
        this.avgBitrate = j;
    }

    public final void setBufferSizeDb(long j) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, akoc.a(j)));
        this.bufferSizeDb = j;
    }

    public final void setMaxBitrate(long j) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, akoc.a(j)));
        this.maxBitrate = j;
    }
}
