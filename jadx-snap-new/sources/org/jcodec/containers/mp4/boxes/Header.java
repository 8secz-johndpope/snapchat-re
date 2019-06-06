package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil2;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.logging.Logger;

public class Header {
    public static final byte[] FOURCC_FREE = new byte[]{(byte) 102, (byte) 114, (byte) 101, (byte) 101};
    private String fourcc;
    private boolean lng;
    private long size;

    public Header(String str) {
        this.fourcc = str;
    }

    public static Header createHeader(String str, long j) {
        Header header = new Header(str);
        header.size = j;
        return header;
    }

    public static int estimateHeaderSize(int i) {
        return ((long) (i + 8)) > 4294967296L ? 16 : 8;
    }

    public static Header newHeader(String str, long j, boolean z) {
        Header header = new Header(str);
        header.size = j;
        header.lng = z;
        return header;
    }

    public static Header read(ByteBuffer byteBuffer) {
        long j = 0;
        while (byteBuffer.remaining() >= 4) {
            j = ((long) byteBuffer.getInt()) & 4294967295L;
            if (j != 0) {
                break;
            }
        }
        String str = "Broken atom of size ";
        if (byteBuffer.remaining() >= 4 && (j >= 8 || j == 1)) {
            String readString = NIOUtils.readString(byteBuffer, 4);
            boolean z = false;
            if (j == 1) {
                if (byteBuffer.remaining() >= 8) {
                    z = true;
                    j = byteBuffer.getLong();
                }
            }
            return newHeader(readString, j, z);
        }
        Logger.error(str.concat(String.valueOf(j)));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        String str = this.fourcc;
        if (str == null) {
            if (header.fourcc != null) {
                return false;
            }
        } else if (!str.equals(header.fourcc)) {
            return false;
        }
        return true;
    }

    public long getBodySize() {
        return this.size - headerSize();
    }

    public String getFourcc() {
        return this.fourcc;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.fourcc;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public long headerSize() {
        return (this.lng || this.size > 4294967296L) ? 16 : 8;
    }

    public void setBodySize(int i) {
        this.size = ((long) i) + headerSize();
    }

    public void write(ByteBuffer byteBuffer) {
        long j = this.size;
        if (j > 4294967296L) {
            byteBuffer.putInt(1);
        } else {
            byteBuffer.putInt((int) j);
        }
        byte[] asciiString = JCodecUtil2.asciiString(this.fourcc);
        if (asciiString == null || asciiString.length != 4) {
            asciiString = FOURCC_FREE;
        }
        byteBuffer.put(asciiString);
        j = this.size;
        if (j > 4294967296L) {
            byteBuffer.putLong(j);
        }
    }
}
