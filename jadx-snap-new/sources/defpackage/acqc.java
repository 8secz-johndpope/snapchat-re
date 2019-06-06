package defpackage;

import android.text.TextUtils;
import com.snap.core.db.api.DbClient;
import defpackage.acpz.b;
import defpackage.alhh.a;
import defpackage.nlq.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acqc */
public final class acqc implements acqb {
    final HashMap<String, Long> a = new HashMap();
    boolean b;
    private final acpz c;
    private final ajei d;

    /* renamed from: acqc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acqc$1 */
    static final class 1 extends akcq implements akbl<List<? extends nlp>, ajxw> {
        1(acqc acqc) {
            super(1, acqc);
        }

        public final String getName() {
            return "fillTimestamps";
        }

        public final akej getOwner() {
            return akde.a(acqc.class);
        }

        public final String getSignature() {
            return "fillTimestamps(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List<nlp> list = (List) obj;
            akcr.b(list, "p1");
            acqc acqc = (acqc) this.receiver;
            for (nlp nlp : list) {
                Map map = acqc.a;
                Object b = nlp.b();
                akcr.a(b, "record.ownerId()");
                map.put(b, Long.valueOf(nlp.c()));
            }
            acqc.b = true;
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public acqc(acpz acpz, zgb zgb, ajei ajei) {
        akcr.b(acpz, "repository");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "compositeDisposable");
        this.c = acpz;
        this.d = ajei;
        DbClient dbClient = this.c.a;
        akcr.a(nlp.a, "MapExploreReadStatusRecord.FACTORY");
        Object a = c.a();
        akcr.a(a, "MapExploreReadStatusRecord.FACTORY.readStatuses");
        Object c = dbClient.queryAndMapToList(a, new b(nlp.b)).c(1);
        akcr.a(c, "dbClient.queryAndMapToLi…\n                .take(1)");
        c = c.a((ajdw) zgb.a(adcw.b.callsite("ExploreStatusesReadStateImpl")).l()).f((ajfb) new acqd(new 1(this)));
        akcr.a(c, "repository.getLastReadSt…ibe(this::fillTimestamps)");
        std.a(c, this.d);
    }

    private final void a(a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : aVarArr) {
            Object d = aVar.d();
            long c = aVar.c();
            Long l = (Long) this.a.get(d);
            if (l == null || l.longValue() < c) {
                Map map = this.a;
                akcr.a(d, "ownerId");
                map.put(d, Long.valueOf(c));
                arrayList.add(new ajxm(d, Long.valueOf(c)));
            }
        }
        if (arrayList.size() != 0) {
            Object e;
            String str;
            if (arrayList.size() == 1) {
                e = this.c.a((String) ((ajxm) arrayList.get(0)).a, ((Number) ((ajxm) arrayList.get(0)).b).longValue()).e();
                str = "repository.replaceReadSt…ps[0].second).subscribe()";
            } else {
                e = this.c.a((List) arrayList).e();
                str = "repository.replaceReadSt…s(timestamps).subscribe()";
            }
            akcr.a(e, str);
            std.a(e, this.d);
        }
    }

    public final void a(acqf acqf) {
        akcr.b(acqf, "explorerStatusWrapper");
        int i = 0;
        alhh alhh;
        a[] aVarArr;
        if (acqf.c != null) {
            alhh = acqf.c;
            if (alhh != null) {
                aVarArr = alhh.c;
                if (aVarArr != null) {
                    if (aVarArr.length == 0) {
                        i = 1;
                    }
                    if ((i ^ 1) != 0) {
                        a(aVarArr);
                    }
                }
            }
        } else if (acqf.b != null) {
            aljr aljr = acqf.b;
            if (aljr != null) {
                alhj alhj = aljr.a;
                if (alhj != null) {
                    alhh = alhj.b;
                    if (alhh != null) {
                        aVarArr = alhh.c;
                        if (aVarArr != null) {
                            if (aVarArr.length == 0) {
                                i = 1;
                            }
                            if ((i ^ 1) != 0) {
                                a(aVarArr);
                            }
                        }
                    }
                }
            }
        } else {
            if (acqf.d != null) {
                alhi alhi = acqf.d;
                if (alhi != null) {
                    long b = alhi.b();
                    String str = "MAP";
                    Long l = (Long) this.a.get(str);
                    if (l == null || l.longValue() < b) {
                        this.a.put(str, Long.valueOf(b));
                        Object e = this.c.a(str, b).e();
                        akcr.a(e, "repository.replaceReadSt…d, timestamp).subscribe()");
                        std.a(e, this.d);
                    }
                }
            }
        }
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "statusData");
        return b(aVar.d(), aVar.c());
    }

    public final boolean a(String str, long j) {
        return str == null ? false : b("MAP", j);
    }

    public final boolean b(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.b) {
            return true;
        }
        Long l = (Long) this.a.get(str);
        return l != null && l.longValue() >= j;
    }
}
