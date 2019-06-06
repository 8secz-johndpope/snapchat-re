package defpackage;

import android.app.Activity;
import android.os.Environment;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.brightcove.player.event.Event;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.snap.core.db.record.FeedMemberModel;
import com.snapchat.android.R;
import defpackage.abln.h;
import defpackage.ablu.e;
import defpackage.ablu.j;
import defpackage.ablu.k;
import defpackage.ebi.s;
import defpackage.ebs.d;
import defpackage.ehb.a;
import defpackage.ehb.b;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eih */
public final class eih implements a {
    static final String G = G;
    final ajdv<ebj> A;
    final ajdv<ebo> B;
    final odu C;
    final tnj D;
    final duk E;
    final eio F;
    private final ajei H;
    private dno I;
    private final ablx J;
    private final aipn<ifs> K;
    private final ajdp<e> L;
    private final dza M;
    private final ekc N;
    private final ajdp<ebs> O;
    private final ejj P;
    private final ajdp<duz> Q;
    private final dvr R;
    private final Supplier<Boolean> S;
    private final ilv T;
    private final dni U;
    private final ajdp<ebm> V;
    private final ajdp<Boolean> W;
    private final ajdp<Boolean> X;
    private final AtomicBoolean Y;
    private final ajwy<epp> Z;
    final zfw a = zgb.a(dnh.f.callsite(G));
    ajej b;
    final ekc.a c;
    final ekc.a d;
    final ekc.a e;
    absz<ebk> f;
    absz<f> g;
    final Supplier<Integer> h;
    final Activity i;
    final b j;
    final dpe k;
    final eil l;
    final dnr m;
    final ebw n;
    final ablu o;
    final ftl p;
    final ajwl<f> q;
    final duo<aeew> r;
    final dqi s;
    final dqm t;
    final ebr u;
    final Supplier<Boolean> v;
    final Supplier<Optional<eeb>> w;
    final ajwl<ebk> x;
    final dnc y;
    final ajdp<Boolean> z;

    /* renamed from: eih$a */
    public enum a implements defpackage.absz.a<ebk, absy> {
        SCROLL_LENSES_CAROUSEL,
        CAPTURE_START_REQUEST,
        VIDEO_CONFIRMED,
        VIDEO_READY_TO_START,
        CAPTURE_HAS_BEGUN,
        CAPTURE_HAS_BEGUN_WITHOUT_SURFACE_RECORDING,
        CAPTURE_END_REQUEST,
        CAPTURE_SUCCEED,
        RECORDING_TOO_SHORT,
        RETURN_TO_CAMERA
    }

    /* renamed from: eih$f */
    public enum f {
        READY,
        STARTED_CAPTURING_VIA_BUTTON,
        STARTED_CAPTURING_VIA_HW_KEY,
        STARTED_CAPTURING_FROM_EXTERNAL,
        CAPTURING_VIDEO_VIA_BUTTON,
        CAPTURING_VIDEO_VIA_HW_KEY,
        CAPTURING_VIA_COUNTDOWN,
        CAPTURING_VIA_HANDS_FREE,
        CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED,
        CAPTURING_VIA_HANDS_FREE_WITH_HW_KEY_PRESSED,
        CONSIDERING_HANDS_FREE_VIA_BUTTON,
        CONSIDERING_HANDS_FREE_VIA_HW_KEY
    }

    /* renamed from: eih$b */
    public enum b implements absz.a<ebk, ebi> {
        CAPTURE_CANCEL_REQUEST,
        CAPTURE_FAIL
    }

    /* renamed from: eih$d */
    public enum d implements absz.a<ebk, ebo> {
        ;

        private d(String str) {
        }
    }

    /* renamed from: eih$e */
    public enum e implements absz.a<f, absy> {
        SNAP_BUTTON_DOWN,
        SNAP_BUTTON_UP,
        HARDWARE_KEY_DOWN,
        HARDWARE_KEY_UP,
        VIDEO_CONFIRMED,
        COUNTDOWN_CONFIRMED,
        COUNTDOWN_FINISHED,
        MOVE_INTO_CAPTURE_LOCK,
        MOVE_INTO_CAPTURE_BUTTON,
        MOVE_INTO_OTHER_REGION,
        LOCK_ICON_DOWN,
        LOCK_ICON_UP,
        MAX_RECORDING_REACHED,
        EXIT_CAMERA_PAGE,
        BACK_BUTTON_PRESSED,
        EXTERNAL_RECORDING_REQUESTED,
        EXTERNAL_RECORDING_FINISHED
    }

    /* renamed from: eih$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: eih$bc */
    static final class bc<T> implements Supplier<T> {
        private /* synthetic */ eih a;

        bc(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ Object get() {
            int integer = this.a.i.getResources().getInteger(R.integer.countdown_max_count);
            return Integer.valueOf((this.a.i.getResources().getInteger(R.integer.countdown_digit_duration) * integer) - ((integer - 1) * this.a.i.getResources().getInteger(R.integer.countdown_digit_overlap)));
        }
    }

    /* renamed from: eih$g */
    static final class g<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        g(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object a;
            String str;
            eih eih = this.a;
            eih.n.a();
            if (((eeb) ((Optional) eih.w.get()).orNull()) == eeb.TIMER) {
                eih.j.a(eih.l.a() ^ 1);
                absz absz = eih.g;
                if (absz == null) {
                    akcr.a("uiStateMachine");
                }
                absz.a(e.COUNTDOWN_CONFIRMED);
                a = eih.a.l().a(new be(eih), (long) ((Number) eih.h.get()).intValue(), TimeUnit.MILLISECONDS);
                str = "qualifiedSchedulers.main…   TimeUnit.MILLISECONDS)";
            } else {
                eih.d();
                eih.j.a(eih.l.a() ^ 1);
                eih.k.a();
                a = eih.a.l().a(new bf(eih), 300, TimeUnit.MILLISECONDS);
                str = "qualifiedSchedulers.main…0, TimeUnit.MILLISECONDS)";
            }
            akcr.a(a, str);
            eih.b = a;
            eih.A.a(ebj.a);
            eih.D.b().a((fth) dnd.MEDIA_RECOVERY_CRASH_COUNT, Integer.valueOf(0)).b();
        }
    }

