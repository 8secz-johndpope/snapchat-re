package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class CleanApertureAtom extends AbstractFullBox {
    public static final String TYPE = "clef";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    double height;
    double width;

    static {
        ajc$preClinit();
    }

    public CleanApertureAtom() {
        super("clef");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("CleanApertureAtom.java", CleanApertureAtom.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"), 45);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "double", "width", "", "void"), 49);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"), 53);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "double", "height", "", "void"), 57);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.width = aqi.f(byteBuffer);
        this.height = aqi.f(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.width);
        aqk.a(byteBuffer, this.height);
    }

    public long getContentSize() {
        return 12;
    }

    public double getHeight() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.height;
    }

    public double getWidth() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.width;
    }

    public void setHeight(double d) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Double.valueOf(d)));
        this.height = d;
    }

    public void setWidth(double d) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Double.valueOf(d)));
        this.width = d;
    }
}
