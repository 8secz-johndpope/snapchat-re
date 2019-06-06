package com.googlecode.mp4parser.boxes.apple;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqj;
import defpackage.aql;
import defpackage.cdb;
import java.nio.ByteBuffer;

public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    int intLength = 1;
    long value;

    static {
        ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String str) {
        super(str, 15);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AppleVariableSignedIntegerBox.java", AppleVariableSignedIntegerBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"), 19);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"), 27);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", "value", "", "void"), 36);
    }

    /* Access modifiers changed, original: protected */
    public int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.intLength;
    }

    public long getValue() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    /* Access modifiers changed, original: protected */
    public void parseData(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.value = aqj.a(byteBuffer, remaining);
        this.intLength = remaining;
    }

    public void setIntLength(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.intLength = i;
    }

    /* JADX WARNING: Missing block: B:11:0x002c, code skipped:
            if (r3.intLength < 2) goto L_0x002e;
     */
    /* JADX WARNING: Missing block: B:12:0x002e, code skipped:
            r3.intLength = r1;
     */
    /* JADX WARNING: Missing block: B:18:0x0042, code skipped:
            if (r3.intLength < 3) goto L_0x002e;
     */
    public void setValue(long r4) {
        /*
        r3 = this;
        r0 = ajc$tjp_3;
        r1 = defpackage.akoc.a(r4);
        r0 = defpackage.akoe.a(r0, r3, r3, r1);
        defpackage.cdb.a(r0);
        r0 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x001d;
    L_0x0013:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x001d;
    L_0x0019:
        r0 = 1;
    L_0x001a:
        r3.intLength = r0;
        goto L_0x0047;
    L_0x001d:
        r0 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0031;
    L_0x0023:
        r0 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0031;
    L_0x0029:
        r0 = r3.intLength;
        r1 = 2;
        if (r0 >= r1) goto L_0x0031;
    L_0x002e:
        r3.intLength = r1;
        goto L_0x0047;
    L_0x0031:
        r0 = 8388607; // 0x7fffff float:1.1754942E-38 double:4.1445225E-317;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0045;
    L_0x0038:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0045;
    L_0x003f:
        r0 = r3.intLength;
        r1 = 3;
        if (r0 >= r1) goto L_0x0045;
    L_0x0044:
        goto L_0x002e;
    L_0x0045:
        r0 = 4;
        goto L_0x001a;
    L_0x0047:
        r3.value = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox.setValue(long):void");
    }

    /* Access modifiers changed, original: protected */
    public byte[] writeData() {
        int dataLength = getDataLength();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[dataLength]);
        aql.a(this.value, wrap, dataLength);
        return wrap.array();
    }
}
