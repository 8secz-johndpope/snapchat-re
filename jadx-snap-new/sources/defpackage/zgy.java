package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snap.ui.view.SnapFontTextView;
import com.snap.ui.view.button.ScButton;
import com.snap.ui.view.button.SnapCancelButton;
import com.snapchat.android.R;
import defpackage.iii.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: zgy */
public final class zgy extends zja implements zjj, zjq, zli {
    public final acgu<zjm> a;
    private final ajei b;
    private final View c;
    private final achb<zjm, zjk> d;
    private final boolean e;
    private final zhh f;
    private final akbk<ajxw> g;
    private final boolean h;
    private final List<e> i;
    private final akbl<Boolean, a> j;

    /* renamed from: zgy$a */
    public static final class a {
        final View a;
        public final LinearLayout b;
        public boolean c;
        akbl<? super View, ajxw> d;
        boolean e;
        public akbl<? super Boolean, defpackage.iii.a.a> f;
        final float g;
        final float h;
        final Context i;
        final achb<zjm, zjk> j;
        final zjm k;
        final boolean l;
        private String m;
        private CharSequence n;
        private boolean o;
        private final List<a> p;
        private final List<e> q;
        private final List<e> r;
        private akbk<ajxw> s;
        private final DisplayMetrics t;
        private final zhh u;

        /* renamed from: zgy$a$a */
        interface a {
            void a();
        }

        /* renamed from: zgy$a$b */
        final class b implements a {
            final akbl<View, ajxw> a;
            final boolean b;
            final /* synthetic */ a c;
            private final String d;

            /* renamed from: zgy$a$b$a */
            static final class a implements OnClickListener {
                private /* synthetic */ b a;

                a(b bVar) {
                    this.a = bVar;
                }

                public final void onClick(View view) {
                    if (this.a.b) {
                        this.a.c.j.a((achg) this.a.c.k, true, true, null);
                    }
                    akbl akbl = this.a.a;
                    akcr.a((Object) view, "it");
                    akbl.invoke(view);
                }
            }

            public b(a aVar, String str, akbl<? super View, ajxw> akbl, boolean z) {
                akcr.b(str, "text");
                akcr.b(akbl, "callback");
                this.c = aVar;
                this.d = str;
                this.a = akbl;
                this.b = z;
            }

            public final void a() {
                View inflate = LayoutInflater.from(this.c.i).inflate(R.layout.dialog_button, this.c.b, false);
                if (inflate != null) {
                    ScButton scButton = (ScButton) inflate;
                    scButton.setText(this.d);
                    le.a(scButton.getTextView(), (int) this.c.g, (int) this.c.h);
                    scButton.setOnClickListener(new a(this));
                    this.c.b.addView(scButton);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.button.ScButton");
            }
        }

        /* renamed from: zgy$a$j */
        static final class j extends akcs implements akbl<Boolean, defpackage.iii.a.a> {
            public static final j a = new j();

            j() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                return new defpackage.iii.a.a();
            }
        }

        /* renamed from: zgy$a$c */
        final class c implements a {
            final akbl<View, ajxw> a;
            final boolean b;
            final /* synthetic */ a c;
            private final String d;
            private final Integer e;
            private final Float f;

            /* renamed from: zgy$a$c$a */
            static final class a implements OnClickListener {
                private /* synthetic */ c a;

                a(c cVar) {
                    this.a = cVar;
                }

                public final void onClick(View view) {
                    if (this.a.b) {
                        this.a.c.j.a((achg) this.a.c.k, true, true, null);
                    }
                    akbl akbl = this.a.a;
                    akcr.a((Object) view, "it");
                    akbl.invoke(view);
                }
            }

            public /* synthetic */ c(a aVar, String str, akbl akbl, boolean z) {
                this(aVar, str, akbl, z, null, null);
            }

