package defpackage;

import android.content.Context;
import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: abwy */
public class abwy {
    public final Context a;
    final List<abwy> b = new ArrayList();
    private final abxl c;
    private final List<abxj> d;

    /* renamed from: abwy$a */
    public static class a {
        public Context a;
        public abxl b;
        final List<abxj> c = new ArrayList();

        public abwy a() {
            return new abwy(this);
        }

        public final abxj a(abxi abxi) {
            akcr.b(abxi, MapboxEvent.KEY_GESTURE_ID);
            Context context = this.a;
            if (context == null) {
                akcr.a();
            }
            abxj abxj = new abxj(context, abxi);
            this.c.add(abxj);
            return abxj;
        }
    }

    public abwy(a aVar) {
        akcr.b(aVar, "builder");
        this.a = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
    }

    public abwk a() {
        return new abwj();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(abwy abwy) {
        akcr.b(abwy, "element");
        this.b.add(abwy);
    }

    public final void a(abxm abxm) {
        akcr.b(abxm, "input");
        abxl abxl = this.c;
        if (abxl != null) {
            abxl.a(abxm);
        }
        for (abwy a : this.b) {
            a.a(abxm);
        }
    }

    public void a(View view) {
        akcr.b(view, "v");
        for (abwy a : this.b) {
            a.a(view);
        }
    }

    public abvv b() {
        return new abvx();
    }

    public final void b(abxm abxm) {
        akcr.b(abxm, "input");
        abxl abxl = this.c;
        if (abxl != null) {
            abxl.b(abxm);
        }
        for (abwy b : this.b) {
            b.b(abxm);
        }
    }

    public abwx c() {
        int size = this.d.size();
        if (size == 0) {
            return new abwv();
        }
        if (size == 1) {
            return ((abxj) this.d.get(0)).a();
        }
        Iterable<abxj> iterable = this.d;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (abxj a : iterable) {
            arrayList.add(a.a());
        }
        Object[] toArray = ((List) arrayList).toArray(new abwx[0]);
        if (toArray != null) {
            abwx[] abwxArr = (abwx[]) toArray;
            return new abwt((abwx[]) Arrays.copyOf(abwxArr, abwxArr.length));
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void c(abxm abxm) {
        akcr.b(abxm, "input");
        abxl abxl = this.c;
        if (abxl != null) {
            abxl.c(abxm);
        }
        for (abwy c : this.b) {
            c.c(abxm);
        }
    }

    public abvt d() {
        return new abvu();
    }
}
