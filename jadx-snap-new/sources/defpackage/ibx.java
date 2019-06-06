package defpackage;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: ibx */
public abstract class ibx {
    protected final ajwy<hyk> a;
    protected final ajwy<hys> b;
    private final ajwy<ian> c;

    ibx(ajwy<ian> ajwy, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        this.c = ajwy;
        this.a = ajwy2;
        this.b = ajwy3;
    }

    private ich a(List<String> list, String str, String str2, icf icf, hyr hyr, Supplier<byte[]> supplier, Supplier<byte[]> supplier2, boolean z) {
        byte[] b = abne.b(str2);
        String a = abne.a((byte[]) supplier.get());
        byte[] bArr = (byte[]) supplier2.get();
        if (TextUtils.isEmpty(a) || bArr == null) {
            ((hyk) this.a.get()).a(hyr, z, "failure", "failure_missing_betas", 0, 0, null, 0, 0);
            return null;
        } else if (TextUtils.isEmpty(str) || b == null) {
            Object obj = b == null ? "isKeyBytesNull" : TextUtils.isEmpty(str) ? "isMyUserIdEmpty" : TextUtils.isEmpty(a) ? "isMyOutBetaEmpty" : null;
            ((hyk) this.a.get()).a(hyr, z, "failure", "failure_unexpected_null_or_empty:".concat(String.valueOf(obj)), 0, 0, null, 0, 0);
            return null;
        } else if (list.isEmpty()) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            List a2 = a((List) list);
            List<ice> b2 = ibx.b(a2);
            int i = 0;
            for (ice ice : b2) {
                ice ice2;
                if (ice2.c == null) {
                    i++;
                    ice2 = new ice(ice2.a, ice2.b, a(ice2, bArr, ice2.b), ice2.d);
                }
                if (ice2.c != null) {
                    arrayList.add(ice2);
                }
            }
            boolean z2 = i == 0;
            ich a3 = a(arrayList, b, str, a, icf);
            if (a3 == null || a3.c.size() != list.size()) {
                ((hyk) this.a.get()).a(hyr, z, "failure", "failure_send_package_empty", (long) a2.size(), (long) i, Boolean.valueOf(z2), 0, 0);
                return null;
            }
            long b3 = (long) a3.b();
            if (a3.a()) {
                hyk hyk;
                String str3;
                long size;
                long j;
                Boolean valueOf;
                String str4;
                long c = hyr.c() / b3;
                if (b3 == ((long) b2.size())) {
                    hyk = (hyk) this.a.get();
                    str3 = null;
                    size = (long) a2.size();
                    j = (long) i;
                    valueOf = Boolean.valueOf(z2);
                    str4 = "success";
                } else {
                    hyk = (hyk) this.a.get();
                    size = (long) a2.size();
                    j = (long) i;
                    valueOf = Boolean.valueOf(z2);
                    str4 = "failure";
                    str3 = "send_package_size_mismatch";
                }
                hyk.a(hyr, z, str4, str3, size, j, valueOf, b3, c);
                return a3;
            }
            ((hyk) this.a.get()).a(hyr, z, "failure", "failure_all_wraps_failed", (long) a2.size(), (long) i, Boolean.valueOf(z2), b3, 0);
            return null;
        }
    }

    private ich a(List<ice> list, byte[] bArr, String str, String str2, icf icf) {
        HashMap newHashMap = Maps.newHashMap();
        for (ice ice : list) {
            String str3 = ice.b;
            Preconditions.checkNotNull(ice.c);
            ahqf a = new icc(bArr, ice.c, str3, ice.a, ice.d.intValue(), str, str2, icf, (ian) this.c.get(), (hyk) this.a.get()).a();
            if (a != null) {
                if (!newHashMap.containsKey(str3)) {
                    ahqw ahqw = new ahqw();
                    ahqw.a = new HashMap();
                    newHashMap.put(str3, ahqw);
                }
                ((ahqw) newHashMap.get(str3)).a.put(ice.a, a);
            }
        }
        return newHashMap.isEmpty() ? null : new ich(str2, newHashMap);
    }

    private byte[] a(ice ice, byte[] bArr, String str) {
        String str2 = ice.a;
        byte[] b = abne.b(str2);
        String str3 = "failure";
        if (b != null) {
            try {
                bArr = ((ian) this.c.get()).a(bArr, b);
                if (bArr != null) {
                    a(bArr, str2, str, ice.d.intValue());
                    ((hyk) this.a.get()).b("success", null, null);
                    return bArr;
                }
            } catch (GeneralSecurityException e) {
                ((hyk) this.a.get()).b(str3, "failure_mystique_gen_sec_exc", abmt.a(e));
            }
        } else {
            ((hyk) this.a.get()).b(str3, "failure_recipient_out_bytes_null", null);
        }
        ((hyk) this.a.get()).b(str3, "failure_recipient_mystique_null", null);
        return null;
    }

    private static List<ice> b(List<ice> list) {
        ArrayList arrayList = new ArrayList();
        for (ice ice : list) {
            if (ice.d.intValue() >= 9) {
                arrayList.add(ice);
            }
        }
        return arrayList;
    }

    public final ich a(String str, String str2, ahql ahql, String str3, icf icf, boolean z, hyr hyr, Supplier<byte[]> supplier, Supplier<byte[]> supplier2) {
        byte[] b = abne.b(str3);
        hyr.a();
        if (b == null) {
            return null;
        }
        List list = ahql.a;
        if (list == null || list.isEmpty()) {
            ((hyk) this.a.get()).a(hyr, true, "failure", "failure_no_devices_from_server", 0, 0, null, 0, 0);
            return null;
        }
        a(str, list, z);
        return a(ImmutableList.of(str), str2, str3, icf, hyr, supplier, supplier2, true);
    }

    public final ich a(List<String> list, String str, String str2, icf icf, Supplier<byte[]> supplier, Supplier<byte[]> supplier2) {
        return a(list, str, str2, icf, ((hys) this.b.get()).a(hyt.FIDELIUS_SNAP_PHI).a(), supplier, supplier2, false);
    }

    public abstract List<ice> a(String str);

    public abstract List<ice> a(List<String> list);

    public abstract void a(String str, List<ahqd> list, boolean z);

    public abstract void a(byte[] bArr, String str, String str2, int i);
}
