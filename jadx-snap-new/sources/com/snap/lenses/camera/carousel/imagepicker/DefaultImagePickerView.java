package com.snap.lenses.camera.carousel.imagepicker;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdv;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajwo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfi;
import defpackage.cfk;
import defpackage.cfl;
import defpackage.ide;
import defpackage.lvi;
import defpackage.lvk;
import defpackage.lvm;
import defpackage.mgy;
import defpackage.mh;
import defpackage.mhd;
import defpackage.mih;
import java.util.List;

public final class DefaultImagePickerView extends LinearLayout implements lvi, mhd {
    final ajwo<ajxw> a;
    final ajwo<defpackage.lvi.a> b;
    boolean c = true;
    private final ajxe d = ajxh.a(new f(this));
    private final ajxe e = ajxh.a(e.a);
    private int f;
    private int g;
    private ide h = mgy.a;
    private final ajxe i = ajxh.a(new d(this));

    static final class e extends akcs implements akbk<lvk> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lvk();
        }
    }

    static final class f extends akcs implements akbk<lvm> {
        private /* synthetic */ DefaultImagePickerView a;

        f(DefaultImagePickerView defaultImagePickerView) {
            this.a = defaultImagePickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lvm(this.a);
        }
    }

    static final class d extends akcs implements akbk<ajdp<defpackage.lvi.a>> {
        private /* synthetic */ DefaultImagePickerView a;

        d(DefaultImagePickerView defaultImagePickerView) {
            this.a = defaultImagePickerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b((ajdt) this.a.a().a, (ajdt) this.a.b);
        }
    }

    static abstract class a<T extends View> implements defpackage.lvm.b<T> {
        private final int a;

        public static final class a extends a<ImagePickerListView> {
            final lvk a;
            final ajdp<?> b;
            private final ajdv<defpackage.lvi.a> c;

            static final class b<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
                private /* synthetic */ ImagePickerListView a;

                b(ImagePickerListView imagePickerListView) {
                    this.a = imagePickerListView;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajdp) obj, "it");
                    return cfl.a(this.a);
                }
            }

            static final class c<T> implements ajfl<cfi> {
                private /* synthetic */ a a;

                c(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ boolean test(Object obj) {
                    akcr.b((cfi) obj, "it");
                    return this.a.a();
                }
            }

            static final class d<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
                private /* synthetic */ a a;

                d(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajdp) obj, "it");
                    return this.a.b;
                }
            }

            static final class e<T, R> implements ajfc<T, R> {
                public static final e a = new e();

                e() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((cfi) obj, "it");
                    return defpackage.lvi.a.b.a;
                }
            }

            static final class a extends akcs implements akbk<Boolean> {
                private /* synthetic */ a a;
                private /* synthetic */ LinearLayoutManager b;

                a(a aVar, LinearLayoutManager linearLayoutManager) {
                    this.a = aVar;
                    this.b = linearLayoutManager;
                    super(0);
                }

                public final boolean a() {
                    return !this.a.a.b && this.b.findLastVisibleItemPosition() >= this.a.a.getItemCount() - 3;
                }

                public final /* synthetic */ Object invoke() {
                    return Boolean.valueOf(a());
                }
            }

            public a(lvk lvk, ajdv<defpackage.lvi.a> ajdv, ajdp<?> ajdp) {
                akcr.b(lvk, "adapter");
                akcr.b(ajdv, "relay");
                akcr.b(ajdp, "loading");
                super(R.layout.lenses_carousel_imagepicker_listview, (byte) 0);
                this.a = lvk;
                this.c = ajdv;
                this.b = ajdp;
            }

            public final /* synthetic */ void a(View view) {
                ImagePickerListView imagePickerListView = (ImagePickerListView) view;
                akcr.b(imagePickerListView, "view");
                imagePickerListView.setAdapter(this.a);
                LayoutManager layoutManager = imagePickerListView.getLayoutManager();
                if (layoutManager != null) {
                    Object p = cfk.a(imagePickerListView).j((ajdt) cfl.b(imagePickerListView)).t(new b(imagePickerListView)).a((ajfl) new c(new a(this, (LinearLayoutManager) layoutManager))).c(1).t(new d(this)).p(e.a);
                    akcr.a(p, "scrollEvents(view)\n     …View.Event.LoadNextPage }");
                    p.c(this.c);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }

            /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0029;
            L_0x0002:
                r0 = r3 instanceof com.snap.lenses.camera.carousel.imagepicker.DefaultImagePickerView.a.a;
                if (r0 == 0) goto L_0x0027;
            L_0x0006:
                r3 = (com.snap.lenses.camera.carousel.imagepicker.DefaultImagePickerView.a.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x0012:
                r0 = r2.c;
                r1 = r3.c;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x001c:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x0027;
            L_0x0026:
                goto L_0x0029;
            L_0x0027:
                r3 = 0;
                return r3;
            L_0x0029:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.imagepicker.DefaultImagePickerView$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                lvk lvk = this.a;
                int i = 0;
                int hashCode = (lvk != null ? lvk.hashCode() : 0) * 31;
                ajdv ajdv = this.c;
                hashCode = (hashCode + (ajdv != null ? ajdv.hashCode() : 0)) * 31;
                ajdp ajdp = this.b;
                if (ajdp != null) {
                    i = ajdp.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ListView(adapter=");
                stringBuilder.append(this.a);
                stringBuilder.append(", relay=");
                stringBuilder.append(this.c);
                stringBuilder.append(", loading=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        public static final class b extends a<TextView> {
            public static final b a = new b();

            private b() {
                super(R.layout.lenses_carousel_imagepicker_message_view, (byte) 0);
            }
        }

        private a(int i) {
            this.a = i;
        }

        public /* synthetic */ a(int i, byte b) {
            this(i);
        }

        public final int a() {
            return this.a;
        }

        public void a(T t) {
            String str = "view";
            akcr.b(t, str);
            akcr.b(t, str);
        }
    }

    static final class b extends akcs implements akbl<TextView, ajxw> {
        private /* synthetic */ defpackage.lvi.b a;

        b(defpackage.lvi.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextView textView = (TextView) obj;
            akcr.b(textView, "receiver$0");
            textView.setText(((defpackage.lvi.b.b) this.a).a);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<ImagePickerListView, ajxw> {
        private /* synthetic */ DefaultImagePickerView a;
        private /* synthetic */ defpackage.lvi.b b;

        c(DefaultImagePickerView defaultImagePickerView, defpackage.lvi.b bVar) {
            this.a = defaultImagePickerView;
            this.b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ImagePickerListView imagePickerListView = (ImagePickerListView) obj;
            akcr.b(imagePickerListView, "receiver$0");
            lvk a = this.a.a();
            List list = ((defpackage.lvi.b.c) this.b).a;
            akcr.b(list, "newItems");
            List list2 = a.c;
            a.c = list;
            mh.a(new defpackage.lvk.c(list2, list)).a((Adapter) a);
            boolean z = ((defpackage.lvi.b.c) this.b).b;
            int i = 1;
            if (a.b != z) {
                a.b = z;
                if (z) {
                    a.notifyItemInserted(a.getItemCount() - 1);
                } else {
                    a.notifyItemRemoved(a.getItemCount() - 1);
                }
            }
            if (a.b) {
                this.a.a.a(ajxw.a);
            }
            if (this.a.c) {
                int i2 = 0;
                for (defpackage.lvf.a aVar : ((defpackage.lvi.b.c) this.b).a) {
                    Object obj2 = ((aVar instanceof defpackage.lvf.a.b) && ((defpackage.lvf.a.b) aVar).c()) ? 1 : null;
                    if (obj2 != null) {
                        break;
                    }
                    i2++;
                }
                i2 = -1;
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf.intValue() < 0) {
                    i = 0;
                }
                if (i == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    this.a.c = false;
                    imagePickerListView.post(new a(imagePickerListView, intValue));
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultImagePickerView.class), "popupViewController", "getPopupViewController()Lcom/snap/lenses/camera/carousel/imagepicker/PopupViewController;"), new akdc(akde.a(DefaultImagePickerView.class), "imagePickerAdapter", "getImagePickerAdapter()Lcom/snap/lenses/camera/carousel/imagepicker/LensImagePickerAdapter;"), new akdc(akde.a(DefaultImagePickerView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultImagePickerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Unit>()");
        this.a = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ImagePickerView.Event>()");
        this.b = ajwo;
    }

    private final void a(mih mih) {
        int i = mih.d + this.f;
        int i2 = mih.a + this.g;
        int i3 = mih.c + this.g;
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            Object obj = null;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                obj = 1;
            }
            if (marginLayoutParams.leftMargin != i2) {
                marginLayoutParams.leftMargin = i2;
                obj = 1;
            }
            if (marginLayoutParams.rightMargin != i3) {
                marginLayoutParams.rightMargin = i3;
                obj = 1;
            }
            if (obj != null) {
                setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final lvm c() {
        return (lvm) this.d.b();
    }

    /* Access modifiers changed, original: final */
    public final lvk a() {
        return (lvk) this.e.b();
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        a().a(ide);
        this.h = ide;
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.lvi.b bVar = (defpackage.lvi.b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        if (bVar instanceof defpackage.lvi.b.b) {
            a(((defpackage.lvi.b.b) bVar).b);
            c().a(b.a, new b(bVar));
        } else if (bVar instanceof defpackage.lvi.b.c) {
            a aVar = new a(a(), this.b, this.a);
            a(((defpackage.lvi.b.c) bVar).c);
            c().a(aVar, new c(this, bVar));
        } else {
            if (bVar instanceof defpackage.lvi.b.a) {
                this.c = true;
                c().a();
            }
        }
    }

    public final ajdp<defpackage.lvi.a> b() {
        return (ajdp) this.i.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = getResources().getDimensionPixelSize(R.dimen.lenses_carousel_imagepicker_bottom_margin);
        this.g = getResources().getDimensionPixelSize(R.dimen.lenses_carousel_imagepicker_horizontal_margin);
    }
}
