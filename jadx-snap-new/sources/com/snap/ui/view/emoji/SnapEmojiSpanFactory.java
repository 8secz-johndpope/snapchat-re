package com.snap.ui.view.emoji;

import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.snap.core.db.record.FriendmojiModel;
import defpackage.abqe;
import defpackage.abqi;
import defpackage.ajdj;
import defpackage.ajdw;
import defpackage.ajfc;
import defpackage.akcr;
import defpackage.ftu;
import defpackage.gdy;
import defpackage.gfu;
import defpackage.idj;
import defpackage.idl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgu;

public final class SnapEmojiSpanFactory {
    private final gfu contentResolver;
    private final EmojiLruCache emojiLoaders = new EmojiLruCache(20);
    private final abqe emojiSequenceParser = abqe.a();
    private final zfw schedulers = zgb.a(zgu.a.callsite("SnapEmojiSpanFactory"));

    final class EmojiLruCache extends LruCache<String, ajdj<Drawable>> {
        public EmojiLruCache(int i) {
            super(i);
        }

        /* Access modifiers changed, original: protected|final */
        public final ajdj<Drawable> create(String str) {
            akcr.b(str, FriendmojiModel.EMOJI);
            idj page = zgu.a.getPage();
            String a = abqi.a(str);
            akcr.a((Object) a, "EmojiUtils.getTwitterAssetName(emoji)");
            Object c = SnapEmojiSpanFactory.this.contentResolver.a(ftu.a(a), (idl) page, false, new gdy[0]).b((ajdw) SnapEmojiSpanFactory.this.getSchedulers().f()).a((ajdw) SnapEmojiSpanFactory.this.getSchedulers().b()).b((ajfc) new SnapEmojiSpanFactory$EmojiLruCache$create$1(str)).c();
            akcr.a(c, "contentResolver.resolve(…                 .cache()");
            return c;
        }
    }

