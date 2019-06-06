package com.snap.composer.utils;

import com.snap.composer.exceptions.AttributeError;
import defpackage.akcr;

public final class JSConversions {
    public static final JSConversions INSTANCE = new JSConversions();

    static final class a {
        final Object a;

        public a(Object obj) {
            akcr.b(obj, "instance");
            this.a = obj;
        }
    }

    private JSConversions() {
    }

    public final boolean asBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        } else {
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            StringBuilder stringBuilder = new StringBuilder("value ");
            stringBuilder.append(obj);
            stringBuilder.append(" is not a boolean");
            throw new AttributeError(stringBuilder.toString());
        }
    }

    public final double asDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        StringBuilder stringBuilder = new StringBuilder("value ");
        stringBuilder.append(obj);
        stringBuilder.append(" is not a double");
        throw new AttributeError(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x008b in {3, 8, 9, 11, 12, 21, 22, 24, 26, 28} preds:[]
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
    public final float asFloat(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = r5 instanceof java.lang.Number;
        if (r0 == 0) goto L_0x000b;
        r5 = (java.lang.Number) r5;
        r5 = r5.floatValue();
        return r5;
        r0 = r5 instanceof java.lang.String;
        if (r0 == 0) goto L_0x0070;
        r0 = r5;
        r0 = (java.lang.CharSequence) r0;
        r1 = "receiver$0";
        defpackage.akcr.b(r0, r1);
        r1 = r0.length();
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0021;
        r1 = 1;
        goto L_0x0022;
        r1 = 0;
        if (r1 == 0) goto L_0x0026;
        r0 = 0;
        goto L_0x0033;
        r1 = r0.length();
        r1 = r1 - r3;
        r0 = r0.charAt(r1);
        r0 = java.lang.Character.valueOf(r0);
        if (r0 == 0) goto L_0x0069;
        r0 = r0.charValue();
        r0 = java.lang.Character.isDigit(r0);
        if (r0 != 0) goto L_0x0069;
        r5 = (java.lang.String) r5;
        r5 = (java.lang.CharSequence) r5;
        r0 = r5.length();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x005c;
        r1 = r5.charAt(r0);
        r1 = java.lang.Character.isDigit(r1);
        r1 = r1 ^ r3;
        if (r1 != 0) goto L_0x0047;
        r0 = r0 + r3;
        r5 = r5.subSequence(r2, r0);
        goto L_0x0060;
        r5 = "";
        r5 = (java.lang.CharSequence) r5;
        r5 = r5.toString();
        r5 = java.lang.Float.parseFloat(r5);
        return r5;
        r5 = (java.lang.String) r5;
        r5 = java.lang.Float.parseFloat(r5);
        return r5;
        r0 = new com.snap.composer.exceptions.AttributeError;
        r1 = new java.lang.StringBuilder;
        r2 = "value ";
        r1.<init>(r2);
        r1.append(r5);
        r5 = " is not a float";
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.utils.JSConversions.asFloat(java.lang.Object):float");
    }

    public final int asInt(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        StringBuilder stringBuilder = new StringBuilder("value ");
        stringBuilder.append(obj);
        stringBuilder.append(" is not an int");
        throw new AttributeError(stringBuilder.toString());
    }

    public final long asLong(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        StringBuilder stringBuilder = new StringBuilder("value ");
        stringBuilder.append(obj);
        stringBuilder.append(" is not a long");
        throw new AttributeError(stringBuilder.toString());
    }

    public final String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("value ");
        stringBuilder.append(obj);
        stringBuilder.append(" is not a string");
        throw new AttributeError(stringBuilder.toString());
    }

    public final Object getParameterOrNull(Object[] objArr, int i) {
        akcr.b(objArr, "parameters");
        return i >= objArr.length ? null : objArr[i];
    }

    public final Object unwrapNativeInstance(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        StringBuilder stringBuilder = new StringBuilder("value ");
        stringBuilder.append(obj);
        stringBuilder.append(" is not a wrapped Java instance");
        throw new AttributeError(stringBuilder.toString());
    }

    public final Object wrapNativeInstance(Object obj) {
        akcr.b(obj, "instance");
        return new a(obj);
    }
}
