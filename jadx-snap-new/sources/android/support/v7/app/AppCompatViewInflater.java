package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import defpackage.iv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    public static final int[] a = new int[]{16843375};
    private static final Class<?>[] b = new Class[]{Context.class, AttributeSet.class};
    private static final String[] c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> d = new iv();
    private final Object[] e = new Object[2];

    public static class a implements OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00aa in {10, 12, 14, 15, 18, 19, 21, 24, 27, 30} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void onClick(android.view.View r8) {
            /*
            r7 = this;
            r0 = r7.c;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x008c;
            r0 = r7.a;
            r0 = r0.getContext();
            if (r0 == 0) goto L_0x0038;
            r3 = r0.isRestricted();	 Catch:{ NoSuchMethodException -> 0x002b }
            if (r3 != 0) goto L_0x002b;	 Catch:{ NoSuchMethodException -> 0x002b }
            r3 = r0.getClass();	 Catch:{ NoSuchMethodException -> 0x002b }
            r4 = r7.b;	 Catch:{ NoSuchMethodException -> 0x002b }
            r5 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x002b }
            r6 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x002b }
            r5[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x002b }
            r3 = r3.getMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x002b }
            if (r3 == 0) goto L_0x002b;	 Catch:{ NoSuchMethodException -> 0x002b }
            r7.c = r3;	 Catch:{ NoSuchMethodException -> 0x002b }
            r7.d = r0;	 Catch:{ NoSuchMethodException -> 0x002b }
            goto L_0x008c;
            r3 = r0 instanceof android.content.ContextWrapper;
            if (r3 == 0) goto L_0x0036;
            r0 = (android.content.ContextWrapper) r0;
            r0 = r0.getBaseContext();
            goto L_0x000c;
            r0 = 0;
            goto L_0x000c;
            r8 = r7.a;
            r8 = r8.getId();
            r0 = -1;
            if (r8 != r0) goto L_0x0044;
            r8 = "";
            goto L_0x0065;
            r0 = new java.lang.StringBuilder;
            r1 = " with id '";
            r0.<init>(r1);
            r1 = r7.a;
            r1 = r1.getContext();
            r1 = r1.getResources();
            r8 = r1.getResourceEntryName(r8);
            r0.append(r8);
            r8 = "'";
            r0.append(r8);
            r8 = r0.toString();
            r0 = new java.lang.IllegalStateException;
            r1 = new java.lang.StringBuilder;
            r2 = "Could not find method ";
            r1.<init>(r2);
            r2 = r7.b;
            r1.append(r2);
            r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view ";
            r1.append(r2);
            r2 = r7.a;
            r2 = r2.getClass();
            r1.append(r2);
            r1.append(r8);
            r8 = r1.toString();
            r0.<init>(r8);
            throw r0;
            r0 = r7.c;	 Catch:{ IllegalAccessException -> 0x00a1, InvocationTargetException -> 0x0098 }
            r3 = r7.d;	 Catch:{ IllegalAccessException -> 0x00a1, InvocationTargetException -> 0x0098 }
            r2 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x00a1, InvocationTargetException -> 0x0098 }
            r2[r1] = r8;	 Catch:{ IllegalAccessException -> 0x00a1, InvocationTargetException -> 0x0098 }
            r0.invoke(r3, r2);	 Catch:{ IllegalAccessException -> 0x00a1, InvocationTargetException -> 0x0098 }
            return;
            r8 = move-exception;
            r0 = new java.lang.IllegalStateException;
            r1 = "Could not execute method for android:onClick";
            r0.<init>(r1, r8);
            throw r0;
            r8 = move-exception;
            r0 = new java.lang.IllegalStateException;
            r1 = "Could not execute non-public method for android:onClick";
            r0.<init>(r1, r8);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatViewInflater$a.onClick(android.view.View):void");
        }
    }

    private View a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    str2 = stringBuilder.toString();
                } else {
                    str2 = str;
                }
                constructor = classLoader.loadClass(str2).asSubclass(View.class).getConstructor(b);
                d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.e);
    }

    public final View a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        Object[] objArr;
        try {
            this.e[0] = context;
            this.e[1] = attributeSet;
            View indexOf = str.indexOf(46);
            if (-1 == indexOf) {
                for (int i = 0; i < 3; i++) {
                    indexOf = a(context, str, c[i]);
                    if (indexOf != null) {
                        return indexOf;
                    }
                }
                Object[] objArr2 = this.e;
                objArr2[0] = null;
                objArr2[1] = null;
                return null;
            }
            View a = a(context, str, null);
            objArr = this.e;
            objArr[0] = null;
            objArr[1] = null;
            return a;
        } catch (Exception unused) {
            return null;
        } finally {
            objArr = this.e;
            objArr[0] = null;
            objArr[1] = null;
        }
    }
}
