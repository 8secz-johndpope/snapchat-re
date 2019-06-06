package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: dl */
public final class dl {
    private static final Set<File> a = new HashSet();
    private static final boolean b = dl.a(System.getProperty("java.vm.version"));

    /* renamed from: dl$a */
    static final class a {
        static void a(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj = dl.a(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Object[] objArr = new Object[]{arrayList2, file, arrayList};
            String str = "dexElements";
            dl.a(obj, str, (Object[]) dl.a(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, objArr));
            if (arrayList.size() > 0) {
                Object obj2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = dl.a(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) a.get(obj);
                if (iOExceptionArr == null) {
                    obj2 = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    Object obj3 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(obj3);
                    System.arraycopy(iOExceptionArr, 0, obj3, arrayList.size(), iOExceptionArr.length);
                    obj2 = obj3;
                }
                a.set(obj, obj2);
            }
        }
    }

    /* renamed from: dl$b */
    static final class b {
        static void a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a = dl.a(classLoader, "path");
            StringBuilder stringBuilder = new StringBuilder((String) a.get(classLoader));
            Object[] objArr = new String[size];
            Object[] objArr2 = new File[size];
            Object[] objArr3 = new ZipFile[size];
            Object[] objArr4 = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                stringBuilder.append(':');
                stringBuilder.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                objArr[previousIndex] = absolutePath;
                objArr2[previousIndex] = file;
                objArr3[previousIndex] = new ZipFile(file);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(absolutePath);
                stringBuilder2.append(".dex");
                objArr4[previousIndex] = DexFile.loadDex(absolutePath, stringBuilder2.toString(), 0);
            }
            a.set(classLoader, stringBuilder.toString());
            dl.a((Object) classLoader, "mPaths", objArr);
            dl.a((Object) classLoader, "mFiles", objArr2);
            dl.a((Object) classLoader, "mZips", objArr3);
            dl.a((Object) classLoader, "mDexs", objArr4);
        }
    }

    private static File a(Context context, File file, String str) {
        String str2 = "code_cache";
        File file2 = new File(file, str2);
        try {
            dl.a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), str2);
            dl.a(file2);
        }
        File file3 = new File(file2, str);
        dl.a(file3);
        return file3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003a in {5, 6, 7, 10} preds:[]
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
    static java.lang.reflect.Field a(java.lang.Object r3, java.lang.String r4) {
        /*
        r0 = r3.getClass();
        if (r0 == 0) goto L_0x001a;
        r1 = r0.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchFieldException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = 1;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchFieldException -> 0x0015 }
        return r1;
        r0 = r0.getSuperclass();
        goto L_0x0004;
        r0 = new java.lang.NoSuchFieldException;
        r1 = new java.lang.StringBuilder;
        r2 = "Field ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(java.lang.Object, java.lang.String):java.lang.reflect.Field");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0046 in {5, 6, 7, 10} preds:[]
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
    static java.lang.reflect.Method a(java.lang.Object r3, java.lang.String r4, java.lang.Class<?>... r5) {
        /*
        r0 = r3.getClass();
        if (r0 == 0) goto L_0x001a;
        r1 = r0.getDeclaredMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchMethodException -> 0x0015 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x0015 }
        return r1;
        r0 = r0.getSuperclass();
        goto L_0x0004;
        r0 = new java.lang.NoSuchMethodException;
        r1 = new java.lang.StringBuilder;
        r2 = "Method ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = " with parameters ";
        r1.append(r4);
        r4 = java.util.Arrays.asList(r5);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(java.lang.Object, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0078 in {2, 4, 11, 13, 16, 18} preds:[]
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
    public static void a(android.content.Context r5) {
        /*
        r0 = "MultiDex";
        r1 = "Installing application";
        android.util.Log.i(r0, r1);
        r1 = b;
        if (r1 == 0) goto L_0x0011;
        r5 = "VM has multidex support, MultiDex support library is disabled.";
        android.util.Log.i(r0, r5);
        return;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 4;
        if (r1 < r2) goto L_0x005d;
        r1 = defpackage.dl.b(r5);	 Catch:{ Exception -> 0x003a }
        if (r1 != 0) goto L_0x0022;	 Catch:{ Exception -> 0x003a }
        r5 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.";	 Catch:{ Exception -> 0x003a }
        android.util.Log.i(r0, r5);	 Catch:{ Exception -> 0x003a }
        return;	 Catch:{ Exception -> 0x003a }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x003a }
        r3 = r1.sourceDir;	 Catch:{ Exception -> 0x003a }
        r2.<init>(r3);	 Catch:{ Exception -> 0x003a }
        r3 = new java.io.File;	 Catch:{ Exception -> 0x003a }
        r1 = r1.dataDir;	 Catch:{ Exception -> 0x003a }
        r3.<init>(r1);	 Catch:{ Exception -> 0x003a }
        r1 = "secondary-dexes";	 Catch:{ Exception -> 0x003a }
        r4 = "";	 Catch:{ Exception -> 0x003a }
        defpackage.dl.a(r5, r2, r3, r1, r4);	 Catch:{ Exception -> 0x003a }
        r5 = "install done";
        goto L_0x000d;
        r5 = move-exception;
        r1 = "MultiDex installation failure";
        android.util.Log.e(r0, r1, r5);
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r2 = "MultiDex installation failed (";
        r1.<init>(r2);
        r5 = r5.getMessage();
        r1.append(r5);
        r5 = ").";
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
        r5 = new java.lang.RuntimeException;
        r0 = new java.lang.StringBuilder;
        r1 = "MultiDex installation failed. SDK ";
        r0.<init>(r1);
        r1 = android.os.Build.VERSION.SDK_INT;
        r0.append(r1);
        r1 = " is unsupported. Min SDK version is 4.";
        r0.append(r1);
        r0 = r0.toString();
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(android.content.Context):void");
    }

    /* JADX WARNING: Missing block: B:32:0x00b1, code skipped:
            return;
     */
    private static void a(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10) {
        /*
        r0 = a;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x00bc }
        r1 = r1.contains(r7);	 Catch:{ all -> 0x00bc }
        if (r1 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r0);	 Catch:{ all -> 0x00bc }
        return;
    L_0x000d:
        r1 = a;	 Catch:{ all -> 0x00bc }
        r1.add(r7);	 Catch:{ all -> 0x00bc }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00bc }
        r2 = 20;
        if (r1 <= r2) goto L_0x0040;
    L_0x0018:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bc }
        r3 = "MultiDex is not guaranteed to work in SDK version ";
        r2.<init>(r3);	 Catch:{ all -> 0x00bc }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00bc }
        r2.append(r3);	 Catch:{ all -> 0x00bc }
        r3 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"";
        r2.append(r3);	 Catch:{ all -> 0x00bc }
        r3 = "java.vm.version";
        r3 = java.lang.System.getProperty(r3);	 Catch:{ all -> 0x00bc }
        r2.append(r3);	 Catch:{ all -> 0x00bc }
        r3 = "\"";
        r2.append(r3);	 Catch:{ all -> 0x00bc }
        r2 = r2.toString();	 Catch:{ all -> 0x00bc }
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x00bc }
    L_0x0040:
        r1 = r6.getClassLoader();	 Catch:{ RuntimeException -> 0x00b2 }
        if (r1 != 0) goto L_0x004f;
    L_0x0046:
        r6 = "MultiDex";
        r7 = "Context class loader is null. Must be running in test mode. Skip patching.";
        android.util.Log.e(r6, r7);	 Catch:{ all -> 0x00bc }
        monitor-exit(r0);	 Catch:{ all -> 0x00bc }
        return;
    L_0x004f:
        defpackage.dl.c(r6);	 Catch:{ Throwable -> 0x0053 }
        goto L_0x005b;
    L_0x0053:
        r2 = move-exception;
        r3 = "MultiDex";
        r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.";
        android.util.Log.w(r3, r4, r2);	 Catch:{ all -> 0x00bc }
    L_0x005b:
        r8 = defpackage.dl.a(r6, r8, r9);	 Catch:{ all -> 0x00bc }
        r6 = defpackage.dm.a(r6, r7, r8, r10);	 Catch:{ all -> 0x00bc }
        r7 = r6.isEmpty();	 Catch:{ all -> 0x00bc }
        if (r7 != 0) goto L_0x00b0;
    L_0x0069:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00bc }
        r9 = 19;
        if (r7 < r9) goto L_0x0073;
    L_0x006f:
        defpackage.dl.a.a(r1, r6, r8);	 Catch:{ all -> 0x00bc }
        goto L_0x00b0;
    L_0x0073:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x00bc }
        r9 = 14;
        if (r7 < r9) goto L_0x00ad;
    L_0x0079:
        r7 = "pathList";
        r7 = defpackage.dl.a(r1, r7);	 Catch:{ all -> 0x00bc }
        r7 = r7.get(r1);	 Catch:{ all -> 0x00bc }
        r9 = "dexElements";
        r10 = new java.util.ArrayList;	 Catch:{ all -> 0x00bc }
        r10.<init>(r6);	 Catch:{ all -> 0x00bc }
        r6 = "makeDexElements";
        r1 = 2;
        r2 = new java.lang.Class[r1];	 Catch:{ all -> 0x00bc }
        r3 = java.util.ArrayList.class;
        r4 = 0;
        r2[r4] = r3;	 Catch:{ all -> 0x00bc }
        r3 = java.io.File.class;
        r5 = 1;
        r2[r5] = r3;	 Catch:{ all -> 0x00bc }
        r6 = defpackage.dl.a(r7, r6, r2);	 Catch:{ all -> 0x00bc }
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x00bc }
        r1[r4] = r10;	 Catch:{ all -> 0x00bc }
        r1[r5] = r8;	 Catch:{ all -> 0x00bc }
        r6 = r6.invoke(r7, r1);	 Catch:{ all -> 0x00bc }
        r6 = (java.lang.Object[]) r6;	 Catch:{ all -> 0x00bc }
        defpackage.dl.a(r7, r9, r6);	 Catch:{ all -> 0x00bc }
        goto L_0x00b0;
    L_0x00ad:
        defpackage.dl.b.a(r1, r6);	 Catch:{ all -> 0x00bc }
    L_0x00b0:
        monitor-exit(r0);	 Catch:{ all -> 0x00bc }
        return;
    L_0x00b2:
        r6 = move-exception;
        r7 = "MultiDex";
        r8 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.";
        android.util.Log.w(r7, r8, r6);	 Catch:{ all -> 0x00bc }
        monitor-exit(r0);	 Catch:{ all -> 0x00bc }
        return;
    L_0x00bc:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00bc }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String):void");
    }

    private static void a(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            String stringBuilder;
            File parentFile = file.getParentFile();
            String str = "Failed to create dir ";
            String str2 = "MultiDex";
            if (parentFile == null) {
                StringBuilder stringBuilder2 = new StringBuilder(str);
                stringBuilder2.append(file.getPath());
                stringBuilder2.append(". Parent file is null.");
                stringBuilder = stringBuilder2.toString();
            } else {
                StringBuilder stringBuilder3 = new StringBuilder(str);
                stringBuilder3.append(file.getPath());
                stringBuilder3.append(". parent file is a dir ");
                stringBuilder3.append(parentFile.isDirectory());
                stringBuilder3.append(", a file ");
                stringBuilder3.append(parentFile.isFile());
                stringBuilder3.append(", exists ");
                stringBuilder3.append(parentFile.exists());
                stringBuilder3.append(", readable ");
                stringBuilder3.append(parentFile.canRead());
                stringBuilder3.append(", writable ");
                stringBuilder3.append(parentFile.canWrite());
                stringBuilder = stringBuilder3.toString();
            }
            Log.e(str2, stringBuilder);
            StringBuilder stringBuilder4 = new StringBuilder("Failed to create directory ");
            stringBuilder4.append(file.getPath());
            throw new IOException(stringBuilder4.toString());
        }
    }

    static void a(Object obj, String str, Object[] objArr) {
        Field a = dl.a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        a.set(obj, objArr3);
    }

    private static boolean a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder("VM with version ");
        stringBuilder.append(str);
        stringBuilder.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", stringBuilder.toString());
        return z;
    }

    private static ApplicationInfo b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static void c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder stringBuilder = new StringBuilder("Clearing old secondary dex dir (");
            stringBuilder.append(file.getPath());
            String str = ").";
            stringBuilder.append(str);
            String str2 = "MultiDex";
            Log.i(str2, stringBuilder.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                stringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
                stringBuilder.append(file.getPath());
                stringBuilder.append(str);
            } else {
                for (File file2 : listFiles) {
                    StringBuilder stringBuilder2 = new StringBuilder("Trying to delete old file ");
                    stringBuilder2.append(file2.getPath());
                    stringBuilder2.append(" of size ");
                    stringBuilder2.append(file2.length());
                    Log.i(str2, stringBuilder2.toString());
                    if (file2.delete()) {
                        stringBuilder2 = new StringBuilder("Deleted old file ");
                        stringBuilder2.append(file2.getPath());
                        Log.i(str2, stringBuilder2.toString());
                    } else {
                        stringBuilder2 = new StringBuilder("Failed to delete old file ");
                        stringBuilder2.append(file2.getPath());
                        Log.w(str2, stringBuilder2.toString());
                    }
                }
                if (file.delete()) {
                    stringBuilder = new StringBuilder("Deleted old secondary dex dir ");
                    stringBuilder.append(file.getPath());
                    Log.i(str2, stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder("Failed to delete secondary dex dir ");
                    stringBuilder.append(file.getPath());
                }
            }
            Log.w(str2, stringBuilder.toString());
        }
    }
}
