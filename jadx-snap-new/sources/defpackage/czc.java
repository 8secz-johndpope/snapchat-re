package defpackage;

import android.app.ActivityManager.MemoryInfo;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.framework.channel.ChannelInfoStore;
import defpackage.abln.b;
import defpackage.abln.c;
import defpackage.abln.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: czc */
public final class czc implements ablh {
    final ajwy<dib> a;
    final ajwy<absa> b;
    final ajwy<abpi> c;
    final ajwy<iha> d;
    final ilv e;
    final ajwy<ChannelInfoStore> f;
    private final ajwy<zfy> g;
    private aaay h;

    public czc(ajwy<dib> ajwy, ajwy<iha> ajwy2, ajwy<abpi> ajwy3, ajwy<absa> ajwy4, ajwy<zfy> ajwy5, ajwy<ChannelInfoStore> ajwy6, ilv ilv) {
        this.a = ajwy;
        this.b = ajwy4;
        this.c = ajwy3;
        this.d = ajwy2;
        this.g = ajwy5;
        this.f = ajwy6;
        this.e = ilv;
    }

    static void a(Map<String, Object> map, String str, c cVar, String str2, Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('_');
        stringBuilder.append(String.valueOf(cVar).toLowerCase(Locale.US));
        stringBuilder.append('_');
        stringBuilder.append(str2);
        map.put(stringBuilder.toString(), obj);
    }

    public final void a() {
        this.h = new aaay();
    }

    public final void a(final ablm ablm) {
        if (this.h != null) {
            Object obj = (ablm.d.get(abmb.FIRST_PREVIEW_FRAME_RECEIVED) == null || ablm.d.get(abmb.FIRST_PREVIEW_FRAME_RENDERED) == null || ablm.d.get(abmb.FIRST_UI_RENDERED) == null) ? null : 1;
            if (obj != null) {
                final aaay aaay = this.h;
                this.g.get();
                zfy.a(djb.a.callsite("BlizzardReporter")).a().submit(new Runnable() {
                    public final void run() {
                        Entry entry;
                        String str;
                        Long a;
                        int i;
                        long abs;
                        MemoryInfo a2 = ((abpi) czc.this.c.get()).a();
                        boolean a3 = ((absa) czc.this.b.get()).a();
                        czc czc = czc.this;
                        ablm ablm = ablm;
                        aajt aajt = aaay;
                        Long l = ablm.a;
                        aajt.g = SCamera.CAMERA_ID_FRONT;
                        aajt.d = ablm.b.name();
                        aajt.e = ablm.h.name();
                        HashMap newHashMap = Maps.newHashMap();
                        newHashMap.put("launch_time_micros", ablm.a(l));
                        for (Entry entry2 : ablm.c.entrySet()) {
                            newHashMap.put(((b) entry2.getKey()).a().toLowerCase(Locale.US), entry2.getValue());
                        }
                        Iterator it = ablm.d.entrySet().iterator();
                        while (true) {
                            str = "micros";
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj;
                            entry2 = (Entry) it.next();
                            a = ablm.a((Long) entry2.getValue(), l);
                            if (entry2.getKey() == abmb.PROCESS_CREATED) {
                                obj = "interval_launch_to_creation_micros";
                            } else if (entry2.getKey() == abmb.CAMERA_OPENED) {
                                obj = "droid_interval_launch_to_camera_opened_micros";
                            } else {
                                czc.a(newHashMap, "interval_launch_to", (c) entry2.getKey(), str, a);
                            }
                            newHashMap.put(obj, a);
                        }
                        newHashMap.put("interval_launch_to_action_micros", ablm.a(ablm.i, l));
                        Iterator it2 = ablm.e.iterator();
                        while (it2.hasNext()) {
                            abll abll = (abll) it2.next();
                            czc.a(newHashMap, "droid_interval_launch_to_start", abll.c, str, ablm.a(Long.valueOf(abll.d), ablm.a));
                            czc.a(newHashMap, "droid_interval_launch_to_end", abll.c, str, ablm.a(abll.e, ablm.a));
                        }
                        it2 = ablm.f.entrySet().iterator();
                        while (true) {
                            i = 0;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Entry entry3 = (Entry) it2.next();
                            Collection collection = (Collection) entry3.getValue();
                            if (!(collection == null || collection.isEmpty())) {
                                newHashMap.put(((f) entry3.getKey()).a().toLowerCase(Locale.US), String.format("[%s]", new Object[]{akly.a((Iterable) entry3.getValue(), ppy.b)}));
                            }
                        }
                        aajt.c = ((iha) czc.d.get()).b(newHashMap);
                        HashMap newHashMap2 = Maps.newHashMap();
                        if (a2 != null) {
                            newHashMap2.put("total_mem", Long.valueOf(a2.totalMem));
                            newHashMap2.put("avail_mem", Long.valueOf(a2.availMem));
                            newHashMap2.put("large_mem", Long.valueOf((long) ((abpi) czc.c.get()).b()));
                            newHashMap2.put("threshold", Long.valueOf(a2.threshold));
                        }
                        aajt.f = ((iha) czc.d.get()).b(newHashMap2);
                        aajt.a = a3 ? "low_power" : "normal_power";
                        if (ablm.b == ably.FROM_NEW_ACTIVITY) {
                            Long l2 = (Long) ablm.d.get(abmb.PROCESS_CREATED);
                            a = null;
                            abll abll2 = (abll) Iterables.find(ablm.e, new defpackage.ablw.1(), null);
                            if (abll2 != null) {
                                a = abll2.e;
                            }
                            long a4 = ablw.a(ablm);
                            if (!(l2 == null || a == null)) {
                                if (Math.abs(ablm.a(l2, ablm.a).longValue()) < Math.abs(ablm.a(a, ablm.a).longValue()) * 3) {
                                    i = 1;
                                }
                                if (i != 0) {
                                    abs = Math.abs(ablm.a(l2, ablm.a).longValue()) + a4;
                                }
                            }
                            abs = a4 / 1000;
                            aajt.b = Long.valueOf(abs);
                            aajt.h = ((ChannelInfoStore) czc.f.get()).a();
                            ((dib) czc.a.get()).a(aajt);
                            czc.e.a(inq.GHOST_TO_SNAPPABLE.a("launchType", ablm.b.name()), abs);
                        }
                        abs = ablw.a(ablm);
                        abs /= 1000;
                        aajt.b = Long.valueOf(abs);
                        aajt.h = ((ChannelInfoStore) czc.f.get()).a();
                        ((dib) czc.a.get()).a(aajt);
                        czc.e.a(inq.GHOST_TO_SNAPPABLE.a("launchType", ablm.b.name()), abs);
                    }
                });
                this.h = null;
            }
        }
    }
}
