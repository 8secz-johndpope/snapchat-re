package com.googlecode.mp4parser.boxes.dece;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = "bloc";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    String baseLocation;
    String purchaseLocation;

    static {
        ajc$preClinit();
    }

    public BaseLocationBox() {
        super(TYPE);
        String str = "";
        this.baseLocation = str;
        this.purchaseLocation = str;
    }

    public BaseLocationBox(String str, String str2) {
        super(TYPE);
        String str3 = "";
        this.baseLocation = str3;
        this.purchaseLocation = str3;
        this.baseLocation = str;
        this.purchaseLocation = str2;
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("BaseLocationBox.java", BaseLocationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", Event.BOOLEAN), 86);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hashCode", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.baseLocation = aqi.d(byteBuffer);
        byteBuffer.get(new byte[((256 - aqn.b(this.baseLocation)) - 1)]);
        this.purchaseLocation = aqi.d(byteBuffer);
        byteBuffer.get(new byte[((256 - aqn.b(this.purchaseLocation)) - 1)]);
        byteBuffer.get(new byte[RasterSource.DEFAULT_TILE_SIZE]);
    }

    public boolean equals(Object obj) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLocationBox baseLocationBox = (BaseLocationBox) obj;
        String str = this.baseLocation;
        if (!str == null ? str.equals(baseLocationBox.baseLocation) : baseLocationBox.baseLocation == null) {
            return false;
        }
        str = this.purchaseLocation;
        return str == null ? baseLocationBox.purchaseLocation == null : str.equals(baseLocationBox.purchaseLocation);
    }

    public String getBaseLocation() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.baseLocation;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqn.a(this.baseLocation));
        byteBuffer.put(new byte[(256 - aqn.b(this.baseLocation))]);
        byteBuffer.put(aqn.a(this.purchaseLocation));
        byteBuffer.put(new byte[(256 - aqn.b(this.purchaseLocation))]);
        byteBuffer.put(new byte[RasterSource.DEFAULT_TILE_SIZE]);
    }

    public long getContentSize() {
        return 1028;
    }

    public String getPurchaseLocation() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.purchaseLocation;
    }

    public int hashCode() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        String str = this.baseLocation;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.purchaseLocation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public void setBaseLocation(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.baseLocation = str;
    }

    public void setPurchaseLocation(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.purchaseLocation = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("BaseLocationBox{baseLocation='");
        stringBuilder.append(this.baseLocation);
        stringBuilder.append('\'');
        stringBuilder.append(", purchaseLocation='");
        stringBuilder.append(this.purchaseLocation);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
