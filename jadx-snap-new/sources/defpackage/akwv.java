package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: akwv */
public final class akwv {
    static final Type[] a = new Type[0];

    /* renamed from: akwv$a */
    static final class a implements GenericArrayType {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && akwv.a((Type) this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(akwv.b(this.a));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: akwv$b */
    static final class b implements ParameterizedType {
        private final Type a;
        private final Type b;
        private final Type[] c;

        b(Type type, Type type2, Type... typeArr) {
            Object obj;
            if (type2 instanceof Class) {
                Object obj2 = 1;
                obj = type == null ? 1 : null;
                if (((Class) type2).getEnclosingClass() != null) {
                    obj2 = null;
                }
                if (obj != obj2) {
                    throw new IllegalArgumentException();
                }
            }
            for (Object obj3 : typeArr) {
                akwv.a(obj3, "typeArgument == null");
                akwv.c(obj3);
            }
            this.a = type;
            this.b = type2;
            this.c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && akwv.a((Type) this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        public final Type getOwnerType() {
            return this.a;
        }

        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
            Type type = this.a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.c;
            if (typeArr.length == 0) {
                return akwv.b(this.b);
            }
            int i = 1;
            StringBuilder stringBuilder = new StringBuilder((typeArr.length + 1) * 30);
            stringBuilder.append(akwv.b(this.b));
            stringBuilder.append("<");
            stringBuilder.append(akwv.b(this.c[0]));
            while (i < this.c.length) {
                stringBuilder.append(ppy.d);
                stringBuilder.append(akwv.b(this.c[i]));
                i++;
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    /* renamed from: akwv$c */
    static final class c implements WildcardType {
        private final Type a;
        private final Type b;

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x004a in {8, 10, 12, 14, 17, 19, 21} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        c(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
            /*
            r3 = this;
            r3.<init>();
            r0 = r5.length;
            r1 = 1;
            if (r0 > r1) goto L_0x0044;
            r0 = r5.length;
            r2 = 0;
            if (r0 != r1) goto L_0x002f;
            r0 = r5[r2];
            if (r0 == 0) goto L_0x0029;
            r0 = r5[r2];
            defpackage.akwv.c(r0);
            r4 = r4[r2];
            r0 = java.lang.Object.class;
            if (r4 != r0) goto L_0x0023;
            r4 = r5[r2];
            r3.b = r4;
            r4 = java.lang.Object.class;
            r3.a = r4;
            return;
            r4 = new java.lang.IllegalArgumentException;
            r4.<init>();
            throw r4;
            r4 = new java.lang.NullPointerException;
            r4.<init>();
            throw r4;
            r5 = r4[r2];
            if (r5 == 0) goto L_0x003e;
            r5 = r4[r2];
            defpackage.akwv.c(r5);
            r5 = 0;
            r3.b = r5;
            r4 = r4[r2];
            goto L_0x0020;
            r4 = new java.lang.NullPointerException;
            r4.<init>();
            throw r4;
            r4 = new java.lang.IllegalArgumentException;
            r4.<init>();
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwv$c.<init>(java.lang.reflect.Type[], java.lang.reflect.Type[]):void");
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && akwv.a((Type) this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            if (this.b == null) {
                return akwv.a;
            }
            return new Type[]{this.b};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public final int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.b != null) {
                stringBuilder = new StringBuilder("? super ");
                type = this.b;
            } else if (this.a == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder("? extends ");
                type = this.a;
            }
            stringBuilder.append(akwv.b(type));
            return stringBuilder.toString();
        }
    }

    static akhw a(akhw akhw) {
        akku akkd = new akkd();
        akhw.d().a(akkd);
        return akhw.a(akhw.a(), akhw.b(), akkd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0073 in {3, 9, 11, 15, 19, 22, 24} preds:[]
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
    public static java.lang.Class<?> a(java.lang.reflect.Type r3) {
        /*
        r0 = "type == null";
        defpackage.akwv.a(r3, r0);
        r0 = r3 instanceof java.lang.Class;
        if (r0 == 0) goto L_0x000c;
        r3 = (java.lang.Class) r3;
        return r3;
        r0 = r3 instanceof java.lang.reflect.ParameterizedType;
        if (r0 == 0) goto L_0x0023;
        r3 = (java.lang.reflect.ParameterizedType) r3;
        r3 = r3.getRawType();
        r0 = r3 instanceof java.lang.Class;
        if (r0 == 0) goto L_0x001d;
        r3 = (java.lang.Class) r3;
        return r3;
        r3 = new java.lang.IllegalArgumentException;
        r3.<init>();
        throw r3;
        r0 = r3 instanceof java.lang.reflect.GenericArrayType;
        r1 = 0;
        if (r0 == 0) goto L_0x003b;
        r3 = (java.lang.reflect.GenericArrayType) r3;
        r3 = r3.getGenericComponentType();
        r3 = defpackage.akwv.a(r3);
        r3 = java.lang.reflect.Array.newInstance(r3, r1);
        r3 = r3.getClass();
        return r3;
        r0 = r3 instanceof java.lang.reflect.TypeVariable;
        if (r0 == 0) goto L_0x0042;
        r3 = java.lang.Object.class;
        return r3;
        r0 = r3 instanceof java.lang.reflect.WildcardType;
        if (r0 == 0) goto L_0x004f;
        r3 = (java.lang.reflect.WildcardType) r3;
        r3 = r3.getUpperBounds();
        r3 = r3[r1];
        goto L_0x0000;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
        r1.<init>(r2);
        r1.append(r3);
        r2 = "> is of type ";
        r1.append(r2);
        r3 = r3.getClass();
        r3 = r3.getName();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwv.a(java.lang.reflect.Type):java.lang.Class");
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static Type a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder stringBuilder = new StringBuilder("Index ");
            stringBuilder.append(i);
            stringBuilder.append(" not in range [0,");
            stringBuilder.append(actualTypeArguments.length);
            stringBuilder.append(") for ");
            stringBuilder.append(parameterizedType);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return akwv.a(type, (Class) cls, akwv.b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:76:0x0101 in {4, 5, 14, 15, 17, 18, 20, 21, 28, 30, 35, 37, 42, 43, 49, 50, 51, 54, 55, 63, 72, 73, 75} preds:[]
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
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        r0 = r10 instanceof java.lang.reflect.TypeVariable;
        r1 = 0;
        if (r0 == 0) goto L_0x0044;
        r10 = (java.lang.reflect.TypeVariable) r10;
        r0 = r10.getGenericDeclaration();
        r2 = r0 instanceof java.lang.Class;
        if (r2 == 0) goto L_0x0012;
        r0 = (java.lang.Class) r0;
        goto L_0x0013;
        r0 = 0;
        if (r0 == 0) goto L_0x003e;
        r2 = defpackage.akwv.b(r8, r9, r0);
        r3 = r2 instanceof java.lang.reflect.ParameterizedType;
        if (r3 == 0) goto L_0x003e;
        r0 = r0.getTypeParameters();
        r3 = r0.length;
        if (r1 >= r3) goto L_0x0038;
        r3 = r0[r1];
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0035;
        r2 = (java.lang.reflect.ParameterizedType) r2;
        r0 = r2.getActualTypeArguments();
        r0 = r0[r1];
        goto L_0x003f;
        r1 = r1 + 1;
        goto L_0x0021;
        r8 = new java.util.NoSuchElementException;
        r8.<init>();
        throw r8;
        r0 = r10;
        if (r0 != r10) goto L_0x0042;
        return r0;
        r10 = r0;
        goto L_0x0000;
        r0 = r10 instanceof java.lang.Class;
        if (r0 == 0) goto L_0x0062;
        r0 = r10;
        r0 = (java.lang.Class) r0;
        r2 = r0.isArray();
        if (r2 == 0) goto L_0x0062;
        r10 = r0.getComponentType();
        r8 = defpackage.akwv.a(r8, r9, r10);
        if (r10 != r8) goto L_0x005c;
        return r0;
        r9 = new akwv$a;
        r9.<init>(r8);
        return r9;
        r0 = r10 instanceof java.lang.reflect.GenericArrayType;
        if (r0 == 0) goto L_0x0079;
        r10 = (java.lang.reflect.GenericArrayType) r10;
        r0 = r10.getGenericComponentType();
        r8 = defpackage.akwv.a(r8, r9, r0);
        if (r0 != r8) goto L_0x0073;
        return r10;
        r9 = new akwv$a;
        r9.<init>(r8);
        return r9;
        r0 = r10 instanceof java.lang.reflect.ParameterizedType;
        r2 = 1;
        if (r0 == 0) goto L_0x00ba;
        r10 = (java.lang.reflect.ParameterizedType) r10;
        r0 = r10.getOwnerType();
        r3 = defpackage.akwv.a(r8, r9, r0);
        if (r3 == r0) goto L_0x008c;
        r0 = 1;
        goto L_0x008d;
        r0 = 0;
        r4 = r10.getActualTypeArguments();
        r5 = r4.length;
        if (r1 >= r5) goto L_0x00ad;
        r6 = r4[r1];
        r6 = defpackage.akwv.a(r8, r9, r6);
        r7 = r4[r1];
        if (r6 == r7) goto L_0x00aa;
        if (r0 != 0) goto L_0x00a8;
        r0 = r4.clone();
        r4 = r0;
        r4 = (java.lang.reflect.Type[]) r4;
        r0 = 1;
        r4[r1] = r6;
        r1 = r1 + 1;
        goto L_0x0092;
        if (r0 == 0) goto L_0x00b9;
        r8 = new akwv$b;
        r9 = r10.getRawType();
        r8.<init>(r3, r9, r4);
        return r8;
        return r10;
        r0 = r10 instanceof java.lang.reflect.WildcardType;
        if (r0 == 0) goto L_0x00fe;
        r10 = (java.lang.reflect.WildcardType) r10;
        r0 = r10.getLowerBounds();
        r3 = r10.getUpperBounds();
        r4 = r0.length;
        if (r4 != r2) goto L_0x00e5;
        r3 = r0[r1];
        r8 = defpackage.akwv.a(r8, r9, r3);
        r9 = r0[r1];
        if (r8 == r9) goto L_0x00fe;
        r9 = new akwv$c;
        r10 = new java.lang.reflect.Type[r2];
        r0 = java.lang.Object.class;
        r10[r1] = r0;
        r0 = new java.lang.reflect.Type[r2];
        r0[r1] = r8;
        r9.<init>(r10, r0);
        return r9;
        r0 = r3.length;
        if (r0 != r2) goto L_0x00fe;
        r0 = r3[r1];
        r8 = defpackage.akwv.a(r8, r9, r0);	 Catch:{ Throwable -> 0x00ff }
        r9 = r3[r1];
        if (r8 == r9) goto L_0x00fe;
        r9 = new akwv$c;
        r10 = new java.lang.reflect.Type[r2];
        r10[r1] = r8;
        r8 = a;
        r9.<init>(r10, r8);
        return r9;
        return r10;
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwv.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    static <T> void a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    static boolean a(Type type, Type type2) {
        Object type3;
        Object type22;
        while (type3 != type22) {
            if (type3 instanceof Class) {
                return type3.equals(type22);
            }
            if (type3 instanceof ParameterizedType) {
                if (!(type22 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type3;
                ParameterizedType parameterizedType2 = (ParameterizedType) type22;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                Object obj = (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) ? 1 : null;
                return obj != null && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            } else if (type3 instanceof GenericArrayType) {
                if (!(type22 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) type22;
                type3 = ((GenericArrayType) type3).getGenericComponentType();
                type22 = genericArrayType.getGenericComponentType();
            } else if (type3 instanceof WildcardType) {
                if (!(type22 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type3;
                WildcardType wildcardType2 = (WildcardType) type22;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            } else if (!(type3 instanceof TypeVariable) || !(type22 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type3;
                TypeVariable typeVariable2 = (TypeVariable) type22;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        Class cls3;
        while (cls2 != cls3) {
            Type type2;
            Class cls4;
            if (cls2.isInterface()) {
                Class[] interfaces = cls3.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls2) {
                        return cls3.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(interfaces[i])) {
                        type2 = cls3.getGenericInterfaces()[i];
                        cls4 = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls3.isInterface()) {
                while (cls3 != Object.class) {
                    cls4 = cls3.getSuperclass();
                    if (cls4 == cls2) {
                        return cls3.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(cls4)) {
                        type2 = cls3.getGenericSuperclass();
                        Type type3 = type2;
                        cls3 = cls4;
                        type = type3;
                    } else {
                        cls3 = cls4;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0060 in {2, 9, 10, 11, 14, 17, 20, 22, 23, 25} preds:[]
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
    static boolean d(java.lang.reflect.Type r5) {
        /*
        r0 = r5 instanceof java.lang.Class;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
        return r1;
        r0 = r5 instanceof java.lang.reflect.ParameterizedType;
        r2 = 1;
        if (r0 == 0) goto L_0x0022;
        r5 = (java.lang.reflect.ParameterizedType) r5;
        r5 = r5.getActualTypeArguments();
        r0 = r5.length;
        r3 = 0;
        if (r3 >= r0) goto L_0x0021;
        r4 = r5[r3];
        r4 = defpackage.akwv.d(r4);
        if (r4 == 0) goto L_0x001e;
        return r2;
        r3 = r3 + 1;
        goto L_0x0013;
        return r1;
        r0 = r5 instanceof java.lang.reflect.GenericArrayType;
        if (r0 == 0) goto L_0x002d;
        r5 = (java.lang.reflect.GenericArrayType) r5;
        r5 = r5.getGenericComponentType();
        goto L_0x0000;
        r0 = r5 instanceof java.lang.reflect.TypeVariable;
        if (r0 == 0) goto L_0x0032;
        return r2;
        r0 = r5 instanceof java.lang.reflect.WildcardType;
        if (r0 == 0) goto L_0x0037;
        return r2;
        if (r5 != 0) goto L_0x003c;
        r0 = "null";
        goto L_0x0044;
        r0 = r5.getClass();
        r0 = r0.getName();
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
        r2.<init>(r3);
        r2.append(r5);
        r5 = "> is of type ";
        r2.append(r5);
        r2.append(r0);
        r5 = r2.toString();
        r1.<init>(r5);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwv.d(java.lang.reflect.Type):boolean");
    }

    static Type e(Type type) {
        if (type instanceof ParameterizedType) {
            return akwv.a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
