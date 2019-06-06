package defpackage;

import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.snap.bolt.core.retrofit.BoltNetworkMappingInterface;

/* renamed from: dmq */
public final class dmq implements dmm {
    private final dlx a;
    private final ihh b;
    private final aipn<BoltNetworkMappingInterface> c;

    public dmq(dlx dlx, ihh ihh, aipn<BoltNetworkMappingInterface> aipn) {
        this.a = dlx;
        this.b = ihh;
        this.c = aipn;
    }

    private /* synthetic */ ajeb a(dml dml, boolean z, String str, long j, akxa akxa) {
        Throwable th;
        akxa akxa2 = akxa;
        String str2 = "network_error";
        String str3 = "outcome";
        long a = this.b.a();
        String str4 = "downloaded";
        ajdx b;
        if (!akxa.c() || akxa2.b == null) {
            try {
                if (akxa2.a == null) {
                    b = ajdx.b(new RuntimeException("Null response received"));
                    this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
                    return b;
                }
                if (dml != null) {
                    if (akxa2.a.a.c == 304) {
                        str2 = "not_modified";
                        b = ajdx.b((Object) new dml(dml.a(), a, z, str));
                        this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
                        return b;
                    }
                }
                if (akxa2.a.b == null) {
                    b = ajdx.b(new RuntimeException("Null NetworkMapping received"));
                    this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
                    return b;
                }
                b = ajdx.b((Object) new dml((acgd) akxa2.a.b, a, z, akxa2.a.a.f.a("Last-Modified")));
                this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str4);
                return b;
            } catch (Throwable th2) {
                th = th2;
                str2 = str4;
                this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
                throw th;
            }
        }
        try {
            if (akxa2.b instanceof InvalidProtocolBufferNanoException) {
                this.a.a(inp.COULD_NOT_PARSE_PROTO, "type", "NetworkMapping", "reason", "proto_parse");
                str2 = "parse_error";
            }
            b = ajdx.b(akxa2.b);
            this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
            return b;
        } catch (Throwable th3) {
            th = th3;
            this.a.a(inp.NETWORK_MAPPING_REQ_TIME, a - j, str3, str2);
            throw th;
        }
    }

    public final ajdx<dml<acgd>> a(boolean z, dml<acgd> dml) {
        boolean z2 = dml == null || dml.c == z;
        Preconditions.checkArgument(z2, "latestNetworkMappingConfig.isProd() does not match the isProd parameter!");
        long a = this.b.a();
        String str = dml == null ? null : dml.b;
        return (z ? ((BoltNetworkMappingInterface) this.c.get()).getNetworkMappingProd(str) : ((BoltNetworkMappingInterface) this.c.get()).getNetworkMappingDev(str)).a(new -$$Lambda$dmq$zXC_cEKTMMYsobYAC94ipmxW68o(this, dml, z, str, a));
    }
}
