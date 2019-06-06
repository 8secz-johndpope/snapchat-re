package com.mp4parser.iso14496.part12;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.opencv.imgproc.Imgproc;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
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
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes = new short[0];

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", Event.INDEX, "", "short"), 57);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 144);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 149);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 123);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 127);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), (int) Imgproc.COLOR_BGR2YUV_YV12);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 136);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 140);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = aqi.j(byteBuffer);
            this.auxInfoTypeParameter = aqi.j(byteBuffer);
        }
        this.defaultSampleInfoSize = (short) aqi.a(byteBuffer.get());
        this.sampleCount = ces.a(aqi.a(byteBuffer));
        if (this.defaultSampleInfoSize == (short) 0) {
            this.sampleInfoSizes = new short[this.sampleCount];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleInfoSizes[i] = (short) aqi.a(byteBuffer.get());
            }
        }
    }

    public String getAuxInfoType() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.auxInfoTypeParameter;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(aqh.a(this.auxInfoType));
            byteBuffer.put(aqh.a(this.auxInfoTypeParameter));
        }
        aqk.c(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize == (short) 0) {
            aqk.b(byteBuffer, (long) this.sampleInfoSizes.length);
            for (int c : this.sampleInfoSizes) {
                aqk.c(byteBuffer, c);
            }
            return;
        }
        aqk.b(byteBuffer, (long) this.sampleCount);
    }

    public long getContentSize() {
        return (long) ((((getFlags() & 1) == 1 ? 12 : 4) + 5) + (this.defaultSampleInfoSize == (short) 0 ? this.sampleInfoSizes.length : 0));
    }

    public int getDefaultSampleInfoSize() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        short[] sArr = this.sampleInfoSizes;
        return Arrays.copyOf(sArr, sArr.length);
    }

    public short getSize(int i) {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this, Integer.valueOf(i)));
        return getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[i] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, Integer.valueOf(i)));
        this.defaultSampleInfoSize = (short) i;
    }

    public void setSampleCount(int i) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, Integer.valueOf(i)));
        this.sampleCount = i;
    }

    public void setSampleInfoSizes(short[] sArr) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, (Object) sArr));
        this.sampleInfoSizes = Arrays.copyOf(sArr, sArr.length);
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        stringBuilder.append(this.defaultSampleInfoSize);
        stringBuilder.append(", sampleCount=");
        stringBuilder.append(this.sampleCount);
        stringBuilder.append(", auxInfoType='");
        stringBuilder.append(this.auxInfoType);
        stringBuilder.append('\'');
        stringBuilder.append(", auxInfoTypeParameter='");
        stringBuilder.append(this.auxInfoTypeParameter);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
