package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import java.io.InputStream;

/* renamed from: ahp */
public class ahp<ModelType, TranscodeType> extends aht<ModelType, akr, Bitmap, TranscodeType> {
    private final ajr a;
    private alz b = alz.a;
    private aim e;
    private aiq<InputStream, Bitmap> f;
    private aiq<ParcelFileDescriptor, Bitmap> g;

    ahp(aoj<ModelType, akr, Bitmap, TranscodeType> aoj, Class<TranscodeType> cls, aht<ModelType, ?, ?, ?> aht) {
        super(aoj, cls, aht);
        this.a = aht.c.d;
        this.e = aht.c.f;
        this.f = new amk(this.a, this.e);
        this.g = new amb(this.a, this.e);
    }

    public final ahp<ModelType, TranscodeType> a() {
        super.e();
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x004a in {2, 4, 7, 10, 12} preds:[]
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
    public final defpackage.ahp<ModelType, TranscodeType> a(int r4) {
        /*
        r3 = this;
        r0 = android.graphics.Bitmap.class;
        r1 = r3.d;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x0013;
        r0 = new aor;
        r0.<init>(r4);
        super.a(r0);
        return r3;
        r0 = android.graphics.drawable.Drawable.class;
        r1 = r3.d;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x0023;
        r0 = new aos;
        r0.<init>(r4);
        goto L_0x000f;
        r4 = r3.d;
        r4 = r4.getCanonicalName();
        if (r4 != 0) goto L_0x0031;
        r4 = r3.d;
        r4 = r4.toString();
        r0 = new java.lang.UnsupportedOperationException;
        r1 = new java.lang.StringBuilder;
        r2 = ".crossFade() is not supported for ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = ", use .animate() to provide a compatible animation.";
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahp.a(int):ahp");
    }

    /* renamed from: a */
    public final ahp<ModelType, TranscodeType> b(int i, int i2) {
        super.b(i, i2);
        return this;
    }

    public final ahp<ModelType, TranscodeType> a(ahp<?, TranscodeType> ahp) {
        super.a((aht) ahp);
        return this;
    }

    public final ahp<ModelType, TranscodeType> a(aiq<akr, Bitmap> aiq) {
        super.b((aiq) aiq);
        return this;
    }

    public final ahp<ModelType, TranscodeType> a(Drawable drawable) {
        super.d(drawable);
        return this;
    }

    public final ahp<ModelType, TranscodeType> a(aon<? super ModelType, TranscodeType> aon) {
        super.b((aon) aon);
        return this;
    }

    public final ahp<ModelType, TranscodeType> a(ais<Bitmap>... aisArr) {
        super.b((ais[]) aisArr);
        return this;
    }

    public final api<TranscodeType> a(ImageView imageView) {
        return super.a(imageView);
    }

    public final ahp<ModelType, TranscodeType> b(int i) {
        super.e(i);
        return this;
    }

    public final ahp<ModelType, TranscodeType> b(Drawable drawable) {
        super.c(drawable);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        super.b(this.c.j);
    }

    public final ahp<ModelType, TranscodeType> c(int i) {
        super.d(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        super.b(this.c.h);
    }

    public /* synthetic */ Object clone() {
        return (ahp) super.clone();
    }

    public final /* bridge */ /* synthetic */ aht d() {
        return (ahp) super.clone();
    }

    public final /* bridge */ /* synthetic */ aht e() {
        super.e();
        return this;
    }

    public final /* bridge */ /* synthetic */ aht e(int i) {
        super.e(i);
        return this;
    }
}
