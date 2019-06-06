package defpackage;

import android.app.Activity;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import defpackage.ifs.a;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ifx */
public final class ifx {
    public final ifu a;
    private int b;
    private final Map<String, Integer> c;
    private final boolean d;
    private final boolean e;
    private final Map<String, Boolean> f;
    private final Map<String, ifv> g;

    ifx(int i, String[] strArr, int[] iArr, boolean[] zArr) {
        boolean z;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        boolean[] zArr2 = zArr;
        this.b = i;
        this.a = ifu.a(i);
        Builder builder = ImmutableMap.builder();
        Builder builder2 = ImmutableMap.builder();
        Builder builder3 = ImmutableMap.builder();
        boolean z2 = false;
        if (strArr2.length == iArr2.length && strArr2.length == zArr2.length) {
            boolean z3 = true;
            z = false;
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                Object obj;
                builder.put(strArr2[i2], Integer.valueOf(iArr2[i2]));
                boolean z4 = iArr2[i2] == 0;
                z3 = z3 && z4;
                builder2.put(strArr2[i2], Boolean.valueOf(zArr2[i2]));
                z = z || zArr2[i2];
                ifw ifw = (ifw) a.a.b.get(strArr2[i2]);
                ifw ifw2 = new ifw(strArr2[i2], zArr2[i2], z4);
                Object obj2 = strArr2[i2];
                if (ifw2.b) {
                    obj = (ifw == null || !ifw.b) ? null : 1;
                    obj = obj != null ? ifv.ALREADY_GRANTED : ifv.JUST_GRANTED;
                } else {
                    obj = (ifw == null || !ifw.a) ? ifw2.a ? ifv.DENIED_NORMALLY_FOR_THE_FIRST_TIME : ifv.ALREADY_DENIED_PERMANENTLY : ifw2.a ? ifv.DENIED_NORMALLY_AGAIN : ifv.JUST_DENIED_PERMANENTLY;
                }
                builder3.put(obj2, obj);
            }
            z2 = z3;
        } else {
            z = false;
        }
        this.c = builder.build();
        this.d = z2;
        this.f = builder2.build();
        this.e = z;
        this.g = builder3.build();
    }

    public static ifx a(Activity activity, int i, String[] strArr, int[] iArr) {
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = fq.a(activity, strArr[i2]);
        }
        return new ifx(i, strArr, iArr, zArr);
    }

    public final Set<String> a() {
        return this.c.keySet();
    }

    public final boolean a(ifu ifu) {
        if (this.a == ifu && !this.c.keySet().isEmpty()) {
            List<String> list = (List) ((Map) ifs.a.get()).get(ifu);
            if (!(list == null || list.isEmpty())) {
                for (String a : list) {
                    if (!a(a)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str) {
        return this.c.containsKey(str);
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean b(String str) {
        return abpp.a((Integer) this.c.get(str), -1) == 0;
    }

    public final ifv c(String str) {
        ifv ifv = (ifv) this.g.get(str);
        return ifv == null ? ifv.UNKNOWN : ifv;
    }

    public final boolean c() {
        return this.g.containsValue(ifv.JUST_GRANTED);
    }

    public final boolean d() {
        return !this.d && this.g.containsValue(ifv.ALREADY_DENIED_PERMANENTLY);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestPermissionsResult{requestCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(", permissionRequestEvent=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mGrantResultMap=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mHasGrantedAll=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mShouldShowAnyRationale=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mShouldShowRationaleMap=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mPermissionResultStateMap=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
