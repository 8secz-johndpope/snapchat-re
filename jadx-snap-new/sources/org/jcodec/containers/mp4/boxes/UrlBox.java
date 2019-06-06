package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.DataEntryUrlBox;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.platform.Platform;

public class UrlBox extends FullBox {
    private String url;

    public UrlBox(Header header) {
        super(header);
    }

    public static UrlBox createUrlBox(String str) {
        UrlBox urlBox = new UrlBox(new Header(fourcc()));
        urlBox.url = str;
        return urlBox;
    }

    public static String fourcc() {
        return DataEntryUrlBox.TYPE;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        Charset forName = Charset.forName("utf-8");
        String str = this.url;
        if (str != null) {
            NIOUtils.write(byteBuffer, ByteBuffer.wrap(Platform.getBytesForCharset(str, forName)));
            byteBuffer.put((byte) 0);
        }
    }

    public int estimateSize() {
        Charset forName = Charset.forName("utf-8");
        String str = this.url;
        return str != null ? 13 + Platform.getBytesForCharset(str, forName).length : 13;
    }

    public String getUrl() {
        return this.url;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        if ((this.flags & 1) == 0) {
            this.url = NIOUtils.readNullTermStringCharset(byteBuffer, Charset.forName("utf-8"));
        }
    }
}
