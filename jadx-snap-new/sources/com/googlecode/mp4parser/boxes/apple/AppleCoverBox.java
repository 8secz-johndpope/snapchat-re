package com.googlecode.mp4parser.boxes.apple;

import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private byte[] data;

    static {
        ajc$preClinit();
    }

    public AppleCoverBox() {
        super("covr", 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AppleCoverBox.java", AppleCoverBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", UnlockablesModel.DATA, "", "void"), 25);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", UnlockablesModel.DATA, "", "void"), 29);
    }

    private void setImageData(byte[] bArr, int i) {
        this.data = bArr;
        this.dataType = i;
    }

    public byte[] getCoverData() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    /* Access modifiers changed, original: protected */
    public int getDataLength() {
        return this.data.length;
    }

    /* Access modifiers changed, original: protected */
    public void parseData(ByteBuffer byteBuffer) {
        this.data = new byte[byteBuffer.limit()];
        byteBuffer.get(this.data);
    }

    public void setJpg(byte[] bArr) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) bArr));
        setImageData(bArr, 13);
    }

    public void setPng(byte[] bArr) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) bArr));
        setImageData(bArr, 14);
    }

    /* Access modifiers changed, original: protected */
    public byte[] writeData() {
        return this.data;
    }
}
