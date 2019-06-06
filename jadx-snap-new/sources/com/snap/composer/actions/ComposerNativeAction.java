package com.snap.composer.actions;

import com.snap.composer.logger.Logger;
import com.snap.composer.utils.MainThreadUtils;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import java.lang.reflect.Method;

public final class ComposerNativeAction implements ComposerAction {
    private Class<?> a;
    private Method b;
    private boolean c;
    private final ComposerActionHandlerHolder d;
    private final String e;
    private final Logger f;

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ ComposerNativeAction a;
        private /* synthetic */ Object[] b;

        a(ComposerNativeAction composerNativeAction, Object[] objArr) {
            this.a = composerNativeAction;
            this.b = objArr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerNativeAction.access$doPerform(this.a, this.b);
            return ajxw.a;
        }
    }

    public ComposerNativeAction(ComposerActionHandlerHolder composerActionHandlerHolder, String str, Logger logger) {
        akcr.b(composerActionHandlerHolder, "actionHandlerHolder");
        akcr.b(str, "functionName");
        akcr.b(logger, "logger");
        this.d = composerActionHandlerHolder;
        this.e = str;
        this.f = logger;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003d */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r7.b = r2.getDeclaredMethod(r7.e, new java.lang.Class[0]);
            r7.c = false;
     */
    public static final /* synthetic */ void access$doPerform(com.snap.composer.actions.ComposerNativeAction r7, java.lang.Object[] r8) {
        /*
        r0 = r7.d;
        r0 = r0.getActionHandler();
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        r2 = r0.getClass();
        goto L_0x000f;
    L_0x000e:
        r2 = r1;
    L_0x000f:
        r3 = r7.a;
        r3 = defpackage.akcr.a(r2, r3);
        r4 = 1;
        r3 = r3 ^ r4;
        if (r3 == 0) goto L_0x001d;
    L_0x0019:
        r7.a = r2;
        r7.b = r1;
    L_0x001d:
        if (r0 == 0) goto L_0x008b;
    L_0x001f:
        if (r2 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x008b;
    L_0x0022:
        r1 = r7.b;
        r3 = 0;
        if (r1 != 0) goto L_0x0049;
    L_0x0027:
        r1 = r7.e;	 Catch:{ NoSuchMethodException -> 0x003d }
        r5 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x003d }
        r6 = java.lang.Object[].class;
        r5[r3] = r6;	 Catch:{ NoSuchMethodException -> 0x003d }
        r1 = r2.getDeclaredMethod(r1, r5);	 Catch:{ NoSuchMethodException -> 0x003d }
        if (r1 != 0) goto L_0x0038;
    L_0x0035:
        defpackage.akcr.a();	 Catch:{ NoSuchMethodException -> 0x003d }
    L_0x0038:
        r7.b = r1;	 Catch:{ NoSuchMethodException -> 0x003d }
        r7.c = r4;	 Catch:{ NoSuchMethodException -> 0x003d }
        goto L_0x0049;
    L_0x003d:
        r1 = r7.e;	 Catch:{ NoSuchMethodException -> 0x0049 }
        r5 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x0049 }
        r1 = r2.getDeclaredMethod(r1, r5);	 Catch:{ NoSuchMethodException -> 0x0049 }
        r7.b = r1;	 Catch:{ NoSuchMethodException -> 0x0049 }
        r7.c = r3;	 Catch:{ NoSuchMethodException -> 0x0049 }
    L_0x0049:
        r1 = r7.b;
        if (r1 != 0) goto L_0x007a;
    L_0x004d:
        r8 = r7.f;
        r1 = com.snap.composer.logger.LogLevel.Companion;
        r1 = r1.getERROR();
        r2 = new java.lang.StringBuilder;
        r3 = "Unable to call function ";
        r2.<init>(r3);
        r7 = r7.e;
        r2.append(r7);
        r7 = " on ";
        r2.append(r7);
        r7 = r0.getClass();
        r2.append(r7);
        r7 = ". ActionHandler does not implement method.";
        r2.append(r7);
        r7 = r2.toString();
        r8.log(r1, r7);
        return;
    L_0x007a:
        r7 = r7.c;
        if (r7 == 0) goto L_0x0086;
    L_0x007e:
        r7 = new java.lang.Object[r4];
        r7[r3] = r8;
        r1.invoke(r0, r7);
        return;
    L_0x0086:
        r7 = new java.lang.Object[r3];
        r1.invoke(r0, r7);
    L_0x008b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.actions.ComposerNativeAction.access$doPerform(com.snap.composer.actions.ComposerNativeAction, java.lang.Object[]):void");
    }

    public final Object perform(Object[] objArr) {
        akcr.b(objArr, "parameters");
        MainThreadUtils.runOnMainThreadIfNeeded(new a(this, objArr));
        return null;
    }
}
