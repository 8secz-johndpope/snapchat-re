package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mhl */
public final class mhl implements mhi<mha> {
    private final mhi<? extends mha>[] a;

    /* renamed from: mhl$a */
    public static final class a implements mha {
        private /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        private ajei c() {
            Iterable<mha> iterable = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (mha a : iterable) {
                arrayList.add(a.a());
            }
            return new ajei((Iterable) (List) arrayList);
        }

        public final /* synthetic */ ajej a() {
            return c();
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mhl(mhi<? extends mha>[] mhiArr) {
        akcr.b(mhiArr, "builders");
        this.a = mhiArr;
    }

    private mha b() {
        mhi[] mhiArr = this.a;
        Collection arrayList = new ArrayList(mhiArr.length);
        for (mhi a : mhiArr) {
            arrayList.add((mha) a.a());
        }
        return new a((List) arrayList);
    }

    public final /* synthetic */ Object a() {
        return b();
    }
}
