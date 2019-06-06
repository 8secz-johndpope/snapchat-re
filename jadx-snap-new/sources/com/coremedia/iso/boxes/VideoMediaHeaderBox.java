package com.coremedia.iso.boxes;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "vmhd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private int graphicsmode = 0;
    private int[] opcolor = new int[3];

    static {
        ajc$preClinit();
    }

    public VideoMediaHeaderBox() {
        super(TYPE);
        setFlags(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("VideoMediaHeaderBox.java", VideoMediaHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsmode = aqi.c(byteBuffer);
        this.opcolor = new int[3];
        for (int i = 0; i < 3; i++) {
            this.opcolor[i] = aqi.c(byteBuffer);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.graphicsmode);
        for (int b : this.opcolor) {
            aqk.b(byteBuffer, b);
        }
    }

    public long getContentSize() {
        return 12;
    }

    public int getGraphicsmode() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.opcolor;
    }

    public void setGraphicsmode(int i) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, Integer.valueOf(i)));
        this.graphicsmode = i;
    }

    public void setOpcolor(int[] iArr) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) iArr));
        this.opcolor = iArr;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        stringBuilder.append(getGraphicsmode());
        stringBuilder.append(";opcolor0=");
        stringBuilder.append(getOpcolor()[0]);
        stringBuilder.append(";opcolor1=");
        stringBuilder.append(getOpcolor()[1]);
        stringBuilder.append(";opcolor2=");
        stringBuilder.append(getOpcolor()[2]);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
