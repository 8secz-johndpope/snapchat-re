package defpackage;

import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: dmx */
public final class dmx implements dlz {
    private final dlx a;
    private final abss b;

    static {
        Pattern.compile("\\.");
    }

    public dmx(dlx dlx, abss abss) {
        this.a = dlx;
        this.b = abss;
    }

    public final aceu a(String str) {
        String str2;
        try {
            return (aceu) MessageNano.mergeFrom(new aceu(), BaseEncoding.base64().decode(str));
        } catch (IllegalArgumentException e) {
            str2 = "base64_decode";
            throw new IOException("Unable to decode base64 encoded Client Rules", e);
        } catch (InvalidProtocolBufferNanoException e2) {
            str2 = "proto_parse";
            throw new IOException("Unable to parse base64 encoded Client Rules", e2);
        } catch (Throwable th) {
            if (null != null) {
                this.a.a(inp.COULD_NOT_PARSE_PROTO, "ClientRules", "reason", null);
            }
        }
    }

    public final acek b(String str) {
        String str2;
        try {
            return (acek) MessageNano.mergeFrom(new acek(), BaseEncoding.base64().decode(str));
        } catch (IllegalArgumentException e) {
            str2 = "base64_decode";
            throw new IOException("Unable to decode base64 encoded Cached Network Mapping", e);
        } catch (InvalidProtocolBufferNanoException e2) {
            str2 = "proto_parse";
            throw new IOException("Unable to parse base64 encoded Cached Network Mapping", e2);
        } catch (Throwable th) {
            if (null != null) {
                this.a.a(inp.COULD_NOT_PARSE_PROTO, "type", "CachedNetworkMapping", "reason", null);
            }
        }
    }
}
