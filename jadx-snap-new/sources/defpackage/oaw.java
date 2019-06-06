package defpackage;

import android.content.res.Resources;
import android.location.Location;
import android.text.format.DateFormat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.nbo.c;
import defpackage.nct.a;
import defpackage.nnl.b;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: oaw */
public final class oaw extends oaj implements b {
    final aczy a;
    final ncn b;
    final obj c;
    boolean e;
    Boolean f = Boolean.FALSE;
    private final nct g;
    private final nbo h;
    private final TextView i;
    private final acpv j;
    private final View k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final View o;
    private final ImageView p;
    private final niw q;
    private final boolean r;
    private final a s = new a(this, (byte) 0);
    private final abnp t;
    private boolean u = false;
    private final acqx v;
    private a w;
    private boolean x;
    private final c y = new 1();

    /* renamed from: oaw$1 */
    class 1 implements c {

        /* renamed from: oaw$1$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                oaw.this.a.k();
            }
        }

        1() {
        }

        public final void a(Map<String, alhq> map) {
            oaw.this.a.b().a.a(new 1());
        }
    }

    /* renamed from: oaw$2 */
    class 2 extends adbw {
        2() {
        }

        public final boolean a(View view, MotionEvent motionEvent) {
            if (!oaw.this.e && motionEvent.getAction() == 1) {
                oaw.this.c.a();
            }
            return true;
        }
    }

    /* renamed from: oaw$3 */
    class 3 implements ajfb<Boolean> {
        3() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            oaw oaw = oaw.this;
            oaw.f = bool;
            oaw.e();
        }
    }

    /* renamed from: oaw$a */
    class a implements ncn.c {
        private a() {
        }

        /* synthetic */ a(oaw oaw, byte b) {
            this();
        }

        public final void a() {
            oaw.this.a.b().f.a(oaw.this.b.e());
            oaw.this.a.b().f.c.a();
            oaw.this.e();
        }

        public final void b() {
        }
    }

    /* renamed from: oaw$b */
    static class b implements a {
        private final WeakReference<oaw> a;

        public b(oaw oaw) {
            this.a = new WeakReference(oaw);
        }

        public final void a() {
        }

        public final void a(Location location) {
            oaw oaw = (oaw) this.a.get();
            if (oaw != null) {
                oaw.a(location);
            }
        }
    }

    /* renamed from: oaw$c */
    static class c implements acwc.a {
        private final ncn a;
        private boolean b = this.a.e();
        private boolean c;

        c(ncn ncn) {
            this.a = ncn;
        }

        public final float a() {
            return MapboxConstants.MINIMUM_ZOOM;
        }

        public final float a(acvr acvr, acwk acwk) {
            return 1.0f;
        }

        public final String a(acvp acvp, Resources resources) {
            return "";
        }

        public final boolean a(boolean z, String str) {
            this.b = z;
            return this.c != this.b;
        }

        public final String b(acvp acvp, Resources resources) {
            this.c = this.b;
            return null;
        }

        public final String c(acvp acvp, Resources resources) {
            return null;
        }
    }

