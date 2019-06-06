package com.coremedia.iso.boxes.apple;

import com.brightcove.player.model.Source.Fields;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", Fields.BIT_RATE, "", "void"), 110);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = aqi.a(byteBuffer);
        this.unknown1 = aqi.a(byteBuffer.get());
        this.sampleSize = aqi.a(byteBuffer.get());
        this.historyMult = aqi.a(byteBuffer.get());
        this.initialHistory = aqi.a(byteBuffer.get());
        this.kModifier = aqi.a(byteBuffer.get());
        this.channels = aqi.a(byteBuffer.get());
        this.unknown2 = aqi.c(byteBuffer);
        this.maxCodedFrameSize = aqi.a(byteBuffer);
        this.bitRate = aqi.a(byteBuffer);
        this.sampleRate = aqi.a(byteBuffer);
    }

    public final long getBitRate() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        return this.bitRate;
    }

    public final int getChannels() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.channels;
    }

    public final void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.maxSamplePerFrame);
        aqk.c(byteBuffer, this.unknown1);
        aqk.c(byteBuffer, this.sampleSize);
        aqk.c(byteBuffer, this.historyMult);
        aqk.c(byteBuffer, this.initialHistory);
        aqk.c(byteBuffer, this.kModifier);
        aqk.c(byteBuffer, this.channels);
        aqk.b(byteBuffer, this.unknown2);
        aqk.b(byteBuffer, this.maxCodedFrameSize);
        aqk.b(byteBuffer, this.bitRate);
        aqk.b(byteBuffer, this.sampleRate);
    }

    public final long getContentSize() {
        return 28;
    }

    public final int getHistoryMult() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.historyMult;
    }

    public final int getInitialHistory() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.initialHistory;
    }

    public final int getKModifier() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.kModifier;
    }

    public final long getMaxCodedFrameSize() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.maxCodedFrameSize;
    }

    public final long getMaxSamplePerFrame() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.maxSamplePerFrame;
    }

    public final long getSampleRate() {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this));
        return this.sampleRate;
    }

    public final int getSampleSize() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.sampleSize;
    }

    public final int getUnknown1() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.unknown1;
    }

    public final int getUnknown2() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.unknown2;
    }

    public final void setBitRate(int i) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, Integer.valueOf(i)));
        this.bitRate = (long) i;
    }

    public final void setChannels(int i) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Integer.valueOf(i)));
        this.channels = i;
    }

    public final void setHistoryMult(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.historyMult = i;
    }

    public final void setInitialHistory(int i) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Integer.valueOf(i)));
        this.initialHistory = i;
    }

    public final void setKModifier(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.kModifier = i;
    }

    public final void setMaxCodedFrameSize(int i) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, Integer.valueOf(i)));
        this.maxCodedFrameSize = (long) i;
    }

    public final void setMaxSamplePerFrame(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.maxSamplePerFrame = (long) i;
    }

    public final void setSampleRate(int i) {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this, Integer.valueOf(i)));
        this.sampleRate = (long) i;
    }

    public final void setSampleSize(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.sampleSize = i;
    }

    public final void setUnknown1(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.unknown1 = i;
    }

    public final void setUnknown2(int i) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, Integer.valueOf(i)));
        this.unknown2 = i;
    }
}
