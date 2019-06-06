package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class FreeSpaceBox extends AbstractBox {
    public static final String TYPE = "skip";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public FreeSpaceBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("FreeSpaceBox.java", FreeSpaceBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", UnlockablesModel.DATA, "", "void"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.data);
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    public long getContentSize() {
        return (long) this.data.length;
    }

    public byte[] getData() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.data;
    }

    public void setData(byte[] bArr) {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this, (Object) bArr));
        this.data = bArr;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("FreeSpaceBox[size=");
        stringBuilder.append(this.data.length);
        stringBuilder.append(";type=");
        stringBuilder.append(getType());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
