package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import defpackage.fs.a;
import java.util.ArrayList;

/* renamed from: ft */
final class ft implements Parcelable {
    public static final Creator<ft> CREATOR = new 1();
    private int[] a;
    private int b;
    private int c;
    private String d;
    private int e;
    private int f;
    private CharSequence g;
    private int h;
    private CharSequence i;
    private ArrayList<String> j;
    private ArrayList<String> k;
    private boolean l;

    /* renamed from: ft$1 */
    static class 1 implements Creator<ft> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ft(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ft[i];
        }
    }

    public ft(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0090 in {6, 7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public ft(defpackage.fs r8) {
        /*
        r7 = this;
        r7.<init>();
        r0 = r8.b;
        r0 = r0.size();
        r1 = r0 * 6;
        r1 = new int[r1];
        r7.a = r1;
        r1 = r8.i;
        if (r1 == 0) goto L_0x0088;
        r1 = 0;
        r2 = 0;
        if (r1 >= r0) goto L_0x005b;
        r3 = r8.b;
        r3 = r3.get(r1);
        r3 = (defpackage.fs.a) r3;
        r4 = r7.a;
        r5 = r2 + 1;
        r6 = r3.a;
        r4[r2] = r6;
        r2 = r7.a;
        r4 = r5 + 1;
        r6 = r3.b;
        if (r6 == 0) goto L_0x0034;
        r6 = r3.b;
        r6 = r6.mIndex;
        goto L_0x0035;
        r6 = -1;
        r2[r5] = r6;
        r2 = r7.a;
        r5 = r4 + 1;
        r6 = r3.c;
        r2[r4] = r6;
        r2 = r7.a;
        r4 = r5 + 1;
        r6 = r3.d;
        r2[r5] = r6;
        r2 = r7.a;
        r5 = r4 + 1;
        r6 = r3.e;
        r2[r4] = r6;
        r2 = r7.a;
        r4 = r5 + 1;
        r3 = r3.f;
        r2[r5] = r3;
        r1 = r1 + 1;
        r2 = r4;
        goto L_0x0015;
        r0 = r8.g;
        r7.b = r0;
        r0 = r8.h;
        r7.c = r0;
        r0 = r8.j;
        r7.d = r0;
        r0 = r8.k;
        r7.e = r0;
        r0 = r8.l;
        r7.f = r0;
        r0 = r8.m;
        r7.g = r0;
        r0 = r8.n;
        r7.h = r0;
        r0 = r8.o;
        r7.i = r0;
        r0 = r8.p;
        r7.j = r0;
        r0 = r8.q;
        r7.k = r0;
        r8 = r8.r;
        r7.l = r8;
        return;
        r8 = new java.lang.IllegalStateException;
        r0 = "Not on back stack";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.<init>(fs):void");
    }

    public final fs a(ga gaVar) {
        fs fsVar = new fs(gaVar);
        int i = 0;
        while (i < this.a.length) {
            a aVar = new a();
            int[] iArr = this.a;
            int i2 = i + 1;
            aVar.a = iArr[i];
            i = i2 + 1;
            int i3 = iArr[i2];
            aVar.b = i3 >= 0 ? (fv) gaVar.b.get(i3) : null;
            iArr = this.a;
            i2 = i + 1;
            aVar.c = iArr[i];
            i = i2 + 1;
            aVar.d = iArr[i2];
            i2 = i + 1;
            aVar.e = iArr[i];
            i = i2 + 1;
            aVar.f = iArr[i2];
            fsVar.c = aVar.c;
            fsVar.d = aVar.d;
            fsVar.e = aVar.e;
            fsVar.f = aVar.f;
            fsVar.a(aVar);
        }
        fsVar.g = this.b;
        fsVar.h = this.c;
        fsVar.j = this.d;
        fsVar.k = this.e;
        fsVar.i = true;
        fsVar.l = this.f;
        fsVar.m = this.g;
        fsVar.n = this.h;
        fsVar.o = this.i;
        fsVar.p = this.j;
        fsVar.q = this.k;
        fsVar.r = this.l;
        fsVar.a(1);
        return fsVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l);
    }
}
