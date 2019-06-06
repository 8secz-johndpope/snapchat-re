package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: absw */
public final class absw<T> implements TypeAdapterFactory {
    private final Class<?> a;
    private final String b;
    private final Map<String, Class<?>> c = new LinkedHashMap();
    private final Map<Class<?>, String> d = new LinkedHashMap();

    private absw(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw new NullPointerException();
        }
        this.a = cls;
        this.b = str;
    }

    public static <T> absw<T> a(Class<T> cls) {
        return new absw(cls, "type");
    }

    public static <T> absw<T> a(Class<T> cls, String str) {
        return new absw(cls, str);
    }

    public final absw<T> b(Class<? extends T> cls) {
        return b(cls, cls.getSimpleName());
    }

    public final absw<T> b(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw new NullPointerException();
        } else if (this.d.containsKey(cls) || this.c.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.c.put(str, cls);
            this.d.put(cls, str);
            return this;
        }
    }

    public final <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken == null || !this.a.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Entry entry : this.c.entrySet()) {
            TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), delegateAdapter);
            linkedHashMap2.put(entry.getValue(), delegateAdapter);
        }
        return new TypeAdapter<R>() {
            public final R read(JsonReader jsonReader) {
                JsonElement parse = Streams.parse(jsonReader);
                JsonElement remove = parse.getAsJsonObject().remove(absw.this.b);
                String str = "cannot deserialize ";
                if (remove != null) {
                    String asString = remove.getAsString();
                    TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(asString);
                    if (typeAdapter != null) {
                        return typeAdapter.fromJsonTree(parse);
                    }
                    StringBuilder stringBuilder = new StringBuilder(str);
                    stringBuilder.append(absw.this.a);
                    stringBuilder.append(" subtype named ");
                    stringBuilder.append(asString);
                    stringBuilder.append("; did you forget to register a subtype?");
                    throw new JsonParseException(stringBuilder.toString());
                }
                StringBuilder stringBuilder2 = new StringBuilder(str);
                stringBuilder2.append(absw.this.a);
                stringBuilder2.append(" because it does not define a field named ");
                stringBuilder2.append(absw.this.b);
                throw new JsonParseException(stringBuilder2.toString());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x00aa in {7, 9, 11, 13} preds:[]
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
            public final void write(com.google.gson.stream.JsonWriter r5, R r6) {
                /*
                r4 = this;
                r0 = r6.getClass();
                r1 = defpackage.absw.this;
                r1 = r1.d;
                r1 = r1.get(r0);
                r1 = (java.lang.String) r1;
                r2 = r0;
                r2 = r2.get(r0);
                r2 = (com.google.gson.TypeAdapter) r2;
                r3 = "cannot serialize ";
                if (r2 == 0) goto L_0x008f;
                r6 = r2.toJsonTree(r6);
                r6 = r6.getAsJsonObject();
                r2 = defpackage.absw.this;
                r2 = r2.b;
                r2 = r6.has(r2);
                if (r2 != 0) goto L_0x006b;
                r0 = new com.google.gson.JsonObject;
                r0.<init>();
                r2 = defpackage.absw.this;
                r2 = r2.b;
                r3 = new com.google.gson.JsonPrimitive;
                r3.<init>(r1);
                r0.add(r2, r3);
                r6 = r6.entrySet();
                r6 = r6.iterator();
                r1 = r6.hasNext();
                if (r1 == 0) goto L_0x0067;
                r1 = r6.next();
                r1 = (java.util.Map.Entry) r1;
                r2 = r1.getKey();
                r2 = (java.lang.String) r2;
                r1 = r1.getValue();
                r1 = (com.google.gson.JsonElement) r1;
                r0.add(r2, r1);
                goto L_0x004b;
                com.google.gson.internal.Streams.write(r0, r5);
                return;
                r5 = new com.google.gson.JsonParseException;
                r6 = new java.lang.StringBuilder;
                r6.<init>(r3);
                r0 = r0.getName();
                r6.append(r0);
                r0 = " because it already defines a field named ";
                r6.append(r0);
                r0 = defpackage.absw.this;
                r0 = r0.b;
                r6.append(r0);
                r6 = r6.toString();
                r5.<init>(r6);
                throw r5;
                r5 = new com.google.gson.JsonParseException;
                r6 = new java.lang.StringBuilder;
                r6.<init>(r3);
                r0 = r0.getName();
                r6.append(r0);
                r0 = "; did you forget to register a subtype?";
                r6.append(r0);
                r6 = r6.toString();
                r5.<init>(r6);
                throw r5;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.absw$1.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
            }
        }.nullSafe();
    }
}
