package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class ItemDataBox extends AbstractBox {
    public static final String TYPE = "idat";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    ByteBuffer data = ByteBuffer.allocate(0);

    static {
        ajc$preClinit();
    }

    public ItemDataBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ItemDataBox.java", ItemDataBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getData", "com.coremedia.iso.boxes.ItemDataBox", "", "", "", "java.nio.ByteBuffer"), 19);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setData", "com.coremedia.iso.boxes.ItemDataBox", "java.nio.ByteBuffer", UnlockablesModel.DATA, "", "void"), 23);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    public long getContentSize() {
        return (long) this.data.limit();
    }

    public ByteBuffer getData() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) byteBuffer));
        this.data = byteBuffer;
    }
}
