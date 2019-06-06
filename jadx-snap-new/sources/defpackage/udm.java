package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.core.db.record.NetworkGatewayInfoModel;
import com.snap.previewtools.caption.ui.CaptionEditTextView;
import com.snapchat.android.R;
import defpackage.ufg.g;
import defpackage.ugc.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: udm */
public final class udm extends zll<udo> {
    static final String w = w;
    private final ajxe A;
    private final ajxe B;
    private final ajxe C;
    private boolean D;
    private final ajwo<udp> E;
    private final ajdp<List<ufg>> F;
    private final ajdx<Boolean> G;
    volatile boolean a;
    ufg b = ufh.a(this.l);
    FrameLayout c;
    ScrollView d;
    CaptionEditTextView e;
    View f;
    final ajxe g = ajxh.a(new d(this));
    final ajdx<udt> h;
    udp i;
    boolean j;
    boolean k;
    final Context l;
    final zgb m;
    final ajwy<uee> n;
    final uoe o;
    final ufp p;
    final udy q;
    final ajwo<Object> r;
    final boolean s;
    final boolean t;
    final boolean u;
    final boolean v;
    private uha x;
    private ImageButton y;
    private final ajxe z = ajxh.a(new k(this));

    /* renamed from: udm$a */
    public final class a implements TextWatcher {
        private final udt a;
        private final boolean b;
        private /* synthetic */ udm c;

        public a(udm udm, udt udt, boolean z) {
            akcr.b(udt, "spanManager");
            this.c = udm;
            this.a = udt;
            this.b = z;
        }

