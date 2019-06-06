package com.google.gson.internal;

import defpackage.ppy;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types */
public final class C$Gson$Types {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                Object obj = (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) ? 1 : null;
                if (type == null && obj == null) {
                    z = false;
                }
                C$Gson$Preconditions.checkArgument(z);
            }
            this.ownerType = type == null ? null : C$Gson$Types.canonicalize(type);
            this.rawType = C$Gson$Types.canonicalize(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            while (true) {
                Type[] typeArr2 = this.typeArguments;
                if (i < typeArr2.length) {
                    C$Gson$Preconditions.checkNotNull(typeArr2[i]);
                    C$Gson$Types.checkNotPrimitive(this.typeArguments[i]);
                    typeArr2 = this.typeArguments;
                    typeArr2[i] = C$Gson$Types.canonicalize(typeArr2[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.equals(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public final Type getOwnerType() {
            return this.ownerType;
        }

        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C$Gson$Types.hashCodeOrZero(this.ownerType);
        }

        public final String toString() {
            int i = 1;
            StringBuilder stringBuilder = new StringBuilder((this.typeArguments.length + 1) * 30);
            stringBuilder.append(C$Gson$Types.typeToString(this.rawType));
            if (this.typeArguments.length == 0) {
                return stringBuilder.toString();
            }
            stringBuilder.append("<");
            stringBuilder.append(C$Gson$Types.typeToString(this.typeArguments[0]));
            while (i < this.typeArguments.length) {
                stringBuilder.append(ppy.d);
                stringBuilder.append(C$Gson$Types.typeToString(this.typeArguments[i]));
                i++;
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    static final class WildcardTypeImpl implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Type type;
            boolean z = true;
            C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
            C$Gson$Preconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C$Gson$Preconditions.checkNotNull(typeArr2[0]);
                C$Gson$Types.checkNotPrimitive(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                C$Gson$Preconditions.checkArgument(z);
                this.lowerBound = C$Gson$Types.canonicalize(typeArr2[0]);
                type = Object.class;
            } else {
                C$Gson$Preconditions.checkNotNull(typeArr[0]);
                C$Gson$Types.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                type = C$Gson$Types.canonicalize(typeArr[0]);
            }
            this.upperBound = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.equals(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            if (this.lowerBound == null) {
                return C$Gson$Types.EMPTY_TYPE_ARRAY;
            }
            return new Type[]{this.lowerBound};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder stringBuilder;
            Type type;
            if (this.lowerBound != null) {
                stringBuilder = new StringBuilder("? super ");
                type = this.lowerBound;
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                stringBuilder = new StringBuilder("? extends ");
                type = this.upperBound;
            }
            stringBuilder.append(C$Gson$Types.typeToString(type));
            return stringBuilder.toString();
        }
    }

    static final class GenericArrayTypeImpl implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C$Gson$Types.canonicalize(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.equals(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(C$Gson$Types.typeToString(this.componentType));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    private C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new GenericArrayTypeImpl(C$Gson$Types.canonicalize(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static void checkNotPrimitive(Type type) {
        boolean z = ((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true;
        C$Gson$Preconditions.checkArgument(z);
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
    }

    static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean equals(Type type, Type type2) {
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
                return C$Gson$Types.equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        type = C$Gson$Types.getSupertype(type, cls, Collection.class);
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
    }

    static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
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

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        type = C$Gson$Types.getSupertype(type, cls, Map.class);
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x006e in {3, 7, 11, 15, 18, 20, 21, 23} preds:[]
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
    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r4) {
        /*
        r0 = r4 instanceof java.lang.Class;
        if (r0 == 0) goto L_0x0007;
        r4 = (java.lang.Class) r4;
        return r4;
        r0 = r4 instanceof java.lang.reflect.ParameterizedType;
        if (r0 == 0) goto L_0x0019;
        r4 = (java.lang.reflect.ParameterizedType) r4;
        r4 = r4.getRawType();
        r0 = r4 instanceof java.lang.Class;
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0);
        r4 = (java.lang.Class) r4;
        return r4;
        r0 = r4 instanceof java.lang.reflect.GenericArrayType;
        r1 = 0;
        if (r0 == 0) goto L_0x0031;
        r4 = (java.lang.reflect.GenericArrayType) r4;
        r4 = r4.getGenericComponentType();
        r4 = com.google.gson.internal.C$Gson$Types.getRawType(r4);
        r4 = java.lang.reflect.Array.newInstance(r4, r1);
        r4 = r4.getClass();
        return r4;
        r0 = r4 instanceof java.lang.reflect.TypeVariable;
        if (r0 == 0) goto L_0x0038;
        r4 = java.lang.Object.class;
        return r4;
        r0 = r4 instanceof java.lang.reflect.WildcardType;
        if (r0 == 0) goto L_0x0045;
        r4 = (java.lang.reflect.WildcardType) r4;
        r4 = r4.getUpperBounds();
        r4 = r4[r1];
        goto L_0x0000;
        if (r4 != 0) goto L_0x004a;
        r0 = "null";
        goto L_0x0052;
        r0 = r4.getClass();
        r0 = r0.getName();
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
        r2.<init>(r3);
        r2.append(r4);
        r4 = "> is of type ";
        r2.append(r4);
        r2.append(r0);
        r4 = r2.toString();
        r1.<init>(r4);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.getRawType(java.lang.reflect.Type):java.lang.Class");
    }

    static Type getSupertype(Type type, Class<?> cls, Class<?> cls2) {
        C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return C$Gson$Types.resolve(type, cls, C$Gson$Types.getGenericSupertype(type, cls, cls2));
    }

    static int hashCodeOrZero(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0016 in {5, 6, 8} preds:[]
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
    private static int indexOf(java.lang.Object[] r2, java.lang.Object r3) {
        /*
        r0 = 0;
        r1 = r2.length;
        if (r0 >= r1) goto L_0x0010;
        r1 = r2[r0];
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x000d;
        return r0;
        r0 = r0 + 1;
        goto L_0x0001;
        r2 = new java.util.NoSuchElementException;
        r2.<init>();
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.indexOf(java.lang.Object[], java.lang.Object):int");
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:60:0x00b8 in {4, 5, 12, 14, 19, 21, 26, 27, 33, 34, 35, 38, 39, 47, 56, 57, 59} preds:[]
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
    public static java.lang.reflect.Type resolve(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        r0 = r10 instanceof java.lang.reflect.TypeVariable;
        if (r0 == 0) goto L_0x000f;
        r10 = (java.lang.reflect.TypeVariable) r10;
        r0 = com.google.gson.internal.C$Gson$Types.resolveTypeVariable(r8, r9, r10);
        if (r0 != r10) goto L_0x000d;
        return r0;
        r10 = r0;
        goto L_0x0000;
        r0 = r10 instanceof java.lang.Class;
        if (r0 == 0) goto L_0x002c;
        r0 = r10;
        r0 = (java.lang.Class) r0;
        r1 = r0.isArray();
        if (r1 == 0) goto L_0x002c;
        r10 = r0.getComponentType();
        r8 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r10);
        if (r10 != r8) goto L_0x0027;
        return r0;
        r8 = com.google.gson.internal.C$Gson$Types.arrayOf(r8);
        return r8;
        r0 = r10 instanceof java.lang.reflect.GenericArrayType;
        if (r0 == 0) goto L_0x0042;
        r10 = (java.lang.reflect.GenericArrayType) r10;
        r0 = r10.getGenericComponentType();
        r8 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r0);
        if (r0 != r8) goto L_0x003d;
        return r10;
        r8 = com.google.gson.internal.C$Gson$Types.arrayOf(r8);
        return r8;
        r0 = r10 instanceof java.lang.reflect.ParameterizedType;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0083;
        r10 = (java.lang.reflect.ParameterizedType) r10;
        r0 = r10.getOwnerType();
        r3 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r0);
        if (r3 == r0) goto L_0x0056;
        r0 = 1;
        goto L_0x0057;
        r0 = 0;
        r4 = r10.getActualTypeArguments();
        r5 = r4.length;
        if (r2 >= r5) goto L_0x0077;
        r6 = r4[r2];
        r6 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r6);
        r7 = r4[r2];
        if (r6 == r7) goto L_0x0074;
        if (r0 != 0) goto L_0x0072;
        r0 = r4.clone();
        r4 = r0;
        r4 = (java.lang.reflect.Type[]) r4;
        r0 = 1;
        r4[r2] = r6;
        r2 = r2 + 1;
        goto L_0x005c;
        if (r0 == 0) goto L_0x0082;
        r8 = r10.getRawType();
        r8 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r3, r8, r4);
        return r8;
        return r10;
        r0 = r10 instanceof java.lang.reflect.WildcardType;
        if (r0 == 0) goto L_0x00b5;
        r10 = (java.lang.reflect.WildcardType) r10;
        r0 = r10.getLowerBounds();
        r3 = r10.getUpperBounds();
        r4 = r0.length;
        if (r4 != r1) goto L_0x00a3;
        r1 = r0[r2];
        r8 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r1);
        r9 = r0[r2];
        if (r8 == r9) goto L_0x00b5;
        r8 = com.google.gson.internal.C$Gson$Types.supertypeOf(r8);
        return r8;
        r0 = r3.length;
        if (r0 != r1) goto L_0x00b5;
        r0 = r3[r2];
        r8 = com.google.gson.internal.C$Gson$Types.resolve(r8, r9, r0);	 Catch:{ Throwable -> 0x00b6 }
        r9 = r3[r2];
        if (r8 == r9) goto L_0x00b5;
        r8 = com.google.gson.internal.C$Gson$Types.subtypeOf(r8);
        return r8;
        return r10;
        r8 = move-exception;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.resolve(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class declaringClassOf = C$Gson$Types.declaringClassOf(typeVariable);
        if (declaringClassOf == null) {
            return typeVariable;
        }
        type = C$Gson$Types.getGenericSupertype(type, cls, declaringClassOf);
        if (!(type instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) type).getActualTypeArguments()[C$Gson$Types.indexOf(declaringClassOf.getTypeParameters(), typeVariable)];
    }

    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{type});
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