            public c(a aVar, String str, akbl<? super View, ajxw> akbl, boolean z, Integer num, Float f) {
                akcr.b(akbl, "callback");
                this.c = aVar;
                this.d = str;
                this.a = akbl;
                this.b = z;
                this.e = num;
                this.f = f;
            }

            public final void a() {
                View inflate = LayoutInflater.from(this.c.i).inflate(R.layout.dialog_cancel, this.c.b, false);
                if (inflate != null) {
                    SnapCancelButton snapCancelButton = (SnapCancelButton) inflate;
                    snapCancelButton.setOnClickListener(new a(this));
                    String str = this.d;
                    if (str != null) {
                        snapCancelButton.setText(str);
                    }
                    Integer num = this.e;
                    if (num != null) {
                        num.intValue();
                        snapCancelButton.setId(this.e.intValue());
                    }
                    Float f = this.f;
                    if (f != null) {
                        f.floatValue();
                        abrz.a((TextView) snapCancelButton, this.f.floatValue());
                    }
                    this.c.b.addView(snapCancelButton);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.button.SnapCancelButton");
            }
        }

        /* renamed from: zgy$a$f */
        static final class f implements OnClickListener {
            private /* synthetic */ a a;

            f(a aVar) {
                this.a = aVar;
            }

            public final void onClick(View view) {
                if (this.a.l) {
                    akbl akbl = this.a.d;
                    if (akbl != null) {
                        akbl.invoke(this.a.a);
                    }
                    this.a.j.a((achg) this.a.k, true, true, null);
                }
            }
        }

        /* renamed from: zgy$a$e */
        public static final class e {
            final int a;
            final akbl<View, ajxw> b;
            final akbl<View, ajxw> c;
            final akbl<View, ajxw> d;
            final boolean e;

