package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Looper;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: adnj */
public final class adnj {
    final admy a;
    private final adnt b;
    private final adny c;
    private final adht d;
    private Map<Integer, String> e;
    private Map<Integer, String> f;

    private adnj(adnt adnt, adny adny, admy admy, adht adht) {
        this.e = new HashMap();
        this.f = new HashMap();
        this.b = adnt;
        this.c = adny;
        this.a = admy;
        this.d = adht;
    }

    public adnj(Context context) {
        this(new adnt(context), adny.a, new admy(context), adht.a);
    }

    private String b(int i) {
        if ((Looper.myLooper() == Looper.getMainLooper() ? 1 : null) != null) {
            adni.d("Loading resource %d on UI thread. This may degrade performance.", Integer.valueOf(i));
        }
        try {
            i = this.b.a(i);
            return i;
        } catch (NotFoundException e) {
            throw new adkd("Unable to find resource: ".concat(String.valueOf(i)), e);
        } catch (IOException e2) {
            throw new adkd("Unable to read resource: ".concat(String.valueOf(i)), e2);
        }
    }

    public final String a(int i) {
        if (this.e.containsKey(Integer.valueOf(i))) {
            return (String) this.e.get(Integer.valueOf(i));
        }
        String b = b(i);
        this.e.put(Integer.valueOf(i), b);
        return b;
    }

    public final String a(int i, String... strArr) {
        Integer valueOf = Integer.valueOf((Integer.valueOf(i).intValue() * 31) + Arrays.hashCode(strArr));
        if (this.f.containsKey(valueOf)) {
            return (String) this.f.get(valueOf);
        }
        Object b = b(i);
        if (strArr != null && strArr.length > 0) {
            b = adht.a((String) b, strArr);
        }
        this.f.put(valueOf, b);
        return b;
    }
}
