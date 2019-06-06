package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    public static final Map<String, String> readableTypes;
    private long a;
    private long b;
    private long c;
    private String handlerType;
    private String name = null;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm = true;

    static {
        ajc$preClinit();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put(TrackReferenceTypeBox.TYPE1, "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put(MetaBox.TYPE, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(hashMap);
    }

    public HandlerBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("HandlerBox.java", HandlerBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = aqi.a(byteBuffer);
        this.handlerType = aqi.j(byteBuffer);
        this.a = aqi.a(byteBuffer);
        this.b = aqi.a(byteBuffer);
        this.c = aqi.a(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.name = aqi.a(byteBuffer, byteBuffer.remaining());
            if (this.name.endsWith("\u0000")) {
                String str = this.name;
                this.name = str.substring(0, str.length() - 1);
                this.zeroTerm = true;
                return;
            }
            this.zeroTerm = false;
            return;
        }
        this.zeroTerm = false;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(aqh.a(this.handlerType));
        aqk.b(byteBuffer, this.a);
        aqk.b(byteBuffer, this.b);
        aqk.b(byteBuffer, this.c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(aqn.a(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    public long getContentSize() {
        return (long) (this.zeroTerm ? aqn.b(this.name) + 25 : aqn.b(this.name) + 24);
    }

    public String getHandlerType() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return readableTypes.get(this.handlerType) != null ? (String) readableTypes.get(this.handlerType) : "Unknown Handler Type";
    }

    public String getName() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.name;
    }

    public void setHandlerType(String str) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.handlerType = str;
    }

    public void setName(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.name = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("HandlerBox[handlerType=");
        stringBuilder.append(getHandlerType());
        stringBuilder.append(";name=");
        stringBuilder.append(getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
