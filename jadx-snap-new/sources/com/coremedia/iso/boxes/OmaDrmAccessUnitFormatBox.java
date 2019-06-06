package com.coremedia.iso.boxes;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {
    public static final String TYPE = "odaf";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    static {
        ajc$preClinit();
    }

    public OmaDrmAccessUnitFormatBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("OmaDrmAccessUnitFormatBox.java", OmaDrmAccessUnitFormatBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", Event.BOOLEAN), 46);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }

    public final void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.allBits = (byte) aqi.a(byteBuffer.get());
        this.selectiveEncryption = (this.allBits & 128) == 128;
        this.keyIndicatorLength = aqi.a(byteBuffer.get());
        this.initVectorLength = aqi.a(byteBuffer.get());
    }

    public final void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.c(byteBuffer, this.allBits);
        aqk.c(byteBuffer, this.keyIndicatorLength);
        aqk.c(byteBuffer, this.initVectorLength);
    }

    public final long getContentSize() {
        return 7;
    }

    public final int getInitVectorLength() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.initVectorLength;
    }

    public final int getKeyIndicatorLength() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.keyIndicatorLength;
    }

    public final boolean isSelectiveEncryption() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.selectiveEncryption;
    }

    public final void setAllBits(byte b) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Byte.valueOf(b)));
        this.allBits = b;
        this.selectiveEncryption = (b & 128) == 128;
    }

    public final void setInitVectorLength(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.initVectorLength = i;
    }

    public final void setKeyIndicatorLength(int i) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, Integer.valueOf(i)));
        this.keyIndicatorLength = i;
    }
}
