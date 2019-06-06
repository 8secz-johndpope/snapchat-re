package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.gcp.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: rhl */
public final class rhl {
    public final List<rhn<?>> a;
    public final ajdx<Uri> b;
    public final puk c;
    public pus d;
    public boolean e;
    public List<? extends rhn<?>> f;
    public boolean g;

    /* renamed from: rhl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static rhl a(Uri uri) {
            akcr.b(uri, MessageMediaRefModel.URI);
            return new rhl(ajyw.a, ajdx.b((Object) uri), null, false, null, 124);
        }
    }

    static {
        a aVar = new a();
    }

    public rhl(List<? extends rhn<?>> list, ajdx<Uri> ajdx, puk puk, pus pus, boolean z, List<? extends rhn<?>> list2, boolean z2) {
        akcr.b(list, "sendToItemList");
        akcr.b(list2, "lastSnapRecipients");
        this.a = list;
        this.b = ajdx;
        this.c = puk;
        this.d = pus;
        this.e = z;
        this.f = list2;
        this.g = z2;
    }

    public /* synthetic */ rhl(List list, ajdx ajdx, puk puk, boolean z, List list2, int i) {
        this(list, (i & 2) != 0 ? null : ajdx, (i & 4) != 0 ? null : puk, null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ajyw.a : list2, false);
    }

    public final boolean a() {
        puk puk = this.c;
        if (!(puk instanceof pun) && (puk instanceof puj)) {
            Object obj;
            Iterable<prm> c = ((puj) puk).c();
            if (!((c instanceof Collection) && ((Collection) c).isEmpty())) {
                for (prm prm : c) {
                    if (!a.a(prm.b).isSpectacles) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final List<String> b() {
        Map linkedHashMap = new LinkedHashMap();
        for (Object next : this.a) {
            rhc rhc = ((rhn) next).e.a;
            ArrayList arrayList = linkedHashMap.get(rhc);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(rhc, arrayList);
            }
            arrayList.add(next);
        }
        List list = (List) linkedHashMap.get(rhc.STORY);
        if (list == null) {
            list = ajyw.a;
        }
        Collection collection = list;
        List list2 = (List) linkedHashMap.get(rhc.FRIEND);
        if (list2 == null) {
            list2 = ajyw.a;
        }
        collection = ajyu.d(collection, (Iterable) list2);
        list2 = (List) linkedHashMap.get(rhc.SUGGESTED_FRIEND);
        if (list2 == null) {
            list2 = ajyw.a;
        }
        collection = ajyu.d(collection, (Iterable) list2);
        list2 = (List) linkedHashMap.get(rhc.NON_FRIEND_USER);
        if (list2 == null) {
            list2 = ajyw.a;
        }
        collection = ajyu.d(collection, (Iterable) list2);
        List list3 = (List) linkedHashMap.get(rhc.MISCHIEF);
        if (list3 == null) {
            list3 = ajyw.a;
        }
        Iterable<rhn> d = ajyu.d(collection, (Iterable) list3);
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) d, 10));
        for (rhn rhn : d) {
            Object obj;
            rhh rhh = rhn.f;
            if (rhh != null) {
                obj = rhh.a;
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
            obj = String.valueOf(rhn.d);
            arrayList2.add(obj);
        }
        return (List) arrayList2;
    }

    public final List<String> c() {
        Collection arrayList = new ArrayList();
        for (Object next : this.a) {
            if ((((rhn) next).e.a == rhc.FRIEND ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<rhn> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (rhn rhn : iterable) {
            rhn rhn2;
            Object obj = null;
            if (!(rhn2 instanceof rhp)) {
                rhn2 = null;
            }
            rhp rhp = (rhp) rhn2;
            if (rhp != null) {
                obj = rhp.b;
            }
            arrayList2.add(obj);
        }
        return ajyu.g((Iterable) ajyu.k((List) arrayList2));
    }

    public final List<String> d() {
        Collection arrayList = new ArrayList();
        for (Object next : this.a) {
            if ((((rhn) next).e.a == rhc.MISCHIEF ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        Iterable<rhn> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (rhn rhn : iterable) {
            rhn rhn2;
            Object obj = null;
            if (!(rhn2 instanceof rhi)) {
                rhn2 = null;
            }
            rhi rhi = (rhi) rhn2;
            if (rhi != null) {
                obj = rhi.a;
            }
            arrayList2.add(obj);
        }
        return ajyu.g((Iterable) ajyu.k((List) arrayList2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rhl) {
                rhl rhl = (rhl) obj;
                if (akcr.a(this.a, rhl.a) && akcr.a(this.b, rhl.b) && akcr.a(this.c, rhl.c) && akcr.a(this.d, rhl.d)) {
                    if ((this.e == rhl.e ? 1 : null) != null && akcr.a(this.f, rhl.f)) {
                        if ((this.g == rhl.g ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        ajdx ajdx = this.b;
        hashCode = (hashCode + (ajdx != null ? ajdx.hashCode() : 0)) * 31;
        puk puk = this.c;
        hashCode = (hashCode + (puk != null ? puk.hashCode() : 0)) * 31;
        pus pus = this.d;
        hashCode = (hashCode + (pus != null ? pus.hashCode() : 0)) * 31;
        int i2 = this.e;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list2 = this.f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.g;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendToData(sendToItemList=");
        stringBuilder.append(this.a);
        stringBuilder.append(", thumbnailProvider=");
        stringBuilder.append(this.b);
        stringBuilder.append(", parcelContent=");
        stringBuilder.append(this.c);
        stringBuilder.append(", addedChat=");
        stringBuilder.append(this.d);
        stringBuilder.append(", isLastSnapRecipientsButtonSeleted=");
        stringBuilder.append(this.e);
        stringBuilder.append(", lastSnapRecipients=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isSendButtonClicked=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
