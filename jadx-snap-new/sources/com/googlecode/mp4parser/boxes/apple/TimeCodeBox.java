package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

public class TimeCodeBox extends AbstractBox implements SampleEntry {
    public static final String TYPE = "tmcd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_14 = null;
    private static final /* synthetic */ a ajc$tjp_15 = null;
    private static final /* synthetic */ a ajc$tjp_16 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest = new byte[0];
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TimeCodeBox.java", TimeCodeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 81);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 85);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 130);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), (int) Imgproc.COLOR_BGRA2YUV_YV12);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 138);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 142);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 146);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), (int) MapboxConstants.ANIMATION_DURATION_SHORT);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 154);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 102);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 106);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 110);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 114);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 118);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), (int) Imgproc.COLOR_YUV2BGRA_YVYU);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 126);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = aqi.a(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = aqi.a(byteBuffer.get());
        this.reserved2 = aqi.b(byteBuffer);
        this.rest = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.rest);
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        aqk.b(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        aqk.b(byteBuffer, this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        aqk.c(byteBuffer, this.numberOfFrames);
        aqk.a(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    public long getContentSize() {
        return (long) (this.rest.length + 28);
    }

    public int getDataReferenceIndex() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this));
        return this.flags;
    }

    public int getFrameDuration() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return this.reserved1;
    }

    public int getReserved2() {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this));
        return this.reserved2;
    }

    public byte[] getRest() {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this));
        return this.rest;
    }

    public int getTimeScale() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.timeScale;
    }

    public void setDataReferenceIndex(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.dataReferenceIndex = i;
    }

    public void setFlags(long j) {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this, akoc.a(j)));
        this.flags = j;
    }

    public void setFrameDuration(int i) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, Integer.valueOf(i)));
        this.frameDuration = i;
    }

    public void setNumberOfFrames(int i) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, Integer.valueOf(i)));
        this.numberOfFrames = i;
    }

    public void setReserved1(int i) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved2 = i;
    }

    public void setRest(byte[] bArr) {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this, (Object) bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, Integer.valueOf(i)));
        this.timeScale = i;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TimeCodeBox{timeScale=");
        stringBuilder.append(this.timeScale);
        stringBuilder.append(", frameDuration=");
        stringBuilder.append(this.frameDuration);
        stringBuilder.append(", numberOfFrames=");
        stringBuilder.append(this.numberOfFrames);
        stringBuilder.append(", reserved1=");
        stringBuilder.append(this.reserved1);
        stringBuilder.append(", reserved2=");
        stringBuilder.append(this.reserved2);
        stringBuilder.append(", flags=");
        stringBuilder.append(this.flags);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
