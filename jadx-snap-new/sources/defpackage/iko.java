package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.column.CalendarDate;
import defpackage.tpl.b.a;
import defpackage.tpl.b.d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/* renamed from: iko */
public final class iko {
    public final ajxe a;
    public final ajei b = new ajei();
    public Boolean c;
    public String d;
    public Long e;
    public String f;
    public iku g = iku.UNKNOWN;
    final ikr h;
    public final ajws<psh> i;
    private final ajxe j = ajxh.a(a.a);

    /* renamed from: iko$a */
    static final class a extends akcs implements akbk<Calendar> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Calendar.getInstance();
        }
    }

    /* renamed from: iko$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        f(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ijd.a.callsite("FriendFilterDataSource"));
        }
    }

    /* renamed from: iko$b */
    public static final class b<T> implements ajfl<psh> {
        private /* synthetic */ defpackage.tpl.b a;

        public b(defpackage.tpl.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((psh) obj, "it");
            defpackage.tpl.b bVar = this.a;
            return (bVar instanceof d) || (bVar instanceof a);
        }
    }

    /* renamed from: iko$c */
    public static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ iko a;

        public c(iko iko) {
            this.a = iko;
        }

        public final /* synthetic */ Object apply(Object obj) {
            psh psh = (psh) obj;
            akcr.b(psh, "it");
            psg psg = psh.a;
            if (psg instanceof psv) {
                psg psg2 = psh.a;
                if (psg2 != null) {
                    String str = ((psv) psg2).b;
                    this.a.a(iku.ONE_TO_ONE);
                    ikr ikr = this.a.h;
                    akcr.b(str, "username");
                    DbClient dbClient = ikr.b;
                    obj = ikr.c.getFriendInfo(str);
                    akcr.a(obj, "dbModel.getFriendInfo(username)");
                    Iterable<ikt> query = dbClient.query(obj, ikr.d);
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) query, 10));
                    for (ikt ikt : query) {
                        this.a.f = ikt.a;
                        this.a.d = ikt.b;
                        this.a.e = ikt.c;
                        iko iko = this.a;
                        CalendarDate calendarDate = ikt.d;
                        boolean z = true;
                        int i = iko.a().get(2) + 1;
                        if (calendarDate == null || i != calendarDate.getMonth() || iko.a().get(5) != calendarDate.getDay()) {
                            z = false;
                        }
                        iko.c = Boolean.valueOf(z);
                        arrayList.add(ajxw.a);
                    }
                    return (List) arrayList;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.messaging.api.UserQuickReplyContext");
            }
            iko iko2;
            iku iku;
            if (psg instanceof pri) {
                iko2 = this.a;
                iku = iku.GROUP;
            } else {
                iko2 = this.a;
                iku = iku.UNKNOWN;
            }
            iko2.a(iku);
            return ajxw.a;
        }
    }

    /* renamed from: iko$d */
    public static final class d<T> implements ajfb<Object> {
        public static final d a = new d();

        d() {
        }

        public final void accept(Object obj) {
        }
    }

    /* renamed from: iko$e */
    public static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iko.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(iko.class), "calendar", "getCalendar()Ljava/util/Calendar;")};
    }

    public iko(zgb zgb, ikr ikr, ajws<psh> ajws) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ikr, "friendFilterRepository");
        akcr.b(ajws, "quickReplyEventSubject");
        this.h = ikr;
        this.i = ajws;
        this.a = ajxh.a(new f(zgb));
    }

    /* Access modifiers changed, original: final */
    public final Calendar a() {
        return (Calendar) this.j.b();
    }

    public final void a(iku iku) {
        akcr.b(iku, "<set-?>");
        this.g = iku;
    }
}