        public final void afterTextChanged(Editable editable) {
            if (this.b) {
                udp udp = this.c.i;
                if (udp != null) {
                    Entry entry = udp.i;
                    if (entry != null) {
                        this.a.a(((Number) entry.getKey()).intValue() + 1, (((Number) entry.getKey()).intValue() + ((unv) entry.getValue()).b.getUsername().length()) + 1);
                        this.a.a((Spannable) udm.a(this.c).getText(), defpackage.abzi.a.UNDERLINE);
                    }
                }
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Missing block: B:45:0x0112, code skipped:
            if (r9 == null) goto L_0x0114;
     */
        public final void onTextChanged(java.lang.CharSequence r17, int r18, int r19, int r20) {
            /*
            r16 = this;
            r0 = r16;
            r1 = r17;
            r2 = r18;
            r3 = r19;
            r4 = r20;
            r5 = r0.c;
            r5 = r5.i;
            if (r5 == 0) goto L_0x01a6;
        L_0x0010:
            if (r1 == 0) goto L_0x01a6;
        L_0x0012:
            r6 = r2 + r4;
            r1 = r1.subSequence(r2, r6);
            r1 = r1.toString();
            if (r1 == 0) goto L_0x01a6;
        L_0x001e:
            r6 = r5.g;
            r7 = r1;
            r7 = (java.lang.CharSequence) r7;
            r8 = "@";
            r9 = r8;
            r9 = (java.lang.CharSequence) r9;
            r10 = 0;
            r9 = defpackage.akgc.a(r7, r9, r10);
            r11 = 1;
            if (r9 == 0) goto L_0x0071;
        L_0x0030:
            r6 = 64;
            r9 = defpackage.akgc.c(r7, r6);
            if (r1 == 0) goto L_0x0069;
        L_0x0038:
            r9 = r1.substring(r9);
            r12 = "(this as java.lang.String).substring(startIndex)";
            defpackage.akcr.a(r9, r12);
            r9 = (java.lang.CharSequence) r9;
            r12 = " ";
            r12 = (java.lang.CharSequence) r12;
            r9 = defpackage.akgc.a(r9, r12, r10);
            if (r9 == 0) goto L_0x004f;
        L_0x004d:
            r6 = 1;
            goto L_0x0057;
        L_0x004f:
            r6 = defpackage.akgc.c(r7, r6);
            r6 = r6 + r2;
            r5.g = r6;
            r6 = 0;
        L_0x0057:
            r1 = defpackage.akcr.a(r1, r8);
            if (r1 == 0) goto L_0x0081;
        L_0x005d:
            r1 = r0.c;
            r1 = r1.q;
            r7 = r1.j;
            r12 = 1;
            r7 = r7 + r12;
            r1.j = r7;
            goto L_0x0081;
        L_0x0069:
            r1 = new ajxt;
            r2 = "null cannot be cast to non-null type java.lang.String";
            r1.<init>(r2);
            throw r1;
        L_0x0071:
            r1 = -1;
            if (r6 == r1) goto L_0x007a;
        L_0x0074:
            r7 = defpackage.ugg.a(r2, r3, r6);
            if (r7 != 0) goto L_0x007e;
        L_0x007a:
            if (r6 != r1) goto L_0x0080;
        L_0x007c:
            if (r4 >= r3) goto L_0x0080;
        L_0x007e:
            r6 = 1;
            goto L_0x0081;
        L_0x0080:
            r6 = 0;
        L_0x0081:
            r1 = new java.util.HashMap;
            r1.<init>();
            r7 = new java.util.HashSet;
            r7.<init>();
            r8 = r5.h;
            r8 = r8.entrySet();
            r8 = r8.iterator();
        L_0x0095:
            r9 = r8.hasNext();
            if (r9 == 0) goto L_0x016c;
        L_0x009b:
            r9 = r8.next();
            r9 = (java.util.Map.Entry) r9;
            r12 = r9.getKey();
            r13 = "tagEntry.key";
            defpackage.akcr.a(r12, r13);
            r12 = (java.lang.Number) r12;
            r12 = r12.intValue();
            r9 = r9.getValue();
            r13 = "tagEntry.value";
            defpackage.akcr.a(r9, r13);
            r9 = (defpackage.unv) r9;
            r13 = r5.i;
            if (r13 == 0) goto L_0x00d5;
        L_0x00bf:
            r13 = r13.getKey();
            r13 = (java.lang.Number) r13;
            r13 = r13.intValue();
            if (r13 != r12) goto L_0x00d5;
        L_0x00cb:
            r13 = r1;
            r13 = (java.util.Map) r13;
            r14 = java.lang.Integer.valueOf(r12);
            r13.put(r14, r9);
        L_0x00d5:
            r13 = defpackage.ugg.b(r2, r3, r12);
            if (r13 == 0) goto L_0x00e8;
        L_0x00db:
            r13 = r1;
            r13 = (java.util.Map) r13;
            r12 = r12 + r4;
            r12 = r12 - r3;
            r12 = java.lang.Integer.valueOf(r12);
            r13.put(r12, r9);
            goto L_0x0095;
        L_0x00e8:
            r13 = r9.b;
            r13 = r13.getUsername();
            r13 = r13.length();
            r13 = r13 + r12;
            r13 = r13 + r11;
            r13 = defpackage.ugg.a(r2, r3, r12, r13);
            if (r13 == 0) goto L_0x015f;
        L_0x00fa:
            r9 = r5.i;
            if (r9 != 0) goto L_0x0169;
        L_0x00fe:
            if (r3 == r4) goto L_0x0169;
        L_0x0100:
            r9 = r5.d;
            r13 = defpackage.abzi.a.UNDERLINE;
            r9 = r9.get(r13);
            r9 = (java.util.List) r9;
            if (r9 == 0) goto L_0x0114;
        L_0x010c:
            r9 = (java.lang.Iterable) r9;
            r9 = defpackage.ajyu.p(r9);
            if (r9 != 0) goto L_0x011b;
        L_0x0114:
            r9 = new java.util.HashSet;
            r9.<init>();
            r9 = (java.util.Set) r9;
        L_0x011b:
            r9 = (java.lang.Iterable) r9;
            r13 = new java.util.ArrayList;
            r13.<init>();
            r13 = (java.util.Collection) r13;
            r9 = r9.iterator();
        L_0x0128:
            r14 = r9.hasNext();
            if (r14 == 0) goto L_0x0147;
        L_0x012e:
            r14 = r9.next();
            r15 = r14;
            r15 = (defpackage.abzi) r15;
            r15 = r15.a();
            r10 = r12 + 1;
            if (r15 != r10) goto L_0x013f;
        L_0x013d:
            r10 = 1;
            goto L_0x0140;
        L_0x013f:
            r10 = 0;
        L_0x0140:
            if (r10 == 0) goto L_0x0145;
        L_0x0142:
            r13.add(r14);
        L_0x0145:
            r10 = 0;
            goto L_0x0128;
        L_0x0147:
            r13 = (java.util.List) r13;
            r13 = (java.lang.Iterable) r13;
            r9 = r13.iterator();
        L_0x014f:
            r10 = r9.hasNext();
            if (r10 == 0) goto L_0x0169;
        L_0x0155:
            r10 = r9.next();
            r10 = (defpackage.abzi) r10;
            r7.add(r10);
            goto L_0x014f;
        L_0x015f:
            r10 = r1;
            r10 = (java.util.Map) r10;
            r12 = java.lang.Integer.valueOf(r12);
            r10.put(r12, r9);
        L_0x0169:
            r10 = 0;
            goto L_0x0095;
        L_0x016c:
            r2 = r5.h;
            r2.clear();
            r2 = r5.h;
            r1 = (java.util.Map) r1;
            r2.putAll(r1);
            r7 = (java.util.Set) r7;
            r1 = r0.b;
            if (r1 == 0) goto L_0x0189;
        L_0x017e:
            r1 = r7.isEmpty();
            if (r1 != 0) goto L_0x0189;
        L_0x0184:
            r1 = r0.a;
            r1.a(r7);
        L_0x0189:
            if (r6 == 0) goto L_0x01a6;
        L_0x018b:
            r1 = r0.c;
            r1 = defpackage.udm.a(r1);
            r1 = r1.getSelectionStart();
            r2 = r0.c;
            r2 = defpackage.udm.a(r2);
            r2 = r2.getText();
            r2 = r2.toString();
            r5.a(r1, r2);
        L_0x01a6:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.udm$a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: udm$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: udm$l */
    static final class l implements OnClickListener {
        private /* synthetic */ udm a;
        private /* synthetic */ ImageButton b;

        l(udm udm, ImageButton imageButton) {
            this.a = udm;
            this.b = imageButton;
        }

        public final void onClick(View view) {
            udp udp = this.a.i;
            if (udp != null) {
                String str = "editTextView";
                CaptionEditTextView captionEditTextView;
                CaptionEditTextView captionEditTextView2;
                if (this.b.isSelected()) {
                    udm udm = this.a;
                    int i = udp.g;
                    captionEditTextView = udm.e;
                    if (captionEditTextView == null) {
                        akcr.a(str);
                    }
                    int selectionStart = captionEditTextView.getSelectionStart();
                    CaptionEditTextView captionEditTextView3 = udm.e;
                    if (captionEditTextView3 == null) {
                        akcr.a(str);
                    }
                    if (selectionStart == captionEditTextView3.getText().length()) {
                        if (i != -1) {
                            captionEditTextView2 = udm.e;
                            if (captionEditTextView2 == null) {
                                akcr.a(str);
                            }
                            captionEditTextView2.getText().delete(i, selectionStart);
                        }
                    } else if (selectionStart != -1) {
                        CaptionEditTextView captionEditTextView4 = udm.e;
                        if (captionEditTextView4 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView4.getText().insert(selectionStart, " ");
                        captionEditTextView4 = udm.e;
                        if (captionEditTextView4 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView2 = udm.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView4.setSelection(captionEditTextView2.getText().length());
                    }
                } else {
                    udm udm2 = this.a;
                    captionEditTextView2 = udm2.e;
                    if (captionEditTextView2 == null) {
                        akcr.a(str);
                    }
                    int selectionStart2 = captionEditTextView2.getSelectionStart();
                    captionEditTextView = udm2.e;
                    if (captionEditTextView == null) {
                        akcr.a(str);
                    }
                    String str2 = "@";
                    CaptionEditTextView captionEditTextView5;
                    if (captionEditTextView.hasSelection()) {
                        captionEditTextView2 = udm2.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str);
                        }
                        Editable text = captionEditTextView2.getText();
                        captionEditTextView5 = udm2.e;
                        if (captionEditTextView5 == null) {
                            akcr.a(str);
                        }
                        int selectionStart3 = captionEditTextView5.getSelectionStart();
                        captionEditTextView = udm2.e;
                        if (captionEditTextView == null) {
                            akcr.a(str);
                        }
                        text.replace(selectionStart3, captionEditTextView.getSelectionEnd(), str2);
                    } else if (selectionStart2 != -1) {
                        captionEditTextView5 = udm2.e;
                        if (captionEditTextView5 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView5.getText().insert(selectionStart2, str2);
                    } else {
                        captionEditTextView2 = udm2.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView2.getText().append(str2);
                    }
                    udy udy = udm2.q;
                    udy.k++;
                    udy udy2 = udm2.q;
                    udy2.j--;
                }
            }
        }
    }

    /* renamed from: udm$o */
    public static final class o implements TextWatcher {
        private /* synthetic */ udm a;
        private /* synthetic */ udo b;

        o(udm udm, udo udo) {
            this.a = udm;
            this.b = udo;
        }

        public final void afterTextChanged(Editable editable) {
            udp udp = this.a.i;
            if (udp != null) {
                if ((akcr.a(String.valueOf(editable), udp.a) ^ 1) != 0) {
                    udp.a(String.valueOf(editable));
                    this.b.b.a((Object) "caption_tool");
                    if (!this.a.k) {
                        udm udm = this.a;
                        udm.k = true;
                        twd.a(((twd) udm.B.b()), twb.PREVIEW_TOOL_FIRST_INTERACTION, null, 6);
                    }
                }
                udm.c(this.a);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: udm$y */
    static final class y implements OnEditorActionListener {
        private /* synthetic */ udm a;

        y(udm udm) {
            this.a = udm;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                Object obj = this.a.i;
                if (obj != null) {
                    this.a.r.a(obj);
                }
            }
            return true;
        }
    }

    /* renamed from: udm$ab */
    static final class ab<T> implements ajfb<MotionEvent> {
        private /* synthetic */ udm a;

        ab(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (MotionEvent) obj;
            akcr.a(obj, "event");
            if (obj.getAction() == 1) {
                obj = this.a.i;
                if (obj != null) {
                    this.a.r.a(obj);
                }
            }
        }
    }

    /* renamed from: udm$ad */
    static final class ad<T> implements ajfl<Boolean> {
        private /* synthetic */ udm a;

        ad(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.a;
        }
    }

    /* renamed from: udm$ae */
    static final class ae<T> implements ajfb<Boolean> {
        private /* synthetic */ udm a;

        ae(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, Property.VISIBLE);
            if (obj.booleanValue()) {
                twd.a(((twd) this.a.B.b()), twb.CAPTION_TOOL_TYPEABLE, null, 6);
                twd.a(((twd) this.a.B.b()), twb.PREVIEW_TOOL_READY, null, 6);
                if (this.a.v) {
                    udm.d(this.a);
                    return;
                }
            }
            this.a.r.a(obj);
        }
    }

    /* renamed from: udm$af */
    static final class af<T> implements ajfl<ajxm<? extends Integer, ? extends Boolean>> {
        public static final af a = new af();

        af() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return akcr.a(((Integer) ajxm.a).intValue(), 0) > 0 && ((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: udm$ag */
    static final class ag<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ udm a;

        ag(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxm) obj, "it");
            return this.a.b().c.e();
        }
    }

    /* renamed from: udm$ai */
    static final class ai<T> implements ajfb<Throwable> {
        public static final ai a = new ai();

        ai() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: udm$aj */
    static final class aj<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ udm a;

        aj(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ufr) obj, "it");
            return this.a.h;
        }
    }

    /* renamed from: udm$ak */
    static final class ak<T, R> implements ajfc<udt, ajdb> {
        final /* synthetic */ udm a;
        final /* synthetic */ float b;
        final /* synthetic */ udp c;
        final /* synthetic */ boolean d;

        ak(udm udm, float f, udp udp, boolean z) {
            this.a = udm;
            this.b = f;
            this.c = udp;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final udt udt = (udt) obj;
            akcr.b(udt, "spanManager");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ ak a;

                public final void run() {
                    Editable text = udm.a(this.a.a).getText();
                    if (text == null) {
                        akcr.a();
                    }
                    if (this.a.b != MapboxConstants.MINIMUM_ZOOM) {
                        udm.a(this.a.a).a(0, this.a.b);
                    }
                    udm.a(this.a.a).setTextSize(0, this.a.c.b);
                    if (this.a.d) {
                        udt.a(this.a.c.a.length(), this.a.c.o);
                    } else {
                        udt.a(this.a.c.d);
                    }
                    udt.a((Spannable) udm.a(this.a.a).getText());
                    udm.a(this.a.a).setSelection(text.length());
                    udm.c(this.a.a);
                    udm.a(this.a.a, this.a.c, CaptionEditTextView.a(udm.a(this.a.a), null, null, null, 7));
                }
            });
        }
    }

    /* renamed from: udm$f */
    static final class f implements ajev {
        private /* synthetic */ udm a;
        private /* synthetic */ udp b;

        f(udm udm, udp udp) {
            this.a = udm;
            this.b = udp;
        }

        public final void run() {
            if (this.a.a) {
                this.a.a().showSoftInput(udm.a(this.a), 1);
                View view = this.a.f;
                if (view == null) {
                    akcr.a("captionEditingBackground");
                }
                int i = 0;
                view.setVisibility(0);
                uha e = udm.e(this.a);
                if (!this.b.o.s) {
                    i = 4;
                }
                e.a(i);
                udm.e(this.a).b(this.b.c() ? this.b.c : this.b.o.t);
                this.a.e();
                if (!this.a.v) {
                    udm.d(this.a);
                }
            }
        }
    }

    /* renamed from: udm$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ udp a;

        g(udp udp) {
            this.a = udp;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: udm$h */
    static final class h implements ajev {
        public static final h a = new h();

        h() {
        }

        public final void run() {
        }
    }

    /* renamed from: udm$i */
    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ ufg a;

        i(ufg ufg) {
            this.a = ufg;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: udm$n */
    static final class n<T> implements ajfb<Object> {
        private /* synthetic */ udm a;

        n(udm udm) {
            this.a = udm;
        }

        public final void accept(Object obj) {
            this.a.f();
        }
    }

    /* renamed from: udm$p */
    static final class p<T> implements ajfb<Float> {
        private /* synthetic */ udm a;
        private /* synthetic */ udo b;

        p(udm udm, udo udo) {
            this.a = udm;
            this.b = udo;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Float) obj;
            udp udp = this.a.i;
            Float valueOf = udp != null ? Float.valueOf(udp.b) : null;
            int i = (valueOf != null ? obj == null || valueOf.floatValue() != obj.floatValue() : obj != null) ? 0 : 1;
            if ((i ^ 1) != 0) {
                this.a.q.f = true;
            }
            udp = this.a.i;
            String str = "it";
            if (udp != null) {
                akcr.a(obj, str);
                udp.b = obj.floatValue();
            }
            CaptionEditTextView a = udm.a(this.a);
            akcr.a(obj, str);
            a.setTextSize(0, obj.floatValue());
            this.b.b.a((Object) "caption_tool");
        }
    }

    /* renamed from: udm$q */
    static final class q<T> implements ajfb<ajxm<? extends Integer, ? extends Boolean>> {
        private /* synthetic */ udm a;

        q(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            udm udm = this.a;
            int intValue = ((Number) ajxm.a).intValue();
            boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
            if (udm.s) {
                udp udp;
                String str;
                CaptionEditTextView captionEditTextView;
                String str2 = "editTextView";
                if (booleanValue) {
                    udp = udm.i;
                    if (udp != null) {
                        Object of;
                        for (Entry entry : udp.h.entrySet()) {
                            Object key = entry.getKey();
                            akcr.a(key, "tagEntry.key");
                            int intValue2 = ((Number) key).intValue();
                            Object value = entry.getValue();
                            akcr.a(value, "tagEntry.value");
                            if (ugg.a(intValue2 + 1, ((unv) value).b.getUsername().length() + 1, intValue)) {
                                of = Optional.of(entry);
                                str = "Optional.of(tagEntry)";
                                break;
                            }
                        }
                        of = Optional.absent();
                        str = "Optional.absent()";
                        akcr.a(of, str);
                        if (of.isPresent()) {
                            udp.g = ((Number) ((Entry) of.get()).getKey()).intValue();
                        } else {
                            captionEditTextView = udm.e;
                            if (captionEditTextView == null) {
                                akcr.a(str2);
                            }
                            udp.a(intValue, captionEditTextView.getText().toString());
                        }
                    }
                }
                if (udm.s) {
                    udp = udm.i;
                    if (udp != null) {
                        udm.o.b();
                        str = "";
                        if (udp.g == -1) {
                            udm.c().a(udm.o.a(str), true);
                            return;
                        }
                        int i = udp.g + 1;
                        CaptionEditTextView captionEditTextView2 = udm.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str2);
                        }
                        intValue = captionEditTextView2.getSelectionStart();
                        captionEditTextView = udm.e;
                        if (captionEditTextView == null) {
                            akcr.a(str2);
                        }
                        str2 = captionEditTextView.getText().toString();
                        if (intValue < i) {
                            udm.c().a(udm.o.a(str), true);
                        } else if (intValue > str2.length()) {
                            udm.c().a(udm.o.a(str), true);
                        } else if (str2 != null) {
                            obj = str2.substring(i, intValue);
                            akcr.a(obj, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            if ((((CharSequence) obj).length() == 0 ? 1 : null) != null) {
                                udm.c().a(udm.o.a(), true);
                            } else {
                                udm.c().a(udm.o.a(obj), true);
                            }
                        } else {
                            throw new ajxt("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: udm$r */
    static final class r<T> implements ajfl<ugz> {
        private /* synthetic */ udm a;

        r(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((ugz) obj, "it");
            return this.a.a;
        }
    }

    /* renamed from: udm$s */
    static final class s<T> implements ajfb<ugz> {
        private /* synthetic */ udm a;
        private /* synthetic */ udo b;

        s(udm udm, udo udo) {
            this.a = udm;
            this.b = udo;
        }

        public final /* synthetic */ void accept(Object obj) {
            ugz ugz = (ugz) obj;
            udp udp = this.a.i;
            if (udp != null) {
                udp.c = ugz.a;
                udm.a(this.a).a(ugz.a);
                ufp.a(udp.o, (TextView) udm.a(this.a));
                udm udm = this.a;
                udm.a(udm, udp, CaptionEditTextView.a(udm.a(udm), null, null, null, 7));
                this.b.b.a((Object) "caption_tool");
                this.a.q.g = true;
            }
        }
    }

    /* renamed from: udm$t */
    static final class t<T> implements ajfb<List<? extends ufg>> {
        private /* synthetic */ udm a;

        t(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            udz c = this.a.c();
            akcr.a(obj, "it");
            akcr.b(obj, "styles");
            c.e.clear();
            c.e.addAll((Collection) obj);
        }
    }

    /* renamed from: udm$u */
    static final class u<T> implements ajfb<ajxm<? extends udt, ? extends Boolean>> {
        final /* synthetic */ udm a;

        /* renamed from: udm$u$a */
        static final class a implements defpackage.udj.a {
            private /* synthetic */ u a;

            a(u uVar) {
                this.a = uVar;
            }

            public final ufg a() {
                udp udp = this.a.a.i;
                if (udp != null) {
                    ufg ufg = udp.o;
                    if (ufg != null) {
                        return ufg;
                    }
                }
                return ufh.a(this.a.a.l);
            }
        }

        u(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            Object obj2 = (udt) ajxm.a;
            obj = (Boolean) ajxm.b;
            if (this.a.s) {
                udm udm = this.a;
                akcr.a(obj2, "snapManager");
                akcr.a(obj, "isPreviewUXExperimentEnabled");
                udm.a(this.a).addTextChangedListener(new a(udm, obj2, obj.booleanValue()));
            }
            udj udj = new udj(udm.a(this.a), obj2, new a(this));
            udm.a(this.a).setCustomSelectionActionModeCallback(udj);
            udm.a(this.a).addTextChangedListener(udj);
        }
    }

    /* renamed from: udm$v */
    static final class v<T> implements ajfb<Throwable> {
        public static final v a = new v();

        v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: udm$w */
    static final class w<T> implements ajfl<udp> {
        private /* synthetic */ udm a;

        w(udm udm) {
            this.a = udm;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((udp) obj, "it");
            return !this.a.a;
        }
    }

    /* renamed from: udm$z */
    static final class z<T> implements ajfl<Object> {
        private /* synthetic */ udm a;

        z(udm udm) {
            this.a = udm;
        }

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return this.a.a;
        }
    }

    /* renamed from: udm$c */
    static final class c extends akcs implements akbk<ukp> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ukp) this.a.get();
        }
    }

    /* renamed from: udm$d */
    static final class d extends akcs implements akbk<uee> {
        private /* synthetic */ udm a;

        d(udm udm) {
            this.a = udm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uee) this.a.n.get();
        }
    }

    /* renamed from: udm$e */
    static final class e extends akcs implements akbk<udz> {
        private /* synthetic */ udm a;
        private /* synthetic */ ajwy b;

        e(udm udm, ajwy ajwy) {
            this.a = udm;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a.l;
            FrameLayout frameLayout = this.a.c;
            if (frameLayout == null) {
                akcr.a("toolLayout");
            }
            zgb zgb = this.a.m;
            Object obj = (uee) this.a.g.b();
            akcr.a(obj, "captionStyleDataSource");
            return new udz(context, frameLayout, zgb, obj, this.a.o, this.a.p, new WeakReference(this.a), this.a.q, this.a.s, this.a.t, this.a.u, this.b);
        }
    }

    /* renamed from: udm$j */
    static final class j extends akcs implements akbk<twd> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (twd) this.a.get();
        }
    }

    /* renamed from: udm$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ udm a;

        k(udm udm) {
            this.a = udm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite(udm.w));
        }
    }

    /* renamed from: udm$m */
    static final class m extends akcs implements akbk<Boolean> {
        private /* synthetic */ udm a;

        m(udm udm) {
            this.a = udm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = this.a.e != null && udm.a(this.a).getTypeface() == null;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: udm$aa */
    static final class aa extends akcq implements akbl<Object, ajxw> {
        aa(udm udm) {
            super(1, udm);
        }

        public final String getName() {
            return "exitEditing";
        }

        public final akej getOwner() {
            return akde.a(udm.class);
        }

        public final String getSignature() {
            return "exitEditing(Ljava/lang/Object;)V";
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0144  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
            /*
            r13 = this;
            r0 = "p1";
            defpackage.akcr.b(r14, r0);
            r14 = r13.receiver;
            r14 = (defpackage.udm) r14;
            r0 = r14.a;
            if (r0 == 0) goto L_0x014a;
        L_0x000d:
            r0 = r14.q;
            r1 = r14.i;
            r2 = 0;
            if (r1 == 0) goto L_0x0022;
        L_0x0014:
            r1 = r1.a;
            if (r1 == 0) goto L_0x0022;
        L_0x0018:
            r1 = (java.lang.CharSequence) r1;
            r1 = r1.length();
            if (r1 <= 0) goto L_0x0022;
        L_0x0020:
            r1 = 1;
            goto L_0x0023;
        L_0x0022:
            r1 = 0;
        L_0x0023:
            r0.h = r1;
            r0 = r14.q;
            r1 = r14.i;
            if (r1 == 0) goto L_0x0030;
        L_0x002b:
            r1 = r1.d();
            goto L_0x0031;
        L_0x0030:
            r1 = 0;
        L_0x0031:
            r0.i = r1;
            r0 = r14.q;
            r1 = new aada;
            r1.<init>();
            r3 = r0.d;
            r4 = 0;
            if (r3 == 0) goto L_0x0071;
        L_0x003f:
            r5 = new java.lang.StringBuilder;
            r6 = "[";
            r5.<init>(r6);
            r6 = r0.a();
            r7 = r3.x;
            r7 = (double) r7;
            r6 = r6.format(r7);
            r5.append(r6);
            r6 = 44;
            r5.append(r6);
            r6 = r0.a();
            r3 = r3.y;
            r7 = (double) r3;
            r3 = r6.format(r7);
            r5.append(r3);
            r3 = 93;
            r5.append(r3);
            r3 = r5.toString();
            goto L_0x0072;
        L_0x0071:
            r3 = r4;
        L_0x0072:
            r1.a(r3);
            r5 = r0.e;
            r3 = java.lang.Double.valueOf(r5);
            r1.a(r3);
            r3 = r0.b;
            r3 = r3.size();
            r5 = (long) r3;
            r3 = java.lang.Long.valueOf(r5);
            r1.a(r3);
            r3 = r0.b;
            r3 = r3.isEmpty();
            if (r3 == 0) goto L_0x0096;
        L_0x0094:
            r3 = r4;
            goto L_0x00ab;
        L_0x0096:
            r3 = r0.b;
            r5 = r3;
            r5 = (java.lang.Iterable) r5;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r3 = defpackage.udy.c.a;
            r11 = r3;
            r11 = (defpackage.akbl) r11;
            r12 = 31;
            r3 = defpackage.ajyu.a(r5, r6, r7, r8, r9, r10, r11, r12);
        L_0x00ab:
            r1.b(r3);
            r3 = r0.f;
            r3 = java.lang.Boolean.valueOf(r3);
            r1.a(r3);
            r3 = r0.g;
            r3 = java.lang.Boolean.valueOf(r3);
            r1.b(r3);
            r3 = r0.h;
            r3 = java.lang.Boolean.valueOf(r3);
            r1.c(r3);
            r3 = r0.i;
            r3 = java.lang.Boolean.valueOf(r3);
            r1.d(r3);
            r5 = r0.j;
            r3 = java.lang.Long.valueOf(r5);
            r1.b(r3);
            r5 = r0.k;
            r3 = java.lang.Long.valueOf(r5);
            r1.c(r3);
            r5 = r0.l;
            r3 = java.lang.Long.valueOf(r5);
            r1.d(r3);
            r3 = r0.a;
            r3 = r3.b();
            r3 = (defpackage.dib) r3;
            r1 = (defpackage.aajt) r1;
            r3.a(r1);
            r5 = -1;
            r0.c = r5;
            r5 = 0;
            r0.e = r5;
            r0.d = r4;
            r1 = r0.b;
            r1.clear();
            r0.f = r2;
            r0.g = r2;
            r0.h = r2;
            r0.i = r2;
            r5 = 0;
            r0.j = r5;
            r0.k = r5;
            r0.l = r5;
            r14.a = r2;
            r14.j = r2;
            r14.i = r4;
            r0 = r14.a();
            r1 = r14.e;
            r3 = "editTextView";
            if (r1 != 0) goto L_0x012c;
        L_0x0129:
            defpackage.akcr.a(r3);
        L_0x012c:
            r1 = r1.getWindowToken();
            r0.hideSoftInputFromWindow(r1, r2);
            r14.d();
            r0 = r14.e;
            if (r0 != 0) goto L_0x013d;
        L_0x013a:
            defpackage.akcr.a(r3);
        L_0x013d:
            r0.a(r2);
            r14 = r14.e;
            if (r14 != 0) goto L_0x0147;
        L_0x0144:
            defpackage.akcr.a(r3);
        L_0x0147:
            r14.clearFocus();
        L_0x014a:
            r14 = defpackage.ajxw.a;
            return r14;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.udm$aa.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: udm$ac */
    static final class ac extends akcq implements akbl<Integer, ajxw> {
        ac(udm udm) {
            super(1, udm);
        }

        public final String getName() {
            return "setViewLocation";
        }

        public final akej getOwner() {
            return akde.a(udm.class);
        }

        public final String getSignature() {
            return "setViewLocation(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            udm.a((udm) this.receiver, ((Number) obj).intValue());
            return ajxw.a;
        }
    }

    /* renamed from: udm$ah */
    static final class ah extends akcq implements akbl<Integer, ajxw> {
        ah(udm udm) {
            super(1, udm);
        }

        public final String getName() {
            return "setViewLocation";
        }

        public final akej getOwner() {
            return akde.a(udm.class);
        }

        public final String getSignature() {
            return "setViewLocation(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            udm.a((udm) this.receiver, ((Number) obj).intValue());
            return ajxw.a;
        }
    }

    /* renamed from: udm$x */
    static final class x extends akcq implements akbl<udp, ajxw> {
        x(udm udm) {
            super(1, udm);
        }

        public final String getName() {
            return "enterEditing";
        }

        public final akej getOwner() {
            return akde.a(udm.class);
        }

        public final String getSignature() {
            return "enterEditing(Lcom/snap/previewtools/caption/CaptionModel;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            udp udp = (udp) obj;
            akcr.b(udp, "p1");
            udm udm = (udm) this.receiver;
            if (!udm.a) {
                udm.a = true;
                udm.i = udp;
                ScrollView scrollView = udm.d;
                if (scrollView == null) {
                    akcr.a("scrollView");
                }
                scrollView.setVisibility(0);
                CaptionEditTextView captionEditTextView = udm.e;
                if (captionEditTextView == null) {
                    akcr.a("editTextView");
                }
                captionEditTextView.requestFocus();
                zln.bindTo$default(udm, udm.a(false).a((ajev) new f(udm, udp), (ajfb) new g(udp)), udm, null, null, 6, null);
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(udm.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(udm.class), "captionStyleDataSource", "getCaptionStyleDataSource()Lcom/snap/previewtools/caption/content/CaptionStyleDataSourceInterface;"), new akdc(akde.a(udm.class), "captionKeyboardDetector", "getCaptionKeyboardDetector()Lcom/snap/previewtools/shared/CaptionKeyboardDetector;"), new akdc(akde.a(udm.class), "previewMetricsPlugin", "getPreviewMetricsPlugin()Lcom/snap/preview/metrics/PreviewMetricsPlugin;"), new akdc(akde.a(udm.class), "carouselViewController", "getCarouselViewController()Lcom/snap/previewtools/caption/CarouselViewController;")};
        b bVar = new b();
    }

    public udm(Context context, zgb zgb, ajwy<uee> ajwy, uoe uoe, ufp ufp, udy udy, ajwo<udp> ajwo, ajwo<Object> ajwo2, ajdp<List<ufg>> ajdp, boolean z, boolean z2, boolean z3, boolean z4, ajdx<Boolean> ajdx, ajwy<udu> ajwy2, ajwy<ukp> ajwy3, ajwy<twd> ajwy4) {
        Context context2 = context;
        zgb zgb2 = zgb;
        ajwy<uee> ajwy5 = ajwy;
        uoe uoe2 = uoe;
        ufp ufp2 = ufp;
        udy udy2 = udy;
        ajwo<udp> ajwo3 = ajwo;
        ajwo<Object> ajwo4 = ajwo2;
        ajdp<List<ufg>> ajdp2 = ajdp;
        ajdx<Boolean> ajdx2 = ajdx;
        ajwy<ukp> ajwy6 = ajwy3;
        ajwy<twd> ajwy7 = ajwy4;
        akcr.b(context2, "context");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(ajwy5, "captionStyleDataSourceProvider");
        akcr.b(uoe2, "userTaggingDataSource");
        akcr.b(ufp2, "captionViewUpdateMixin");
        akcr.b(udy2, "captionV2Analytics");
        akcr.b(ajwo3, "enterEditingSubject");
        akcr.b(ajwo4, "exitEditingSubject");
        akcr.b(ajdp2, "initializedStylesObservable");
        akcr.b(ajdx2, "previewUXEnabledSingle");
        akcr.b(ajwy2, "captionSpanManagerFactory");
        akcr.b(ajwy6, "captionKeyboardDetector");
        akcr.b(ajwy7, "previewMetricsPluginProvider");
        this.l = context2;
        this.m = zgb2;
        this.n = ajwy5;
        this.o = uoe2;
        this.p = ufp2;
        this.q = udy2;
        this.E = ajwo3;
        this.r = ajwo4;
        this.F = ajdp2;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = z4;
        this.G = ajdx2;
        this.A = ajxh.a(new c(ajwy6));
        this.h = udu.a((udu) ajwy2.get(), (akbk) new m(this)).a();
        this.B = ajxh.a(new j(ajwy7));
        this.C = ajxh.a(new e(this, ajwy7));
    }

    public static final /* synthetic */ void a(udm udm, int i) {
        if (udm.a) {
            udm.c().b.a(Integer.valueOf(i));
            CaptionEditTextView captionEditTextView = udm.e;
            String str = "editTextView";
            if (captionEditTextView == null) {
                akcr.a(str);
            }
            i -= ((Number) udm.c().a.b()).intValue();
            CaptionEditTextView captionEditTextView2 = udm.e;
            if (captionEditTextView2 == null) {
                akcr.a(str);
            }
            captionEditTextView.setY((float) (i - captionEditTextView2.getHeight()));
        }
    }

    public static final /* synthetic */ void a(udm udm, udp udp, int i) {
        Object arrayList;
        CaptionEditTextView captionEditTextView = udm.e;
        String str = "editTextView";
        if (captionEditTextView == null) {
            akcr.a(str);
        }
        EditText editText = captionEditTextView;
        akcr.b(editText, "editText");
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (selectionStart == -1 || selectionEnd == -1) {
            arrayList = new ArrayList();
        } else {
            if (selectionStart == selectionEnd) {
                selectionStart = 0;
                selectionEnd = editText.length();
            }
            Object text = editText.getText();
            akcr.a(text, "editText.text");
            arrayList = a.a(text, i, selectionStart, selectionEnd);
        }
        akcr.b(arrayList, "<set-?>");
        udp.e = arrayList;
        CaptionEditTextView captionEditTextView2 = udm.e;
        if (captionEditTextView2 == null) {
            akcr.a(str);
        }
        Editable text2 = captionEditTextView2.getText();
        if (text2 == null) {
            akcr.a();
        }
        a.a(text2);
        a.a((Spannable) text2, (List) udp.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    public static final /* synthetic */ void c(defpackage.udm r4) {
        /*
        r0 = r4.i;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r0.o;
        r1 = defpackage.ufh.e(r1);
        r2 = "editTextView";
        if (r1 == 0) goto L_0x003b;
    L_0x000f:
        r0 = r0.a();
        r1 = 17;
        if (r0 != r1) goto L_0x003b;
    L_0x0017:
        r0 = r4.e;
        if (r0 != 0) goto L_0x001e;
    L_0x001b:
        defpackage.akcr.a(r2);
    L_0x001e:
        r1 = r4.c;
        if (r1 != 0) goto L_0x0027;
    L_0x0022:
        r3 = "toolLayout";
        defpackage.akcr.a(r3);
    L_0x0027:
        r1 = r1.getWidth();
        r3 = r4.e;
        if (r3 != 0) goto L_0x0032;
    L_0x002f:
        defpackage.akcr.a(r2);
    L_0x0032:
        r3 = r3.getWidth();
        r1 = r1 - r3;
        r1 = r1 / 2;
        r1 = (float) r1;
        goto L_0x0052;
    L_0x003b:
        r0 = r4.e;
        if (r0 != 0) goto L_0x0042;
    L_0x003f:
        defpackage.akcr.a(r2);
    L_0x0042:
        r0 = r0.getX();
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x0055;
    L_0x004b:
        r0 = r4.e;
        if (r0 != 0) goto L_0x0052;
    L_0x004f:
        defpackage.akcr.a(r2);
    L_0x0052:
        r0.setX(r1);
    L_0x0055:
        r4 = r4.e;
        if (r4 != 0) goto L_0x005c;
    L_0x0059:
        defpackage.akcr.a(r2);
    L_0x005c:
        r4.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udm.c(udm):void");
    }

    public static final /* synthetic */ void d(udm udm) {
        udm.c().e();
        udp udp = udm.i;
        if (udp != null) {
            udm.c().a(udp.o);
        }
        if (udm.s && !udm.D) {
            ImageButton imageButton = udm.c().h;
            if (imageButton != null) {
                imageButton.setOnClickListener(new l(udm, imageButton));
            }
            udm.D = true;
        }
    }

    public static final /* synthetic */ uha e(udm udm) {
        uha uha = udm.x;
        if (uha == null) {
            akcr.a("colorPicker");
        }
        return uha;
    }

    private final zfw g() {
        return (zfw) this.z.b();
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(boolean z) {
        Object a;
        String str;
        udp udp = this.i;
        if (udp == null) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            float f = (udp.o.j == null || (akcr.a(udp.b, udp.o.j) ^ 1) == 0) ? MapboxConstants.MINIMUM_ZOOM : udp.b;
            try {
                CaptionEditTextView captionEditTextView = this.e;
                String str2 = "editTextView";
                if (captionEditTextView == null) {
                    akcr.a(str2);
                }
                captionEditTextView.setText(udp.a);
                captionEditTextView = this.e;
                if (captionEditTextView == null) {
                    akcr.a(str2);
                }
                captionEditTextView.e = (ufh.a(udp.o) ^ 1) != 0 ? captionEditTextView.b() : null;
                if (udp.c != 0) {
                    captionEditTextView = this.e;
                    if (captionEditTextView == null) {
                        akcr.a(str2);
                    }
                    captionEditTextView.a(udp.c);
                }
                captionEditTextView = this.e;
                if (captionEditTextView == null) {
                    akcr.a(str2);
                }
                captionEditTextView.setGravity(ufh.a(udp.o) ? 8388611 : udp.a());
                ufp ufp = this.p;
                ufk ufk = new ufk(ufk.a.PREVIEW, udp.o);
                CaptionEditTextView captionEditTextView2 = this.e;
                if (captionEditTextView2 == null) {
                    akcr.a(str2);
                }
                a = ufp.a(ufk, (TextView) captionEditTextView2, false).d((ajfb) ai.a).a((ajfc) new aj(this)).a((ajdw) g().l()).e((ajfc) new ak(this, f, udp, z));
                str = "captionViewUpdateMixin.u…          }\n            }";
            } catch (NullPointerException e) {
                a = ajcx.b((Throwable) e);
                str = "Completable.error(e)";
            }
        }
        akcr.a(a, str);
        return a;
    }

    /* Access modifiers changed, original: final */
    public final InputMethodManager a() {
        Object systemService = this.l.getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public final void takeTarget(udo udo) {
        akcr.b(udo, "target");
        super.takeTarget(udo);
        this.c = udo.a;
        FrameLayout frameLayout = this.c;
        String str = "toolLayout";
        if (frameLayout == null) {
            akcr.a(str);
        }
        Object systemService = frameLayout.getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            LayoutInflater layoutInflater = (LayoutInflater) systemService;
            View inflate = layoutInflater.inflate(R.layout.caption_edit_view, null);
            if (inflate != null) {
                this.d = (ScrollView) inflate;
                inflate = layoutInflater.inflate(R.layout.caption_editing_background_view, null);
                if (inflate != null) {
                    this.f = inflate;
                    FrameLayout frameLayout2 = this.c;
                    if (frameLayout2 == null) {
                        akcr.a(str);
                    }
                    View inflate2 = layoutInflater.inflate(R.layout.caption_tools, frameLayout2, false);
                    if (inflate2 != null) {
                        ViewGroup viewGroup = (ViewGroup) inflate2;
                        FrameLayout frameLayout3 = this.c;
                        if (frameLayout3 == null) {
                            akcr.a(str);
                        }
                        View view = this.f;
                        if (view == null) {
                            akcr.a("captionEditingBackground");
                        }
                        frameLayout3.addView(view);
                        frameLayout3 = this.c;
                        if (frameLayout3 == null) {
                            akcr.a(str);
                        }
                        ScrollView scrollView = this.d;
                        String str2 = "scrollView";
                        if (scrollView == null) {
                            akcr.a(str2);
                        }
                        frameLayout3.addView(scrollView);
                        frameLayout3 = this.c;
                        if (frameLayout3 == null) {
                            akcr.a(str);
                        }
                        frameLayout3.addView(viewGroup);
                        ScrollView scrollView2 = this.d;
                        if (scrollView2 == null) {
                            akcr.a(str2);
                        }
                        Object findViewById = scrollView2.findViewById(R.id.caption_edit_text_view);
                        akcr.a(findViewById, "scrollView.findViewById(…d.caption_edit_text_view)");
                        this.e = (CaptionEditTextView) findViewById;
                        CaptionEditTextView captionEditTextView = this.e;
                        String str3 = "editTextView";
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView.p = this.t;
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView.a(this.u);
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        FrameLayout frameLayout4 = this.c;
                        if (frameLayout4 == null) {
                            akcr.a(str);
                        }
                        captionEditTextView.setY((float) (frameLayout4.getHeight() / 2));
                        CaptionEditTextView captionEditTextView2 = this.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView2.addTextChangedListener(new o(this, udo));
                        captionEditTextView2 = this.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView2.setMovementMethod(new ScrollingMovementMethod());
                        captionEditTextView2 = this.e;
                        if (captionEditTextView2 == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView2.setOnEditorActionListener(new y(this));
                        ScrollView scrollView3 = this.d;
                        if (scrollView3 == null) {
                            akcr.a(str2);
                        }
                        ajej f = cfl.f(scrollView3).f((ajfb) new ab(this));
                        zln zln = this;
                        zln.bindTo$default(this, f, zln, null, null, 6, null);
                        udm udm = this;
                        ajej f2 = b().c.f((ajfb) new udn(new ac(udm)));
                        zln zln2 = zln;
                        zln.bindTo$default(this, f2, zln2, null, null, 6, null);
                        zln.bindTo$default(this, b().b.a((ajfl) new ad(this)).f((ajfb) new ae(this)), zln2, null, null, 6, null);
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        zln.bindTo$default(this, ajwa.a(captionEditTextView.j, b().b).a((ajfl) af.a).n(new ag(this)).f((ajfb) new udn(new ah(udm))), zln, null, null, 6, null);
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        zln.bindTo$default(this, captionEditTextView.i.f((ajfb) new p(this, udo)), zln, null, null, 6, null);
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        ajws ajws = captionEditTextView.k;
                        if (ajws == null) {
                            akcr.a("cursorPositionChangeSubject");
                        }
                        zln.bindTo$default(this, ajws.f((ajfb) new q(this)), zln, null, null, 6, null);
                        captionEditTextView = this.e;
                        if (captionEditTextView == null) {
                            akcr.a(str3);
                        }
                        zln.bindTo$default(this, captionEditTextView.b().a.a(), zln, null, null, 6, null);
                        Object obj = (ImageView) viewGroup.findViewById(R.id.color_picker_color_bar);
                        str2 = "colorBar";
                        if (udo.c) {
                            int dimensionPixelSize = this.l.getResources().getDimensionPixelSize(R.dimen.tools_button_size);
                            akcr.a(obj, str2);
                            LayoutParams layoutParams = obj.getLayoutParams();
                            if (layoutParams != null) {
                                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin -= dimensionPixelSize;
                            } else {
                                throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        }
                        Context context = this.l;
                        akcr.a(obj, str2);
                        Object findViewById2 = viewGroup.findViewById(R.id.color_picker_droplet);
                        akcr.a(findViewById2, "captionToolView.findView….id.color_picker_droplet)");
                        ImageView imageView = (ImageView) findViewById2;
                        findViewById2 = viewGroup.findViewById(R.id.color_picker_tracking_dot);
                        akcr.a(findViewById2, "captionToolView.findView…olor_picker_tracking_dot)");
                        this.x = new uha(context, obj, imageView, (ImageView) findViewById2, -1);
                        uha uha = this.x;
                        if (uha == null) {
                            akcr.a("colorPicker");
                        }
                        zln2 = zln;
                        zln.bindTo$default(this, uha.a().a((ajfl) new r(this)).f((ajfb) new s(this, udo)), zln2, null, null, 6, null);
                        Object findViewById3 = viewGroup.findViewById(R.id.caption_alignment_button);
                        ImageButton imageButton = (ImageButton) findViewById3;
                        zln.bindTo$default(this, cfl.c(imageButton).f((ajfb) new n(this)), zln2, null, null, 6, null);
                        akcr.a(findViewById3, "captionToolView.findView…  .bindTo(this)\n        }");
                        this.y = imageButton;
                        zln.bindTo$default(this, this.F.f((ajfb) new t(this)), zln2, null, null, 6, null);
                        CaptionEditTextView captionEditTextView3 = this.e;
                        if (captionEditTextView3 == null) {
                            akcr.a(str3);
                        }
                        captionEditTextView3.setTextIsSelectable(true);
                        findViewById3 = this.h;
                        akcr.a(findViewById3, "spanManagerSingle");
                        zln2 = zln;
                        zln.bindTo$default(this, ajwd.a(findViewById3, this.G).a((ajfb) new u(this), (ajfb) v.a), zln2, null, null, 6, null);
                        zln.bindTo$default(this, this.E.a((ajfl) new w(this)).a((ajdw) g().l()).f((ajfb) new udn(new x(udm))), zln2, null, null, 6, null);
                        zln.bindTo$default(this, this.r.a((ajfl) new z(this)).a((ajdw) g().l()).f((ajfb) new udn(new aa(udm))), zln2, null, null, 6, null);
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
                }
                throw new ajxt("null cannot be cast to non-null type android.view.View");
            }
            throw new ajxt("null cannot be cast to non-null type android.widget.ScrollView");
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* Access modifiers changed, original: final */
    public final ukp b() {
        return (ukp) this.A.b();
    }

    /* Access modifiers changed, original: final */
    public final udz c() {
        return (udz) this.C.b();
    }

    public final void d() {
        ScrollView scrollView = this.d;
        if (scrollView == null) {
            akcr.a("scrollView");
        }
        scrollView.setVisibility(4);
        c().b().setVisibility(8);
        View view = this.f;
        if (view == null) {
            akcr.a("captionEditingBackground");
        }
        view.setVisibility(8);
        uha uha = this.x;
        if (uha == null) {
            akcr.a("colorPicker");
        }
        uha.a(8);
        ImageButton imageButton = this.y;
        if (imageButton == null) {
            akcr.a("alignmentButton");
        }
        imageButton.setVisibility(8);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    public final void e() {
        /*
        r4 = this;
        r0 = r4.i;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r4.y;
        if (r1 != 0) goto L_0x000e;
    L_0x0009:
        r2 = "alignmentButton";
        defpackage.akcr.a(r2);
    L_0x000e:
        r2 = 0;
        r1.setVisibility(r2);
        r2 = r0.o;
        r2 = defpackage.ufh.a(r2);
        if (r2 == 0) goto L_0x0020;
    L_0x001a:
        r0 = 8;
        r1.setVisibility(r0);
        return;
    L_0x0020:
        r2 = r0.a();
        r3 = 3;
        if (r2 == r3) goto L_0x0037;
    L_0x0027:
        r3 = 5;
        if (r2 == r3) goto L_0x0033;
    L_0x002a:
        r3 = 17;
        if (r2 == r3) goto L_0x002f;
    L_0x002e:
        goto L_0x003d;
    L_0x002f:
        r2 = 2131231110; // 0x7f080186 float:1.8078292E38 double:1.052968075E-314;
        goto L_0x003a;
    L_0x0033:
        r2 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        goto L_0x003a;
    L_0x0037:
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;
    L_0x003a:
        r1.setImageResource(r2);
    L_0x003d:
        r1 = r4.e;
        if (r1 != 0) goto L_0x0046;
    L_0x0041:
        r2 = "editTextView";
        defpackage.akcr.a(r2);
    L_0x0046:
        r0 = r0.a();
        r1.setGravity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udm.e():void");
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        udp udp = this.i;
        if (udp != null) {
            int a = udp.a();
            if (a == 3) {
                udp.f = 17;
            } else if (a == 5) {
                udp.f = 3;
            } else if (a == 17) {
                udp.f = 5;
            }
            e();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCaptionCarouselItemFailedToLoadEvent(uft uft) {
        akcr.b(uft, "event");
        udz c = c();
        ufg ufg = uft.a;
        akcr.b(ufg, "captionStyle");
        c.g.add(ufg);
        c.f();
    }

    @akqq
    public final void onCaptionCarouselItemLoadedEvent(ufu ufu) {
        akcr.b(ufu, "event");
        ufr ufr = ufu.a;
        udz c = c();
        String str = ufr.a;
        boolean z = ufr.b;
        long j = ufr.c;
        String str2 = "styleId";
        akcr.b(str, str2);
        twd d = c.d();
        akcr.b(str, str2);
        d.a.c(ipc.FONT_SOURCE.a(str2, str).a("source", z ? NetworkGatewayInfoModel.SERVER : "cache"), 1);
        c.j = Math.max(c.j, j);
        c.i--;
        if (c.i <= 0 && !c.k) {
            c.k = true;
            c.d().a.a((ily) ipc.CAPTION_FONT_LOAD_TIME, c.j);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCarouselItemClicked(ufs ufs) {
        akcr.b(ufs, "event");
        udp udp = this.i;
        if (udp != null) {
            if (akcr.a(udp.o.a, ufs.a.a.b.a)) {
                if (!ufh.a(udp.o)) {
                    f();
                }
                return;
            }
            float a;
            ufg ufg = ufs.a.a.b;
            this.b = ufg;
            udp.a(ufg);
            g gVar = ufg.n;
            Object resources = this.l.getResources();
            String str = "context.resources";
            akcr.a(resources, str);
            udp.f = ufh.a(gVar, resources);
            e();
            if (ufg.j == null || ufg.j.floatValue() <= MapboxConstants.MINIMUM_ZOOM) {
                a = a.a(this.l, ufh.a(udp.o));
            } else {
                float floatValue = ufg.j.floatValue();
                Object resources2 = this.l.getResources();
                akcr.a(resources2, str);
                Object displayMetrics = resources2.getDisplayMetrics();
                akcr.a(displayMetrics, "context.resources.displayMetrics");
                a = a.a(2, floatValue, displayMetrics);
            }
            udp.b = a;
            uha uha = this.x;
            String str2 = "colorPicker";
            if (uha == null) {
                akcr.a(str2);
            }
            uha.a(ufg.s ? 0 : 4);
            int i = udp.c() ? udp.c : ufg.t;
            uha = this.x;
            if (uha == null) {
                akcr.a(str2);
            }
            uha.b(i);
            c().a(ufs.a.a.b);
            udo udo = (udo) getTarget();
            if (udo != null) {
                ajwo ajwo = udo.b;
                if (ajwo != null) {
                    ajwo.a((Object) "caption_tool");
                }
            }
            zln.bindTo$default(this, a(true).a((ajev) h.a, (ajfb) new i(ufg)), this, null, null, 6, null);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUserTaggingCarouselItemClicked(uoa uoa) {
        akcr.b(uoa, "event");
        if (this.s) {
            udp udp = this.i;
            if (udp != null) {
                int i = udp.g;
                CaptionEditTextView captionEditTextView = this.e;
                String str = "editTextView";
                if (captionEditTextView == null) {
                    akcr.a(str);
                }
                int selectionStart = captionEditTextView.getSelectionStart();
                if (selectionStart > i && i != -1) {
                    CaptionEditTextView captionEditTextView2 = this.e;
                    if (captionEditTextView2 == null) {
                        akcr.a(str);
                    }
                    Editable text = captionEditTextView2.getText();
                    if (text == null) {
                        akcr.a();
                    }
                    int i2 = i + 1;
                    text.delete(i2, selectionStart);
                    unv unv = uoa.a.a;
                    akcr.b(unv, "tag");
                    udp.h.put(Integer.valueOf(i), unv);
                    udp.k++;
                    udp.i = Maps.immutableEntry(Integer.valueOf(i), uoa.a.a);
                    udp.g = -1;
                    CaptionEditTextView captionEditTextView3 = this.e;
                    if (captionEditTextView3 == null) {
                        akcr.a(str);
                    }
                    Editable text2 = captionEditTextView3.getText();
                    if (text2 == null) {
                        akcr.a();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(uoa.a.a.b.getUsername());
                    stringBuilder.append(" ");
                    text2.insert(i2, stringBuilder.toString());
                    udp.i = null;
                    udy udy = this.q;
                    udy.l++;
                }
            }
        }
    }
}
