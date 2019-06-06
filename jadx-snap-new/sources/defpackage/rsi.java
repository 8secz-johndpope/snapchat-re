package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: rsi */
public final class rsi implements puv<aegj> {
    private final ajwy<iha> a;
    private final ajwy<qou> b;

    public rsi(ajwy<iha> ajwy, ajwy<qou> ajwy2) {
        akcr.b(ajwy, "serializationHelper");
        akcr.b(ajwy2, "textMessagePlugin");
        this.a = ajwy;
        this.b = ajwy2;
    }

    private static prm a(aerv aerv) {
        String obj;
        Object obj2 = aerv.a;
        akcr.a(obj2, "media.mediaId");
        String a = ptf.a(aerv.b);
        String str = aerv.e;
        String str2 = aerv.f;
        Integer num = aerv.g;
        Integer num2 = aerv.h;
        aesg aesg = aerv.r;
        Map map = aerv.d;
        Boolean bool = (Boolean) (map != null ? map.get("is_custom_sticker") : null);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Float f = aerv.j;
        Integer valueOf = f != null ? Integer.valueOf((int) (f.floatValue() * ((float) TimeUnit.SECONDS.toMillis(1)))) : null;
        Map map2 = aerv.d;
        if (map2 != null) {
            Object obj3 = map2.get("thumbnail");
            if (obj3 != null) {
                obj = obj3.toString();
                return new prm(obj2, a, str, str2, num, num2, aesg, booleanValue, valueOf, false, obj, RasterSource.DEFAULT_TILE_SIZE);
            }
        }
        obj = null;
        return new prm(obj2, a, str, str2, num, num2, aesg, booleanValue, valueOf, false, obj, RasterSource.DEFAULT_TILE_SIZE);
    }

    public static prm a(List<? extends aerv> list) {
        if (list != null) {
            aerv aerv = (aerv) ajyu.g((List) list);
            if (aerv != null) {
                return rsi.a(aerv);
            }
        }
        return null;
    }

