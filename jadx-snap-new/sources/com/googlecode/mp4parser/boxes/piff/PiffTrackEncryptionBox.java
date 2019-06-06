package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;

public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public PiffTrackEncryptionBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        ajc$tjp_0 = akoe.a("method-execution", akoe.a(SCamera.CAMERA_ID_FRONT, "getFlags", "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }

    public int getFlags() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return 0;
    }

    public byte[] getUserType() {
        return new byte[]{(byte) -119, (byte) 116, (byte) -37, (byte) -50, (byte) 123, (byte) -25, (byte) 76, (byte) 81, (byte) -124, (byte) -7, (byte) 113, (byte) 72, (byte) -7, (byte) -120, (byte) 37, (byte) 84};
    }
}