    public SnapEmojiSpanFactory(zgb zgb, gfu gfu) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gfu, "contentResolver");
        this.contentResolver = gfu;
    }

    public static /* synthetic */ CharSequence convert$default(SnapEmojiSpanFactory snapEmojiSpanFactory, CharSequence charSequence, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 1.1f;
        }
        return snapEmojiSpanFactory.convert(charSequence, f, f2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0049 in {6, 7, 12, 13, 16, 20, 21, 23} preds:[]
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
    public final void clear(java.lang.CharSequence r5) {
        /*
        r4 = this;
        r0 = "text";
        defpackage.akcr.b(r5, r0);
        r0 = r5 instanceof android.text.Spanned;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0046;	 Catch:{ all -> 0x0047 }
        r0 = r5;	 Catch:{ all -> 0x0047 }
        r0 = (android.text.Spanned) r0;	 Catch:{ all -> 0x0047 }
        r1 = r5.length();	 Catch:{ all -> 0x0047 }
        r2 = com.snap.ui.view.emoji.SnapEmojiSpan.class;	 Catch:{ all -> 0x0047 }
        r3 = 0;	 Catch:{ all -> 0x0047 }
        r0 = r0.getSpans(r3, r1, r2);	 Catch:{ all -> 0x0047 }
        r0 = (com.snap.ui.view.emoji.SnapEmojiSpan[]) r0;	 Catch:{ all -> 0x0047 }
        r1 = "existingSpans";	 Catch:{ all -> 0x0047 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0047 }
        r1 = r0.length;	 Catch:{ all -> 0x0047 }
        r2 = 1;	 Catch:{ all -> 0x0047 }
        if (r1 != 0) goto L_0x0024;	 Catch:{ all -> 0x0047 }
        r1 = 1;	 Catch:{ all -> 0x0047 }
        goto L_0x0025;	 Catch:{ all -> 0x0047 }
        r1 = 0;	 Catch:{ all -> 0x0047 }
        r1 = r1 ^ r2;	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0046;	 Catch:{ all -> 0x0047 }
        r1 = r5 instanceof android.text.SpannableStringBuilder;	 Catch:{ all -> 0x0047 }
        if (r1 != 0) goto L_0x002e;	 Catch:{ all -> 0x0047 }
        r1 = 0;	 Catch:{ all -> 0x0047 }
        goto L_0x002f;	 Catch:{ all -> 0x0047 }
        r1 = r5;	 Catch:{ all -> 0x0047 }
        r1 = (android.text.SpannableStringBuilder) r1;	 Catch:{ all -> 0x0047 }
        if (r1 != 0) goto L_0x0038;	 Catch:{ all -> 0x0047 }
        r1 = new android.text.SpannableStringBuilder;	 Catch:{ all -> 0x0047 }
        r1.<init>(r5);	 Catch:{ all -> 0x0047 }
        r5 = r0.length;	 Catch:{ all -> 0x0047 }
        if (r3 >= r5) goto L_0x0046;	 Catch:{ all -> 0x0047 }
        r2 = r0[r3];	 Catch:{ all -> 0x0047 }
        r1.removeSpan(r2);	 Catch:{ all -> 0x0047 }
        r2.dispose();	 Catch:{ all -> 0x0047 }
        r3 = r3 + 1;
        goto L_0x0039;
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.emoji.SnapEmojiSpanFactory.clear(java.lang.CharSequence):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x008c in {8, 9, 10, 12, 20, 25, 26, 27, 29, 30, 31, 33, 35} preds:[]
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
    public final java.lang.CharSequence convert(java.lang.CharSequence r7, float r8, float r9) {
        /*
        r6 = this;
        r0 = "charSequence";
        defpackage.akcr.b(r7, r0);
        r0 = 0;
        r1 = 0;
        r2 = r7.length();	 Catch:{ all -> 0x008a }
        r3 = 1;	 Catch:{ all -> 0x008a }
        if (r1 >= r2) goto L_0x0026;	 Catch:{ all -> 0x008a }
        r2 = java.lang.Character.codePointAt(r7, r1);	 Catch:{ all -> 0x008a }
        r4 = java.lang.Character.isLetterOrDigit(r2);	 Catch:{ all -> 0x008a }
        if (r4 != 0) goto L_0x0020;	 Catch:{ all -> 0x008a }
        r4 = java.lang.Character.isWhitespace(r2);	 Catch:{ all -> 0x008a }
        if (r4 != 0) goto L_0x0020;	 Catch:{ all -> 0x008a }
        r1 = 0;	 Catch:{ all -> 0x008a }
        goto L_0x0027;	 Catch:{ all -> 0x008a }
        r2 = java.lang.Character.charCount(r2);	 Catch:{ all -> 0x008a }
        r1 = r1 + r2;	 Catch:{ all -> 0x008a }
        goto L_0x0007;	 Catch:{ all -> 0x008a }
        r1 = 1;	 Catch:{ all -> 0x008a }
        if (r1 == 0) goto L_0x002a;	 Catch:{ all -> 0x008a }
        return r7;	 Catch:{ all -> 0x008a }
        r8 = r8 * r9;	 Catch:{ all -> 0x008a }
        r8 = (int) r8;	 Catch:{ all -> 0x008a }
        r9 = new android.text.SpannableStringBuilder;	 Catch:{ all -> 0x008a }
        r9.<init>(r7);	 Catch:{ all -> 0x008a }
        r7 = 0;	 Catch:{ all -> 0x008a }
        r1 = r9.length();	 Catch:{ all -> 0x008a }
        if (r7 >= r1) goto L_0x0080;	 Catch:{ all -> 0x008a }
        r1 = r9;	 Catch:{ all -> 0x008a }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x008a }
        r1 = java.lang.Character.codePointAt(r1, r7);	 Catch:{ all -> 0x008a }
        r2 = java.lang.Character.charCount(r1);	 Catch:{ all -> 0x008a }
        r4 = java.lang.Character.isLetterOrDigit(r1);	 Catch:{ all -> 0x008a }
        if (r4 != 0) goto L_0x007e;	 Catch:{ all -> 0x008a }
        r4 = java.lang.Character.isWhitespace(r1);	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x0050;	 Catch:{ all -> 0x008a }
        goto L_0x007e;	 Catch:{ all -> 0x008a }
        r4 = r6.emojiSequenceParser;	 Catch:{ all -> 0x008a }
        r5 = r9;	 Catch:{ all -> 0x008a }
        r5 = (java.lang.CharSequence) r5;	 Catch:{ all -> 0x008a }
        r1 = r4.a(r5, r7, r1, r2);	 Catch:{ all -> 0x008a }
        r4 = r1;	 Catch:{ all -> 0x008a }
        r4 = (java.lang.CharSequence) r4;	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x0067;	 Catch:{ all -> 0x008a }
        r4 = r4.length();	 Catch:{ all -> 0x008a }
        if (r4 != 0) goto L_0x0065;	 Catch:{ all -> 0x008a }
        goto L_0x0067;	 Catch:{ all -> 0x008a }
        r4 = 0;	 Catch:{ all -> 0x008a }
        goto L_0x0068;	 Catch:{ all -> 0x008a }
        r4 = 1;	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x006b;	 Catch:{ all -> 0x008a }
        goto L_0x007e;	 Catch:{ all -> 0x008a }
        r2 = r1.length();	 Catch:{ all -> 0x008a }
        r1 = r6.create(r1, r8);	 Catch:{ all -> 0x008a }
        r1.initialize();	 Catch:{ all -> 0x008a }
        r2 = r2 + r7;	 Catch:{ all -> 0x008a }
        r4 = 33;	 Catch:{ all -> 0x008a }
        r9.setSpan(r1, r7, r2, r4);	 Catch:{ all -> 0x008a }
        r7 = r2;	 Catch:{ all -> 0x008a }
        goto L_0x0032;	 Catch:{ all -> 0x008a }
        r7 = r7 + r2;	 Catch:{ all -> 0x008a }
        goto L_0x0032;	 Catch:{ all -> 0x008a }
        r7 = new android.text.SpannedString;	 Catch:{ all -> 0x008a }
        r9 = (java.lang.CharSequence) r9;	 Catch:{ all -> 0x008a }
        r7.<init>(r9);	 Catch:{ all -> 0x008a }
        r7 = (java.lang.CharSequence) r7;	 Catch:{ all -> 0x008a }
        return r7;
        r7 = move-exception;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.emoji.SnapEmojiSpanFactory.convert(java.lang.CharSequence, float, float):java.lang.CharSequence");
    }

    public final synchronized SnapEmojiSpan create(String str, int i) {
        Object obj;
        akcr.b(str, FriendmojiModel.EMOJI);
        obj = (ajdj) this.emojiLoaders.get(str);
        akcr.a(obj, "emojiLoader");
        return new SnapEmojiSpan(str, i, obj);
    }

    public final zfw getSchedulers() {
        return this.schedulers;
    }
}