    /* renamed from: eih$o */
    static final class o<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        o(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih eih = this.a;
            eih.j.c();
            eih.b.dispose();
            eih.e();
        }
    }

    /* renamed from: eih$p */
    static final class p<T> implements ajfb<ebi> {
        private /* synthetic */ eih a;

        p(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            ebi ebi = (ebi) obj;
            eih eih = this.a;
            akcr.a((Object) ebi, "it");
            eih.a(eih, ebi);
        }
    }

    /* renamed from: eih$q */
    static final class q<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        q(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih eih = this.a;
            eih.o.a(e.PRE_CAPTURE_OPERATION_REQUESTED);
            eih.k.e();
            eih.j.a();
            ekc.a aVar = eih.e;
            akcr.a((Object) aVar, "videoFlashToken");
            eih.a(aVar, (akbl) new bo(eih));
        }
    }

    /* renamed from: eih$r */
    static final class r<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        r(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih eih = this.a;
            eih.k.a(eih.l.a, false);
        }
    }

    /* renamed from: eih$s */
    static final class s<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        s(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih eih = this.a;
            eih.o.a(e.RECORDING_GESTURE_FINISHED);
            eih.o.a(e.PRE_CAPTURE_OPERATION_REQUESTED);
            eih.a(true);
            eih.k.b();
            eih.b.dispose();
            eih.E.a(aaig.TAP);
        }
    }

    /* renamed from: eih$t */
    static final class t<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        t(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih.a(this.a);
        }
    }

    /* renamed from: eih$u */
    static final class u<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        u(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih.a(this.a);
        }
    }

    /* renamed from: eih$v */
    static final class v<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        v(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih eih = this.a;
            eih.o.a(e.RECORDING_GESTURE_FINISHED);
            eih.j.c();
            eih.k.c();
        }
    }

    /* renamed from: eih$h */
    static final class h<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        h(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(false);
        }
    }

    /* renamed from: eih$i */
    static final class i<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        i(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(false);
        }
    }

    /* renamed from: eih$j */
    static final class j<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        j(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih.a(this.a, true);
        }
    }

    /* renamed from: eih$k */
    static final class k<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        k(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih.a(this.a, false);
        }
    }

    /* renamed from: eih$l */
    static final class l<T> implements ajfb<ebo> {
        private /* synthetic */ eih a;

        l(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.B.a((ebo) obj);
        }
    }

    /* renamed from: eih$m */
    static final class m<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        m(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.e();
        }
    }

    /* renamed from: eih$n */
    static final class n<T> implements ajfb<ebi> {
        private /* synthetic */ eih a;

        n(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            ebi ebi = (ebi) obj;
            eih eih = this.a;
            akcr.a((Object) ebi, "it");
            eih.a(eih, ebi);
        }
    }

    /* renamed from: eih$bg */
    static final class bg<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ eih a;

        bg(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            ebk ebk = (ebk) obj;
            akcr.b(ebk, "it");
            if (ebk == ebk.CAPTURING_VIDEO || ebk == ebk.CAPTURING_VIDEO_WITHOUT_SURFACE_RECORDING) {
                eih eih = this.a;
                ajeb e = eih.z.e();
                Object e2 = eih.p.p(dnd.RECORD_THREE_SECOND_SEGMENT).e();
                akcr.a((Object) e, "isMultiSnapSingle");
                akcr.a(e2, "isThreeSecondSegmentSingle");
                Object a = ajdx.a(e, (ajeb) e2, (ajex) new bj());
                String str2 = "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })";
                akcr.a(a, str2);
                obj = a.b((ajdw) eih.a.h());
                akcr.a(obj, "isMultiSnapSingle\n      …dulers.userInteractive())");
                e = ajdx.c((Callable) bl.a);
                akcr.a((Object) e, "Single.fromCallable { System.currentTimeMillis() }");
                obj = ajdx.a(e, (ajeb) obj, (ajex) new bk());
                akcr.a(obj, str2);
                obj = obj.a((ajfc) bm.a);
                str = "Single.fromCallable { Sy… TimeUnit.MILLISECONDS) }";
            } else {
                obj = ajvo.a(ajsn.a);
                str = "Single.never()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: eih$bh */
    static final class bh<T> implements ajfb<Long> {
        private /* synthetic */ eih a;

        bh(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            eih.b(this.a).a(e.MAX_RECORDING_REACHED);
        }
    }

    /* renamed from: eih$bi */
    static final class bi<T> implements ajfb<ebk> {
        private /* synthetic */ eih a;

        bi(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.x.a((ebk) obj);
        }
    }

    /* renamed from: eih$cf */
    static final class cf<T> implements Predicate<Void> {
        private /* synthetic */ absz a;

        cf(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((ebk) this.a.a()) == ebk.READY;
        }
    }

    /* renamed from: eih$bt */
    static final class bt implements ajev {
        private /* synthetic */ eih a;
        private /* synthetic */ Predicate b;

        bt(eih eih, Predicate predicate) {
            this.a = eih;
            this.b = predicate;
        }

        public final void run() {
            eih eih = this.a;
            eih.k.d();
            eih.k.b(eih);
            this.a.m.a(this.b);
        }
    }

    /* renamed from: eih$bs */
    public static final class bs<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        public final R apply(T1 t1, T2 t2, T3 t3) {
            boolean z = ((Boolean) t1).booleanValue() && ((duz) t2) == duz.FULLY_VISIBLE && akcr.a((ebs) t3, d.b);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: eih$bz */
    static final class bz<T> implements ajfb<Boolean> {
        private /* synthetic */ eih a;

        bz(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                this.a.j.d();
            } else {
                this.a.j.e();
            }
        }
    }

    /* renamed from: eih$ca */
    static final class ca<T> implements ajfb<Boolean> {
        private /* synthetic */ eih a;

        ca(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                this.a.j.f();
            } else {
                this.a.j.g();
            }
        }
    }

    /* renamed from: eih$w */
    static final class w<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        w(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_START_REQUEST);
        }
    }

    /* renamed from: eih$ah */
    static final class ah<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ah(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_START_REQUEST);
        }
    }

    /* renamed from: eih$as */
    static final class as<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        as(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_START_REQUEST);
        }
    }

    /* renamed from: eih$aw */
    static final class aw<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        aw(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$ax */
    static final class ax<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ax(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(b.CAPTURE_CANCEL_REQUEST, s.d);
        }
    }

    /* renamed from: eih$ay */
    static final class ay<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ay(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(b.CAPTURE_CANCEL_REQUEST, s.d);
        }
    }

    /* renamed from: eih$az */
    static final class az<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        az(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(b.CAPTURE_CANCEL_REQUEST, s.d);
        }
    }

    /* renamed from: eih$ba */
    static final class ba<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ba(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.h();
        }
    }

    /* renamed from: eih$bb */
    static final class bb<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        bb(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.h();
        }
    }

    /* renamed from: eih$x */
    static final class x<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        /* renamed from: eih$x$1 */
        static final class 1<T> implements duo.a<aeew> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                ((aeew) obj).l = Boolean.TRUE;
            }
        }

        x(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.k();
            this.a.r.a((duo.a) 1.a);
        }
    }

    /* renamed from: eih$y */
    static final class y<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        y(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$z */
    static final class z<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        z(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$aa */
    static final class aa<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        aa(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$ab */
    static final class ab<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ab(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$ac */
    static final class ac<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ac(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.i();
        }
    }

    /* renamed from: eih$ad */
    static final class ad<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ad(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.j();
        }
    }

    /* renamed from: eih$ae */
    static final class ae<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ae(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.j();
        }
    }

    /* renamed from: eih$af */
    static final class af<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        af(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.i();
        }
    }

    /* renamed from: eih$ag */
    static final class ag<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ag(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.i();
        }
    }

    /* renamed from: eih$ai */
    static final class ai<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ai(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.j();
        }
    }

    /* renamed from: eih$aj */
    static final class aj<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        aj(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.j();
        }
    }

    /* renamed from: eih$ak */
    static final class ak<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        /* renamed from: eih$ak$1 */
        static final class 1<T> implements duo.a<aeew> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void a(Object obj) {
                ((aeew) obj).l = Boolean.TRUE;
            }
        }

        ak(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.k();
            this.a.r.a((duo.a) 1.a);
        }
    }

    /* renamed from: eih$al */
    static final class al<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        al(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.l();
        }
    }

    /* renamed from: eih$am */
    static final class am<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        am(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.m();
        }
    }

    /* renamed from: eih$an */
    static final class an<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        an(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.m();
        }
    }

    /* renamed from: eih$ao */
    static final class ao<T> implements ajfb<absy> {
        private /* synthetic */ eih a;

        ao(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.j.l();
        }
    }

    /* renamed from: eih$ap */
    static final class ap<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ap(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$aq */
    static final class aq<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        aq(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$ar */
    static final class ar<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        ar(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$at */
    static final class at<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        at(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$au */
    static final class au<T> implements ajfb<absy> {
        private /* synthetic */ absz a;

        au(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.CAPTURE_END_REQUEST);
        }
    }

    /* renamed from: eih$av */
    static final class av<T> implements ajfb<f> {
        private /* synthetic */ eih a;

        av(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.q.a((f) obj);
        }
    }

    /* renamed from: eih$cb */
    static final class cb<T> implements ajfb<e> {
        private /* synthetic */ absz a;

        cb(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((e) obj);
        }
    }

    /* renamed from: eih$bf */
    static final class bf implements Runnable {
        private /* synthetic */ eih a;

        bf(eih eih) {
            this.a = eih;
        }

        public final void run() {
            eih.c(this.a).a(a.VIDEO_CONFIRMED);
        }
    }

    /* renamed from: eih$cc */
    static final class cc<T> implements ajfl<duz> {
        public static final cc a = new cc();

        cc() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            duz duz = (duz) obj;
            akcr.b(duz, "it");
            return duz == duz.HIDDEN;
        }
    }

    /* renamed from: eih$cd */
    static final class cd<T> implements ajfb<duz> {
        private /* synthetic */ absz a;

        cd(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(e.EXIT_CAMERA_PAGE);
        }
    }

    /* renamed from: eih$ce */
    static final class ce<T> implements ajfl<duz> {
        public static final ce a = new ce();

        ce() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            duz duz = (duz) obj;
            akcr.b(duz, "it");
            return duz == duz.FULLY_VISIBLE;
        }
    }

    /* renamed from: eih$bu */
    static final class bu<T> implements ajfb<duz> {
        private /* synthetic */ absz a;

        bu(absz absz) {
            this.a = absz;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(a.RETURN_TO_CAMERA);
        }
    }

    /* renamed from: eih$bv */
    static final class bv<T, R> implements ajfc<ajxm<? extends ebm, ? extends duz>, ajdb> {
        private /* synthetic */ eih a;

        bv(eih eih) {
            this.a = eih;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0079  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.ajxm) r7;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r7, r0);
            r0 = r7.a;
            r0 = (defpackage.ebm) r0;
            r7 = r7.b;
            r7 = (defpackage.duz) r7;
            r1 = r6.a;
            r2 = "pageVisibility";
            defpackage.akcr.a(r7, r2);
            r2 = r0.a;
            r3 = defpackage.duz.FULLY_VISIBLE;
            if (r7 != r3) goto L_0x0031;
        L_0x001c:
            r7 = r1.f;
            if (r7 != 0) goto L_0x0025;
        L_0x0020:
            r3 = "stateMachine";
            defpackage.akcr.a(r3);
        L_0x0025:
            r3 = defpackage.eih.d.EXTERNAL_CAPTURE_RESULT;
            r3 = (defpackage.absz.a) r3;
            r7 = r7.a(r3, r2);
            if (r7 == 0) goto L_0x0031;
        L_0x002f:
            r7 = 1;
            goto L_0x0032;
        L_0x0031:
            r7 = 0;
        L_0x0032:
            r3 = r0.b;
            r4 = r3 instanceof defpackage.ebl.a;
            if (r4 == 0) goto L_0x0071;
        L_0x0038:
            r4 = r2.a();
            r5 = "receiver$0";
            defpackage.akcr.b(r4, r5);
            r5 = defpackage.igs.r.a;
            r5 = (defpackage.ajfc) r5;
            r4 = r4.f(r5);
            r5 = defpackage.igs.s.a;
            r5 = (defpackage.ajfc) r5;
            r4 = r4.h(r5);
            r5 = "this.map<Either<T, Throw….just(Either.Right(it)) }";
            defpackage.akcr.a(r4, r5);
            r5 = r3;
            r5 = (defpackage.ebl.a) r5;
            r5 = r5.b;
            r5 = (defpackage.ajeb) r5;
            r4 = defpackage.ajwd.a(r4, r5);
            r5 = new eih$bq;
            r5.<init>(r1, r0, r7, r3);
            r5 = (defpackage.ajfb) r5;
            r0 = r4.c(r5);
            r0 = r0.e();
            goto L_0x0077;
        L_0x0071:
            r0 = defpackage.ajhn.a;
            r0 = defpackage.ajvo.a(r0);
        L_0x0077:
            if (r7 != 0) goto L_0x0091;
        L_0x0079:
            r7 = r2.a;
            r7 = r7.h();
            r2 = defpackage.ajfu.g;
            r7 = r7.b(r2);
            r2 = new eih$bp;
            r2.<init>(r1);
            r2 = (defpackage.ajfc) r2;
            r7 = r7.e(r2);
            goto L_0x0097;
        L_0x0091:
            r7 = defpackage.ajhn.a;
            r7 = defpackage.ajvo.a(r7);
        L_0x0097:
            r1 = "if (!succeeded) {\n      …able.complete()\n        }";
            defpackage.akcr.a(r7, r1);
            r7 = (defpackage.ajdb) r7;
            r7 = r0.d(r7);
            r0 = "reportMetric.mergeWith(releaseOnFailure)";
            defpackage.akcr.a(r7, r0);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eih$bv.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: eih$bw */
    static final class bw<T> implements Predicate<MotionEvent> {
        private /* synthetic */ eih a;
        private /* synthetic */ absz b;

        bw(eih eih, absz absz) {
            this.a = eih;
            this.b = absz;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return this.a.l.b() && !this.b.a(a.SCROLL_LENSES_CAROUSEL);
        }
    }

    /* renamed from: eih$cg */
    public static final class cg implements dnc.a {
        private /* synthetic */ absz a;

        cg(absz absz) {
            this.a = absz;
        }

        public final boolean a() {
            return this.a.a(e.BACK_BUTTON_PRESSED);
        }
    }

    /* renamed from: eih$bx */
    static final class bx implements ajev {
        private /* synthetic */ eih a;
        private /* synthetic */ cg b;

        bx(eih eih, cg cgVar) {
            this.a = eih;
            this.b = cgVar;
        }

        public final void run() {
            this.a.y.b(this.b);
        }
    }

    /* renamed from: eih$by */
    static final class by implements ajev {
        private /* synthetic */ eih a;

        by(eih eih) {
            this.a = eih;
        }

        public final void run() {
            this.a.b.dispose();
        }
    }

    /* renamed from: eih$ch */
    static final class ch<T> implements ajfb<ajxm<? extends dpa.b, ? extends Boolean>> {
        final /* synthetic */ eih a;

        ch(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            final dpa.b bVar = (dpa.b) ajxm.a;
            final Boolean bool = (Boolean) ajxm.b;
            eih eih = this.a;
            akcr.a((Object) bVar, "takePictureMethod");
            dpp a = eih.s.a();
            boolean z = false;
            if (!(a == null || !a.b().contains(ecd.AUTO) || eih.t.a() || !eih.u.a || bVar == dpa.b.API)) {
                z = true;
            }
            ekc.a aVar = (!z || this.a.t.k()) ? this.a.c : this.a.d;
            eih eih2 = this.a;
            akcr.a((Object) aVar, "flashToken");
            eih2.a(aVar, (akbl) new akbl<Boolean, ajxw>(this) {
                final /* synthetic */ ch a;

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    Object obj2 = bool;
                    akcr.a(obj2, "shouldStartPreviewBeforeShutterConfig");
                    boolean booleanValue2 = obj2.booleanValue();
                    Object obj3 = this.a.a.v.get();
                    akcr.a(obj3, "isBatchCaptureModeSupplier.get()");
                    booleanValue = (!booleanValue2 || ((Boolean) obj3).booleanValue() || (booleanValue && this.a.a.t.a())) ? false : true;
                    if (z) {
                        this.a.a.s.a((dom) new dom(this) {
                            private /* synthetic */ 1 a;

                            public final void onAutoFocus(boolean z, dpp dpp) {
                                this.a.a.a.k.a(bVar, booleanValue);
                            }
                        });
                    } else {
                        this.a.a.k.a(bVar, booleanValue);
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: eih$bd */
    static final class bd<V> implements Callable<T> {
        public static final bd a = new bd();

        bd() {
        }

        public final /* synthetic */ Object call() {
            int i;
            String externalStorageState = Environment.getExternalStorageState();
            if (externalStorageState != null) {
                int hashCode = externalStorageState.hashCode();
                if (hashCode != -903566235) {
                    if (hashCode != 1091836000) {
                        if (hashCode == 1536898522 && externalStorageState.equals("checking")) {
                            i = R.string.camera_sd_card_being_checked;
                            return Integer.valueOf(i);
                        }
                    } else if (externalStorageState.equals(FeedMemberModel.REMOVED)) {
                        i = R.string.camera_insert_sd_card;
                        return Integer.valueOf(i);
                    }
                } else if (externalStorageState.equals("shared")) {
                    i = R.string.camera_sd_card_mounted_to_computer;
                    return Integer.valueOf(i);
                }
            }
            i = R.string.camera_sd_card_issue;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: eih$be */
    static final class be implements Runnable {
        private /* synthetic */ eih a;

        be(eih eih) {
            this.a = eih;
        }

        public final void run() {
            this.a.d();
            eih.b(this.a).a(e.COUNTDOWN_FINISHED);
        }
    }

    /* renamed from: eih$bl */
    static final class bl<V> implements Callable<T> {
        public static final bl a = new bl();

        bl() {
        }

        public final /* synthetic */ Object call() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: eih$bn */
    static final class bn implements Runnable {
        private /* synthetic */ eih a;
        private /* synthetic */ ebi b;

        bn(eih eih, ebi ebi) {
            this.a = eih;
            this.b = ebi;
        }

        public final void run() {
            eih.c(this.a).a(b.CAPTURE_FAIL, this.b);
        }
    }

    /* renamed from: eih$bj */
    public static final class bj<T1, T2, R> implements ajex<Boolean, Boolean, R> {
        public final R apply(Boolean bool, Boolean bool2) {
            Object obj = bool2;
            Object obj2 = bool;
            akcr.a(obj, "isThreeSecondSegment");
            int i = obj.booleanValue() ? BrightcoveMediaController.DEFAULT_TIMEOUT : 10000;
            akcr.a(obj2, "isMultiSnap");
            return Integer.valueOf(i * (obj2.booleanValue() ? 6 : 1));
        }
    }

    /* renamed from: eih$bk */
    public static final class bk<T1, T2, R> implements ajex<Long, Integer, R> {
        public final R apply(Long l, Integer num) {
            Object obj = l;
            long intValue = (long) num.intValue();
            long currentTimeMillis = System.currentTimeMillis();
            akcr.a(obj, "trueStartTime");
            return Long.valueOf(intValue - (currentTimeMillis - obj.longValue()));
        }
    }

    /* renamed from: eih$bm */
    static final class bm<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final bm a = new bm();

        bm() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return ajdx.a(l.longValue(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: eih$bp */
    static final class bp<T, R> implements ajfc<List<? extends abyi>, ajdb> {
        private /* synthetic */ eih a;

        bp(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.C.d(dnh.f.callsite(eih.G), list).b((ajdw) this.a.a.f());
        }
    }

    /* renamed from: eih$bq */
    static final class bq<T> implements ajfb<ajxm<? extends ihu<? extends abyi, ? extends Throwable>, ? extends Integer>> {
        final /* synthetic */ eih a;
        final /* synthetic */ ebm b;
        final /* synthetic */ boolean c;
        final /* synthetic */ ebl d;

        bq(eih eih, ebm ebm, boolean z, ebl ebl) {
            this.a = eih;
            this.b = ebm;
            this.c = z;
            this.d = ebl;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ihu ihu = (ihu) ajxm.a;
            final Integer num = (Integer) ajxm.b;
            ihu.a(new akbl<abyi, ajxw>(this) {
                private /* synthetic */ bq a;

                public final /* synthetic */ Object invoke(Object obj) {
                    abyi abyi = (abyi) obj;
                    akcr.b(abyi, "mediaPackage");
                    aeew aeew = abyi.e;
                    this.a.a.F.a(aesf.a(aeew.a), aeew.i, this.a.b.c, aeew.h, (long) num.intValue(), this.a.c, ((ebl.a) this.a.d).a);
                    return ajxw.a;
                }
            }, new akbl<Throwable, ajxw>(this) {
                private /* synthetic */ bq a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((Throwable) obj, "error");
                    this.a.a.F.a(null, null, this.a.b.c, null, (long) num.intValue(), false, ((ebl.a) this.a.d).a);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: eih$br */
    static final class br<T> implements ajfb<Integer> {
        private /* synthetic */ eih a;

        br(eih eih) {
            this.a = eih;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            b bVar = this.a.j;
            akcr.a(obj, "failureMessage");
            bVar.a(obj.intValue());
        }
    }

    /* renamed from: eih$bo */
    static final class bo extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ eih a;

        bo(eih eih) {
            this.a = eih;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            eih.c(this.a).a(a.VIDEO_READY_TO_START);
            return ajxw.a;
        }
    }

    static {
        c cVar = new c();
    }

    public eih(dno dno, ablx ablx, aipn<ifs> aipn, Activity activity, b bVar, ajdp<e> ajdp, dpe dpe, eil eil, dza dza, dnr dnr, ebw ebw, ekc ekc, ablu ablu, zgb zgb, ajdp<ebs> ajdp2, ejj ejj, ajdp<duz> ajdp3, ftl ftl, ajwl<f> ajwl, duo<aeew> duo, dqi dqi, dqm dqm, dvr dvr, ebr ebr, Supplier<Boolean> supplier, Supplier<Boolean> supplier2, Supplier<Optional<eeb>> supplier3, ilv ilv, ajwl<ebk> ajwl2, dnc dnc, dni dni, ajdp<Boolean> ajdp4, ajdp<ebm> ajdp5, ajdv<ebj> ajdv, ajdv<ebo> ajdv2, odu odu, tnj tnj, ajdp<Boolean> ajdp6, ajdp<Boolean> ajdp7, duk duk, AtomicBoolean atomicBoolean, eio eio, ajwy<epp> ajwy) {
        dno dno2 = dno;
        ablx ablx2 = ablx;
        aipn<ifs> aipn2 = aipn;
        Activity activity2 = activity;
        b bVar2 = bVar;
        ajdp<e> ajdp8 = ajdp;
        dpe dpe2 = dpe;
        eil eil2 = eil;
        dza dza2 = dza;
        dnr dnr2 = dnr;
        ebw ebw2 = ebw;
        ekc ekc2 = ekc;
        ablu ablu2 = ablu;
        ajdp<ebs> ajdp9 = ajdp2;
        ejj ejj2 = ejj;
        ajdp<duz> ajdp10 = ajdp3;
        akcr.b(dno2, "subcomponentActivator");
        akcr.b(ablx2, "launchTracker");
        akcr.b(aipn2, "permissionHelper");
        akcr.b(activity2, Event.ACTIVITY);
        akcr.b(bVar2, "view");
        akcr.b(ajdp8, "captureActionObservable");
        akcr.b(dpe2, "captureModel");
        akcr.b(eil2, "lensesLifecycleObserver");
        akcr.b(dza2, "compositeFrameTextureProcessor");
        akcr.b(dnr2, "navigator");
        akcr.b(ebw2, "zoomModel");
        akcr.b(ekc2, "flashActivator");
        akcr.b(ablu2, "snapCreationTracker");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdp9, "streamingStateObservable");
        akcr.b(ejj2, "captureGestureDetector");
        akcr.b(ajdp3, "pageVisibilityObservable");
        akcr.b(ftl, "configProvider");
        akcr.b(ajwl, "captureUiStateSubject");
        akcr.b(duo, "captureMetricsGatherer");
        akcr.b(dqi, "cameraFunctionProvider");
        akcr.b(dqm, "cameraStateProvider");
        akcr.b(dvr, "cameraTakePictureApiController");
        akcr.b(ebr, "sharedCameraState");
        akcr.b(supplier, "nightModeStateSupplier");
        akcr.b(supplier2, "isBatchCaptureModeSupplier");
        akcr.b(supplier3, "cameraModeSelectionSupplier");
        akcr.b(ilv, "graphene");
        akcr.b(ajwl2, "captureStateBehaviorSubject");
        akcr.b(dnc, "backPressDispatcher");
        akcr.b(dni, "cameraFragmentConfiguration");
        akcr.b(ajdp4, "multiSnapEnabled");
        akcr.b(ajdp5, "externalMediaCreationEventObservable");
        akcr.b(ajdv, "captureStartEventObserver");
        akcr.b(ajdv2, "mediaCreationEventObserver");
        akcr.b(odu, "mediaPackageManager");
        akcr.b(tnj, "preferences");
        akcr.b(ajdp6, "captureEnabled");
        akcr.b(ajdp7, "hardwareCaptureEnabled");
        akcr.b(duk, "captureMetricsReporter");
        akcr.b(atomicBoolean, "isFirstCapture");
        akcr.b(eio, "cameraContentRecoveryAttemptReporter");
        akcr.b(ajwy, "microphonePermissionRequester");
        ajdp<duz> ajdp11 = ajdp3;
        this.I = dno2;
        this.J = ablx2;
        this.K = aipn2;
        this.i = activity2;
        this.j = bVar2;
        this.L = ajdp8;
        this.k = dpe2;
        this.l = eil2;
        this.M = dza2;
        this.m = dnr2;
        this.n = ebw2;
        this.N = ekc2;
        this.o = ablu;
        this.O = ajdp9;
        this.P = ejj2;
        this.Q = ajdp11;
        ajwl<f> ajwl3 = ajwl;
        this.p = ftl;
        this.q = ajwl3;
        dqi dqi2 = dqi;
        this.r = duo;
        this.s = dqi2;
        dvr dvr2 = dvr;
        this.t = dqm;
        this.R = dvr2;
        Supplier<Boolean> supplier4 = supplier;
        this.u = ebr;
        this.S = supplier4;
        Supplier<Optional<eeb>> supplier5 = supplier3;
        this.v = supplier2;
        this.w = supplier5;
        ajwl<ebk> ajwl4 = ajwl2;
        this.T = ilv;
        this.x = ajwl4;
        dni dni2 = dni;
        this.y = dnc;
        this.U = dni2;
        ajdp<ebm> ajdp12 = ajdp5;
        this.z = ajdp4;
        this.V = ajdp12;
        ajdv<ebo> ajdv3 = ajdv2;
        this.A = ajdv;
        this.B = ajdv3;
        tnj tnj2 = tnj;
        this.C = odu;
        this.D = tnj2;
        ajdp<Boolean> ajdp13 = ajdp7;
        this.W = ajdp6;
        this.X = ajdp13;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        this.E = duk;
        this.Y = atomicBoolean2;
        ajwy<epp> ajwy2 = ajwy;
        this.F = eio;
        this.Z = ajwy2;
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        this.b = obj;
        this.H = new ajei();
        this.c = ekc.a.a();
        this.d = ekc.a.b();
        this.e = ekc.a.b();
        this.h = Suppliers.memoize(new bc(this));
    }

    public static final /* synthetic */ absz b(eih eih) {
        absz absz = eih.g;
        if (absz == null) {
            akcr.a("uiStateMachine");
        }
        return absz;
    }

    public static final /* synthetic */ absz c(eih eih) {
        absz absz = eih.f;
        if (absz == null) {
            akcr.a("stateMachine");
        }
        return absz;
    }

    public final void a() {
        absz absz = this.f;
        String str = "stateMachine";
        if (absz == null) {
            akcr.a(str);
        }
        absz.a(a.CAPTURE_SUCCEED);
        Object obj = this.v.get();
        akcr.a(obj, "isBatchCaptureModeSupplier.get()");
        if (((Boolean) obj).booleanValue()) {
            absz = this.f;
            if (absz == null) {
                akcr.a(str);
            }
            absz.a(a.RETURN_TO_CAMERA);
        }
    }

    public final void a(aesf aesf, boolean z) {
        absz absz;
        a aVar;
        akcr.b(aesf, "mediaType");
        this.J.a((h) abmd.USER_ATTEMPTED_SNAP, SystemClock.elapsedRealtimeNanos());
        String str = "stateMachine";
        if (z) {
            absz = this.f;
            if (absz == null) {
                akcr.a(str);
            }
            aVar = a.CAPTURE_HAS_BEGUN;
        } else {
            absz = this.f;
            if (absz == null) {
                akcr.a(str);
            }
            aVar = a.CAPTURE_HAS_BEGUN_WITHOUT_SURFACE_RECORDING;
        }
        absz.a(aVar);
    }

    public final void a(ajej ajej) {
        akcr.b(ajej, "disposable");
        this.H.a(ajej);
    }

    public final void a(ebi ebi) {
        akcr.b(ebi, "failure");
        igk.a(this.a.l().a((Runnable) new bn(this, ebi)), this.H);
    }

    public final void a(ekc.a aVar, akbl<? super Boolean, ajxw> akbl) {
        akcr.b(aVar, "flashToken");
        akcr.b(akbl, "onComplete");
        igk.a(this.N.a(aVar).e((ajfb) new eii(akbl)), this.H);
    }

    public final void a(boolean z) {
        if (z) {
            this.k.e();
        }
        dvr dvr = this.R;
        eca g = this.t.g();
        boolean a = this.t.a();
        boolean z2 = this.u.a;
        Object obj = this.S.get();
        akcr.a(obj, "nightModeStateSupplier.get()");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z3 = this.l.a || this.M.a();
        obj = dvr.a(g, a, z2, booleanValue, z3, this.U.b().equals(dnh.a)).e().b((ajdw) this.a.h());
        akcr.a(obj, "cameraTakePictureApiCont…dulers.userInteractive())");
        Object b = this.p.b((fth) dnd.START_IMAGE_PREVIEW_ON_TOUCH_UP).b((ajdw) this.a.h());
        akcr.a(b, "configProvider.getBoolea…dulers.userInteractive())");
        igk.a(ajwd.a(obj, (ajeb) b).a((ajdw) this.a.l()).e((ajfb) new ch(this)), this.H);
    }

    public final void b() {
        absz absz = this.f;
        if (absz == null) {
            akcr.a("stateMachine");
        }
        absz.a(a.RECORDING_TOO_SHORT);
    }

    public final void c() {
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.o.a();
        this.o.a(this.Y.getAndSet(false) ? k.COLD_START : k.WARM_START);
        this.o.a(this.U.b().equals(dnh.a) ? j.CAMERA : j.CHAT);
        dnm dnm = (dnm) this.t.m().orNull();
        this.o.c(dnm != null ? dnm.name() : null);
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        this.N.b(this.d);
        this.N.b(this.c);
        this.N.b(this.e);
    }

    public final ajej start() {
        this.j.a(this);
        Object a = abta.a(ebk.READY, this.H).a(Thread.currentThread());
        a.a(ebk.READY, (absz.a) a.CAPTURE_START_REQUEST, ebk.REQUESTED).a((ajfb) new g(this));
        a.a(ebk.REQUESTED, (absz.a) a.SCROLL_LENSES_CAROUSEL, ebk.READY).a((ajfb) new o(this));
        a.a(ebk.REQUESTED, (absz.a) b.CAPTURE_CANCEL_REQUEST, ebk.READY).a((ajfb) new p(this));
        a.a(ebk.REQUESTED, (absz.a) a.VIDEO_CONFIRMED, ebk.PREPARING_CAPTURE_VIDEO).a((ajfb) new q(this));
        a.a(ebk.PREPARING_CAPTURE_VIDEO, (absz.a) a.VIDEO_READY_TO_START, ebk.CAPTURING_VIDEO).a((ajfb) new r(this));
        a.a(ebk.REQUESTED, (absz.a) a.CAPTURE_END_REQUEST, ebk.CAPTURING_PICTURE).a((ajfb) new s(this));
        a.a(ebk.CAPTURING_VIDEO, (absz.a) a.CAPTURE_HAS_BEGUN, ebk.CAPTURING_VIDEO).a((ajfb) new t(this));
        a.a(ebk.CAPTURING_VIDEO, (absz.a) a.CAPTURE_HAS_BEGUN_WITHOUT_SURFACE_RECORDING, ebk.CAPTURING_VIDEO_WITHOUT_SURFACE_RECORDING).a((ajfb) new u(this));
        a.a((Iterable) EnumSet.of(ebk.CAPTURING_VIDEO, ebk.CAPTURING_VIDEO_WITHOUT_SURFACE_RECORDING), (absz.a) a.CAPTURE_END_REQUEST, ebk.VIDEO_COMPLETING).a((ajfb) new v(this));
        a.a(ebk.CAPTURING_PICTURE, (absz.a) a.CAPTURE_HAS_BEGUN, ebk.CAPTURING_PICTURE);
        a.a(ebk.VIDEO_COMPLETING, (absz.a) a.RECORDING_TOO_SHORT, ebk.CAPTURING_PICTURE).a((ajfb) new h(this));
        a.a(ebk.PREPARING_CAPTURE_VIDEO, (absz.a) a.CAPTURE_END_REQUEST, ebk.CAPTURING_PICTURE).a((ajfb) new i(this));
        a.a(ebk.VIDEO_COMPLETING, (absz.a) a.CAPTURE_SUCCEED, ebk.PRESENTING_CAPTURE_RESULT).a((ajfb) new j(this));
        a.a(ebk.CAPTURING_PICTURE, (absz.a) a.CAPTURE_SUCCEED, ebk.PRESENTING_CAPTURE_RESULT).a((ajfb) new k(this));
        a.a(ebk.READY, (absz.a) d.EXTERNAL_CAPTURE_RESULT, ebk.PRESENTING_CAPTURE_RESULT).a((ajfb) new l(this));
        a.a(ebk.PRESENTING_CAPTURE_RESULT, (absz.a) a.RETURN_TO_CAMERA, ebk.READY);
        a.a(ebk.CAPTURING_PICTURE, (absz.a) a.RETURN_TO_CAMERA, ebk.READY).a((ajfb) new m(this));
        a.a((Iterable) EnumSet.allOf(ebk.class), (absz.a) b.CAPTURE_FAIL, ebk.READY).a((ajfb) new n(this));
        String str = "builder";
        akcr.a(a, str);
        Object a2 = a.a();
        akcr.a(a2, "builder.stateObservable");
        akcr.b(a2, "captureStateObservable");
        igk.a(a2.j(ajfu.a).x(new bg(this)).a((ajdw) this.a.l()).f((ajfb) new bh(this)), this.H);
        igk.a(a2.f((ajfb) new bi(this)), this.H);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(G);
        stringBuilder.append(".stateMachine");
        a = a.a(stringBuilder.toString());
        akcr.a(a, "builder.build(\"$TAG.stateMachine\")");
        absz absz = (absz) a;
        this.f = absz;
        this.k.a(this);
        Predicate cfVar = new cf(absz);
        this.m.a(cfVar, G);
        igk.a(ajek.a((ajev) new bt(this, cfVar)), this.H);
        ajdp a3 = ajdp.a((ajdt) this.W, (ajdt) this.Q, (ajdt) this.O, (ajfd) new bs());
        if (a3 == null) {
            akcr.a();
        }
        igk.a(a3.j(ajfu.a).f((ajfb) new bz(this)), this.H);
        igk.a(this.X.f((ajfb) new ca(this)), this.H);
        ajei ajei = this.H;
        akcr.b(ajei, "compositeDisposable");
        akcr.b(absz, "stateMachine");
        Object a4 = abta.a(f.READY, ajei);
        a4.a(f.READY, (absz.a) e.SNAP_BUTTON_DOWN, f.STARTED_CAPTURING_VIA_BUTTON).a((ajfb) new w(absz));
        a4.a(f.READY, (absz.a) e.HARDWARE_KEY_DOWN, f.STARTED_CAPTURING_VIA_HW_KEY).a((ajfb) new ah(absz));
        a4.a(f.READY, (absz.a) e.EXTERNAL_RECORDING_REQUESTED, f.STARTED_CAPTURING_FROM_EXTERNAL).a((ajfb) new as(absz));
        a4.a((Iterable) Sets.immutableEnumSet(f.STARTED_CAPTURING_VIA_BUTTON, f.STARTED_CAPTURING_VIA_HW_KEY), (absz.a) e.COUNTDOWN_CONFIRMED, f.CAPTURING_VIA_COUNTDOWN);
        a4.a(f.CAPTURING_VIA_COUNTDOWN, (absz.a) e.COUNTDOWN_FINISHED, f.READY).a((ajfb) new aw(absz));
        a4.a(f.CAPTURING_VIA_COUNTDOWN, (absz.a) e.SNAP_BUTTON_DOWN, f.READY).a((ajfb) new ax(absz));
        a4.a(f.CAPTURING_VIA_COUNTDOWN, (absz.a) e.HARDWARE_KEY_DOWN, f.READY).a((ajfb) new ay(absz));
        a4.a(f.CAPTURING_VIA_COUNTDOWN, (absz.a) e.EXIT_CAMERA_PAGE, f.READY).a((ajfb) new az(absz));
        a4.a(f.STARTED_CAPTURING_VIA_BUTTON, (absz.a) e.VIDEO_CONFIRMED, f.CAPTURING_VIDEO_VIA_BUTTON).a((ajfb) new ba(this));
        a4.a(f.STARTED_CAPTURING_VIA_HW_KEY, (absz.a) e.VIDEO_CONFIRMED, f.CAPTURING_VIDEO_VIA_HW_KEY).a((ajfb) new bb(this));
        a4.a(f.STARTED_CAPTURING_FROM_EXTERNAL, (absz.a) e.VIDEO_CONFIRMED, f.CAPTURING_VIA_HANDS_FREE).a((ajfb) new x(this));
        a4.a((Iterable) Sets.immutableEnumSet(f.STARTED_CAPTURING_VIA_BUTTON, f.CAPTURING_VIDEO_VIA_BUTTON), (absz.a) e.SNAP_BUTTON_UP, f.READY).a((ajfb) new y(absz));
        a4.a((Iterable) Sets.immutableEnumSet(f.STARTED_CAPTURING_VIA_HW_KEY, f.CAPTURING_VIDEO_VIA_HW_KEY), (absz.a) e.HARDWARE_KEY_UP, f.READY).a((ajfb) new z(absz));
        a4.a((Iterable) Sets.immutableEnumSet(f.STARTED_CAPTURING_FROM_EXTERNAL, f.CAPTURING_VIA_HANDS_FREE), (absz.a) e.EXTERNAL_RECORDING_FINISHED, f.READY).a((ajfb) new aa(absz));
        a4.a(f.STARTED_CAPTURING_VIA_BUTTON, (absz.a) e.LOCK_ICON_UP, f.READY).a((ajfb) new ab(absz));
        a4.a(f.CAPTURING_VIDEO_VIA_BUTTON, (absz.a) e.MOVE_INTO_CAPTURE_LOCK, f.CONSIDERING_HANDS_FREE_VIA_BUTTON).a((ajfb) new ac(this));
        a4.a(f.CONSIDERING_HANDS_FREE_VIA_BUTTON, (absz.a) e.MOVE_INTO_CAPTURE_BUTTON, f.CAPTURING_VIDEO_VIA_BUTTON).a((ajfb) new ad(this));
        a4.a(f.CONSIDERING_HANDS_FREE_VIA_BUTTON, (absz.a) e.MOVE_INTO_OTHER_REGION, f.CAPTURING_VIDEO_VIA_BUTTON).a((ajfb) new ae(this));
        a4.a(f.CAPTURING_VIDEO_VIA_HW_KEY, (absz.a) e.MOVE_INTO_CAPTURE_LOCK, f.CONSIDERING_HANDS_FREE_VIA_HW_KEY).a((ajfb) new af(this));
        a4.a(f.CAPTURING_VIDEO_VIA_HW_KEY, (absz.a) e.LOCK_ICON_DOWN, f.CONSIDERING_HANDS_FREE_VIA_HW_KEY).a((ajfb) new ag(this));
        a4.a(f.CONSIDERING_HANDS_FREE_VIA_HW_KEY, (absz.a) e.MOVE_INTO_CAPTURE_BUTTON, f.CAPTURING_VIDEO_VIA_HW_KEY).a((ajfb) new ai(this));
        a4.a(f.CONSIDERING_HANDS_FREE_VIA_HW_KEY, (absz.a) e.MOVE_INTO_OTHER_REGION, f.CAPTURING_VIDEO_VIA_HW_KEY).a((ajfb) new aj(this));
        a4.a((Iterable) EnumSet.of(f.CONSIDERING_HANDS_FREE_VIA_BUTTON, f.CONSIDERING_HANDS_FREE_VIA_HW_KEY), (absz.a) e.LOCK_ICON_UP, f.CAPTURING_VIA_HANDS_FREE).a((ajfb) new ak(this));
        a4.a(f.CAPTURING_VIA_HANDS_FREE, (absz.a) e.SNAP_BUTTON_DOWN, f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED).a((ajfb) new al(this));
        a4.a(f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED, (absz.a) e.MOVE_INTO_OTHER_REGION, f.CAPTURING_VIA_HANDS_FREE).a((ajfb) new am(this));
        a4.a(f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED, (absz.a) e.MOVE_INTO_CAPTURE_LOCK, f.CAPTURING_VIA_HANDS_FREE).a((ajfb) new an(this));
        a4.a(f.CAPTURING_VIA_HANDS_FREE, (absz.a) e.MOVE_INTO_CAPTURE_BUTTON, f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED).a((ajfb) new ao(this));
        a4.a(f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED, (absz.a) e.SNAP_BUTTON_UP, f.READY).a((ajfb) new ap(absz));
        a4.a(f.CAPTURING_VIA_HANDS_FREE, (absz.a) e.HARDWARE_KEY_DOWN, f.CAPTURING_VIA_HANDS_FREE_WITH_HW_KEY_PRESSED);
        a4.a(f.CAPTURING_VIA_HANDS_FREE_WITH_HW_KEY_PRESSED, (absz.a) e.HARDWARE_KEY_UP, f.READY).a((ajfb) new aq(absz));
        Iterable immutableEnumSet = Sets.immutableEnumSet(f.STARTED_CAPTURING_VIA_BUTTON, f.STARTED_CAPTURING_VIA_HW_KEY, f.CAPTURING_VIDEO_VIA_BUTTON, f.CAPTURING_VIDEO_VIA_HW_KEY, f.CAPTURING_VIA_HANDS_FREE, f.CAPTURING_VIA_HANDS_FREE_WITH_CAPTURE_BUTTON_PRESSED, f.CAPTURING_VIA_HANDS_FREE_WITH_HW_KEY_PRESSED, f.CONSIDERING_HANDS_FREE_VIA_BUTTON, f.CONSIDERING_HANDS_FREE_VIA_HW_KEY);
        a4.a(immutableEnumSet, (absz.a) e.MAX_RECORDING_REACHED, f.READY).a((ajfb) new ar(absz));
        a4.a(immutableEnumSet, (absz.a) e.EXIT_CAMERA_PAGE, f.READY).a((ajfb) new at(absz));
        a4.a(immutableEnumSet, (absz.a) e.BACK_BUTTON_PRESSED, f.READY).a((ajfb) new au(absz));
        akcr.a(a4, str);
        igk.a(a4.a().f((ajfb) new av(this)), ajei);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(G);
        stringBuilder2.append(".uiStateMachine");
        Object a5 = a4.a(stringBuilder2.toString());
        akcr.a(a5, "builder.build(\"$TAG.uiStateMachine\")");
        absz absz2 = (absz) a5;
        this.g = absz2;
        igk.a(this.L.f((ajfb) new cb(absz2)), this.H);
        igk.a(this.Q.a((ajfl) cc.a).f((ajfb) new cd(absz2)), this.H);
        igk.a(this.I.start(), this.H);
        igk.a(this.Q.a((ajfl) ce.a).f((ajfb) new bu(absz)), this.H);
        igk.a(ajwb.a(this.V, this.Q).a((ajfc) new bv(this), false).e(), this.H);
        igk.a(this.P.a((Predicate) new bw(this, absz)), this.H);
        cg cgVar = new cg(absz2);
        this.y.a(cgVar);
        igk.a(ajek.a((ajev) new bx(this, cgVar)), this.H);
        igk.a(ajek.a((ajev) new by(this)), this.H);
        return this.H;
    }
}
