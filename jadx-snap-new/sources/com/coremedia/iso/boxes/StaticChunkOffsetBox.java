package com.coremedia.iso.boxes;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class StaticChunkOffsetBox extends ChunkOffsetBox {
    public static final String TYPE = "stco";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private long[] chunkOffsets = new long[0];

    static {
        ajc$preClinit();
    }

    public StaticChunkOffsetBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("StaticChunkOffsetBox.java", StaticChunkOffsetBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 47);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = ces.a(aqi.a(byteBuffer));
        this.chunkOffsets = new long[a];
        for (int i = 0; i < a; i++) {
            this.chunkOffsets[i] = aqi.a(byteBuffer);
        }
    }

    public long[] getChunkOffsets() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.chunkOffsets;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.chunkOffsets.length);
        for (long b : this.chunkOffsets) {
            aqk.b(byteBuffer, b);
        }
    }

    public long getContentSize() {
        return (long) ((this.chunkOffsets.length << 2) + 8);
    }

    public void setChunkOffsets(long[] jArr) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) jArr));
        this.chunkOffsets = jArr;
    }
}
