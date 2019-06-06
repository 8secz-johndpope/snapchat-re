package org.apache.http;

import java.io.Serializable;
import org.apache.http.util.Args;

public class ProtocolVersion implements Serializable, Cloneable {
    protected final int major;
    protected final int minor;
    protected final String protocol;

    public ProtocolVersion(String str, int i, int i2) {
        this.protocol = (String) Args.notNull(str, "Protocol name");
        str = "Protocol minor version";
        this.major = Args.notNegative(i, str);
        this.minor = Args.notNegative(i2, str);
    }

    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        return this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.protocol);
        stringBuilder.append('/');
        stringBuilder.append(Integer.toString(this.major));
        stringBuilder.append('.');
        stringBuilder.append(Integer.toString(this.minor));
        return stringBuilder.toString();
    }
}
