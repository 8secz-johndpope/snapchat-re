package com.coremedia.iso.boxes;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class ChunkOffset64BitBox extends ChunkOffsetBox {
    public static final String TYPE = "co64";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private long[] chunkOffsets;

    static {
        ajc$preClinit();
    }

    public ChunkOffset64BitBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ChunkOffset64BitBox.java", ChunkOffset64BitBox.class);
        ajc$tjp_0 = akoe.a("method-execution", akoe.a(SCamera.CAMERA_ID_FRONT, "getChunkOffsets", "com.coremedia.iso.boxes.ChunkOffset64BitBox", "", "", "", "[J"), 23);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = ces.a(aqi.a(byteBuffer));
        this.chunkOffsets = new long[a];
        for (int i = 0; i < a; i++) {
            this.chunkOffsets[i] = aqi.e(byteBuffer);
        }
    }

    public long[] getChunkOffsets() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.chunkOffsets;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.chunkOffsets.length);
        for (long a : this.chunkOffsets) {
            aqk.a(byteBuffer, a);
        }
    }

    public long getContentSize() {
        return (long) ((this.chunkOffsets.length * 8) + 8);
    }
}