            public e(int i, akbl<? super View, ajxw> akbl, akbl<? super View, ajxw> akbl2, akbl<? super View, ajxw> akbl3, boolean z) {
                akcr.b(akbl, "callback");
                akcr.b(akbl2, "onBind");
                akcr.b(akbl3, "onDispose");
                this.a = i;
                this.b = akbl;
                this.c = akbl2;
                this.d = akbl3;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if ((this.a == eVar.a ? 1 : null) != null && akcr.a(this.b, eVar.b) && akcr.a(this.c, eVar.c) && akcr.a(this.d, eVar.d)) {
                            if ((this.e == eVar.e ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a * 31;
                akbl akbl = this.b;
                int i2 = 0;
                i = (i + (akbl != null ? akbl.hashCode() : 0)) * 31;
                akbl = this.c;
                i = (i + (akbl != null ? akbl.hashCode() : 0)) * 31;
                akbl = this.d;
                if (akbl != null) {
                    i2 = akbl.hashCode();
                }
                i = (i + i2) * 31;
                int i3 = this.e;
                if (i3 != 0) {
                    i3 = 1;
                }
                return i + i3;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ViewResBlock(viewResId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", callback=");
                stringBuilder.append(this.b);
                stringBuilder.append(", onBind=");
                stringBuilder.append(this.c);
                stringBuilder.append(", onDispose=");
                stringBuilder.append(this.d);
                stringBuilder.append(", dismiss=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: zgy$a$g */
        static final class g implements OnClickListener {
            private /* synthetic */ e a;
            private /* synthetic */ a b;

            g(e eVar, a aVar) {
                this.a = eVar;
                this.b = aVar;
            }

            public final void onClick(View view) {
                if (this.a.e) {
                    this.b.j.a((achg) this.b.k, true, true, null);
                }
                akbl akbl = this.a.b;
                akcr.a((Object) view, "it");
                akbl.invoke(view);
            }
        }

        /* renamed from: zgy$a$h */
        static final class h implements OnClickListener {
            private /* synthetic */ e a;
            private /* synthetic */ a b;

            h(e eVar, a aVar) {
                this.a = eVar;
                this.b = aVar;
            }

            public final void onClick(View view) {
                if (this.a.e) {
                    this.b.j.a((achg) this.b.k, true, true, null);
                }
                akbl akbl = this.a.b;
                akcr.a((Object) view, "it");
                akbl.invoke(view);
            }
        }

        /* renamed from: zgy$a$d */
        final class d implements a {
            private final String a;
            private final String b;
            private final TextWatcher c;
            private final InputFilter[] d;
            private final Integer e;
            private final Integer f;
            private final boolean g;
            private final boolean h;

            public d(String str, String str2, TextWatcher textWatcher, InputFilter[] inputFilterArr, Integer num, Integer num2, boolean z, boolean z2) {
                this.a = str;
                this.b = str2;
                this.c = textWatcher;
                this.d = inputFilterArr;
                this.e = num;
                this.f = num2;
                this.g = z;
                this.h = z2;
            }

            public final void a() {
                View inflate = LayoutInflater.from(a.this.i).inflate(R.layout.dialog_edit_text, a.this.b, false);
                if (inflate != null) {
                    EditText editText = (EditText) inflate;
                    editText.setHint(this.a);
                    editText.setText(this.b);
                    editText.setSelectAllOnFocus(this.g);
                    InputFilter[] inputFilterArr = this.d;
                    if (inputFilterArr != null) {
                        editText.setFilters(inputFilterArr);
                    }
                    TextWatcher textWatcher = this.c;
                    if (textWatcher != null) {
                        editText.addTextChangedListener(textWatcher);
                    }
                    Integer num = this.e;
                    if (num != null) {
                        editText.setInputType(num.intValue());
                    }
                    if (this.f != null) {
                        editText.setFilters((InputFilter[]) new LengthFilter[]{new LengthFilter(this.f.intValue())});
                    }
                    a.this.b.addView(editText);
                    if (this.h) {
                        editText.requestFocus();
                        a.this.e = true;
                        return;
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.widget.EditText");
            }
        }

        /* renamed from: zgy$a$i */
        static final class i extends akcs implements akbl<View, ajxw> {
            public static final i a = new i();

            i() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: zgy$a$k */
        static final class k extends akcs implements akbl<View, ajxw> {
            public static final k a = new k();

            k() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: zgy$a$l */
        static final class l extends akcs implements akbl<View, ajxw> {
            public static final l a = new l();

            l() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: zgy$a$m */
        static final class m extends akcs implements akbl<View, ajxw> {
            public static final m a = new m();

            m() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: zgy$a$n */
        static final class n extends akcs implements akbl<View, ajxw> {
            public static final n a = new n();

            n() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        public a(Context context, achb<zjm, zjk> achb, zjm zjm, boolean z, zhh zhh) {
            akcr.b(context, "context");
            akcr.b(achb, "navigationHost");
            akcr.b(zjm, "deckPageType");
            this.i = context;
            this.j = achb;
            this.k = zjm;
            this.l = z;
            this.u = zhh;
            Object inflate = LayoutInflater.from(this.i).inflate(R.layout.dialog, null);
            akcr.a(inflate, "LayoutInflater.from(cont…te(R.layout.dialog, null)");
            this.a = inflate;
            inflate = this.a.findViewById(R.id.dialog_content);
            akcr.a(inflate, "view.findViewById(R.id.dialog_content)");
            this.b = (LinearLayout) inflate;
            this.p = new ArrayList();
            this.q = new ArrayList();
            this.r = new ArrayList();
            this.f = j.a;
            inflate = this.i.getResources();
            akcr.a(inflate, "context.resources");
            this.t = inflate.getDisplayMetrics();
            this.g = this.i.getResources().getDimension(R.dimen.alert_dialog_button_text_min_size) / this.t.scaledDensity;
            this.h = this.i.getResources().getDimension(R.dimen.alert_dialog_button_text_size) / this.t.scaledDensity;
            if (!this.k.b) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        public /* synthetic */ a(Context context, achb achb, zjm zjm, boolean z, zhh zhh, int i) {
            boolean z2 = (i & 8) != 0 ? true : z;
            if ((i & 16) != 0) {
                zhh = null;
            }
            this(context, achb, zjm, z2, zhh);
        }

        private a a(int i, akbl<? super View, ajxw> akbl, akbl<? super View, ajxw> akbl2, akbl<? super View, ajxw> akbl3, boolean z) {
            akcr.b(akbl, "callback");
            akcr.b(akbl2, "onBind");
            akcr.b(akbl3, "onDispose");
            this.q.add(new e(i, akbl, akbl2, akbl3, z));
            return this;
        }

        private a a(int i, String str, TextWatcher textWatcher, InputFilter[] inputFilterArr) {
            this.p.add(new d(this.i.getString(R.string.edit_name), str, textWatcher, inputFilterArr, null, null, false, false));
            return this;
        }

        private a a(akbl<? super View, ajxw> akbl, boolean z, Integer num, Integer num2, Float f) {
            String string;
            akcr.b(akbl, "callback");
            List list = this.p;
            if (num != null) {
                string = this.i.getString(num.intValue());
            } else {
                string = null;
            }
            list.add(new c(this, string, akbl, z, num2, f));
            return this;
        }

        private a a(String str, String str2, TextWatcher textWatcher, InputFilter[] inputFilterArr, Integer num, Integer num2, boolean z, boolean z2) {
            this.p.add(new d(str, str2, textWatcher, inputFilterArr, num, num2, z, z2));
            return this;
        }

        public static /* synthetic */ a a(a aVar, String str, String str2, TextWatcher textWatcher, InputFilter[] inputFilterArr, Integer num, Integer num2, boolean z, boolean z2, int i) {
            int i2 = i;
            return aVar.a(str, str2, (i2 & 4) != 0 ? null : textWatcher, (i2 & 8) != 0 ? null : inputFilterArr, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2);
        }

        private final void a(boolean z) {
            View inflate = LayoutInflater.from(this.i).inflate(R.layout.dialog_title, this.b, false);
            if (inflate != null) {
                SnapFontTextView snapFontTextView = (SnapFontTextView) inflate;
                snapFontTextView.setText(this.m);
                if (!z) {
                    LayoutParams layoutParams = snapFontTextView.getLayoutParams();
                    View view = snapFontTextView;
                    Object context = snapFontTextView.getContext();
                    akcr.a(context, "context");
                    iho.f(view, context.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_top_view_margin_top));
                    snapFontTextView.setLayoutParams(layoutParams);
                }
                snapFontTextView.setText(this.m);
                this.b.addView(snapFontTextView);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.SnapFontTextView");
        }

        private a b(int i, akbl<? super View, ajxw> akbl, akbl<? super View, ajxw> akbl2, akbl<? super View, ajxw> akbl3, boolean z) {
            akcr.b(akbl, "callback");
            akcr.b(akbl2, "onBind");
            akcr.b(akbl3, "onDispose");
            this.r.add(new e(i, akbl, akbl2, akbl3, z));
            return this;
        }

        public static /* synthetic */ a b(a aVar, int i, akbl akbl, akbl akbl2, akbl akbl3, boolean z, int i2) {
            if ((i2 & 4) != 0) {
                akbl2 = m.a;
            }
            akbl akbl4 = akbl2;
            if ((i2 & 8) != 0) {
                akbl3 = n.a;
            }
            return aVar.b(i, akbl, akbl4, akbl3, (i2 & 16) != 0 ? true : z);
        }

        private final a b(boolean z) {
            View inflate = LayoutInflater.from(this.i).inflate(R.layout.dialog_description, this.b, false);
            if (inflate != null) {
                SnapFontTextView snapFontTextView = (SnapFontTextView) inflate;
                if (z) {
                    LayoutParams layoutParams = snapFontTextView.getLayoutParams();
                    View view = snapFontTextView;
                    Object context = snapFontTextView.getContext();
                    String str = "context";
                    akcr.a(context, str);
                    iho.f(view, context.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_top_view_margin_top));
                    snapFontTextView.setLayoutParams(layoutParams);
                    Object context2 = snapFontTextView.getContext();
                    akcr.a(context2, str);
                    snapFontTextView.setTextSize(0, (float) context2.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_description_text_size_without_title));
                }
                snapFontTextView.setText(this.n);
                snapFontTextView.setAutoFit(this.c);
                if (this.o) {
                    snapFontTextView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                this.b.addView(snapFontTextView);
                return this;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.SnapFontTextView");
        }

        private final void c() {
            Iterable iterable = this.q;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                e eVar = (e) next;
                View inflate = LayoutInflater.from(this.i).inflate(eVar.a, this.b, false);
                if (inflate != null) {
                    if (i == 0) {
                        LayoutParams layoutParams = inflate.getLayoutParams();
                        if (layoutParams != null) {
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                            Object context = inflate.getContext();
                            akcr.a(context, "context");
                            marginLayoutParams.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_top_view_margin_top);
                            inflate.setLayoutParams(marginLayoutParams);
                        } else {
                            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    eVar.c.invoke(inflate);
                    inflate.setOnClickListener(new g(eVar, this));
                    this.b.addView(inflate);
                    arrayList.add(ajxw.a);
                    i = i2;
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.view.View");
                }
            }
        }

        private final void d() {
            Iterable<a> iterable = this.p;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (a a : iterable) {
                a.a();
                arrayList.add(ajxw.a);
            }
        }

        private final void e() {
            Iterable<e> iterable = this.r;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (e eVar : iterable) {
                View inflate = LayoutInflater.from(this.i).inflate(eVar.a, this.b, false);
                if (inflate != null) {
                    eVar.c.invoke(inflate);
                    inflate.setOnClickListener(new h(eVar, this));
                    this.b.addView(inflate);
                    arrayList.add(ajxw.a);
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.view.View");
                }
            }
        }

        public final a a(int i) {
            this.m = this.i.getString(i);
            return this;
        }

        public final a a(int i, akbl<? super View, ajxw> akbl) {
            akcr.b(akbl, "callback");
            this.p.add(new c(this, this.i.getString(i), akbl, true));
            return this;
        }

        public final a a(int i, akbl<? super View, ajxw> akbl, boolean z) {
            akcr.b(akbl, "callback");
            List list = this.p;
            Object string = this.i.getString(i);
            akcr.a(string, "context.getString(textId)");
            list.add(new b(this, string, akbl, z));
            return this;
        }

        public final a a(int i, Object... objArr) {
            akcr.b(objArr, "formatArgs");
            this.m = this.i.getString(i, Arrays.copyOf(objArr, 1));
            return this;
        }

        public final a a(akbk<ajxw> akbk) {
            akcr.b(akbk, "callback");
            a aVar = this;
            aVar.s = akbk;
            return aVar;
        }

        public final a a(akbl<? super View, ajxw> akbl) {
            akcr.b(akbl, "callback");
            a aVar = this;
            aVar.d = akbl;
            return aVar;
        }

        public final a a(CharSequence charSequence) {
            akcr.b(charSequence, "text");
            this.n = charSequence;
            this.o = true;
            return this;
        }

        public final a a(String str) {
            akcr.b(str, "text");
            this.m = str;
            return this;
        }

        public final a a(String str, akbl<? super View, ajxw> akbl, boolean z) {
            akcr.b(str, "text");
            akcr.b(akbl, "callback");
            this.p.add(new b(this, str, akbl, z));
            return this;
        }

        public final zgy a() {
            this.a.setOnClickListener(new f(this));
            boolean z = true;
            if ((this.p.isEmpty() ^ 1) != 0 && (ajyu.h(this.p) instanceof b)) {
                iho.e(this.b, this.i.getResources().getDimensionPixelOffset(R.dimen.alert_dialog_background_padding_top));
            }
            c();
            if (this.m != null) {
                a(this.q.size() == 0);
            }
            if (this.n != null) {
                CharSequence charSequence = this.m;
                Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (obj == null || this.q.size() != 0) {
                    z = false;
                }
                b(z);
            }
            e();
            d();
            return new zgy(this.a, this.j, this.k, this.l, this.u, this.s, this.e, ajyu.d((Collection) this.q, (Iterable) this.r), this.f, (byte) 0);
        }

        public final a b() {
            View view = this.a;
            if (view != null) {
                ((ViewGroup) view).setClipToPadding(false);
                ((ViewGroup) this.a).setClipChildren(false);
                this.b.setClipToPadding(false);
                this.b.setClipChildren(false);
                return this;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
        }

        public final a b(int i) {
            this.n = this.i.getString(i);
            return this;
        }

        public final a b(int i, Object... objArr) {
            akcr.b(objArr, "formatArgs");
            this.n = this.i.getString(i, Arrays.copyOf(objArr, 1));
            this.o = true;
            return this;
        }

        public final a b(String str) {
            akcr.b(str, "text");
            this.n = str;
            return this;
        }

        public final a b(String str, akbl<? super View, ajxw> akbl, boolean z) {
            akcr.b(str, "text");
            akcr.b(akbl, "callback");
            this.p.add(new c(this, str, akbl, z));
            return this;
        }
    }

    /* renamed from: zgy$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ zgy a;

        b(zgy zgy) {
            this.a = zgy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View contentView = this.a.getContentView();
            int paddingLeft = this.a.getContentView().getPaddingLeft();
            int paddingTop = this.a.getContentView().getPaddingTop();
            int paddingRight = this.a.getContentView().getPaddingRight();
            akcr.a(obj, "keyboardHeight");
            contentView.setPadding(paddingLeft, paddingTop, paddingRight, obj.intValue());
        }
    }

    private zgy(View view, achb<zjm, zjk> achb, zjm zjm, boolean z, zhh zhh, akbk<ajxw> akbk, boolean z2, List<e> list, akbl<? super Boolean, a> akbl) {
        boolean z3 = z;
        super(zjm, z3 ? acgv.a().a(zgz.a.b((achg) zjm).d().j()).a() : null, null, 4, null);
        this.c = view;
        this.d = achb;
        this.e = z3;
        this.f = zhh;
        this.g = akbk;
        this.h = z2;
        this.i = list;
        this.j = akbl;
        Object d = zgz.a.b((achg) zjm).d();
        akcr.a(d, "DIALOG_PRESENT_BUILDER\n …ype)\n            .build()");
        this.a = d;
        this.b = new ajei();
    }

    public /* synthetic */ zgy(View view, achb achb, zjm zjm, boolean z, zhh zhh, akbk akbk, boolean z2, List list, akbl akbl, byte b) {
        this(view, achb, zjm, z, zhh, akbk, z2, list, akbl);
    }

    public final long S_() {
        return this.e ? 0 : -1;
    }

    public final a a(boolean z) {
        return (a) this.j.invoke(Boolean.valueOf(z));
    }

    public final boolean d() {
        return this.e;
    }

    public final View getContentView() {
        return this.c;
    }

    public final boolean onPageBackPressed() {
        akbk akbk = this.g;
        if (akbk != null) {
            akbk.invoke();
        }
        return this.e ? super.onPageBackPressed() : true;
    }

    public final void onPageHidden(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.onPageHidden(achi);
        for (e eVar : this.i) {
            eVar.d.invoke(getContentView());
        }
        this.b.a();
        zpj.a(getContentView().getContext(), getContentView().getWindowToken());
    }

    public final void onPageVisible(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.onPageVisible(achi);
        zhh zhh = this.f;
        if (zhh != null) {
            this.b.a(zhh.a().f((ajfb) new b(this)));
        }
        if (this.h) {
            abtj.b(getContentView().getContext());
        }
    }
}
