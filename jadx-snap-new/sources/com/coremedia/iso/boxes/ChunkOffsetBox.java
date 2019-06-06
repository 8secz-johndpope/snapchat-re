package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;

public abstract class ChunkOffsetBox extends AbstractFullBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public ChunkOffsetBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ChunkOffsetBox.java", ChunkOffsetBox.class);
        ajc$tjp_0 = akoe.a("method-execution", akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 17);
    }

    public abstract long[] getChunkOffsets();

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(getClass().getSimpleName()));
        stringBuilder.append("[entryCount=");
        stringBuilder.append(getChunkOffsets().length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
