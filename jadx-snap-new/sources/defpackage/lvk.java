package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.lenses.camera.carousel.imagepicker.DefaultImagePickerItemView;
import com.snapchat.android.R;
import defpackage.lvf.a.b;
import defpackage.lvi.a;
import java.util.List;

/* renamed from: lvk */
public final class lvk extends Adapter<lvl> implements mhd {
    public final ajwo<a> a;
    public boolean b;
    public List<? extends lvf.a> c;
    private ide d;

    /* renamed from: lvk$a */
    static final class a<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "<anonymous parameter 0>");
            return cfl.a(this.a);
        }
    }

    /* renamed from: lvk$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ lvk a;
        private /* synthetic */ lvl.a b;

        b(lvk lvk, lvl.a aVar) {
            this.a = lvk;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            return new a.a((lvf.a) this.a.c.get(this.b.getAdapterPosition()));
        }
    }

    /* renamed from: lvk$c */
    public static final class c extends mh.a {
        private /* synthetic */ List a;
        private /* synthetic */ List b;

        public c(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        public final int a() {
            return this.a.size();
        }

        public final boolean a(int i, int i2) {
            Object obj = (lvf.a) this.a.get(i);
            lvf.a aVar = (lvf.a) this.b.get(i2);
            if ((akcr.a(akde.a(obj.getClass()), akde.a(aVar.getClass())) ^ 1) == 0) {
                if (akcr.a(obj, lvf.a.a.a)) {
                    return true;
                }
                if (obj instanceof b) {
                    obj = ((b) obj).a();
                    if (aVar != null) {
                        return akcr.a(obj, ((b) aVar).a());
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.lenses.camera.carousel.imagepicker.ImagePickerItemView.Model.Image");
                }
            }
            return false;
        }

        public final int b() {
            return this.b.size();
        }

        public final boolean b(int i, int i2) {
            return akcr.a((lvf.a) this.a.get(i), (lvf.a) this.b.get(i2));
        }
    }

    public /* synthetic */ lvk() {
        this(ajyw.a);
    }

    private lvk(List<? extends lvf.a> list) {
        akcr.b(list, "items");
        this.c = list;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ImagePickerView.Event>()");
        this.a = ajwo;
        this.d = mgy.a;
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        this.d = ide;
    }

    public final int getItemCount() {
        return this.c.size() + this.b;
    }

    public final long getItemId(int i) {
        return getItemViewType(i) == 2 ? Long.MAX_VALUE : (long) ((lvf.a) this.c.get(i)).hashCode();
    }

    public final int getItemViewType(int i) {
        return (this.b && i == this.c.size()) ? 2 : 1;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        lvl lvl = (lvl) viewHolder;
        akcr.b(lvl, "holder");
        if (lvl instanceof lvl.a) {
            lvl.a aVar = (lvl.a) lvl;
            lvf.a aVar2 = (lvf.a) this.c.get(i);
            akcr.b(aVar2, MapboxEvent.KEY_MODEL);
            aVar.a.accept(aVar2);
        }
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        lvl bVar;
        akcr.b(viewGroup, "parent");
        if (i != 1) {
            bVar = new lvl.b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lenses_carousel_imagepicker_item_loading, viewGroup, false));
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lenses_carousel_imagepicker_itemview, viewGroup, false);
            if (inflate != null) {
                DefaultImagePickerItemView defaultImagePickerItemView = (DefaultImagePickerItemView) inflate;
                defaultImagePickerItemView.a(this.d);
                lvl.a aVar = new lvl.a(defaultImagePickerItemView);
                cfl.c(defaultImagePickerItemView).j((ajdt) cfl.b(viewGroup)).t(new a(viewGroup)).p(new b(this, aVar)).c((ajdv) this.a);
                bVar = aVar;
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.camera.carousel.imagepicker.DefaultImagePickerItemView");
            }
        }
        return bVar;
    }
}
