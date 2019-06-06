package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Preconditions;
import defpackage.aiuk.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aiuf */
public final class aiuf {
    public static final aiuf a = new aiuf();
    public aius b;
    public Executor c;
    public String d;
    public aiue e;
    public String f;
    public List<a> g = Collections.emptyList();
    public boolean h;
    public Integer i;
    public Integer j;
    private Object[][] k = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

    /* renamed from: aiuf$a */
    public static final class a<T> {
        private final String a;
        private T b = null;

        private a(String str) {
            this.a = str;
        }

        public static <T> a<T> a(String str) {
            Preconditions.checkNotNull(str, "debugString");
            return new a(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    private aiuf() {
    }

    public aiuf(aiuf aiuf) {
        this.b = aiuf.b;
        this.d = aiuf.d;
        this.e = aiuf.e;
        this.c = aiuf.c;
        this.f = aiuf.f;
        this.k = aiuf.k;
        this.h = aiuf.h;
        this.i = aiuf.i;
        this.j = aiuf.j;
        this.g = aiuf.g;
    }

    public final aiuf a() {
        aiuf aiuf = new aiuf(this);
        aiuf.h = true;
        return aiuf;
    }

    public final aiuf a(int i) {
        Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        aiuf aiuf = new aiuf(this);
        aiuf.i = Integer.valueOf(i);
        return aiuf;
    }

    public final <T> aiuf a(a<T> aVar, T t) {
        Object[][] objArr;
        Preconditions.checkNotNull(aVar, "key");
        Preconditions.checkNotNull(t, "value");
        aiuf aiuf = new aiuf(this);
        int i = 0;
        while (true) {
            objArr = this.k;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (aVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        aiuf.k = (Object[][]) Array.newInstance(Object.class, new int[]{this.k.length + (i == -1 ? 1 : 0), 2});
        objArr = this.k;
        System.arraycopy(objArr, 0, aiuf.k, 0, objArr.length);
        if (i == -1) {
            aiuf.k[this.k.length] = new Object[]{aVar, t};
        } else {
            aiuf.k[i][1] = t;
        }
        return aiuf;
    }

    public final aiuf a(a aVar) {
        aiuf aiuf = new aiuf(this);
        ArrayList arrayList = new ArrayList(this.g.size() + 1);
        arrayList.addAll(this.g);
        arrayList.add(aVar);
        aiuf.g = Collections.unmodifiableList(arrayList);
        return aiuf;
    }

    public final aiuf a(aius aius) {
        aiuf aiuf = new aiuf(this);
        aiuf.b = aius;
        return aiuf;
    }

    public final <T> T a(a<T> aVar) {
        Preconditions.checkNotNull(aVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.k;
            if (i >= objArr.length) {
                return null;
            }
            if (aVar.equals(objArr[i][0])) {
                return this.k[i][1];
            }
            i++;
        }
    }

    public final aiuf b(int i) {
        Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        aiuf aiuf = new aiuf(this);
        aiuf.j = Integer.valueOf(i);
        return aiuf;
    }

    public final String toString() {
        String str = "callCredentials";
        ToStringHelper add = MoreObjects.toStringHelper((Object) this).add("deadline", this.b).add("authority", this.d).add(str, this.e);
        Executor executor = this.c;
        return add.add("executor", executor != null ? executor.getClass() : null).add("compressorName", this.f).add("customOptions", Arrays.deepToString(this.k)).add("waitForReady", this.h).add("maxInboundMessageSize", this.i).add("maxOutboundMessageSize", this.j).add("streamTracerFactories", this.g).toString();
    }
}
