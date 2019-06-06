package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: pus */
public final class pus implements puk {
    public final String a;
    public final List<aerx> b;
    public final List<afdk> c;

    /* renamed from: pus$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static pus a(byte[] bArr) {
            int i;
            akcr.b(bArr, "bytes");
            acjr a = acjr.a(ByteBuffer.wrap(bArr));
            Object b = a.b();
            List arrayList = new ArrayList();
            int c = a.c();
            for (i = 0; i < c; i++) {
                acjn f = a.f(i);
                aerx aerx = new aerx();
                aerx.a = Integer.valueOf(f.b());
                aerx.b = Integer.valueOf(f.c());
                aerx.c = f.d();
                aerx.d = f.e();
                arrayList.add(aerx);
            }
            List arrayList2 = new ArrayList();
            i = a.e();
            for (int i2 = 0; i2 < i; i2++) {
                ackc g = a.g(i2);
                acjk d = g.d();
                afdk afdk = new afdk();
                afdk.a = Integer.valueOf(g.b());
                afdk.b = Integer.valueOf(g.c());
                aegl aegl = new aegl();
                aegl.a = d.b();
                aegl.f = d.c();
                aegl.g = d.d();
                afdk.c = aegl;
                arrayList2.add(afdk);
            }
            akcr.a(b, "text");
            return new pus(b, arrayList, arrayList2);
        }
    }

    static {
        a aVar = new a();
    }

    public /* synthetic */ pus(String str) {
        this(str, ajyw.a, ajyw.a);
    }

    public pus(String str, List<? extends aerx> list, List<? extends afdk> list2) {
        akcr.b(str, "text");
        akcr.b(list, "mediaCardAttributes");
        akcr.b(list2, "textAttributes");
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final String a() {
        Object a = aesq.TEXT.a();
        akcr.a(a, "MessageBodyType.TEXT.value()");
        return a;
    }

    public final byte[] b() {
        String str;
        String str2;
        String str3;
        Object obj;
        int i = 0;
        ccc ccc = new ccc(0);
        int a = ccc.a((CharSequence) this.a);
        List arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (true) {
            str = "it.end";
            str2 = "it.start";
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            aerx aerx = (aerx) it.next();
            int a2 = ccc.a((CharSequence) aerx.c);
            str3 = aerx.d;
            if (str3 != null) {
                num = Integer.valueOf(ccc.a((CharSequence) str3));
            }
            acjn.a(ccc);
            obj = aerx.a;
            akcr.a(obj, str2);
            acjn.a(ccc, obj.intValue());
            Object obj2 = aerx.b;
            akcr.a(obj2, str);
            acjn.b(ccc, obj2.intValue());
            acjn.c(ccc, a2);
            if (num != null) {
                num.intValue();
                acjn.d(ccc, num.intValue());
            }
            arrayList.add(Integer.valueOf(acjn.b(ccc)));
        }
        int a3 = acjr.a(ccc, ajyu.f((Collection) arrayList));
        List arrayList2 = new ArrayList();
        for (afdk afdk : this.c) {
            str3 = afdk.c.a;
            Integer valueOf = str3 != null ? Integer.valueOf(ccc.a((CharSequence) str3)) : null;
            String str4 = afdk.c.f;
            Integer valueOf2 = str4 != null ? Integer.valueOf(ccc.a((CharSequence) str4)) : null;
            String str5 = afdk.c.g;
            Integer valueOf3 = str5 != null ? Integer.valueOf(ccc.a((CharSequence) str5)) : null;
            acjk.a(ccc);
            if (valueOf != null) {
                acjk.a(ccc, valueOf.intValue());
            }
            if (valueOf2 != null) {
                acjk.b(ccc, valueOf2.intValue());
            }
            if (valueOf3 != null) {
                acjk.c(ccc, valueOf3.intValue());
            }
            int b = acjk.b(ccc);
            ackc.a(ccc);
            ackc.c(ccc, b);
            obj = afdk.a;
            akcr.a(obj, str2);
            ackc.a(ccc, obj.intValue());
            Object obj3 = afdk.b;
            akcr.a(obj3, str);
            ackc.b(ccc, obj3.intValue());
            arrayList2.add(Integer.valueOf(ackc.b(ccc)));
        }
        int b2 = acjr.b(ccc, ajyu.f((Collection) arrayList2));
        acjr.a(ccc);
        acjr.a(ccc, a);
        acjr.b(ccc, a3);
        acjr.d(ccc, b2);
        ccc.e(acjr.b(ccc));
        ByteBuffer e = ccc.e();
        byte[] bArr = new byte[(e.capacity() - e.position())];
        while (e.hasRemaining()) {
            a3 = i + 1;
            bArr[i] = e.get();
            i = a3;
        }
        return bArr;
    }
}
