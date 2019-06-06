package com.snap.spectacles.lib.main.newport;

import defpackage.ajxl;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.akfp;
import defpackage.auv;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Header;

public final class SphericalBox extends Box {
    private final byte[] sphericalBoxDataUuid = auv.a("FFCC8263F8554A938814587A02521FDD");
    private final String xmlString = "<?xml version=\"1.0\"?><rdf:SphericalVideo\nxmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\nxmlns:GSpherical=\"http://ns.google.com/videos/1.0/spherical/\"><GSpherical:Spherical>true</GSpherical:Spherical><GSpherical:Stitched>true</GSpherical:Stitched><GSpherical:StitchingSoftware>Snapchat</GSpherical:StitchingSoftware><GSpherical:ProjectionType>equirectangular</GSpherical:ProjectionType><GSpherical:StereoMode>left-right</GSpherical:StereoMode></rdf:SphericalVideo>";

    public SphericalBox() {
        super(new Header("uuid"));
    }

    public final void doWrite(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byteBuffer.put(this.sphericalBoxDataUuid);
        }
        if (byteBuffer != null) {
            String str = this.xmlString;
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
        return (this.sphericalBoxDataUuid.length + 8) + this.xmlString.length();
    }

    public final void parse(ByteBuffer byteBuffer) {
        throw new ajxl("An operation is not implemented: ".concat("This won't be implemented"));
    }
}
