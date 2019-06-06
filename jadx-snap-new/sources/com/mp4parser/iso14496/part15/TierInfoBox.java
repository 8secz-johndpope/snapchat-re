package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1 = 0;
    int reserved2 = 0;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TierInfoBox.java", TierInfoBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 113);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 117);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), (int) Imgproc.COLOR_YUV2RGBA_YVYU);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 125);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), (int) Imgproc.COLOR_RGBA2YUV_YV12);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 137);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"), 153);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = aqi.c(byteBuffer);
        this.profileIndication = aqi.a(byteBuffer.get());
        this.profile_compatibility = aqi.a(byteBuffer.get());
        this.levelIndication = aqi.a(byteBuffer.get());
        this.reserved1 = aqi.a(byteBuffer.get());
        this.visualWidth = aqi.c(byteBuffer);
        this.visualHeight = aqi.c(byteBuffer);
        int a = aqi.a(byteBuffer.get());
        this.discardable = (a & 192) >> 6;
        this.constantFrameRate = (a & 48) >> 4;
        this.reserved2 = a & 15;
        this.frameRate = aqi.c(byteBuffer);
    }

    public int getConstantFrameRate() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.constantFrameRate;
    }

    public void getContent(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, this.tierID);
        aqk.c(byteBuffer, this.profileIndication);
        aqk.c(byteBuffer, this.profile_compatibility);
        aqk.c(byteBuffer, this.levelIndication);
        aqk.c(byteBuffer, this.reserved1);
        aqk.b(byteBuffer, this.visualWidth);
        aqk.b(byteBuffer, this.visualHeight);
        aqk.c(byteBuffer, ((this.discardable << 6) + (this.constantFrameRate << 4)) + this.reserved2);
        aqk.b(byteBuffer, this.frameRate);
    }

    public long getContentSize() {
        return 13;
    }

    public int getDiscardable() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.discardable;
    }

    public int getFrameRate() {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.reserved1;
    }

    public int getReserved2() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        return this.reserved2;
    }

    public int getTierID() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.tierID;
    }

    public int getVisualHeight() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, Integer.valueOf(i)));
        this.constantFrameRate = i;
    }

    public void setDiscardable(int i) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, Integer.valueOf(i)));
        this.discardable = i;
    }

    public void setFrameRate(int i) {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this, Integer.valueOf(i)));
        this.frameRate = i;
    }

    public void setLevelIndication(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.levelIndication = i;
    }

    public void setProfileIndication(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.profileIndication = i;
    }

    public void setProfile_compatibility(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.profile_compatibility = i;
    }

    public void setReserved1(int i) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved2 = i;
    }

    public void setTierID(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.tierID = i;
    }

    public void setVisualHeight(int i) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Integer.valueOf(i)));
        this.visualHeight = i;
    }

    public void setVisualWidth(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.visualWidth = i;
    }
}
