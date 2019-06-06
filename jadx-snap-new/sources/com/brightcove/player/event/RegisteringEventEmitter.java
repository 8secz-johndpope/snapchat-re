package com.brightcove.player.event;

import com.brightcove.player.util.ErrorUtil;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisteringEventEmitter implements EventEmitter {
    private static String b = "events";
    boolean a = false;
    private EventEmitter c;
    private String d;
    private List<String> e;
    private List<String> f;

    public RegisteringEventEmitter(EventEmitter eventEmitter, Class<? extends Component> cls) {
        if (eventEmitter == null || cls == null) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.EVENT_EMITTER_AND_COMPONENT_REQUIRED));
        }
        this.c = eventEmitter;
        this.d = cls.getSimpleName();
        this.e = a(cls, Emits.class);
        this.f = a(cls, ListensFor.class);
        eventEmitter.on("debug", new EventListener() {
            public final void processEvent(Event event) {
                RegisteringEventEmitter.this.a = Boolean.parseBoolean(event.properties.get("debug").toString());
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0088 in {8, 10, 11, 12, 14} preds:[]
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
    private java.util.List<java.lang.String> a(java.lang.Class<? extends com.brightcove.player.event.Component> r8, java.lang.Class<? extends java.lang.annotation.Annotation> r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = new java.lang.String[r0];
        r2 = new java.util.ArrayList;
        r2.<init>();
        r8 = r7.b(r8, r9);
        r3 = r8.size();
        if (r3 <= 0) goto L_0x006f;
        r8 = r8.iterator();
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x006e;
        r3 = r8.next();
        r3 = (java.lang.annotation.Annotation) r3;
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0038 }
        r5 = b;	 Catch:{ Exception -> 0x0038 }
        r6 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0038 }
        r4 = r4.getMethod(r5, r6);	 Catch:{ Exception -> 0x0038 }
        r5 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0038 }
        r3 = r4.invoke(r3, r5);	 Catch:{ Exception -> 0x0038 }
        r3 = (java.lang.String[]) r3;	 Catch:{ Exception -> 0x0038 }
        r1 = r3;
        goto L_0x0066;
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r5 = "Error attempting to invoke ";
        r4.<init>(r5);
        r5 = b;
        r4.append(r5);
        r5 = " on annotation ";
        r4.append(r5);
        r5 = r9.getName();
        r4.append(r5);
        r5 = ": ";
        r4.append(r5);
        r3 = r3.getMessage();
        r4.append(r3);
        r3 = r4.toString();
        r4 = "Component";
        android.util.Log.e(r4, r3);
        r3 = java.util.Arrays.asList(r1);
        r2.addAll(r3);
        goto L_0x0016;
        return r2;
        r8 = "annotationRequired";
        r8 = com.brightcove.player.util.ErrorUtil.getMessage(r8);
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r9 = r9.getName();
        r1[r0] = r9;
        r8 = java.lang.String.format(r8, r1);
        r9 = new java.lang.RuntimeException;
        r9.<init>(r8);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.event.RegisteringEventEmitter.a(java.lang.Class, java.lang.Class):java.util.List");
    }

    private List<Annotation> b(Class<? extends Object> cls, Class<? extends Annotation> cls2) {
        ArrayList arrayList = new ArrayList();
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            arrayList.addAll(b(superclass, cls2));
        }
        Annotation annotation = cls.getAnnotation(cls2);
        if (annotation != null) {
            arrayList.add(annotation);
        }
        return arrayList;
    }

    public static RegisteringEventEmitter build(EventEmitter eventEmitter, Class<? extends Component> cls) {
        if (eventEmitter instanceof RegisteringEventEmitter) {
            eventEmitter = ((RegisteringEventEmitter) eventEmitter).getRootEmitter();
        }
        return new RegisteringEventEmitter(eventEmitter, cls);
    }

    public void disable() {
        this.c.disable();
    }

    public void emit(String str) {
        Map singletonMap;
        if (this.a) {
            singletonMap = Collections.singletonMap(Event.EMITTER, this.d);
        } else {
            singletonMap = Collections.emptyMap();
        }
        if (this.e.contains(str)) {
            this.c.emit(str, singletonMap);
            return;
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_EMIT), new Object[]{str}));
    }

    public void emit(String str, Map<String, Object> map) {
        if (this.e.contains(str)) {
            Map map2;
            EventEmitter eventEmitter = this.c;
            if (this.a) {
                HashMap hashMap = new HashMap(map2.size() + 1);
                hashMap.putAll(map2);
                hashMap.put(Event.EMITTER, this.d);
                map2 = hashMap;
            }
            eventEmitter.emit(str, map2);
            return;
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_EMIT), new Object[]{str}));
    }

    public void enable() {
        this.c.enable();
    }

    public List<String> getAllowedEmittedEvents() {
        return this.e;
    }

    public List<String> getAllowedListenEvents() {
        return this.f;
    }

    public EventEmitter getRootEmitter() {
        return this.c;
    }

    public void off() {
        this.c.off();
    }

    public void off(String str, int i) {
        this.c.off(str, i);
    }

    public int on(String str, EventListener eventListener) {
        if (this.f.contains(str)) {
            return this.c.on(str, eventListener);
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_LISTEN), new Object[]{str}));
    }

    public int once(String str, EventListener eventListener) {
        if (this.f.contains(str)) {
            return this.c.once(str, eventListener);
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_LISTEN), new Object[]{str}));
    }

    public void request(String str, EventListener eventListener) {
        if (this.e.contains(str)) {
            this.c.request(str, eventListener);
            return;
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_EMIT), new Object[]{str}));
    }

    public void request(String str, Map<String, Object> map, EventListener eventListener) {
        if (this.e.contains(str)) {
            this.c.request(str, map, eventListener);
            return;
        }
        throw new IllegalArgumentException(String.format(ErrorUtil.getMessage(ErrorUtil.NOT_PERMITTED_TO_EMIT), new Object[]{str}));
    }

    public void respond(Event event) {
        this.c.respond(event);
    }

    public void respond(Map<String, Object> map) {
        this.c.respond((Map) map);
    }
}
