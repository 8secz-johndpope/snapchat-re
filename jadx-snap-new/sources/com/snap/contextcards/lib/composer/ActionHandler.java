package com.snap.contextcards.lib.composer;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.core.db.record.FriendModel;
import defpackage.abbd;
import defpackage.aecr;
import defpackage.aipn;
import defpackage.ajei;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.fva;
import defpackage.fvx;
import defpackage.usd;
import defpackage.usg;
import defpackage.usq;
import defpackage.uym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ActionHandler {
    public fva a;
    private final Context b;
    private final ajei c;
    private final aipn<fvx> d;
    private final aipn<usd> e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ActionHandler(Context context, ajei ajei, aipn<fvx> aipn, aipn<usd> aipn2) {
        akcr.b(context, "context");
        akcr.b(ajei, "activityDisposable");
        akcr.b(aipn, "openUrlAction");
        akcr.b(aipn2, "unifiedProfileLauncher");
        this.b = context;
        this.c = ajei;
        this.d = aipn;
        this.e = aipn2;
    }

    @Keep
    public final void dismissModal(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }

    @Keep
    public final void logActionMetric(Object[] objArr) {
        akcr.b(objArr, "params");
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map != null) {
                Object obj2 = map.get("actionMetric");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                obj = map.get("cardId");
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (!(str == null && str2 == null)) {
                    fva fva = this.a;
                    if (fva != null) {
                        fva.a(str, str2);
                    }
                }
            }
        }
    }

    @Keep
    public final void openContext(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }

    @Keep
    public final void openDefaultSwipeUpContent(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
        fva fva = this.a;
        if (fva != null) {
            fva.c();
        }
    }

    @Keep
    public final void openFriendProfile(Object[] objArr) {
        Object obj = objArr;
        akcr.b(obj, "params");
        logActionMetric(objArr);
        if (obj.length > 0) {
            obj = obj[0];
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            HashMap hashMap = (HashMap) obj;
            Object obj2 = hashMap != null ? hashMap.get("username") : null;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            Object obj3 = hashMap != null ? hashMap.get("userId") : null;
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            obj3 = hashMap != null ? hashMap.get("displayName") : null;
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str3 = (String) obj3;
            String str4 = str3 == null ? str : str3;
            obj3 = hashMap != null ? hashMap.get(FriendModel.BITMOJIAVATARID) : null;
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str5 = (String) obj3;
            obj = hashMap != null ? hashMap.get(FriendModel.BITMOJISELFIEID) : null;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str6 = (String) obj;
            if (str != null) {
                ((usd) this.e.get()).a(new usq(usg.FRIEND_PROFILE, str, new uym((long) str.hashCode(), str2, str, str4, null, str5, str6, null, null, true, null, null, aecr.ADDED_BY_MENTION, 511872), abbd.CONTEXT_CARDS, null, 16));
            }
        }
    }

    @Keep
    public final void openReplyCamera(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }

    @Keep
    public final void openReplyChat(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }

    @Keep
    public final void openURL(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
        if (objArr.length > 0) {
            boolean z = false;
            Object obj = objArr[0];
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map != null) {
                Object obj2;
                Object obj3 = map.get("urls");
                if (!(obj3 instanceof Object[])) {
                    obj3 = null;
                }
                Object[] objArr2 = (Object[]) obj3;
                if (objArr2 == null) {
                    objArr2 = new Object[0];
                }
                Collection arrayList = new ArrayList();
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    obj2 = 1;
                    if (i >= length) {
                        break;
                    }
                    Object obj4 = objArr2[i];
                    if (obj4 == null || !(obj4 instanceof String)) {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        arrayList.add(obj4);
                    }
                    i++;
                }
                List list = (List) arrayList;
                obj3 = map.get("url");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                obj3 = (String) obj3;
                if (obj3 == null) {
                    obj3 = "";
                }
                if (((CharSequence) obj3).length() <= 0) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    list = ajyu.a((Collection) list, obj3);
                }
                obj = map.get("external");
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                for (String openUrl : list) {
                    if (openUrl(openUrl, z)) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0133  */
    @android.support.annotation.Keep
    public final boolean openUrl(java.lang.String r20, boolean r21) {
        /*
        r19 = this;
        r0 = r19;
        r1 = "url";
        r2 = r20;
        defpackage.akcr.b(r2, r1);
        r2 = android.net.Uri.parse(r20);
        r3 = r0.a;
        r4 = "uri";
        if (r3 == 0) goto L_0x0023;
    L_0x0013:
        defpackage.akcr.a(r2, r4);
        r5 = r0.d;
        r5 = r5.get();
        r5 = (defpackage.fvx) r5;
        r5 = r5.b;
        r3.a(r2, r5);
    L_0x0023:
        r3 = r0.d;
        r3 = r3.get();
        r3 = (defpackage.fvx) r3;
        r5 = r0.b;
        defpackage.akcr.a(r2, r4);
        r6 = r0.c;
        r7 = "context";
        defpackage.akcr.b(r5, r7);
        defpackage.akcr.b(r2, r4);
        r8 = "sessionDisposables";
        defpackage.akcr.b(r6, r8);
        r8 = 1;
        if (r21 == 0) goto L_0x004b;
    L_0x0042:
        r1 = new fvw;
        r1.<init>();
        defpackage.fvw.a(r5, r2);
        return r8;
    L_0x004b:
        r9 = r3.b;
        r9 = r9.a(r2);
        if (r9 == 0) goto L_0x0076;
    L_0x0053:
        r9 = r9.c(r2);
        r11 = new fvx$d;
        r11.<init>(r2, r5, r6);
        r11 = (defpackage.ajev) r11;
        r12 = new fvx$e;
        r12.<init>(r2, r5, r6);
        r12 = (defpackage.ajfb) r12;
        r9 = r9.a(r11, r12);
        r11 = "deepLinkHandler.handle(u…t)\n                    })";
        defpackage.akcr.a(r9, r11);
        r11 = r6;
        r11 = (defpackage.ajfo) r11;
        defpackage.std.a(r9, r11);
        r9 = 1;
        goto L_0x0077;
    L_0x0076:
        r9 = 0;
    L_0x0077:
        r11 = "uri.toString()";
        if (r9 != 0) goto L_0x0130;
    L_0x007b:
        r9 = r2.toString();
        r9 = android.webkit.URLUtil.isValidUrl(r9);
        if (r9 == 0) goto L_0x012a;
    L_0x0085:
        r3 = r3.a;
        r9 = r2.toString();
        defpackage.akcr.a(r9, r11);
        defpackage.akcr.b(r5, r7);
        defpackage.akcr.b(r9, r1);
        r14 = new slg;
        r12 = new slh;
        r12.<init>();
        r12 = (defpackage.slp) r12;
        r14.<init>(r5, r12);
        r12 = defpackage.sqx.SWIPE_DOWN;
        r14.a(r12);
        r12 = defpackage.ajyy.a;
        r13 = r12;
        r13 = (java.util.Set) r13;
        r12 = r3.a;
        r12 = r12.b();
        r15 = r12;
        r15 = (defpackage.zfw) r15;
        r12 = r3.d;
        r16 = defpackage.fvu.a;
        r10 = r16;
        r10 = (defpackage.ide) r10;
        r16 = r12.a(r10);
        r10 = r3.c;
        r17 = r10.a();
        r10 = new fwc;
        r10.<init>();
        r18 = r10;
        r18 = (defpackage.idl) r18;
        r10 = new sti$a;
        r12 = r10;
        r12.<init>(r13, r14, r15, r16, r17, r18);
        r12 = r3.e;
        r10.k = r12;
        r10 = r10.a();
        r12 = new sqh;
        r12.<init>();
        r13 = defpackage.sqh.ai;
        r14 = new sqf;
        r14.<init>(r9);
        r12.b(r13, r14);
        r9 = defpackage.sqh.ak;
        r13 = defpackage.sqn.ALWAYS;
        r12.b(r9, r13);
        r9 = defpackage.sqh.an;
        r13 = java.lang.Boolean.TRUE;
        r12.b(r9, r13);
        r9 = new ssy;
        r13 = new defpackage.sqh[r8];
        r14 = 0;
        r13[r14] = r12;
        r9.<init>(r13);
        r12 = new fwg$b;
        r12.<init>();
        r3 = r3.b;
        r9 = (defpackage.smi) r9;
        r12 = (defpackage.ssi) r12;
        r3 = r3.a(r9, r10, r12, new defpackage.stl());
        r9 = defpackage.fvx.b.a;
        r9 = (defpackage.ajev) r9;
        r10 = defpackage.fvx.c.a;
        r10 = (defpackage.ajfb) r10;
        r3 = r3.a(r9, r10);
        r9 = "operaWebLauncher.launch(…in opera\")\n            })";
        defpackage.akcr.a(r3, r9);
        r6 = (defpackage.ajfo) r6;
        defpackage.std.a(r3, r6);
        r3 = 1;
        goto L_0x012b;
    L_0x012a:
        r3 = 0;
    L_0x012b:
        if (r3 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x0130;
    L_0x012e:
        r3 = 0;
        goto L_0x0131;
    L_0x0130:
        r3 = 1;
    L_0x0131:
        if (r3 != 0) goto L_0x0187;
    L_0x0133:
        r6 = new fvw;
        r6.<init>();
        r6 = r2.toString();
        defpackage.akcr.a(r6, r11);
        defpackage.akcr.b(r6, r1);
        r1 = "tel:";
        r14 = 0;
        r1 = defpackage.akgb.b(r6, r1, r14);
        if (r1 == 0) goto L_0x015c;
    L_0x014b:
        defpackage.akcr.b(r5, r7);
        defpackage.akcr.b(r2, r4);
        r1 = new android.content.Intent;
        r3 = "android.intent.action.DIAL";
        r1.<init>(r3, r2);
        r5.startActivity(r1);
        goto L_0x0188;
    L_0x015c:
        defpackage.akcr.b(r5, r7);
        defpackage.akcr.b(r2, r4);
        r1 = new android.content.Intent;
        r4 = "android.intent.action.VIEW";
        r1.<init>(r4, r2);
        r4 = r5.getPackageManager();
        r1 = r1.resolveActivity(r4);
        if (r1 == 0) goto L_0x0181;
    L_0x0173:
        r1 = r1.getClassName();
        r4 = "com.android.internal.app.ResolverActivity";
        r1 = defpackage.akcr.a(r1, r4);
        r1 = r1 ^ r8;
        if (r1 == 0) goto L_0x0181;
    L_0x0180:
        r14 = 1;
    L_0x0181:
        if (r14 == 0) goto L_0x0187;
    L_0x0183:
        defpackage.fvw.a(r5, r2);
        goto L_0x0188;
    L_0x0187:
        r8 = r3;
    L_0x0188:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.contextcards.lib.composer.ActionHandler.openUrl(java.lang.String, boolean):boolean");
    }

    @Keep
    public final void playStoryWithToken(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }

    @Keep
    public final void presentRemoteDocumentModally(Object[] objArr) {
        akcr.b(objArr, "params");
        logActionMetric(objArr);
    }
}
