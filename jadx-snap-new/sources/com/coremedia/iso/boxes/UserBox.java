package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class UserBox extends AbstractBox {
    public static final String TYPE = "uuid";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public UserBox(byte[] bArr) {
        super("uuid", bArr);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("UserBox.java", UserBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"), 47);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setData", "com.coremedia.iso.boxes.UserBox", "[B", UnlockablesModel.DATA, "", "void"), 51);
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
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) bArr));
        this.data = bArr;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("UserBox[type=");
        stringBuilder.append(getType());
        stringBuilder.append(";userType=");
        stringBuilder.append(new String(getUserType()));
        stringBuilder.append(";contentLength=");
        stringBuilder.append(this.data.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
