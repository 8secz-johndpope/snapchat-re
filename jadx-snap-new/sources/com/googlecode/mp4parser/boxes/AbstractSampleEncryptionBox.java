package com.googlecode.mp4parser.boxes;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cgw;
import defpackage.cgw.b;
import defpackage.cgw.c;
import defpackage.cgw.d;
import defpackage.cgw.e;
import defpackage.cgw.f;
import defpackage.cgw.g;
import defpackage.cgw.h;
import defpackage.cgw.i;
import defpackage.cgw.j;
import defpackage.cgw.k;
import defpackage.cgw.l;
import defpackage.cgw.m;
import defpackage.cgw.n;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    protected int algorithmId = -1;
    List<cgw> entries = Collections.emptyList();
    protected int ivSize = -1;
    protected byte[] kid = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};

    static {
        ajc$preClinit();
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 93);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", Event.BOOLEAN), 162);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 189);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 197);
    }

    private List<cgw> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            long j3 = j2 - 1;
            if (j2 <= 0) {
                return arrayList;
            }
            try {
                cgw cgw = new cgw();
                cgw.a = new byte[i];
                byteBuffer.get(cgw.a);
                if ((getFlags() & 2) > 0) {
                    cgw.b = new j[aqi.c(byteBuffer)];
                    for (int i2 = 0; i2 < cgw.b.length; i2++) {
                        j[] jVarArr = cgw.b;
                        int c = aqi.c(byteBuffer);
                        long a = aqi.a(byteBuffer);
                        b bVar = c <= 127 ? a <= 127 ? new b(c, a) : a <= 32767 ? new e(c, a) : a <= 2147483647L ? new c(c, a) : new d(c, a) : c <= 32767 ? a <= 127 ? new k(c, a) : a <= 32767 ? new n(c, a) : a <= 2147483647L ? new l(c, a) : new m(c, a) : a <= 127 ? new f(c, a) : a <= 32767 ? new i(c, a) : a <= 2147483647L ? new g(c, a) : new h(c, a);
                        jVarArr[i2] = bVar;
                    }
                }
                arrayList.add(cgw);
                j2 = j3;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = aqi.b(byteBuffer);
            this.ivSize = aqi.a(byteBuffer.get());
            this.kid = new byte[16];
            byteBuffer.get(this.kid);
        }
        long a = aqi.a(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        this.entries = parseEntries(duplicate, a, 8);
        if (this.entries == null) {
            this.entries = parseEntries(duplicate2, a, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    public boolean equals(Object obj) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List list = this.entries;
        return (list == null ? abstractSampleEncryptionBox.entries == null : list.equals(abstractSampleEncryptionBox.entries)) ? Arrays.equals(this.kid, abstractSampleEncryptionBox.kid) : false;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        super.getBox(writableByteChannel);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            aqk.a(byteBuffer, this.algorithmId);
            aqk.c(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        aqk.b(byteBuffer, (long) this.entries.size());
        for (cgw cgw : this.entries) {
            if (cgw.a() > 0) {
                if (cgw.a.length == 8 || cgw.a.length == 16) {
                    byteBuffer.put(cgw.a);
                    if (isSubSampleEncryption()) {
                        aqk.b(byteBuffer, cgw.b.length);
                        for (j jVar : cgw.b) {
                            aqk.b(byteBuffer, jVar.a());
                            aqk.b(byteBuffer, jVar.b());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    public long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4) + 4;
        for (cgw a : this.entries) {
            length += (long) a.a();
        }
        return length;
    }

    public List<cgw> getEntries() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (cgw cgw : this.entries) {
            short length = (short) cgw.a.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (cgw.b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return ((getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0)) + 4;
    }

    public int hashCode() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int i2 = 0;
        i = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List list = this.entries;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    /* Access modifiers changed, original: protected */
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<cgw> list) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setSubSampleEncryption(boolean z) {
        setFlags(z ? getFlags() | 2 : getFlags() & 16777213);
    }
}
