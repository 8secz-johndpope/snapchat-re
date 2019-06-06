package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    protected AbstractFullBox(String str) {
        super(str);
    }

    protected AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AbstractFullBox.java", AbstractFullBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    /* Access modifiers changed, original: protected|final */
    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = aqi.a(byteBuffer.get());
        this.flags = aqi.b(byteBuffer);
        return 4;
    }

    public void setFlags(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.flags = i;
    }

    public void setVersion(int i) {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this, Integer.valueOf(i)));
        this.version = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        aqk.c(byteBuffer, this.version);
        aqk.a(byteBuffer, this.flags);
    }
}
