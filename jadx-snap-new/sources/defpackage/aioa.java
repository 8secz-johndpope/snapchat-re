package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: aioa */
public final class aioa extends AbstractSet<String> {
    private final String[] a;

    /* renamed from: aioa$a */
    static final class a implements Iterator<String> {
        private final String[] a;
        private int b;

        a(String[] strArr) {
            this.a = strArr;
        }

        public final boolean hasNext() {
            return this.b < this.a.length;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            String[] strArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return strArr[i];
        }
    }

    public aioa(String... strArr) {
        this.a = strArr;
    }

    public final boolean contains(Object obj) {
        for (String equals : this.a) {
            if (equals.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator<String> iterator() {
        return new a(this.a);
    }

    public final int size() {
        return this.a.length;
    }
}