    public oaw(View view, obk obk, ncn ncn, nct nct, nbo nbo, obj obj, acpv acpv, aczz aczz, niw niw, ajdp<Boolean> ajdp, abnp abnp, ajei ajei) {
        super(view, obk);
        this.t = abnp;
        this.v = new acqx(view.getResources(), new ihl());
        this.r = DateFormat.is24HourFormat(view.getContext());
        this.b = ncn;
        this.g = nct;
        this.h = nbo;
        this.c = obj;
        this.j = acpv;
        this.q = niw;
        aclh aclh = new aclh();
        acli acli = new acli();
        acli.a = "SharingSettingsExploreMapCard";
        acli.c = false;
        acli.b = true;
        acli.e = false;
        acli.d = true;
        acli = acli.a(0.09f);
        acli.h = true;
        this.a = aczz.a(aclh, acli, abbd.SETTINGS);
        this.a.b().a.a(new 2());
        acmu b = this.a.b().a.p().b(view.getContext());
        ViewGroup a = b.a();
        this.a.a(b, null);
        this.a.b().f.m.a();
        ((LinearLayout) view.findViewById(R.id.map_anchor)).addView(a);
        this.i = (TextView) view.findViewById(R.id.map_status_text);
        this.k = view.findViewById(R.id.map_status_container);
        this.l = view.findViewById(R.id.map_status_wrapper);
        this.m = (TextView) view.findViewById(R.id.map_status_subtext);
        this.n = (TextView) view.findViewById(R.id.map_status_view_count);
        this.o = view.findViewById(R.id.map_status_view_count_image);
        this.p = (ImageView) view.findViewById(R.id.map_status_view_count_caret);
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.p.setImageDrawable(view.getResources().getDrawable(R.drawable.neon_header_back_white));
        }
        ajei.a(ajdp.d(new 3()).l());
    }

    private void a(List<acqf> list) {
        long j;
        String str;
        ntt ntt = new ntt();
        String str2 = "";
        if (!list.isEmpty()) {
            aljr aljr = ((acqf) list.get(0)).b;
            if (aljr != null) {
                j = aljr.b;
                if (aljr.a.b != null) {
                    String valueOf = String.valueOf(aljr.a.b.b);
                    alhh.a[] aVarArr = aljr.a.b.c;
                    if (aVarArr.length > 0) {
                        str2 = aVarArr[0].b;
                    }
                    str = str2;
                    str2 = valueOf;
                    ntt.a = str2;
                    ntt.b = str;
                    ntt.c = j;
                    this.t.c(ntt);
                }
                str = str2;
                ntt.a = str2;
                ntt.b = str;
                ntt.c = j;
                this.t.c(ntt);
            }
        }
        j = 0;
        str = str2;
        ntt.a = str2;
        ntt.b = str;
        ntt.c = j;
        this.t.c(ntt);
    }

    private boolean a(alhh alhh, acmj acmj) {
        acpx a = acqe.a(alhh, this.h);
        if (a == null) {
            return false;
        }
        Map map = a.a;
        List list = a.b;
        final List list2 = a.c;
        if (list.size() <= 1) {
            return false;
        }
        acpw a2 = acqe.a(this.a.l(), map);
        List list3 = a2.a;
        Collection collection = a2.b;
        ViewGroup k = this.a.b().a.k();
        if (k == null) {
            return false;
        }
        this.a.b().f.t.a(list3).a(collection);
        this.a.b().f.E = list2;
        this.a.b().f.a(this.q.b());
        ales ales = (ales) list.get(list.size() - 1);
        final cgi a3 = cgo.a(ales.a, ales.b);
        if (list2.isEmpty() || ((acvh) list2.get(0)).a != 1) {
            acmj.a(0, adby.a(k, (alhm) list3.get(0), 0.09f, MapboxConstants.MINIMUM_ZOOM), 0, this.i.getHeight());
        } else {
            acmj.a(0, 0, 0, (int) (((float) this.a.b().a.b.heightPixels) * 0.045f));
        }
        acmj.a(a3, 10.0d, new acmj.a() {
            public final void a() {
            }

            public final void b() {
                for (acvh acvh : list2) {
                    if (acvh.h == null) {
                        acvh.h = new acuh(1.0f, 1.0f, 500.0f, acun.a);
                    }
                }
                oaw.this.a.b().a.m();
            }
        });
        return true;
    }

    private void f() {
        this.i.setGravity(17);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
    }

    public final void L_() {
        d();
    }

    public final void a() {
        this.x = false;
        this.a.e();
        this.t.b(this);
        this.h.b(this.y);
        this.b.b(this.s);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    public final void a(defpackage.acmj r10, java.util.List<defpackage.acqf> r11, java.lang.String r12, android.location.Location r13) {
        /*
        r9 = this;
        r0 = r9.a;
        r0 = r0.b();
        r0 = r0.a;
        r0 = r0.k();
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r1 = r11.isEmpty();
        r2 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r4 = 0;
        if (r1 != 0) goto L_0x0035;
    L_0x0018:
        r11 = r11.get(r4);
        r11 = (defpackage.acqf) r11;
        r11 = r11.b;
        if (r11 == 0) goto L_0x0035;
    L_0x0022:
        r1 = r11.a;
        if (r1 == 0) goto L_0x0035;
    L_0x0026:
        r1 = r11.a;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0035;
    L_0x002c:
        r11 = r11.a;
        r11 = r11.b;
        r11 = r9.a(r11, r10);
        goto L_0x0050;
    L_0x0035:
        r5 = r13.getLatitude();
        r7 = r13.getLongitude();
        r11 = defpackage.cgo.a(r5, r7);
        r10.a(r11, r2);
        r11 = r9.a;
        r11 = r11.b();
        r11 = r11.f;
        r11.a(r12);
        r11 = 0;
    L_0x0050:
        if (r11 != 0) goto L_0x00a7;
    L_0x0052:
        r11 = 0;
        r1 = 1035489772; // 0x3db851ec float:0.09 double:5.11599923E-315;
        r5 = 0;
        r11 = defpackage.adby.a(r0, r11, r1, r5);
        r0 = r9.k;
        r0 = r0.getHeight();
        r1 = r9.l;
        r1 = r1.getPaddingTop();
        r0 = r0 - r1;
        r10.a(r4, r11, r4, r0);
        r11 = r9.a;
        r11 = r11.b();
        r11 = r11.f;
        r11 = r11.t;
        r0 = java.util.Collections.singletonList(r12);
        r11.a(r0);
        r11 = r9.a;
        r11 = r11.b();
        r11 = r11.f;
        r0 = new oaw$c;
        r1 = r9.b;
        r0.<init>(r1);
        r11.D = r0;
        r0 = r13.getLatitude();
        r5 = r13.getLongitude();
        r11 = defpackage.cgo.a(r0, r5);
        r10.a(r11, r2);
        r10 = r9.a;
        r10 = r10.b();
        r10 = r10.f;
        r10.a(r12);
    L_0x00a7:
        r10 = r9.itemView;
        r10.setVisibility(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaw.a(acmj, java.util.List, java.lang.String, android.location.Location):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(final Location location) {
        if (this.x) {
            final String b = this.q.b();
            if (b != null) {
                if (this.h.b(b) == null) {
                    this.h.a(2);
                    this.h.a(this.y);
                } else {
                    this.a.k();
                }
                final List g = this.j.g();
                if (!this.u) {
                    a(g);
                    this.u = true;
                }
                acmj j = this.a.b().a.j();
                if (j != null) {
                    a(j, g, b, location);
                } else {
                    this.a.b().a.a(new adbn() {
                        public final void a(acmj acmj) {
                            oaw.this.a(acmj, g, b, location);
                        }
                    });
                }
            }
        }
    }

    public final void b() {
        c();
    }

    public final void c() {
        this.x = false;
        this.a.b().x = null;
        this.a.d();
        this.t.b(this);
        this.h.b(this.y);
        this.b.b(this.s);
    }

    public final void d() {
        this.x = true;
        this.b.a(this.s);
        this.t.a(this);
        this.s.a();
        Location a = this.g.a();
        if (a != null) {
            a(a);
        } else if (this.w == null) {
            this.w = new b(this);
            this.g.a(new WeakReference(this.w));
        }
        this.a.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0157  */
    public final void e() {
        /*
        r8 = this;
        r0 = r8.j;
        r0 = r0.g();
        r1 = r8.b;
        r1 = r1.e();
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0029;
    L_0x0010:
        r0 = r8.i;
        r1 = r8.itemView;
        r1 = r1.getResources();
        r4 = 2131888268; // 0x7f12088c float:1.9411167E38 double:1.053292754E-314;
    L_0x001b:
        r1 = r1.getText(r4);
        r0.setText(r1);
        r8.f();
        r8.e = r2;
        goto L_0x014f;
    L_0x0029:
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x003b;
    L_0x002f:
        r0 = r8.i;
        r1 = r8.itemView;
        r1 = r1.getResources();
        r4 = 2131888265; // 0x7f120889 float:1.941116E38 double:1.0532927525E-314;
        goto L_0x001b;
    L_0x003b:
        r8.e = r3;
        r0 = r0.get(r3);
        r0 = (defpackage.acqf) r0;
        r1 = r8.j;
        r4 = r0.g;
        r1 = r1.a(r4);
        if (r1 != 0) goto L_0x0063;
    L_0x004d:
        r0 = r8.i;
        r1 = r8.itemView;
        r1 = r1.getResources();
        r2 = 2131888269; // 0x7f12088d float:1.9411169E38 double:1.0532927545E-314;
        r1 = r1.getText(r2);
        r0.setText(r1);
        r8.f();
        return;
    L_0x0063:
        r1 = r8.i;
        r4 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        r1.setGravity(r4);
        r1 = r8.m;
        r1.setVisibility(r3);
        r1 = r8.n;
        r1.setVisibility(r3);
        r1 = r8.o;
        r1.setVisibility(r3);
        r1 = r8.p;
        r1.setVisibility(r3);
        r0 = r0.b;
        if (r0 != 0) goto L_0x0084;
    L_0x0083:
        return;
    L_0x0084:
        r1 = r0.a;
        r1 = r1.b;
        r4 = r8.a;
        r4 = r4.i();
        r1 = defpackage.acqe.a(r1, r4);
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 != 0) goto L_0x009e;
    L_0x0098:
        r4 = r8.i;
        r4.setText(r1);
        goto L_0x00a5;
    L_0x009e:
        r1 = r8.i;
        r4 = "";
        r1.setText(r4);
    L_0x00a5:
        r1 = r8.n;
        r4 = r0.b;
        r4 = java.lang.String.valueOf(r4);
        r1.setText(r4);
        r1 = r0.a;
        r1 = r1.b;
        r1 = r1.c;
        if (r1 == 0) goto L_0x0136;
    L_0x00b8:
        r1 = r0.a;
        r1 = r1.b;
        r1 = r1.c;
        r1 = r1.length;
        if (r1 != 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x0136;
    L_0x00c2:
        r1 = r8.m;
        r1.setVisibility(r3);
        r1 = r8.i;
        r1 = r1.getResources();
        r4 = 2131166104; // 0x7f070398 float:1.7946444E38 double:1.0529359576E-314;
        r1 = r1.getDimensionPixelSize(r4);
        r4 = r8.i;
        r4.setPadding(r1, r3, r1, r3);
        r1 = r0.a;
        r1 = r1.b;
        r1 = r1.c;
        r1 = r1[r3];
        r1 = r1.a;
        r4 = 2;
        r1 = r1 & r4;
        if (r1 == 0) goto L_0x00e9;
    L_0x00e7:
        r1 = 1;
        goto L_0x00ea;
    L_0x00e9:
        r1 = 0;
    L_0x00ea:
        r5 = 2131887182; // 0x7f12044e float:1.9408964E38 double:1.0532922174E-314;
        if (r1 == 0) goto L_0x0126;
    L_0x00ef:
        r0 = r0.a;
        r0 = r0.b;
        r0 = r0.c;
        r0 = r0[r3];
        r0 = r0.c;
        r6 = r8.v;
        r0 = r6.a(r0);
        r1 = r8.m;
        r6 = r8.itemView;
        r6 = r6.getResources();
        r7 = 2131887181; // 0x7f12044d float:1.9408962E38 double:1.053292217E-314;
        r6 = r6.getString(r7);
        r4 = new java.lang.Object[r4];
        r4[r3] = r0;
        r0 = r8.itemView;
        r0 = r0.getResources();
        r0 = r0.getString(r5);
        r4[r2] = r0;
        r0 = java.lang.String.format(r6, r4);
        r1.setText(r0);
        goto L_0x014f;
    L_0x0126:
        r0 = r8.m;
        r1 = r8.itemView;
        r1 = r1.getResources();
        r1 = r1.getString(r5);
        r0.setText(r1);
        goto L_0x014f;
    L_0x0136:
        r0 = r8.m;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r8.i;
        r0 = r0.getResources();
        r1 = 2131166121; // 0x7f0703a9 float:1.7946478E38 double:1.052935966E-314;
        r0 = r0.getDimensionPixelSize(r1);
        r1 = r8.i;
        r1.setPadding(r0, r3, r0, r3);
    L_0x014f:
        r0 = r8.f;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x016b;
    L_0x0157:
        r0 = r8.i;
        r1 = r8.itemView;
        r1 = r1.getResources();
        r2 = 2131888291; // 0x7f1208a3 float:1.9411213E38 double:1.0532927654E-314;
        r1 = r1.getString(r2);
        r0.setText(r1);
        r8.e = r3;
    L_0x016b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaw.e():void");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleEvent(nmr.a aVar) {
        d();
    }
}
