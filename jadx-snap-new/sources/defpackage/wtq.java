package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: wtq */
public final class wtq {
    private wts a;
    private final WeakHashMap<abpb, wqq> b = new WeakHashMap();
    private final Set<abov> c = new HashSet();
    private final gqa d;
    private final hwy e;
    private final zgb f;
    private final Context g;

    public wtq(gqa gqa, hwy hwy, zgb zgb, Context context) {
        this.d = gqa;
        this.e = hwy;
        this.f = zgb;
        this.g = context;
    }

    private File a() {
        return new File(this.g.getFilesDir(), "/s2r/");
    }

    private List<String> a(File file) {
        ArrayList newArrayList = Lists.newArrayList();
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        if (file2.isDirectory()) {
                            List a = a(file2);
                            if (a != null) {
                                newArrayList.addAll(a);
                            }
                        } else {
                            newArrayList.add(file2.getPath());
                        }
                    }
                }
            }
        }
        return newArrayList;
    }

    private boolean a(File file, File file2) {
        if (!file.exists()) {
            return false;
        }
        List a = a(file);
        try {
            ygt.a((String[]) a.toArray(new String[a.size()]), file2.getPath());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private File g(String str) {
        File[] l = l(str);
        return (l == null || l.length == 0) ? null : l[0];
    }

    private synchronized String h(String str) {
        File k = k(str);
        File file = new File(k(str), String.format("s2r_%s.zip", new Object[]{str}));
        if (file.exists()) {
            return file.getPath();
        }
        File g = g(str);
        File file2 = new File(k(str), "screenshot.jpg");
        if (g != null) {
            g.renameTo(file2);
        }
        b(str);
        if (!a(k, file) || !file.exists()) {
            return null;
        }
        return file.getPath();
    }

    private File i(String str) {
        return new File(k(str), "log/");
    }

    private boolean j(String str) {
        File k = k(str);
        return k.exists() || k.mkdirs();
    }

    private File k(String str) {
        return new File(a(), str);
    }

    private File[] l(String str) {
        return k(str).listFiles(-$$Lambda$wtq$wPyQtAyF_VDJ8s3XeU_ZfMdg_MI.INSTANCE);
    }

    private /* synthetic */ Optional n(String str) {
        File g = g(str);
        return g == null ? Optional.absent() : Optional.of(Uri.fromFile(g));
    }

    public final ajdx<Optional<Uri>> a(String str) {
        return ajdx.c(new -$$Lambda$wtq$6PApt2kpY9_iMJafXKpxxdwiBTw(this, str));
    }

    public final synchronized void a(String str, boolean z, Activity activity) {
        if (i(str).mkdirs()) {
            wts wtp;
            File i = i(str);
            if (z) {
                wts wtr = new wtr(this.b, this.c, this.d, this.e, this.f);
            } else {
                wtp = new wtp();
            }
            this.a = wtp;
            this.a.a(i, activity);
        }
    }

    public final void a(Set<abov> set) {
        this.c.addAll(set);
    }

    public final boolean a(String str, Bitmap bitmap) {
        if (!j(str)) {
            return false;
        }
        File[] l = l(str);
        if (l != null) {
            for (File delete : l) {
                delete.delete();
            }
        }
        File k = k(str);
        StringBuilder stringBuilder = new StringBuilder("image_attachment");
        stringBuilder.append(iig.a());
        File file = new File(k, stringBuilder.toString());
        Closeable fileOutputStream;
        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            bitmap.compress(CompressFormat.JPEG, 40, fileOutputStream);
            aklc.a(fileOutputStream);
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            aklc.a(fileOutputStream);
        }
    }

    public final boolean a(String str, InputStream inputStream) {
        if (!j(str)) {
            return false;
        }
        File[] l = l(str);
        if (l != null) {
            for (File delete : l) {
                delete.delete();
            }
        }
        File k = k(str);
        StringBuilder stringBuilder = new StringBuilder("image_attachment");
        stringBuilder.append(iig.a());
        File file = new File(k, stringBuilder.toString());
        Closeable fileOutputStream;
        try {
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            aklc.a(inputStream, (OutputStream) fileOutputStream);
            aklc.a(fileOutputStream);
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            aklc.a(fileOutputStream);
        }
    }

    public final void b(String str) {
        File[] l = l(str);
        if (l != null) {
            for (File delete : l) {
                delete.delete();
            }
        }
    }

    public final synchronized ajdx<Optional<String>> c(String str) {
        str = h(str);
        if (TextUtils.isEmpty(str)) {
            return ajdx.b(Optional.absent());
        }
        return ajdx.b(Optional.of(str));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0013 in {4, 6, 7, 10} preds:[]
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
    /* renamed from: d */
    public final synchronized boolean m(java.lang.String r1) {
        /*
        r0 = this;
        monitor-enter(r0);
        r1 = r0.k(r1);	 Catch:{ all -> 0x0010 }
        r1 = defpackage.ygr.b(r1);	 Catch:{ all -> 0x0010 }
        if (r1 == 0) goto L_0x000e;
        r1 = 1;
        monitor-exit(r0);
        return r1;
        r1 = 0;
        goto L_0x000c;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtq.m(java.lang.String):boolean");
    }

    public final ajcx e(String str) {
        return ajcx.a(new -$$Lambda$wtq$a8fJkyI8C13EYtcPwlb9iiVS84Y(this, str));
    }

    public final synchronized void f(String str) {
        File i = i(str);
        if (i.exists()) {
            ygr.b(i);
        }
    }
}
