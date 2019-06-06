package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.lenses.camera.carousel.DefaultCarouselItemView;
import com.snapchat.android.R;
import defpackage.lrw.a;
import defpackage.lrw.a.d;
import defpackage.lsd.a.c;
import java.util.List;

/* renamed from: lre */
public final class lre extends Adapter<lrf> implements mhd {
    public final ajwo<c> a;
    private ide b;
    private final int c;
    private List<? extends a> d;

    /* renamed from: lre$c */
    public static final class c extends mh.a {
        private /* synthetic */ List a;
        private /* synthetic */ List b;

        c(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        public final int a() {
            return this.a.size();
        }

        public final boolean a(int i, int i2) {
            a aVar = (a) this.a.get(i);
            a aVar2 = (a) this.b.get(i2);
            akcr.b(aVar, "receiver$0");
            akcr.b(aVar2, "other");
            return aVar == aVar2 || (akcr.a(aVar.getClass(), aVar2.getClass()) && akcr.a(aVar.d(), aVar2.d()));
        }

        public final int b() {
            return this.b.size();
        }

        public final boolean b(int i, int i2) {
            return akcr.a((a) this.a.get(i), (a) this.b.get(i2));
        }
    }

    /* renamed from: lre$a */
    static final class a<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "it");
            return cfl.a(this.a);
        }
    }

    /* renamed from: lre$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lre a;
        private /* synthetic */ lrf b;

        b(lre lre, lrf lrf) {
            this.a = lre;
            this.b = lrf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            int adapterPosition = this.b.getAdapterPosition();
            return adapterPosition != -1 ? ajdp.b(new c(adapterPosition, this.a.a(adapterPosition))) : ajvo.a(ajot.a);
        }
    }

    public lre() {
        this(0, null, 3);
    }

    private lre(int i, List<? extends a> list) {
        akcr.b(list, "items");
        this.c = i;
        this.d = list;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Ca…iew.Event.ItemSelected>()");
        this.a = ajwo;
        this.b = mgy.a;
        setHasStableIds(true);
    }

    public /* synthetic */ lre(int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = R.layout.lenses_camera_carousel_item_view;
        }
        if ((i2 & 2) != 0) {
            list = ajyw.a;
        }
        this(i, list);
    }

    public final a a(int i) {
        return (a) this.d.get(i);
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        this.b = ide;
    }

    public final void a(List<? extends a> list) {
        akcr.b(list, "items");
        List list2 = this.d;
        this.d = list;
        mh.a(new c(list2, list), false).a((Adapter) this);
    }

    public final int getItemCount() {
        return this.d.size();
    }

    public final long getItemId(int i) {
        return (long) ((a) this.d.get(i)).d().hashCode();
    }

    public final int getItemViewType(int i) {
        a a = a(i);
        if (a instanceof a.c) {
            return 0;
        }
        if ((a instanceof d) || (a instanceof a.a)) {
            return 1;
        }
        throw new ajxk();
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        lrf lrf = (lrf) viewHolder;
        akcr.b(lrf, "holder");
        a aVar = (a) this.d.get(i);
        akcr.b(aVar, "carouselItemViewModel");
        lrf.a.accept(aVar);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        akcr.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
        if (inflate != null) {
            DefaultCarouselItemView defaultCarouselItemView = (DefaultCarouselItemView) inflate;
            defaultCarouselItemView.a(this.b);
            lrf lrf = new lrf(defaultCarouselItemView);
            cfl.c(defaultCarouselItemView).j((ajdt) cfl.b(viewGroup)).t(new a(viewGroup)).u(new b(this, lrf)).c((ajdv) this.a);
            return lrf;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.lenses.camera.carousel.DefaultCarouselItemView");
    }
}
