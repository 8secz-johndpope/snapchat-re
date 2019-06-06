package defpackage;

import android.content.Context;
import com.snapchat.android.R;
import defpackage.rlc.a;
import java.util.List;

/* renamed from: rlg */
public final class rlg extends rlc {
    final rkj a;
    final ajwl<Integer> b;
    private final String c;
    private final String d;
    private final Integer e;
    private final int f = R.string.send_to_story_group_title;
    private final String g;
    private final ajdp<znh<zmy>> l;
    private final ris m;
    private final String n = null;

    /* renamed from: rlg$1 */
    static final class 1<T, R> implements ajfc<T, R> {
        public static final 1 a = new 1();

        1() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return new rli(((Number) ajxm.a).longValue(), ((Number) ajxm.b).longValue());
        }
    }

    public rlg(riq riq, ris ris, ajdp<List<rjd>> ajdp, zkf zkf, ajdp<rkh> ajdp2, a aVar, Context context, gpb gpb, boolean z, ajdp<Boolean> ajdp3, yig yig) {
        Object a;
        String str;
        Object a2;
        riq riq2 = riq;
        ris ris2 = ris;
        ajdp<List<rjd>> ajdp4 = ajdp;
        zkf zkf2 = zkf;
        ajdp<rkh> ajdp5 = ajdp2;
        final a aVar2 = aVar;
        Context context2 = context;
        ajdp<Boolean> ajdp6 = ajdp3;
        akcr.b(riq, "presenter");
        akcr.b(ris, "viewModelFactory");
        akcr.b(ajdp4, "storyDataObservable");
        akcr.b(zkf2, "rxBus");
        akcr.b(ajdp5, "groupManagerObservable");
        akcr.b(aVar2, "displayMode");
        akcr.b(context2, "context");
        akcr.b(gpb, "userAuthStore");
        akcr.b(ajdp6, "visibilityForSearch");
        akcr.b(yig, "userStorySettings");
        super(riq, context2);
        this.m = ris2;
        Integer num = null;
        Object i = ajwl.i(Integer.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDefault(0)");
        this.b = i;
        zkf2.a(this);
        if (z) {
            a = riq.a(R.string.send_to_search_add_to_stories);
            str = "presenter.getString(R.st…to_search_add_to_stories)";
        } else {
            a = riq.a(R.string.send_to_story_group_title);
            str = "presenter.getString(R.st…end_to_story_group_title)";
        }
        akcr.a(a, str);
        this.c = a;
        String str2 = "";
        this.g = str2;
        if (yig.b()) {
            a2 = riq.a(R.string.send_to_new_private_story);
            akcr.a(a2, "presenter.getString(R.st…end_to_new_private_story)");
            this.d = a2;
            num = Integer.valueOf(R.drawable.send_to_stories_section_header_new_story_plus);
        } else {
            this.d = str2;
        }
        this.e = num;
        a2 = new rki(ajyx.a);
        this.a = new rkj((rkh) a2);
        ajdw h = riq.k().h();
        Object a3 = ajdp.a(ajdp4.a(h), ajdp.b(a2).c((ajdt) ajdp5).a(h), this.b.a(h), g().a(h), gpb.c().a(h), ajdp6.a(h), ajwa.a(yig.e(), yig.f()).p(1.a), new ajfh<List<? extends rjd>, rkh, Integer, String, abkq, Boolean, rli, List<? extends zmy>>(this) {
            private /* synthetic */ rlg a;

            public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                List list = (List) obj;
                rkh rkh = (rkh) obj2;
                Integer num = (Integer) obj3;
                String str = (String) obj4;
                abkq abkq = (abkq) obj5;
                Boolean bool = (Boolean) obj6;
                rli rli = (rli) obj7;
                akcr.b(list, "storyDataList");
                akcr.b(rkh, "groupManager");
                akcr.b(num, "isCollapsed");
                akcr.b(str, "rawQuery");
                akcr.b(abkq, "userSession");
                akcr.b(bool, "visibleForSearch");
                akcr.b(rli, "storySettings");
                if (aVar2 == a.SEARCH_ONLY && !bool.booleanValue()) {
                    return ajyw.a;
                }
                String a = vxg.a(str);
                this.a.a.a(rkh);
                if (a == null) {
                    akcr.a();
                }
                Integer valueOf = (((CharSequence) a).length() == 0 ? 1 : null) != null ? (Integer) this.a.b.p() : Integer.valueOf(Integer.MAX_VALUE);
                return this.a.a(list, a, valueOf != null ? valueOf.intValue() : 0, aVar2, abkq, rli);
            }
        }).a(f());
        akcr.a(a3, "Observable.combineLatest…se(applySelectionState())");
        this.l = a3;
    }

    public final int a() {
        return 11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARNING: Missing block: B:8:0x0035, code skipped:
            if (r5 == null) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:19:0x004f, code skipped:
            if (r5 != null) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:44:0x0102, code skipped:
            if (r11 > r16) goto L_0x0107;
     */
    public final java.util.List<defpackage.zmy> a(java.util.List<? extends defpackage.rjd> r20, java.lang.String r21, int r22, defpackage.rlc.a r23, defpackage.abkq r24, defpackage.rli r25) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = r23;
        r4 = r25;
        r5 = "storyDataList";
        defpackage.akcr.b(r1, r5);
        r5 = "displayMode";
        defpackage.akcr.b(r3, r5);
        r5 = "userSession";
        r14 = r24;
        defpackage.akcr.b(r14, r5);
        r5 = "storySettings";
        defpackage.akcr.b(r4, r5);
        r5 = defpackage.rlc.a.DEFAULT_ONLY;
        r15 = 0;
        r13 = 1;
        if (r3 != r5) goto L_0x003c;
    L_0x0026:
        r5 = r2;
        r5 = (java.lang.CharSequence) r5;
        if (r5 == 0) goto L_0x0034;
    L_0x002b:
        r5 = r5.length();
        if (r5 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0034;
    L_0x0032:
        r5 = 0;
        goto L_0x0035;
    L_0x0034:
        r5 = 1;
    L_0x0035:
        if (r5 != 0) goto L_0x003c;
    L_0x0037:
        r1 = defpackage.ajyw.a;
        r1 = (java.util.List) r1;
        return r1;
    L_0x003c:
        r5 = defpackage.rlc.a.SEARCH_ONLY;
        if (r3 != r5) goto L_0x0052;
    L_0x0040:
        r5 = r2;
        r5 = (java.lang.CharSequence) r5;
        if (r5 == 0) goto L_0x004e;
    L_0x0045:
        r5 = r5.length();
        if (r5 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x004e;
    L_0x004c:
        r5 = 0;
        goto L_0x004f;
    L_0x004e:
        r5 = 1;
    L_0x004f:
        if (r5 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0037;
    L_0x0052:
        r5 = defpackage.rlh.a;
        r3 = r23.ordinal();
        r3 = r5[r3];
        r5 = 2;
        if (r3 == r13) goto L_0x0074;
    L_0x005d:
        if (r3 != r5) goto L_0x006e;
    L_0x005f:
        if (r2 != 0) goto L_0x0064;
    L_0x0061:
        defpackage.akcr.a();
    L_0x0064:
        r3 = r0.a;
        r1 = r3.a(r1, r2);
        r0.b(r1);
        goto L_0x0077;
    L_0x006e:
        r1 = new ajxk;
        r1.<init>();
        throw r1;
    L_0x0074:
        r19.a(r20);
    L_0x0077:
        r2 = r1.isEmpty();
        if (r2 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x0037;
    L_0x007e:
        r2 = "receiver$0";
        defpackage.akcr.b(r1, r2);
        r2 = new defpackage.akbl[r5];
        r3 = defpackage.rku.e.a;
        r3 = (defpackage.akbl) r3;
        r2[r15] = r3;
        r3 = defpackage.rku.f.a;
        r3 = (defpackage.akbl) r3;
        r2[r13] = r3;
        r2 = defpackage.ajzy.a(r2);
        r1 = (java.lang.Iterable) r1;
        r1 = defpackage.ajyu.a(r1, r2);
        r2 = r1.size();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3 = (java.util.List) r3;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r5 = (java.util.List) r5;
        r6 = new java.util.LinkedHashMap;
        r6.<init>();
        r6 = (java.util.Map) r6;
        r7 = r1;
        r7 = (java.lang.Iterable) r7;
        r7 = r7.iterator();
        r8 = 0;
    L_0x00bc:
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x013a;
    L_0x00c2:
        r9 = r7.next();
        r9 = (defpackage.rjd) r9;
        r10 = defpackage.rku.a(r9);
        r11 = r10.displayConfig;
        r12 = r11.a;
        r9 = r12.invoke(r9, r4);
        r9 = (java.lang.Boolean) r9;
        r9 = r9.booleanValue();
        if (r9 == 0) goto L_0x0130;
    L_0x00dc:
        r9 = r11.b;
        r9 = r9.invoke(r4);
        r9 = (java.lang.Number) r9;
        r11 = r9.longValue();
        r16 = -1;
        r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r9 == 0) goto L_0x0107;
    L_0x00ee:
        r16 = 0;
        r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r9 <= 0) goto L_0x0105;
    L_0x00f4:
        r9 = r6.get(r10);
        r9 = (java.lang.Long) r9;
        if (r9 == 0) goto L_0x0100;
    L_0x00fc:
        r16 = r9.longValue();
    L_0x0100:
        r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1));
        if (r9 <= 0) goto L_0x0105;
    L_0x0104:
        goto L_0x0107;
    L_0x0105:
        r9 = 0;
        goto L_0x0108;
    L_0x0107:
        r9 = 1;
    L_0x0108:
        if (r9 == 0) goto L_0x0130;
    L_0x010a:
        r9 = java.lang.Integer.valueOf(r8);
        r3.add(r9);
        r9 = r6.get(r10);
        r9 = (java.lang.Long) r9;
        r11 = 1;
        if (r9 == 0) goto L_0x0128;
    L_0x011b:
        r9 = (java.lang.Number) r9;
        r16 = r9.longValue();
        r16 = r16 + r11;
        r9 = java.lang.Long.valueOf(r16);
        goto L_0x012c;
    L_0x0128:
        r9 = java.lang.Long.valueOf(r11);
    L_0x012c:
        r6.put(r10, r9);
        goto L_0x0137;
    L_0x0130:
        r9 = java.lang.Integer.valueOf(r8);
        r5.add(r9);
    L_0x0137:
        r8 = r8 + 1;
        goto L_0x00bc;
    L_0x013a:
        r5 = (java.lang.Iterable) r5;
        r4 = r5.iterator();
        r5 = 0;
    L_0x0141:
        r6 = r4.hasNext();
        if (r6 == 0) goto L_0x0167;
    L_0x0147:
        r6 = r4.next();
        r6 = (java.lang.Number) r6;
        r6 = r6.intValue();
        r7 = r22;
        if (r5 < r7) goto L_0x015d;
    L_0x0155:
        r8 = r3.size();
        r8 = r2 - r8;
        if (r8 > r13) goto L_0x0167;
    L_0x015d:
        r6 = java.lang.Integer.valueOf(r6);
        r3.add(r6);
        r5 = r5 + 1;
        goto L_0x0141;
    L_0x0167:
        r2 = new java.util.ArrayList;
        r4 = r3.size();
        r4 = r4 + r13;
        r2.<init>(r4);
        r5 = r0.m;
        r6 = r0.c;
        r7 = r0.d;
        r8 = r0.e;
        r9 = 2131889445; // 0x7f120d25 float:1.9413554E38 double:1.0532933355E-314;
        r11 = 11;
        r12 = r0.g;
        r4 = r5.a(r6, r7, r8, r9, r11, r12);
        r2.add(r15, r4);
        r4 = r3.size();
        r5 = r3;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
        r12 = 0;
    L_0x0193:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x01ed;
    L_0x0199:
        r6 = r5.next();
        r6 = (java.lang.Number) r6;
        r6 = r6.intValue();
        r10 = defpackage.rnv.a(r12, r4);
        r6 = r1.get(r6);
        r16 = r6;
        r16 = (defpackage.rjd) r16;
        r11 = r2;
        r11 = (java.util.List) r11;
        r6 = r0.m;
        r8 = r19.d();
        r7 = "selectionState";
        defpackage.akcr.a(r8, r7);
        r17 = 11;
        r18 = 0;
        r7 = r16;
        r9 = r12;
        r15 = r11;
        r11 = r17;
        r17 = r12;
        r12 = r18;
        r18 = 1;
        r13 = r24;
        r6 = r6.a(r7, r8, r9, r10, r11, r12, r13);
        if (r6 != 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x01e8;
    L_0x01d6:
        r15.add(r6);
        r7 = r19.e();
        r6 = r6.d();
        r8 = r16.x();
        r7.a(r6, r8);
    L_0x01e8:
        r12 = r17 + 1;
        r13 = 1;
        r15 = 0;
        goto L_0x0193;
    L_0x01ed:
        r18 = 1;
        r3 = r3.size();
        r1 = r1.size();
        if (r3 >= r1) goto L_0x01fa;
    L_0x01f9:
        goto L_0x01fc;
    L_0x01fa:
        r18 = 0;
    L_0x01fc:
        if (r18 == 0) goto L_0x0209;
    L_0x01fe:
        r1 = r0.m;
        r3 = 11;
        r1 = r1.a(r3);
        r2.add(r1);
    L_0x0209:
        r2 = (java.util.List) r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlg.a(java.util.List, java.lang.String, int, rlc$a, abkq, rli):java.util.List");
    }

    public final ajdp<znh<zmy>> c() {
        return this.l;
    }

    @akqq
    public final void onViewMoreEvent(rjq rjq) {
        akcr.b(rjq, "viewMoreEvent");
        if (rjq.a() == 11) {
            ajwl ajwl = this.b;
            Integer num = (Integer) ajwl.p();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            ajwl.a(Integer.valueOf(num.intValue() + 5));
        }
    }
}
