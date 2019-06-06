package org.apache.http;

import java.io.InputStream;

public interface HttpEntity {
    InputStream getContent();

    long getContentLength();
}
