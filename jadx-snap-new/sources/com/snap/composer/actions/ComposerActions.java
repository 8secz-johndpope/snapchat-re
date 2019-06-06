package com.snap.composer.actions;

import defpackage.akco;
import defpackage.akcr;
import java.util.Map;

public final class ComposerActions {
    public static final Companion Companion = new Companion();
    private final ComposerActionHandlerHolder a;
    private final Map<String, ComposerAction> b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0060 in {8, 9, 10, 12, 14, 16} preds:[]
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
        public final com.snap.composer.actions.ComposerActions make(java.lang.Object[] r8, boolean[] r9, com.snap.composer.actions.JSCaller r10, com.snap.composer.logger.Logger r11) {
            /*
            r7 = this;
            r0 = "actionNames";
            defpackage.akcr.b(r8, r0);
            r0 = "actionIsJS";
            defpackage.akcr.b(r9, r0);
            r0 = "jsCaller";
            defpackage.akcr.b(r10, r0);
            r0 = "logger";
            defpackage.akcr.b(r11, r0);
            r0 = r8.length;
            r1 = r9.length;
            if (r0 != r1) goto L_0x0056;
            r0 = new com.snap.composer.actions.ComposerActionHandlerHolder;
            r0.<init>();
            r1 = new java.util.HashMap;
            r1.<init>();
            r2 = 0;
            r3 = r8.length;
            if (r2 >= r3) goto L_0x004e;
            r4 = r8[r2];
            if (r4 == 0) goto L_0x0046;
            r4 = (java.lang.String) r4;
            r5 = r9[r2];
            if (r5 == 0) goto L_0x0036;
            r5 = new com.snap.composer.actions.ComposerJavaScriptAction;
            r5.<init>(r4, r10);
            goto L_0x003b;
            r5 = new com.snap.composer.actions.ComposerNativeAction;
            r5.<init>(r0, r4, r11);
            r5 = (com.snap.composer.actions.ComposerAction) r5;
            r6 = r1;
            r6 = (java.util.Map) r6;
            r6.put(r4, r5);
            r2 = r2 + 1;
            goto L_0x0024;
            r8 = new ajxt;
            r9 = "null cannot be cast to non-null type kotlin.String";
            r8.<init>(r9);
            throw r8;
            r8 = new com.snap.composer.actions.ComposerActions;
            r1 = (java.util.Map) r1;
            r8.<init>(r0, r1);
            return r8;
            r8 = new com.snap.composer.exceptions.ComposerException;
            r9 = "ActionNames and ActionIsJS must be the same size";
            r8.<init>(r9);
            r8 = (java.lang.Throwable) r8;
            throw r8;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.actions.ComposerActions$Companion.make(java.lang.Object[], boolean[], com.snap.composer.actions.JSCaller, com.snap.composer.logger.Logger):com.snap.composer.actions.ComposerActions");
        }
    }

    public ComposerActions(ComposerActionHandlerHolder composerActionHandlerHolder, Map<String, ComposerAction> map) {
        akcr.b(composerActionHandlerHolder, "actionHandlerHolder");
        akcr.b(map, "actionByName");
        this.a = composerActionHandlerHolder;
        this.b = map;
    }

    public final ComposerAction getAction(String str) {
        akcr.b(str, "name");
        return (ComposerAction) this.b.get(str);
    }

    public final Map<String, ComposerAction> getActionByName() {
        return this.b;
    }

    public final ComposerActionHandlerHolder getActionHandlerHolder() {
        return this.a;
    }
}
