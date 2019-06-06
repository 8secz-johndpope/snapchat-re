package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import defpackage.cdj;
import defpackage.cdk;
import java.nio.ByteBuffer;

public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_14 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AC3SpecificBox.java", AC3SpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 55);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 95);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 103);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 63);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 71);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 79);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 87);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        cdj cdj = new cdj(byteBuffer);
        this.fscod = cdj.a(2);
        this.bsid = cdj.a(5);
        this.bsmod = cdj.a(3);
        this.acmod = cdj.a(3);
        this.lfeon = cdj.a(1);
        this.bitRateCode = cdj.a(5);
        this.reserved = cdj.a(5);
    }

    public int getAcmod() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.acmod;
    }

    public int getBitRateCode() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.bitRateCode;
    }

    public int getBsid() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.bsid;
    }

    public int getBsmod() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.bsmod;
    }

    public void getContent(ByteBuffer byteBuffer) {
        cdk cdk = new cdk(byteBuffer);
        cdk.a(this.fscod, 2);
        cdk.a(this.bsid, 5);
        cdk.a(this.bsmod, 3);
        cdk.a(this.acmod, 3);
        cdk.a(this.lfeon, 1);
        cdk.a(this.bitRateCode, 5);
        cdk.a(this.reserved, 5);
    }

    public long getContentSize() {
        return 3;
    }

    public int getFscod() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.fscod;
    }

    public int getLfeon() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.lfeon;
    }

    public int getReserved() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.reserved;
    }

    public void setAcmod(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.bsid = i;
    }

    public void setBsmod(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.bsmod = i;
    }

    public void setFscod(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.fscod = i;
    }

    public void setLfeon(int i) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Integer.valueOf(i)));
        this.lfeon = i;
    }

    public void setReserved(int i) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved = i;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AC3SpecificBox{fscod=");
        stringBuilder.append(this.fscod);
        stringBuilder.append(", bsid=");
        stringBuilder.append(this.bsid);
        stringBuilder.append(", bsmod=");
        stringBuilder.append(this.bsmod);
        stringBuilder.append(", acmod=");
        stringBuilder.append(this.acmod);
        stringBuilder.append(", lfeon=");
        stringBuilder.append(this.lfeon);
        stringBuilder.append(", bitRateCode=");
        stringBuilder.append(this.bitRateCode);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
