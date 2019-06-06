package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = "tibr";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        ajc$preClinit();
    }

    public TierBitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TierBitRateBox.java", TierBitRateBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 52);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"), 56);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 92);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"), 96);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 60);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"), 64);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 68);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"), 72);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 76);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"), 80);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 84);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"), 88);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = aqi.a(byteBuffer);
        this.maxBitRate = aqi.a(byteBuffer);
        this.avgBitRate = aqi.a(byteBuffer);
        this.tierBaseBitRate = aqi.a(byteBuffer);
        this.tierMaxBitRate = aqi.a(byteBuffer);
        this.tierAvgBitRate = aqi.a(byteBuffer);
    }

    public long getAvgBitRate() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.baseBitRate;
    }

    public void getContent(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, this.baseBitRate);
        aqk.b(byteBuffer, this.maxBitRate);
        aqk.b(byteBuffer, this.avgBitRate);
        aqk.b(byteBuffer, this.tierBaseBitRate);
        aqk.b(byteBuffer, this.tierMaxBitRate);
        aqk.b(byteBuffer, this.tierAvgBitRate);
    }

    public long getContentSize() {
        return 24;
    }

    public long getMaxBitRate() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, akoc.a(j)));
        this.avgBitRate = j;
    }

    public void setBaseBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, akoc.a(j)));
        this.baseBitRate = j;
    }

    public void setMaxBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, akoc.a(j)));
        this.maxBitRate = j;
    }

    public void setTierAvgBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, akoc.a(j)));
        this.tierAvgBitRate = j;
    }

    public void setTierBaseBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, akoc.a(j)));
        this.tierBaseBitRate = j;
    }

    public void setTierMaxBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, akoc.a(j)));
        this.tierMaxBitRate = j;
    }
}