    private final pus b(aegj aegj) {
        List list;
        String str = aegj.a.g;
        if (str == null) {
            str = "";
        }
        List list2 = aegj.a.i;
        if (list2 != null) {
            Iterable<aerx> iterable = list2;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (aerx aerx : iterable) {
                aerx aerx2 = new aerx();
                aerx2.a = aerx.a;
                aerx2.b = aerx.b;
                aerx2.c = aerx.c;
                aerx2.d = aerx.d;
                arrayList.add(aerx2);
            }
            list = (List) arrayList;
        } else {
            list = ((qou) this.b.get()).b(str);
        }
        List list3 = aegj.a.h;
        if (list3 == null) {
            list3 = new ArrayList();
        }
        return new pus(str, list, list3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0480  */
    /* JADX WARNING: Missing block: B:109:0x02fb, code skipped:
            if (r2 == null) goto L_0x02fd;
     */
    /* JADX WARNING: Missing block: B:116:0x030d, code skipped:
            if (r3 == null) goto L_0x030f;
     */
    /* JADX WARNING: Missing block: B:123:0x031a, code skipped:
            if (r5 == null) goto L_0x031c;
     */
    /* JADX WARNING: Missing block: B:130:0x0327, code skipped:
            if (r1 == null) goto L_0x0329;
     */
    public final defpackage.puk a(defpackage.aegj r27) {
        /*
        r26 = this;
        r0 = r26;
        r1 = r27;
        r2 = "chatMessage";
        defpackage.akcr.b(r1, r2);
        r2 = r1.a;
        r2 = r2.e;
        r3 = defpackage.aesq.MISSED_AUDIO_CALL;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        r4 = "chatMessage.header.isv3";
        if (r3 != 0) goto L_0x06f7;
    L_0x001b:
        r3 = defpackage.aesq.MISSED_VIDEO_CALL;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06f7;
    L_0x0027:
        r3 = defpackage.aesq.JOINED_CALL;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06f7;
    L_0x0033:
        r3 = defpackage.aesq.LEFT_CALL;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0041;
    L_0x003f:
        goto L_0x06f7;
    L_0x0041:
        r3 = defpackage.aesq.TEXT;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06f1;
    L_0x004d:
        r3 = defpackage.aesq.WELCOME_MESSAGE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06f1;
    L_0x0059:
        r3 = defpackage.aesq.HERE_SCREENSHOT;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06f1;
    L_0x0065:
        r3 = defpackage.aesq.SNAPCASH;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0073;
    L_0x0071:
        goto L_0x06f1;
    L_0x0073:
        r3 = defpackage.aesq.KHALEESI_SHARE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        r5 = "chatMessage.body.media";
        if (r3 == 0) goto L_0x009a;
    L_0x0081:
        r2 = new pum;
        r3 = r1.a;
        r3 = r3.n;
        r3 = r3.a;
        r1 = r1.a;
        r1 = r1.a;
        defpackage.akcr.a(r1, r5);
        r1 = defpackage.rsi.a(r1);
        r2.<init>(r3, r1);
    L_0x0097:
        r2 = (defpackage.puk) r2;
        return r2;
    L_0x009a:
        r3 = defpackage.aesq.AD_SHARE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        r6 = 0;
        if (r3 != 0) goto L_0x06cd;
    L_0x00a7:
        r3 = defpackage.aesq.MEDIA;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06cd;
    L_0x00b3:
        r3 = defpackage.aesq.MEDIA_V2;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06cd;
    L_0x00bf:
        r3 = defpackage.aesq.MEDIA_V3;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06cd;
    L_0x00cb:
        r3 = defpackage.aesq.MEDIA_V4;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x06cd;
    L_0x00d7:
        r3 = defpackage.aesq.VIDEO_NOTE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x00e5;
    L_0x00e3:
        goto L_0x06cd;
    L_0x00e5:
        r3 = defpackage.aesq.DISCOVER_SHARE_V2;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0102;
    L_0x00f1:
        r2 = new ptq;
        r1 = r1.a;
        r1 = r1.a;
        defpackage.akcr.a(r1, r5);
        r1 = defpackage.rsi.a(r1);
        r2.<init>(r1);
        goto L_0x0097;
    L_0x0102:
        r3 = defpackage.aesq.AUDIO_NOTE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0133;
    L_0x010e:
        r2 = r1.a;
        r2 = r2.a;
        defpackage.akcr.a(r2, r5);
        r2 = defpackage.rsi.a(r2);
        r1 = r1.a;
        r1 = r1.s;
        if (r1 == 0) goto L_0x012b;
    L_0x011f:
        r1 = defpackage.ajyu.g(r1);
        r1 = (defpackage.aerv) r1;
        if (r1 == 0) goto L_0x012b;
    L_0x0127:
        r6 = defpackage.rsi.a(r1);
    L_0x012b:
        r1 = new ptj;
        r1.<init>(r2, r6);
    L_0x0130:
        r1 = (defpackage.puk) r1;
        return r1;
    L_0x0133:
        r3 = defpackage.aesq.BATCHED_MEDIA;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x018e;
    L_0x013f:
        r2 = r1.a;
        r2 = r2.b;
        r3 = "chatMessage.body.medias";
        defpackage.akcr.a(r2, r3);
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r4 = 10;
        r4 = defpackage.ajyn.a(r2, r4);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
    L_0x015b:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0174;
    L_0x0161:
        r4 = r2.next();
        r4 = (defpackage.aerv) r4;
        r5 = "it";
        defpackage.akcr.a(r4, r5);
        r4 = defpackage.rsi.a(r4);
        r3.add(r4);
        goto L_0x015b;
    L_0x0174:
        r3 = (java.util.List) r3;
        r1 = r1.a;
        r1 = r1.s;
        if (r1 == 0) goto L_0x0188;
    L_0x017c:
        r1 = defpackage.ajyu.g(r1);
        r1 = (defpackage.aerv) r1;
        if (r1 == 0) goto L_0x0188;
    L_0x0184:
        r6 = defpackage.rsi.a(r1);
    L_0x0188:
        r1 = new ptk;
        r1.<init>(r3, r6);
        goto L_0x0130;
    L_0x018e:
        r3 = defpackage.aesq.SCREENSHOT;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        r7 = 0;
        if (r3 == 0) goto L_0x01ac;
    L_0x019b:
        r2 = new pug;
        r1 = r1.a;
        r1 = r1.v;
        if (r1 == 0) goto L_0x01a7;
    L_0x01a3:
        r7 = r1.booleanValue();
    L_0x01a7:
        r2.<init>(r7);
        goto L_0x0097;
    L_0x01ac:
        r3 = defpackage.aesq.STICKER;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x0686;
    L_0x01b8:
        r3 = defpackage.aesq.STICKER_V2;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x0686;
    L_0x01c4:
        r3 = defpackage.aesq.STICKER_V3;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x01d2;
    L_0x01d0:
        goto L_0x0686;
    L_0x01d2:
        r3 = defpackage.aesq.STORY_REPLY;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x066b;
    L_0x01de:
        r3 = defpackage.aesq.STORY_REPLY_V2;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x01ec;
    L_0x01ea:
        goto L_0x066b;
    L_0x01ec:
        r3 = defpackage.aesq.SPEEDWAY_STORY;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x0638;
    L_0x01f8:
        r3 = defpackage.aesq.SPEEDWAY_STORY_V2;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0206;
    L_0x0204:
        goto L_0x0638;
    L_0x0206:
        r3 = defpackage.aesq.STORY_SHARE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0232;
    L_0x0212:
        r1 = r1.a;
        r1 = r1.k;
        r2 = new pur;
        r3 = r1.a;
        r4 = "storyShare.storyId";
        defpackage.akcr.a(r3, r4);
        r4 = r1.b;
        r4 = defpackage.ptf.a(r4);
        r1 = r1.c;
        if (r1 == 0) goto L_0x022d;
    L_0x0229:
        r7 = r1.booleanValue();
    L_0x022d:
        r2.<init>(r3, r4, r7);
        goto L_0x0097;
    L_0x0232:
        r3 = defpackage.aesq.SEARCH_SHARE_STORY;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0250;
    L_0x023e:
        r1 = r1.a;
        r1 = r1.q;
        r2 = new puh;
        r1 = r1.a;
        r3 = "searchShareStory.dynamicStoryId";
        defpackage.akcr.a(r1, r3);
        r2.<init>(r1);
        goto L_0x0097;
    L_0x0250:
        r3 = defpackage.aesq.SEARCH_SHARE_STORY_SNAP;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x027b;
    L_0x025c:
        r1 = r1.a;
        r1 = r1.p;
        r2 = new pui;
        r3 = r1.c;
        r4 = "searchShareStorySnap.dynamicStoryId";
        defpackage.akcr.a(r3, r4);
        r4 = r1.b;
        r4 = defpackage.ptf.a(r4);
        r1 = r1.a;
        r5 = "searchShareStorySnap.snapId";
        defpackage.akcr.a(r1, r5);
        r2.<init>(r3, r4, r1);
        goto L_0x0097;
    L_0x027b:
        r3 = defpackage.aesq.NYC_SHARE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x02a1;
    L_0x0287:
        r1 = r1.a;
        r1 = r1.o;
        r2 = new pub;
        r3 = r1.a;
        r4 = "mapShare.storyId";
        defpackage.akcr.a(r3, r4);
        r4 = r1.b;
        r4 = defpackage.ptf.a(r4);
        r1 = r1.c;
        r2.<init>(r3, r4, r1);
        goto L_0x0097;
    L_0x02a1:
        r3 = defpackage.aesq.SNAPCHATTER;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x02d0;
    L_0x02ad:
        r1 = r1.a;
        r1 = r1.d;
        r2 = new puu;
        r3 = r1.a;
        r4 = "it.userId";
        defpackage.akcr.a(r3, r4);
        r4 = r1.b;
        r5 = "it.username";
        defpackage.akcr.a(r4, r5);
        r5 = r1.d;
        r1 = r1.c;
        if (r1 == 0) goto L_0x02cb;
    L_0x02c7:
        r7 = r1.booleanValue();
    L_0x02cb:
        r2.<init>(r3, r4, r5, r7);
        goto L_0x0097;
    L_0x02d0:
        r3 = defpackage.aesq.UPDATE_MESSAGE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x02e5;
    L_0x02dc:
        r2 = new ptx;
        r1 = (defpackage.aetd) r1;
        r2.<init>(r1);
        goto L_0x0097;
    L_0x02e5:
        r3 = defpackage.aesq.MEDIA_SAVE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0332;
    L_0x02f1:
        r2 = r1.a;
        if (r2 == 0) goto L_0x02fd;
    L_0x02f5:
        r2 = r2.r;
        if (r2 == 0) goto L_0x02fd;
    L_0x02f9:
        r2 = r2.c;
        if (r2 != 0) goto L_0x0301;
    L_0x02fd:
        r2 = defpackage.ajyx.a;
        r2 = (java.util.Map) r2;
    L_0x0301:
        r3 = r1.a;
        r4 = "";
        if (r3 == 0) goto L_0x030f;
    L_0x0307:
        r3 = r3.r;
        if (r3 == 0) goto L_0x030f;
    L_0x030b:
        r3 = r3.a;
        if (r3 != 0) goto L_0x0310;
    L_0x030f:
        r3 = r4;
    L_0x0310:
        r5 = r1.a;
        if (r5 == 0) goto L_0x031c;
    L_0x0314:
        r5 = r5.r;
        if (r5 == 0) goto L_0x031c;
    L_0x0318:
        r5 = r5.b;
        if (r5 != 0) goto L_0x031d;
    L_0x031c:
        r5 = r4;
    L_0x031d:
        r1 = r1.a;
        if (r1 == 0) goto L_0x0329;
    L_0x0321:
        r1 = r1.r;
        if (r1 == 0) goto L_0x0329;
    L_0x0325:
        r1 = r1.d;
        if (r1 != 0) goto L_0x032a;
    L_0x0329:
        r1 = r4;
    L_0x032a:
        r4 = new pud;
        r4.<init>(r2, r3, r5, r1);
        r4 = (defpackage.puk) r4;
        return r4;
    L_0x0332:
        r3 = defpackage.aesq.ERASED_MESSAGE;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x0345;
    L_0x033e:
        r1 = new ptr;
        r1.<init>();
        goto L_0x0130;
    L_0x0345:
        r3 = defpackage.aesq.SNAP;
        r3 = r3.a();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x04a1;
    L_0x0351:
        r2 = r1.i;
        r2 = r2.d;
        defpackage.akcr.a(r2, r4);
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x0493;
    L_0x035e:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x03a6;
    L_0x0364:
        r2 = r2.k;
        if (r2 == 0) goto L_0x03a6;
    L_0x0368:
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
    L_0x0375:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0394;
    L_0x037b:
        r4 = r2.next();
        r5 = r4;
        r5 = (defpackage.aeye) r5;
        r5 = r5.a;
        r7 = defpackage.aeyg.REMOTE_WEB_PAGE;
        r7 = r7.toString();
        r5 = defpackage.akcr.a(r5, r7);
        if (r5 == 0) goto L_0x0375;
    L_0x0390:
        r3.add(r4);
        goto L_0x0375;
    L_0x0394:
        r3 = (java.util.List) r3;
        r2 = defpackage.ajyu.g(r3);
        r2 = (defpackage.aeye) r2;
        if (r2 == 0) goto L_0x03a6;
    L_0x039e:
        r2 = r2.b;
        if (r2 == 0) goto L_0x03a6;
    L_0x03a2:
        r2 = r2.a;
        r13 = r2;
        goto L_0x03a7;
    L_0x03a6:
        r13 = r6;
    L_0x03a7:
        r2 = r1.a;
        r2 = r2.a;
        if (r2 == 0) goto L_0x03b1;
    L_0x03ad:
        r2 = r2.n;
        r8 = r2;
        goto L_0x03b2;
    L_0x03b1:
        r8 = r6;
    L_0x03b2:
        r2 = r1.a;
        r2 = r2.a;
        if (r2 == 0) goto L_0x03c7;
    L_0x03b8:
        r2 = r2.j;
        if (r2 == 0) goto L_0x03c7;
    L_0x03bc:
        r2 = r2.floatValue();
        r2 = (double) r2;
        r2 = java.lang.Double.valueOf(r2);
        r9 = r2;
        goto L_0x03c8;
    L_0x03c7:
        r9 = r6;
    L_0x03c8:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x03d2;
    L_0x03ce:
        r2 = r2.g;
        r10 = r2;
        goto L_0x03d3;
    L_0x03d2:
        r10 = r6;
    L_0x03d3:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x03dd;
    L_0x03d9:
        r2 = r2.q;
        r11 = r2;
        goto L_0x03de;
    L_0x03dd:
        r11 = r6;
    L_0x03de:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x03ee;
    L_0x03e4:
        r2 = r2.o;
        if (r2 == 0) goto L_0x03ee;
    L_0x03e8:
        r2 = defpackage.gcf.a(r2);
        r12 = r2;
        goto L_0x03ef;
    L_0x03ee:
        r12 = r6;
    L_0x03ef:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x03f9;
    L_0x03f5:
        r2 = r2.j;
        r15 = r2;
        goto L_0x03fa;
    L_0x03f9:
        r15 = r6;
    L_0x03fa:
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x0405;
    L_0x0400:
        r2 = r2.t;
        r16 = r2;
        goto L_0x0407;
    L_0x0405:
        r16 = r6;
    L_0x0407:
        r18 = new pse;
        r14 = 0;
        r17 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r7 = r18;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r2 = r1.a;
        r2 = r2.a;
        if (r2 == 0) goto L_0x041c;
    L_0x0417:
        r2 = r2.r;
        r19 = r2;
        goto L_0x041e;
    L_0x041c:
        r19 = r6;
    L_0x041e:
        r2 = r1.a;
        if (r2 == 0) goto L_0x042b;
    L_0x0422:
        r2 = r2.a;
        if (r2 == 0) goto L_0x042b;
    L_0x0426:
        r2 = r2.a;
        r20 = r2;
        goto L_0x042d;
    L_0x042b:
        r20 = r6;
    L_0x042d:
        r2 = r1.a;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0438;
    L_0x0433:
        r2 = r2.e;
        r21 = r2;
        goto L_0x043a;
    L_0x0438:
        r21 = r6;
    L_0x043a:
        r2 = r1.a;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0445;
    L_0x0440:
        r2 = r2.f;
        r22 = r2;
        goto L_0x0447;
    L_0x0445:
        r22 = r6;
    L_0x0447:
        r2 = r1.a;
        r2 = r2.a;
        r2 = r2.b;
        r3 = "chatMessage.body.media.mediaType";
        defpackage.akcr.a(r2, r3);
        r23 = defpackage.gcp.a.a(r2);
        r2 = r1.a;
        r2 = r2.s;
        r24 = defpackage.rsi.a(r2);
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x046b;
    L_0x0464:
        r2 = r2.m;
        if (r2 == 0) goto L_0x046b;
    L_0x0468:
        r2 = r2.a;
        goto L_0x046c;
    L_0x046b:
        r2 = r6;
    L_0x046c:
        r3 = r1.a;
        r3 = r3.m;
        if (r3 == 0) goto L_0x0479;
    L_0x0472:
        r3 = r3.m;
        if (r3 == 0) goto L_0x0479;
    L_0x0476:
        r3 = r3.b;
        goto L_0x047a;
    L_0x0479:
        r3 = r6;
    L_0x047a:
        r1 = r1.a;
        r1 = r1.m;
        if (r1 == 0) goto L_0x0486;
    L_0x0480:
        r1 = r1.m;
        if (r1 == 0) goto L_0x0486;
    L_0x0484:
        r6 = r1.c;
    L_0x0486:
        r25 = defpackage.pun.b.a.a(r2, r3, r6);
        r1 = new pun;
        r17 = r1;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25);
        goto L_0x0130;
    L_0x0493:
        r1 = new java.lang.IllegalStateException;
        r2 = "only group ChatMessages can be snaps";
        r2 = r2.toString();
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
    L_0x04a1:
        r3 = defpackage.aesq.MESSAGE_PARCEL;
        r3 = r3.a();
        r2 = defpackage.akcr.a(r2, r3);
        if (r2 == 0) goto L_0x0631;
    L_0x04ad:
        r2 = r1.a;
        r2 = r2.w;
        r2 = r2.b;
        r3 = "chatMessage.body.messageParcel.type";
        defpackage.akcr.a(r2, r3);
        r3 = java.util.Locale.ENGLISH;
        r4 = "Locale.ENGLISH";
        defpackage.akcr.a(r3, r4);
        if (r2 == 0) goto L_0x0629;
    L_0x04c1:
        r2 = r2.toLowerCase(r3);
        r3 = "(this as java.lang.String).toLowerCase(locale)";
        defpackage.akcr.a(r2, r3);
        r3 = r2.hashCode();
        r4 = "serializationHelper.get()";
        r5 = "chatMessage.body.messageParcel.contents";
        r6 = "Base64.decode(chatMessag…contents, Base64.DEFAULT)";
        switch(r3) {
            case -1813565398: goto L_0x0607;
            case -1395496709: goto L_0x05e4;
            case -719439438: goto L_0x05c1;
            case -712920059: goto L_0x059e;
            case -489310007: goto L_0x0583;
            case -97320257: goto L_0x0568;
            case 15587054: goto L_0x054d;
            case 730876285: goto L_0x0532;
            case 762399831: goto L_0x0517;
            case 1001873043: goto L_0x04fc;
            case 1806822421: goto L_0x04d9;
            default: goto L_0x04d7;
        };
    L_0x04d7:
        goto L_0x0622;
    L_0x04d9:
        r3 = "share_location";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x04e1:
        r2 = new pua;
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        defpackage.akcr.a(r1, r5);
        r3 = r0.a;
        r3 = r3.get();
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.iha) r3;
        r2.<init>(r1, r3);
        goto L_0x0097;
    L_0x04fc:
        r3 = "cognac_update";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x0504:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptu.a.a(r1);
        goto L_0x0130;
    L_0x0517:
        r3 = "cognac_terminate";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x051f:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptv.a.a(r1);
        goto L_0x0130;
    L_0x0532:
        r3 = "cognac_launch";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x053a:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptt.a.a(r1);
        goto L_0x0130;
    L_0x054d:
        r3 = "cognac_close";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x0555:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.pts.a.a(r1);
        goto L_0x0130;
    L_0x0568:
        r3 = "business_profile_snap";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x0570:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptm.a.a(r1);
        goto L_0x0130;
    L_0x0583:
        r3 = "group_invite";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x058b:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptw.a.a(r1);
        goto L_0x0130;
    L_0x059e:
        r3 = "location_request";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x05a6:
        r2 = new ptz;
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        defpackage.akcr.a(r1, r5);
        r3 = r0.a;
        r3 = r3.get();
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.iha) r3;
        r2.<init>(r1, r3);
        goto L_0x0097;
    L_0x05c1:
        r3 = "map_story_share";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x05c9:
        r2 = new puc;
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        defpackage.akcr.a(r1, r5);
        r3 = r0.a;
        r3 = r3.get();
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.iha) r3;
        r2.<init>(r1, r3);
        goto L_0x0097;
    L_0x05e4:
        r3 = "erase_rules_status_message";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x05ec:
        r2 = new puf;
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        defpackage.akcr.a(r1, r5);
        r3 = r0.a;
        r3 = r3.get();
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.iha) r3;
        r2.<init>(r1, r3);
        goto L_0x0097;
    L_0x0607:
        r3 = "business_profile";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0622;
    L_0x060f:
        r1 = r1.a;
        r1 = r1.w;
        r1 = r1.c;
        r1 = android.util.Base64.decode(r1, r7);
        defpackage.akcr.a(r1, r6);
        r1 = defpackage.ptl.a.a(r1);
        goto L_0x0130;
    L_0x0622:
        r1 = new ptr;
        r1.<init>();
        goto L_0x0130;
    L_0x0629:
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type java.lang.String";
        r1.<init>(r2);
        throw r1;
    L_0x0631:
        r1 = new ptr;
        r1.<init>();
        goto L_0x0130;
    L_0x0638:
        r2 = r1.a;
        r2 = r2.b;
        r2 = r2.size();
        r3 = new defpackage.prm[r2];
    L_0x0642:
        if (r7 >= r2) goto L_0x065c;
    L_0x0644:
        r4 = r1.a;
        r4 = r4.b;
        r4 = r4.get(r7);
        r5 = "chatMessage.body.medias[i]";
        defpackage.akcr.a(r4, r5);
        r4 = (defpackage.aerv) r4;
        r4 = defpackage.rsi.a(r4);
        r3[r7] = r4;
        r7 = r7 + 1;
        goto L_0x0642;
    L_0x065c:
        r2 = new pue;
        r3 = defpackage.ajyi.i(r3);
        r1 = r1.a;
        r1 = r1.j;
        r2.<init>(r3, r1);
        goto L_0x0097;
    L_0x066b:
        r2 = new put;
        r3 = r1.a;
        r3 = r3.a;
        defpackage.akcr.a(r3, r5);
        r3 = defpackage.rsi.a(r3);
        r1 = r1.a;
        r1 = r1.g;
        r4 = "chatMessage.body.text";
        defpackage.akcr.a(r1, r4);
        r2.<init>(r3, r1);
        goto L_0x0097;
    L_0x0686:
        r2 = new puq;
        r3 = r1.a;
        r3 = r3.c;
        r4 = "chatMessage.body.sticker";
        defpackage.akcr.a(r3, r4);
        r3 = r3.a();
        r4 = r3.toString();
        r3 = r1.a;
        r3 = r3.c;
        r5 = r3.d;
        r3 = r1.a;
        r3 = r3.c;
        r6 = r3.c;
        r3 = r1.a;
        r3 = r3.s;
        r8 = defpackage.rsi.a(r3);
        r3 = r1.a;
        r3 = r3.c;
        r9 = r3.f;
        r1 = r1.a;
        r1 = r1.c;
        r1 = r1.m;
        if (r1 == 0) goto L_0x06c1;
    L_0x06bb:
        r7 = r1.booleanValue();
        r1 = r7;
        goto L_0x06c2;
    L_0x06c1:
        r1 = 0;
    L_0x06c2:
        r10 = 64;
        r3 = r2;
        r7 = r8;
        r8 = r9;
        r9 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        goto L_0x0097;
    L_0x06cd:
        r2 = r1.a;
        r2 = r2.a;
        defpackage.akcr.a(r2, r5);
        r2 = defpackage.rsi.a(r2);
        r1 = r1.a;
        r1 = r1.s;
        if (r1 == 0) goto L_0x06ea;
    L_0x06de:
        r1 = defpackage.ajyu.g(r1);
        r1 = (defpackage.aerv) r1;
        if (r1 == 0) goto L_0x06ea;
    L_0x06e6:
        r6 = defpackage.rsi.a(r1);
    L_0x06ea:
        r1 = new pto;
        r1.<init>(r2, r6);
        goto L_0x0130;
    L_0x06f1:
        r1 = r26.b(r27);
        goto L_0x0130;
    L_0x06f7:
        r2 = new ptn;
        r3 = r1.a;
        r3 = r3.e;
        r5 = "chatMessage.body.type";
        defpackage.akcr.a(r3, r5);
        r5 = r1.i;
        r5 = r5.d;
        defpackage.akcr.a(r5, r4);
        r4 = r5.booleanValue();
        r5 = r1.i;
        r5 = r5.a;
        r6 = "chatMessage.header.from";
        defpackage.akcr.a(r5, r6);
        r1 = r1.i;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0720;
    L_0x071c:
        r1 = defpackage.ajyw.a;
        r1 = (java.util.List) r1;
    L_0x0720:
        r2.<init>(r3, r4, r5, r1);
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsi.a(aegj):puk");
    }
}
