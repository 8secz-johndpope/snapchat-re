package org.apache.http;

import java.io.Serializable;

public final class HttpVersion extends ProtocolVersion implements Serializable {
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);

    public HttpVersion(int i, int i2) {
        super("HTTP", i, i2);
    }
}
