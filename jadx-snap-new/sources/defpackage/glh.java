package defpackage;

import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

/* renamed from: glh */
public final class glh {
    public final Supplier<Boolean> a;
    private final Supplier<Boolean> b;
    private final Supplier<accj> c;
    private final Supplier<accj> d;
    private final ajwy<gqr> e;

    public glh(ajwy<ftl> ajwy, ajwy<gqr> ajwy2) {
        this.b = Suppliers.memoize(new -$$Lambda$glh$4vzVPc1kgAoC_FDXauAaNqsFrS8(ajwy));
        this.c = Suppliers.memoize(new -$$Lambda$glh$Oa40k6rTYOYzFnJ_NtLoJoYjUXc(this, ajwy));
        this.a = Suppliers.memoize(new -$$Lambda$glh$3VpTdiuptrrrFq-Yk7ukSZ5Zy8Y(ajwy));
        this.d = Suppliers.memoize(new -$$Lambda$glh$dGl5U15fFOUm7dxBstL2Z4TC_jA(this, ajwy));
        this.e = ajwy2;
    }

    private accj a(String str) {
        String str2 = "ConcurrencyConfigParser";
        try {
            if (Strings.isNullOrEmpty(str)) {
                return null;
            }
            return (accj) MessageNano.mergeFrom(new accj(), BaseEncoding.base64().decode(str));
        } catch (InvalidProtocolBufferNanoException | IllegalArgumentException e) {
            idd callsite = iew.a.callsite(str2);
            ((gqr) this.e.get()).a(gqt.NORMAL, e, callsite, callsite.a());
            return null;
        }
    }

    private accj a(String str, String str2, Supplier<Boolean> supplier) {
        if (!((Boolean) supplier.get()).booleanValue()) {
            return new accj();
        }
        accj a = a(str);
        if (a == null) {
            a = a(str2);
            if (a == null) {
                a = new accj();
            }
        }
        return a;
    }

    private /* synthetic */ accj c(ajwy ajwy) {
        return a(((ftl) ajwy.get()).j(rxp.METADATA_CONCURRENCY_CONTROL_CONFIG), "CAYQAhotEilodHRwczovL2FwcC5zbmFwY2hhdC5jb20vYnEvdXBkYXRlX2V2ZW50cyAFGjISLmh0dHBzOi8vcnRhbS1jb2xsZWN0b3Iuc25hcGNoYXQuY29tL3YxL21ldHJpY3MgBRo3EjNodHRwczovL3VzLWNlbnRyYWwxLWdjcC5hcGkuc25hcGNoYXQuY29tL3YxL21ldHJpY3MgBRoxEi1odHRwczovL3J0YW0tY29sbGVjdG9yLmFwcHNwb3QuY29tL3YxL21ldHJpY3MgBRomEiJodHRwczovL2FwcC5zbmFwY2hhdC5jb20vYnEvdXBsb2FkIAEaJhIiaHR0cHM6Ly9jZi1zdC5zYy1jZG4ubmV0L3NjLXVwbG9hZCABGhwSGmh0dHBzOi8vYXV0aC5zbmFwY2hhdC5jb20vGkUSQ2h0dHBzOi8vc3RhZ2luZzItZG90LXNjLWFuYWx5dGljcy5hcHBzcG90LmNvbS9hbmFseXRpY3MvYno/bG9nUT1nYWUaRBJCaHR0cHM6Ly9zdGFnaW5nLWRvdC1zYy1hbmFseXRpY3MuYXBwc3BvdC5jb20vYW5hbHl0aWNzL2J6P2xvZ1E9Z2FlGkgSRmh0dHBzOi8vc3RhZ2luZzItZG90LXNjLWFuYWx5dGljcy5hcHBzcG90LmNvbS9hbmFseXRpY3MvYno/bG9nUT1zaGFkb3caRxJFaHR0cHM6Ly9zdGFnaW5nLWRvdC1zYy1hbmFseXRpY3MuYXBwc3BvdC5jb20vYW5hbHl0aWNzL2J6P2xvZ1E9c2hhZG93", this.b);
    }

    public final boolean a() {
        return ((Boolean) this.b.get()).booleanValue();
    }

    public final Supplier<accj> b() {
        return this.c;
    }

    public final Supplier<accj> c() {
        return this.d;
    }
}
