package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class TfxdBox extends AbstractFullBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        ajc$preClinit();
    }

    public TfxdBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TfxdBox.java", TfxdBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 79);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 83);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        long e;
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.fragmentAbsoluteTime = aqi.e(byteBuffer);
            e = aqi.e(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = aqi.a(byteBuffer);
            e = aqi.a(byteBuffer);
        }
        this.fragmentAbsoluteDuration = e;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            aqk.a(byteBuffer, this.fragmentAbsoluteTime);
            aqk.a(byteBuffer, this.fragmentAbsoluteDuration);
            return;
        }
        aqk.b(byteBuffer, this.fragmentAbsoluteTime);
        aqk.b(byteBuffer, this.fragmentAbsoluteDuration);
    }

    public long getContentSize() {
        return (long) (getVersion() == 1 ? 20 : 12);
    }

    public long getFragmentAbsoluteDuration() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.fragmentAbsoluteTime;
    }

    public byte[] getUserType() {
        return new byte[]{(byte) 109, (byte) 29, (byte) -101, (byte) 5, (byte) 66, (byte) -43, (byte) 68, (byte) -26, Byte.MIN_VALUE, (byte) -30, (byte) 20, (byte) 29, (byte) -81, (byte) -9, (byte) 87, (byte) -78};
    }
}
