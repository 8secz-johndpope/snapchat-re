package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: acnu */
public final class acnu extends jz {
    acnx a;
    private final acnw<?> b;
    private List<Object> c = new ArrayList();
    private int d;

    public acnu(acnw<?> acnw) {
        this.b = acnw;
    }

    public static boolean a(int i) {
        return i > 1;
    }

    public final int a() {
        List list = this.c;
        return list != null ? list.size() : 0;
    }

    public final void a(acnx acnx) {
        this.a = acnx;
    }

    public final void a(List<Object> list, int i, int i2) {
        this.c = list;
        int size = this.c.size();
        this.d = acnu.a(size) ? size - ((((i - i2) % size) + size) % size) : 0;
    }

    public final int b(int i) {
        int a = a();
        return !acnu.a(a) ? i : ((((i - (((((((SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH % a) + a) % a) + this.d) % a) + a) % a)) % a) + a) % a) + SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;
    }

    public final int c(int i) {
        int a = a();
        if (acnu.a(a)) {
            i = (((i % a) + a) % a) + this.d;
        }
        return ((i % a) + a) % a;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int getCount() {
        int a = a();
        return acnu.a(a) ? 100000 : a;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.b.a(viewGroup, c(i), i, this.a);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
