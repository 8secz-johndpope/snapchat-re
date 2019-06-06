package defpackage;

import defpackage.kom.b;

/* renamed from: kok */
public final class kok {
    private final ilv a;

    public kok(ilv ilv) {
        akcr.b(ilv, "graphene");
        this.a = ilv;
    }

    public final void a(kom kom, long j) {
        akcr.b(kom, "danglingLease");
        kol kol = kom.a == b.INVALID ? kol.INVALID : kol.TIME_OUT;
        ilv ilv = this.a;
        iol iol = iol.DANGLING_CODEC_LEASE;
        Object b = kom.c.b();
        String str = "danglingLease.leaseRequest.useCase";
        akcr.a(b, str);
        String str2 = "use_case";
        ilz a = iol.a(str2, (Enum) b);
        Enum enumR = kol;
        String str3 = "dangling_type";
        ilv.c(a.a(str3, enumR), 1);
        ilv = this.a;
        iol = iol.DANGLING_CODEC_LEASE;
        Object b2 = kom.c.b();
        akcr.a(b2, str);
        ilv.a(iol.a(str2, (Enum) b2).a(str3, enumR), j);
    }
}
