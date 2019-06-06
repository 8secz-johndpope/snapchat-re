package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public static final class Adapter<T> extends TypeAdapter<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0049 in {3, 13, 14, 16, 18, 21, 24} preds:[]
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
        public final T read(com.google.gson.stream.JsonReader r4) {
            /*
            r3 = this;
            r0 = r4.peek();
            r1 = com.google.gson.stream.JsonToken.NULL;
            if (r0 != r1) goto L_0x000d;
            r4.nextNull();
            r4 = 0;
            return r4;
            r0 = r3.constructor;
            r0 = r0.construct();
            r4.beginObject();	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r1 = r4.hasNext();	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            if (r1 == 0) goto L_0x0037;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r1 = r4.nextName();	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r2 = r3.boundFields;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r1 = r2.get(r1);	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            if (r1 == 0) goto L_0x0033;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r2 = r1.deserialized;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            if (r2 != 0) goto L_0x002f;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            goto L_0x0033;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r1.read(r4, r0);	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            goto L_0x0016;	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            r4.skipValue();	 Catch:{ IllegalStateException -> 0x0042, IllegalAccessException -> 0x003b }
            goto L_0x0016;
            r4.endObject();
            return r0;
            r4 = move-exception;
            r0 = new java.lang.AssertionError;
            r0.<init>(r4);
            throw r0;
            r4 = move-exception;
            r0 = new com.google.gson.JsonSyntaxException;
            r0.<init>(r4);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0039 in {2, 11, 13, 16} preds:[]
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
        public final void write(com.google.gson.stream.JsonWriter r4, T r5) {
            /*
            r3 = this;
            if (r5 != 0) goto L_0x0006;
            r4.nullValue();
            return;
            r4.beginObject();
            r0 = r3.boundFields;	 Catch:{ IllegalAccessException -> 0x0032 }
            r0 = r0.values();	 Catch:{ IllegalAccessException -> 0x0032 }
            r0 = r0.iterator();	 Catch:{ IllegalAccessException -> 0x0032 }
            r1 = r0.hasNext();	 Catch:{ IllegalAccessException -> 0x0032 }
            if (r1 == 0) goto L_0x002e;	 Catch:{ IllegalAccessException -> 0x0032 }
            r1 = r0.next();	 Catch:{ IllegalAccessException -> 0x0032 }
            r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1;	 Catch:{ IllegalAccessException -> 0x0032 }
            r2 = r1.writeField(r5);	 Catch:{ IllegalAccessException -> 0x0032 }
            if (r2 == 0) goto L_0x0013;	 Catch:{ IllegalAccessException -> 0x0032 }
            r2 = r1.name;	 Catch:{ IllegalAccessException -> 0x0032 }
            r4.name(r2);	 Catch:{ IllegalAccessException -> 0x0032 }
            r1.write(r4, r5);	 Catch:{ IllegalAccessException -> 0x0032 }
            goto L_0x0013;
            r4.endObject();
            return;
            r4 = move-exception;
            r5 = new java.lang.AssertionError;
            r5.<init>(r4);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
        }
    }

    static abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        protected BoundField(String str, boolean z, boolean z2) {
            this.name = str;
            this.serialized = z;
            this.deserialized = z2;
        }

        public abstract void read(JsonReader jsonReader, Object obj);

        public abstract void write(JsonWriter jsonWriter, Object obj);

        public abstract boolean writeField(Object obj);
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private BoundField createBoundField(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        Gson gson2 = gson;
        TypeToken typeToken2 = typeToken;
        final boolean isPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken2, jsonAdapter) : null;
        final boolean z3 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken2);
        }
        final TypeAdapter typeAdapter2 = typeAdapter;
        field2 = field;
        gson2 = gson;
        final TypeToken<?> typeToken3 = typeToken;
        return new BoundField(str, z, z2) {
            /* Access modifiers changed, original: 0000 */
            public void read(JsonReader jsonReader, Object obj) {
                Object read = typeAdapter2.read(jsonReader);
                if (read != null || !isPrimitive) {
                    field2.set(obj, read);
                }
            }

            /* Access modifiers changed, original: 0000 */
            public void write(JsonWriter jsonWriter, Object obj) {
                (z3 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper(gson2, typeAdapter2, typeToken3.getType())).write(jsonWriter, field2.get(obj));
            }

            public boolean writeField(Object obj) {
                return this.serialized && field2.get(obj) != obj;
            }
        };
    }

    static boolean excludeField(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    private Map<String, BoundField> getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken typeToken2 = typeToken;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean excludeField = excludeField(field, true);
                boolean excludeField2 = excludeField(field, z);
                if (excludeField || excludeField2) {
                    BoundField boundField;
                    field.setAccessible(true);
                    Type resolve = C$Gson$Types.resolve(typeToken2.getType(), cls2, field.getGenericType());
                    List fieldNames = getFieldNames(field);
                    BoundField boundField2 = null;
                    int i2 = 0;
                    while (i2 < fieldNames.size()) {
                        String str = (String) fieldNames.get(i2);
                        boolean z2 = i2 != 0 ? false : excludeField;
                        String str2 = str;
                        boundField = boundField2;
                        int i3 = i2;
                        List list = fieldNames;
                        Field field2 = field;
                        boundField2 = boundField == null ? (BoundField) linkedHashMap.put(str2, createBoundField(gson, field, str2, TypeToken.get(resolve), z2, excludeField2)) : boundField;
                        i2 = i3 + 1;
                        excludeField = z2;
                        fieldNames = list;
                        field = field2;
                    }
                    boundField = boundField2;
                    if (boundField != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(type);
                        stringBuilder.append(" declares multiple JSON fields named ");
                        stringBuilder.append(boundField.name);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.translateName(field));
        }
        String value = serializedName.value();
        String[] alternate = serializedName.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (Object add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class rawType = typeToken.getRawType();
        return !Object.class.isAssignableFrom(rawType) ? null : new Adapter(this.constructorConstructor.get(typeToken), getBoundFields(gson, typeToken, rawType));
    }

    public final boolean excludeField(Field field, boolean z) {
        return excludeField(field, z, this.excluder);
    }
}
