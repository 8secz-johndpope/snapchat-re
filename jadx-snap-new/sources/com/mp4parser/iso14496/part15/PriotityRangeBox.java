package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class PriotityRangeBox extends AbstractBox {
    public static final String TYPE = "svpr";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    int max_priorityId;
    int min_priorityId;
    int reserved1 = 0;
    int reserved2 = 0;

    static {
        ajc$preClinit();
    }

    public PriotityRangeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("PriotityRangeBox.java", PriotityRangeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 45);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"), 49);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 53);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"), 57);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 61);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"), 65);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 69);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"), 73);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.min_priorityId = aqi.a(byteBuffer.get());
        int i = this.min_priorityId;
        this.reserved1 = (i & 192) >> 6;
        this.min_priorityId = i & 63;
        this.max_priorityId = aqi.a(byteBuffer.get());
        int i2 = this.max_priorityId;
        this.reserved2 = (i2 & 192) >> 6;
        this.max_priorityId = i2 & 63;
    }

    public void getContent(ByteBuffer byteBuffer) {
        aqk.c(byteBuffer, (this.reserved1 << 6) + this.min_priorityId);
        aqk.c(byteBuffer, (this.reserved2 << 6) + this.max_priorityId);
    }

    public long getContentSize() {
        return 2;
    }

    public int getMax_priorityId() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.min_priorityId;
    }

    public int getReserved1() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.reserved1;
    }

    public int getReserved2() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.reserved2;
    }

    public void setMax_priorityId(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.max_priorityId = i;
    }

    public void setMin_priorityId(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.min_priorityId = i;
    }

    public void setReserved1(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved2 = i;
    }
}
