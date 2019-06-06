package com.googlecode.mp4parser.boxes;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.googlecode.mp4parser.AbstractBox;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cdj;
import defpackage.cdk;
import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static final /* synthetic */ a ajc$tjp_30 = null;
    private static final /* synthetic */ a ajc$tjp_31 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("DTSSpecificBox.java", DTSSpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 89);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), (int) Imgproc.COLOR_RGBA2YUV_YV12);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 137);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 165);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 97);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 169);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 173);
        ajc$tjp_22 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 177);
        ajc$tjp_23 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 181);
        ajc$tjp_24 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 185);
        ajc$tjp_25 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 189);
        ajc$tjp_26 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 193);
        ajc$tjp_27 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 197);
        ajc$tjp_28 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 205);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 209);
        ajc$tjp_31 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 213);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 105);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 113);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 117);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), (int) Imgproc.COLOR_YUV2RGBA_YVYU);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 125);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = aqi.a(byteBuffer);
        this.maxBitRate = aqi.a(byteBuffer);
        this.avgBitRate = aqi.a(byteBuffer);
        this.pcmSampleDepth = aqi.a(byteBuffer.get());
        cdj cdj = new cdj(byteBuffer);
        this.frameDuration = cdj.a(2);
        this.streamConstruction = cdj.a(5);
        this.coreLFEPresent = cdj.a(1);
        this.coreLayout = cdj.a(6);
        this.coreSize = cdj.a(14);
        this.stereoDownmix = cdj.a(1);
        this.representationType = cdj.a(3);
        this.channelLayout = cdj.a(16);
        this.multiAssetFlag = cdj.a(1);
        this.LBRDurationMod = cdj.a(1);
        this.reservedBoxPresent = cdj.a(1);
        this.reserved = cdj.a(5);
    }

    public long getAvgBitRate() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        cdb.a(akoe.a(ajc$tjp_22, (Object) this, (Object) this));
        return this.channelLayout;
    }

    public void getContent(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, this.DTSSamplingFrequency);
        aqk.b(byteBuffer, this.maxBitRate);
        aqk.b(byteBuffer, this.avgBitRate);
        aqk.c(byteBuffer, this.pcmSampleDepth);
        cdk cdk = new cdk(byteBuffer);
        cdk.a(this.frameDuration, 2);
        cdk.a(this.streamConstruction, 5);
        cdk.a(this.coreLFEPresent, 1);
        cdk.a(this.coreLayout, 6);
        cdk.a(this.coreSize, 14);
        cdk.a(this.stereoDownmix, 1);
        cdk.a(this.representationType, 3);
        cdk.a(this.channelLayout, 16);
        cdk.a(this.multiAssetFlag, 1);
        cdk.a(this.LBRDurationMod, 1);
        cdk.a(this.reservedBoxPresent, 1);
        cdk.a(this.reserved, 5);
    }

    public long getContentSize() {
        return 20;
    }

    public int getCoreLFEPresent() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.DTSSamplingFrequency;
    }

    public int[] getDashAudioChannelConfiguration() {
        int i;
        int i2;
        int channelLayout = getChannelLayout();
        if ((channelLayout & 1) == 1) {
            i = 1;
            i2 = 4;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((channelLayout & 2) == 2) {
            i += 2;
            i2 = (i2 | 1) | 2;
        }
        if ((channelLayout & 4) == 4) {
            i += 2;
            i2 = (i2 | 16) | 32;
        }
        if ((channelLayout & 8) == 8) {
            i++;
            i2 |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i++;
            i2 |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i += 2;
            i2 = (i2 | 4096) | 16384;
        }
        if ((channelLayout & 64) == 64) {
            i += 2;
            i2 = (i2 | 16) | 32;
        }
        if ((channelLayout & 128) == 128) {
            i++;
            i2 |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i++;
            i2 |= ItemAnimator.FLAG_MOVED;
        }
        if ((channelLayout & RasterSource.DEFAULT_TILE_SIZE) == RasterSource.DEFAULT_TILE_SIZE) {
            i += 2;
            i2 = (i2 | 64) | 128;
        }
        if ((channelLayout & Imgproc.INTER_TAB_SIZE2) == Imgproc.INTER_TAB_SIZE2) {
            i += 2;
            i2 = (i2 | RasterSource.DEFAULT_TILE_SIZE) | Imgproc.INTER_TAB_SIZE2;
        }
        if ((channelLayout & ItemAnimator.FLAG_MOVED) == ItemAnimator.FLAG_MOVED) {
            i += 2;
            i2 = (i2 | 16) | 32;
        }
        if ((channelLayout & 4096) == 4096) {
            i++;
            i2 |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i += 2;
            i2 = (i2 | 16) | 32;
        }
        if ((channelLayout & 16384) == 16384) {
            i++;
            i2 |= Imgproc.FLOODFILL_FIXED_RANGE;
        }
        if ((32768 & channelLayout) == 32768) {
            i += 2;
            i2 = Imgproc.FLOODFILL_MASK_ONLY | (32768 | i2);
        }
        if ((Imgproc.FLOODFILL_FIXED_RANGE & channelLayout) == Imgproc.FLOODFILL_FIXED_RANGE) {
            i++;
        }
        if ((channelLayout & Imgproc.FLOODFILL_MASK_ONLY) == Imgproc.FLOODFILL_MASK_ONLY) {
            i += 2;
        }
        return new int[]{i, i2};
    }

    public int getFrameDuration() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        cdb.a(akoe.a(ajc$tjp_26, (Object) this, (Object) this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        cdb.a(akoe.a(ajc$tjp_24, (Object) this, (Object) this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this));
        return this.representationType;
    }

    public int getReserved() {
        cdb.a(akoe.a(ajc$tjp_28, (Object) this, (Object) this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        cdb.a(akoe.a(ajc$tjp_30, (Object) this, (Object) this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, akoc.a(j)));
        this.avgBitRate = j;
    }

    public void setChannelLayout(int i) {
        cdb.a(akoe.a(ajc$tjp_23, (Object) this, (Object) this, Integer.valueOf(i)));
        this.channelLayout = i;
    }

    public void setCoreLFEPresent(int i) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Integer.valueOf(i)));
        this.coreLFEPresent = i;
    }

    public void setCoreLayout(int i) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, Integer.valueOf(i)));
        this.coreLayout = i;
    }

    public void setCoreSize(int i) {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this, Integer.valueOf(i)));
        this.coreSize = i;
    }

    public void setDTSSamplingFrequency(long j) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, akoc.a(j)));
        this.DTSSamplingFrequency = j;
    }

    public void setFrameDuration(int i) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Integer.valueOf(i)));
        this.frameDuration = i;
    }

    public void setLBRDurationMod(int i) {
        cdb.a(akoe.a(ajc$tjp_27, (Object) this, (Object) this, Integer.valueOf(i)));
        this.LBRDurationMod = i;
    }

    public void setMaxBitRate(long j) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, akoc.a(j)));
        this.maxBitRate = j;
    }

    public void setMultiAssetFlag(int i) {
        cdb.a(akoe.a(ajc$tjp_25, (Object) this, (Object) this, Integer.valueOf(i)));
        this.multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.pcmSampleDepth = i;
    }

    public void setRepresentationType(int i) {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this, Integer.valueOf(i)));
        this.representationType = i;
    }

    public void setReserved(int i) {
        cdb.a(akoe.a(ajc$tjp_29, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved = i;
    }

    public void setReservedBoxPresent(int i) {
        cdb.a(akoe.a(ajc$tjp_31, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i) {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this, Integer.valueOf(i)));
        this.stereoDownmix = i;
    }

    public void setStreamConstruction(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.streamConstruction = i;
    }
}
