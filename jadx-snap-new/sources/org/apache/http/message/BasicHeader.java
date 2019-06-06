package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.Header;
import org.apache.http.util.Args;

public class BasicHeader implements Serializable, Cloneable, Header {
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        this.name = (String) Args.notNull(str, "Name");
        this.value = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return BasicLineFormatter.INSTANCE.formatHeader(null, this).toString();
    }
}
