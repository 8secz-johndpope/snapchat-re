package com.coremedia.iso.boxes.sampleentry;

import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.ccy;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private b styleRecord;
    private int verticalJustification;

    public static class a {
        int a;
        int b;
        int c;
        int d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.d == aVar.d && this.a == aVar.a;
        }

        public final int hashCode() {
            return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
        }
    }

    public static class b {
        int a;
        int b;
        int c;
        int d;
        int e;
        int[] f = new int[]{255, 255, 255, 255};

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.d == bVar.d && this.c == bVar.c && this.e == bVar.e && this.a == bVar.a && Arrays.equals(this.f, bVar.f);
        }

        public final int hashCode() {
            int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
            int[] iArr = this.f;
            return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        aqk.b(allocate, this.displayFlags);
        aqk.c(allocate, this.horizontalJustification);
        aqk.c(allocate, this.verticalJustification);
        aqk.c(allocate, this.backgroundColorRgba[0]);
        aqk.c(allocate, this.backgroundColorRgba[1]);
        aqk.c(allocate, this.backgroundColorRgba[2]);
        aqk.c(allocate, this.backgroundColorRgba[3]);
        a aVar = this.boxRecord;
        aqk.b(allocate, aVar.a);
        aqk.b(allocate, aVar.b);
        aqk.b(allocate, aVar.c);
        aqk.b(allocate, aVar.d);
        b bVar = this.styleRecord;
        aqk.b(allocate, bVar.a);
        aqk.b(allocate, bVar.b);
        aqk.b(allocate, bVar.c);
        aqk.c(allocate, bVar.d);
        aqk.c(allocate, bVar.e);
        aqk.c(allocate, bVar.f[0]);
        aqk.c(allocate, bVar.f[1]);
        aqk.c(allocate, bVar.f[2]);
        aqk.c(allocate, bVar.f[3]);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    public long getSize() {
        long containerSize = getContainerSize() + 38;
        int i = (this.largeBox || containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public b getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & 2048) == 2048;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & 262144) == 262144;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & 131072) == 131072;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(38);
        ccy.a(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        this.displayFlags = aqi.a(byteBuffer);
        this.horizontalJustification = aqi.a(byteBuffer.get());
        this.verticalJustification = aqi.a(byteBuffer.get());
        this.backgroundColorRgba = new int[4];
        this.backgroundColorRgba[0] = aqi.a(byteBuffer.get());
        this.backgroundColorRgba[1] = aqi.a(byteBuffer.get());
        this.backgroundColorRgba[2] = aqi.a(byteBuffer.get());
        this.backgroundColorRgba[3] = aqi.a(byteBuffer.get());
        this.boxRecord = new a();
        a aVar = this.boxRecord;
        aVar.a = aqi.c(byteBuffer);
        aVar.b = aqi.c(byteBuffer);
        aVar.c = aqi.c(byteBuffer);
        aVar.d = aqi.c(byteBuffer);
        this.styleRecord = new b();
        b bVar = this.styleRecord;
        bVar.a = aqi.c(byteBuffer);
        bVar.b = aqi.c(byteBuffer);
        bVar.c = aqi.c(byteBuffer);
        bVar.d = aqi.a(byteBuffer.get());
        bVar.e = aqi.a(byteBuffer.get());
        bVar.f = new int[4];
        bVar.f[0] = aqi.a(byteBuffer.get());
        bVar.f[1] = aqi.a(byteBuffer.get());
        bVar.f[2] = aqi.a(byteBuffer.get());
        bVar.f[3] = aqi.a(byteBuffer.get());
        initContainer(ccy, j - 38, aqf);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(a aVar) {
        this.boxRecord = aVar;
    }

    public void setContinuousKaraoke(boolean z) {
        this.displayFlags = z ? this.displayFlags | 2048 : this.displayFlags & -2049;
    }

    public void setFillTextRegion(boolean z) {
        this.displayFlags = z ? this.displayFlags | 262144 : this.displayFlags & -262145;
    }

    public void setHorizontalJustification(int i) {
        this.horizontalJustification = i;
    }

    public void setScrollDirection(boolean z) {
        this.displayFlags = z ? this.displayFlags | 384 : this.displayFlags & -385;
    }

    public void setScrollIn(boolean z) {
        this.displayFlags = z ? this.displayFlags | 32 : this.displayFlags & -33;
    }

    public void setScrollOut(boolean z) {
        this.displayFlags = z ? this.displayFlags | 64 : this.displayFlags & -65;
    }

    public void setStyleRecord(b bVar) {
        this.styleRecord = bVar;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i) {
        this.verticalJustification = i;
    }

    public void setWriteTextVertically(boolean z) {
        this.displayFlags = z ? this.displayFlags | 131072 : this.displayFlags & -131073;
    }

    public String toString() {
        return "TextSampleEntry";
    }
}
