package com.snap.spectacles.lib.main.newport;

import com.snap.core.db.record.SnapModel;
import defpackage.ajxl;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.akfp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jcodec.containers.mp4.boxes.FullBox;
import org.jcodec.containers.mp4.boxes.Header;

public final class Svhd extends FullBox {
    private final String metadataSource = SnapModel.TABLE_NAME;

    public Svhd() {
        super(new Header("svhd"));
    }

    public final void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        if (byteBuffer != null) {
            String str = this.metadataSource;
            Charset charset = akfp.a;
            if (str != null) {
                Object bytes = str.getBytes(charset);
                akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
                byteBuffer.put(bytes);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final int estimateSize() {
        return this.metadataSource.length() + 12;
    }

    public final void parse(ByteBuffer byteBuffer) {
        throw new ajxl("An operation is not implemented: ".concat("This won't be implemented"));
    }
}
