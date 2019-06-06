package com.mp4parser.iso14496.part15;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import defpackage.cgq;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
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
    private static final /* synthetic */ a ajc$tjp_22 = null;
    private static final /* synthetic */ a ajc$tjp_23 = null;
    private static final /* synthetic */ a ajc$tjp_24 = null;
    private static final /* synthetic */ a ajc$tjp_25 = null;
    private static final /* synthetic */ a ajc$tjp_26 = null;
    private static final /* synthetic */ a ajc$tjp_27 = null;
    private static final /* synthetic */ a ajc$tjp_28 = null;
    private static final /* synthetic */ a ajc$tjp_29 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    public cgq avcDecoderConfigurationRecord = new cgq();

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AvcConfigurationBox.java", AvcConfigurationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        ajc$tjp_22 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Event.BOOLEAN), (int) Imgproc.COLOR_BGR2YUV_YV12);
        ajc$tjp_23 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Event.BOOLEAN, "hasExts", "", "void"), 136);
        ajc$tjp_24 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        ajc$tjp_25 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        ajc$tjp_26 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        ajc$tjp_27 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        ajc$tjp_28 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        ajc$tjp_29 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new cgq(byteBuffer);
    }

    public final int getAvcLevelIndication() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.d;
    }

    public final int getAvcProfileIndication() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.b;
    }

    public final int getBitDepthChromaMinus8() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.k;
    }

    public final int getBitDepthLumaMinus8() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.j;
    }

    public final int getChromaFormat() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.i;
    }

    public final int getConfigurationVersion() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.a;
    }

    public final void getContent(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_25, (Object) this, (Object) this, (Object) byteBuffer));
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    public final long getContentSize() {
        cdb.a(akoe.a(ajc$tjp_24, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.a();
    }

    public final int getLengthSizeMinusOne() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.e;
    }

    public final String[] getPPS() {
        cdb.a(akoe.a(ajc$tjp_27, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.b();
    }

    public final List<byte[]> getPictureParameterSets() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.g);
    }

    public final int getProfileCompatibility() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.c;
    }

    public final String[] getSPS() {
        cdb.a(akoe.a(ajc$tjp_26, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public final List<byte[]> getSequenceParameterSetExts() {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.l;
    }

    public final List<byte[]> getSequenceParameterSets() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f);
    }

    public final cgq getavcDecoderConfigurationRecord() {
        cdb.a(akoe.a(ajc$tjp_28, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord;
    }

    public final boolean hasExts() {
        cdb.a(akoe.a(ajc$tjp_22, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.h;
    }

    public final void setAvcLevelIndication(int i) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.d = i;
    }

    public final void setAvcProfileIndication(int i) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.b = i;
    }

    public final void setBitDepthChromaMinus8(int i) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.k = i;
    }

    public final void setBitDepthLumaMinus8(int i) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.j = i;
    }

    public final void setChromaFormat(int i) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.i = i;
    }

    public final void setConfigurationVersion(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.a = i;
    }

    public final void setHasExts(boolean z) {
        cdb.a(akoe.a(ajc$tjp_23, (Object) this, (Object) this, Boolean.valueOf(z)));
        this.avcDecoderConfigurationRecord.h = z;
    }

    public final void setLengthSizeMinusOne(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.e = i;
    }

    public final void setPictureParameterSets(List<byte[]> list) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, (Object) list));
        this.avcDecoderConfigurationRecord.g = list;
    }

    public final void setProfileCompatibility(int i) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Integer.valueOf(i)));
        this.avcDecoderConfigurationRecord.c = i;
    }

    public final void setSequenceParameterSetExts(List<byte[]> list) {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this, (Object) list));
        this.avcDecoderConfigurationRecord.l = list;
    }

    public final void setSequenceParameterSets(List<byte[]> list) {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this, (Object) list));
        this.avcDecoderConfigurationRecord.f = list;
    }

    public final String toString() {
        cdb.a(akoe.a(ajc$tjp_29, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AvcConfigurationBox{avcDecoderConfigurationRecord=");
        stringBuilder.append(this.avcDecoderConfigurationRecord);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
