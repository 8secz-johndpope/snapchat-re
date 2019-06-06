package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;
import defpackage.jf.b;

/* renamed from: ox */
public final class ox {
    public final iv<ViewHolder, a> a = new iv();
    public final ja<ViewHolder> b = new ja();

    /* renamed from: ox$b */
    public interface b {
        void a(ViewHolder viewHolder);

        void a(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void b(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void c(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);
    }

    /* renamed from: ox$a */
    public static class a {
        public static defpackage.jf.a<a> d = new b(20);
        public int a;
        public ItemHolderInfo b;
        public ItemHolderInfo c;

        private a() {
        }

        public static a a() {
            a aVar = (a) d.a();
            return aVar == null ? new a() : aVar;
        }

        public static void a(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    public final ItemHolderInfo a(ViewHolder viewHolder, int i) {
        int a = this.a.a((Object) viewHolder);
        if (a < 0) {
            return null;
        }
        a aVar = (a) this.a.c(a);
        if (aVar == null || (aVar.a & i) == 0) {
            return null;
        }
        ItemHolderInfo itemHolderInfo;
        aVar.a &= i ^ -1;
        if (i == 4) {
            itemHolderInfo = aVar.b;
        } else if (i == 8) {
            itemHolderInfo = aVar.c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.a & 12) == 0) {
            this.a.d(a);
            a.a(aVar);
        }
        return itemHolderInfo;
    }

    public final void a() {
        this.a.clear();
        this.b.b();
    }

    public final void a(long j, ViewHolder viewHolder) {
        this.b.a(j, (Object) viewHolder);
    }

    public final void a(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(viewHolder, aVar);
        }
        aVar.b = itemHolderInfo;
        aVar.a |= 4;
    }

    public final boolean a(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public final void b(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(viewHolder, aVar);
        }
        aVar.a |= 1;
    }

    public final void b(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(viewHolder, aVar);
        }
        aVar.c = itemHolderInfo;
        aVar.a |= 8;
    }

    public final void c(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    public final void d(ViewHolder viewHolder) {
        for (int a = this.b.a() - 1; a >= 0; a--) {
            if (viewHolder == this.b.c(a)) {
                this.b.a(a);
                break;
            }
        }
        a aVar = (a) this.a.remove(viewHolder);
        if (aVar != null) {
            a.a(aVar);
        }
    }
}
