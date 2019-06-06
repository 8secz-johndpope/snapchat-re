package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.ccy;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "text";
    int backgroundB;
    int backgroundG;
    int backgroundR;
    int dataReferenceIndex;
    long defaultTextBox;
    int displayFlags;
    short fontFace;
    String fontName = "";
    short fontNumber;
    int foregroundB = 65535;
    int foregroundG = 65535;
    int foregroundR = 65535;
    long reserved1;
    byte reserved2;
    short reserved3;
    int textJustification;

    public QuicktimeTextSampleEntry() {
        super("text");
    }

    public void addBox(aqo aqo) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public int getBackgroundB() {
        return this.backgroundB;
    }

    public int getBackgroundG() {
        return this.backgroundG;
    }

    public int getBackgroundR() {
        return this.backgroundR;
    }

    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        String str = this.fontName;
        ByteBuffer allocate = ByteBuffer.allocate((str != null ? str.length() : 0) + 52);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        allocate.putInt(this.displayFlags);
        allocate.putInt(this.textJustification);
        aqk.b(allocate, this.backgroundR);
        aqk.b(allocate, this.backgroundG);
        aqk.b(allocate, this.backgroundB);
        aqk.a(allocate, this.defaultTextBox);
        aqk.a(allocate, this.reserved1);
        allocate.putShort(this.fontNumber);
        allocate.putShort(this.fontFace);
        allocate.put(this.reserved2);
        allocate.putShort(this.reserved3);
        aqk.b(allocate, this.foregroundR);
        aqk.b(allocate, this.foregroundG);
        aqk.b(allocate, this.foregroundB);
        String str2 = this.fontName;
        if (str2 != null) {
            aqk.c(allocate, str2.length());
            allocate.put(this.fontName.getBytes());
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
    }

    public long getDefaultTextBox() {
        return this.defaultTextBox;
    }

    public int getDisplayFlags() {
        return this.displayFlags;
    }

    public short getFontFace() {
        return this.fontFace;
    }

    public String getFontName() {
        return this.fontName;
    }

    public short getFontNumber() {
        return this.fontNumber;
    }

    public int getForegroundB() {
        return this.foregroundB;
    }

    public int getForegroundG() {
        return this.foregroundG;
    }

    public int getForegroundR() {
        return this.foregroundR;
    }

    public long getReserved1() {
        return this.reserved1;
    }

    public byte getReserved2() {
        return this.reserved2;
    }

    public short getReserved3() {
        return this.reserved3;
    }

    public long getSize() {
        long containerSize = getContainerSize() + 52;
        String str = this.fontName;
        containerSize += (long) (str != null ? str.length() : 0);
        int i = (this.largeBox || 8 + containerSize >= 4294967296L) ? 16 : 8;
        return containerSize + ((long) i);
    }

    public int getTextJustification() {
        return this.textJustification;
    }

    public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(ces.a(j));
        ccy.a(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        this.displayFlags = byteBuffer.getInt();
        this.textJustification = byteBuffer.getInt();
        this.backgroundR = aqi.c(byteBuffer);
        this.backgroundG = aqi.c(byteBuffer);
        this.backgroundB = aqi.c(byteBuffer);
        this.defaultTextBox = aqi.e(byteBuffer);
        this.reserved1 = aqi.e(byteBuffer);
        this.fontNumber = byteBuffer.getShort();
        this.fontFace = byteBuffer.getShort();
        this.reserved2 = byteBuffer.get();
        this.reserved3 = byteBuffer.getShort();
        this.foregroundR = aqi.c(byteBuffer);
        this.foregroundG = aqi.c(byteBuffer);
        this.foregroundB = aqi.c(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            byte[] bArr = new byte[aqi.a(byteBuffer.get())];
            byteBuffer.get(bArr);
            this.fontName = new String(bArr);
            return;
        }
        this.fontName = null;
    }

    public void setBackgroundB(int i) {
        this.backgroundB = i;
    }

    public void setBackgroundG(int i) {
        this.backgroundG = i;
    }

    public void setBackgroundR(int i) {
        this.backgroundR = i;
    }

    public void setBoxes(List<aqo> list) {
        throw new RuntimeException("QuicktimeTextSampleEntries may not have child boxes");
    }

    public void setDefaultTextBox(long j) {
        this.defaultTextBox = j;
    }

    public void setDisplayFlags(int i) {
        this.displayFlags = i;
    }

    public void setFontFace(short s) {
        this.fontFace = s;
    }

    public void setFontName(String str) {
        this.fontName = str;
    }

    public void setFontNumber(short s) {
        this.fontNumber = s;
    }

    public void setForegroundB(int i) {
        this.foregroundB = i;
    }

    public void setForegroundG(int i) {
        this.foregroundG = i;
    }

    public void setForegroundR(int i) {
        this.foregroundR = i;
    }

    public void setReserved1(long j) {
        this.reserved1 = j;
    }

    public void setReserved2(byte b) {
        this.reserved2 = b;
    }

    public void setReserved3(short s) {
        this.reserved3 = s;
    }

    public void setTextJustification(int i) {
        this.textJustification = i;
    }
}
