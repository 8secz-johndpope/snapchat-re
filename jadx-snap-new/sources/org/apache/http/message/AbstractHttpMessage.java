package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpMessage implements HttpMessage {
    protected HeaderGroup headergroup;
    @Deprecated
    protected HttpParams params;

    protected AbstractHttpMessage() {
        this(null);
    }

    @Deprecated
    protected AbstractHttpMessage(HttpParams httpParams) {
        this.headergroup = new HeaderGroup();
        this.params = httpParams;
    }

    public Header[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    public void setHeaders(Header[] headerArr) {
        this.headergroup.setHeaders(headerArr);
    }
}
