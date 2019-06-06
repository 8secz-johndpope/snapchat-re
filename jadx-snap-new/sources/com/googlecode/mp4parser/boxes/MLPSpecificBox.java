package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import defpackage.cdj;
import defpackage.cdk;
import java.nio.ByteBuffer;

public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("MLPSpecificBox.java", MLPSpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 65);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        cdj cdj = new cdj(byteBuffer);
        this.format_info = cdj.a(32);
        this.peak_data_rate = cdj.a(15);
        this.reserved = cdj.a(1);
        this.reserved2 = cdj.a(32);
    }

    public void getContent(ByteBuffer byteBuffer) {
        cdk cdk = new cdk(byteBuffer);
        cdk.a(this.format_info, 32);
        cdk.a(this.peak_data_rate, 15);
        cdk.a(this.reserved, 1);
        cdk.a(this.reserved2, 32);
    }

    public long getContentSize() {
        return 10;
    }

    public int getFormat_info() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.reserved;
    }

    public int getReserved2() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.reserved2;
    }

    public void setFormat_info(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.format_info = i;
    }

    public void setPeak_data_rate(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.peak_data_rate = i;
    }

    public void setReserved(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved = i;
    }

    public void setReserved2(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved2 = i;
    }
}
