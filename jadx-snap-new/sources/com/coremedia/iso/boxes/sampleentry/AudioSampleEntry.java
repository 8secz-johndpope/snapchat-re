package com.coremedia.iso.boxes.sampleentry;

import defpackage.aqf;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class AudioSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;

    public AudioSampleEntry(String str) {
        super(str);
    }

    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(getHeader());
        int i = 0;
        int i2 = (this.soundVersion == 1 ? 16 : 0) + 28;
        if (this.soundVersion == 2) {
            i = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 + i);
        allocate.position(6);
        aqk.b(allocate, this.dataReferenceIndex);
        aqk.b(allocate, this.soundVersion);
        aqk.b(allocate, this.reserved1);
        aqk.b(allocate, this.reserved2);
        aqk.b(allocate, this.channelCount);
        aqk.b(allocate, this.sampleSize);
        aqk.b(allocate, this.compressionId);
        aqk.b(allocate, this.packetSize);
        aqk.b(allocate, this.type.equals(TYPE10) ? getSampleRate() : getSampleRate() << 16);
        if (this.soundVersion == 1) {
            aqk.b(allocate, this.samplesPerPacket);
            aqk.b(allocate, this.bytesPerPacket);
            aqk.b(allocate, this.bytesPerFrame);
            aqk.b(allocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            aqk.b(allocate, this.samplesPerPacket);
            aqk.b(allocate, this.bytesPerPacket);
            aqk.b(allocate, this.bytesPerFrame);
            aqk.b(allocate, this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public final long getBytesPerFrame() {
        return this.bytesPerFrame;
    }

    public final long getBytesPerPacket() {
        return this.bytesPerPacket;
    }

    public final long getBytesPerSample() {
        return this.bytesPerSample;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final int getCompressionId() {
        return this.compressionId;
    }

    public final int getPacketSize() {
        return this.packetSize;
    }

    public final int getReserved1() {
        return this.reserved1;
    }

    public final long getReserved2() {
        return this.reserved2;
    }

    public final long getSampleRate() {
        return this.sampleRate;
    }

    public final int getSampleSize() {
        return this.sampleSize;
    }

    public final long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }

    public final long getSize() {
        int i = 16;
        int i2 = 0;
        int i3 = (this.soundVersion == 1 ? 16 : 0) + 28;
        if (this.soundVersion == 2) {
            i2 = 36;
        }
        long containerSize = ((long) (i3 + i2)) + getContainerSize();
        if (!this.largeBox && 8 + containerSize < 4294967296L) {
            i = 8;
        }
        return containerSize + ((long) i);
    }

    public final int getSoundVersion() {
        return this.soundVersion;
    }

    public final byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }

    public final void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        byteBuffer = ByteBuffer.allocate(28);
        ccy.a(byteBuffer);
        byteBuffer.position(6);
        this.dataReferenceIndex = aqi.c(byteBuffer);
        this.soundVersion = aqi.c(byteBuffer);
        this.reserved1 = aqi.c(byteBuffer);
        this.reserved2 = aqi.a(byteBuffer);
        this.channelCount = aqi.c(byteBuffer);
        this.sampleSize = aqi.c(byteBuffer);
        this.compressionId = aqi.c(byteBuffer);
        this.packetSize = aqi.c(byteBuffer);
        this.sampleRate = aqi.a(byteBuffer);
        int i = 16;
        if (!this.type.equals(TYPE10)) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            byteBuffer = ByteBuffer.allocate(16);
            ccy.a(byteBuffer);
            byteBuffer.rewind();
            this.samplesPerPacket = aqi.a(byteBuffer);
            this.bytesPerPacket = aqi.a(byteBuffer);
            this.bytesPerFrame = aqi.a(byteBuffer);
            this.bytesPerSample = aqi.a(byteBuffer);
        }
        int i2 = 36;
        if (this.soundVersion == 2) {
            byteBuffer = ByteBuffer.allocate(36);
            ccy.a(byteBuffer);
            byteBuffer.rewind();
            this.samplesPerPacket = aqi.a(byteBuffer);
            this.bytesPerPacket = aqi.a(byteBuffer);
            this.bytesPerFrame = aqi.a(byteBuffer);
            this.bytesPerSample = aqi.a(byteBuffer);
            this.soundVersion2Data = new byte[20];
            byteBuffer.get(this.soundVersion2Data);
        }
        String str = this.type;
        String str2 = TYPE7;
        if (str2.equals(str)) {
            System.err.println(str2);
            j -= 28;
            if (this.soundVersion != 1) {
                i = 0;
            }
            j -= (long) i;
            if (this.soundVersion != 2) {
                i2 = 0;
            }
            j -= (long) i2;
            byteBuffer = ByteBuffer.allocate(ces.a(j));
            ccy.a(byteBuffer);
            addBox(new aqo() {
                public void getBox(WritableByteChannel writableByteChannel) {
                    byteBuffer.rewind();
                    writableByteChannel.write(byteBuffer);
                }

                public long getOffset() {
                    return 0;
                }

                public aqp getParent() {
                    return AudioSampleEntry.this;
                }

                public long getSize() {
                    return j;
                }

                public String getType() {
                    return "----";
                }

                public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
                    throw new RuntimeException("NotImplemented");
                }

                public void setParent(aqp aqp) {
                    if (!AudioSampleEntry.$assertionsDisabled && aqp != AudioSampleEntry.this) {
                        throw new AssertionError("you cannot diswown this special box");
                    }
                }
            });
            return;
        }
        j -= 28;
        if (this.soundVersion != 1) {
            i = 0;
        }
        j -= (long) i;
        if (this.soundVersion != 2) {
            i2 = 0;
        }
        initContainer(ccy, j - ((long) i2), aqf);
    }

    public final void setBytesPerFrame(long j) {
        this.bytesPerFrame = j;
    }

    public final void setBytesPerPacket(long j) {
        this.bytesPerPacket = j;
    }

    public final void setBytesPerSample(long j) {
        this.bytesPerSample = j;
    }

    public final void setChannelCount(int i) {
        this.channelCount = i;
    }

    public final void setCompressionId(int i) {
        this.compressionId = i;
    }

    public final void setPacketSize(int i) {
        this.packetSize = i;
    }

    public final void setReserved1(int i) {
        this.reserved1 = i;
    }

    public final void setReserved2(long j) {
        this.reserved2 = j;
    }

    public final void setSampleRate(long j) {
        this.sampleRate = j;
    }

    public final void setSampleSize(int i) {
        this.sampleSize = i;
    }

    public final void setSamplesPerPacket(long j) {
        this.samplesPerPacket = j;
    }

    public final void setSoundVersion(int i) {
        this.soundVersion = i;
    }

    public final void setSoundVersion2Data(byte[] bArr) {
        this.soundVersion2Data = bArr;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSampleEntry{bytesPerSample=");
        stringBuilder.append(this.bytesPerSample);
        stringBuilder.append(", bytesPerFrame=");
        stringBuilder.append(this.bytesPerFrame);
        stringBuilder.append(", bytesPerPacket=");
        stringBuilder.append(this.bytesPerPacket);
        stringBuilder.append(", samplesPerPacket=");
        stringBuilder.append(this.samplesPerPacket);
        stringBuilder.append(", packetSize=");
        stringBuilder.append(this.packetSize);
        stringBuilder.append(", compressionId=");
        stringBuilder.append(this.compressionId);
        stringBuilder.append(", soundVersion=");
        stringBuilder.append(this.soundVersion);
        stringBuilder.append(", sampleRate=");
        stringBuilder.append(this.sampleRate);
        stringBuilder.append(", sampleSize=");
        stringBuilder.append(this.sampleSize);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(this.channelCount);
        stringBuilder.append(", boxes=");
        stringBuilder.append(getBoxes());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
