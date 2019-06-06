package com.looksery.sdk.io;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.looksery.sdk.LSNativeLibraryLoader;
import com.looksery.sdk.LensResource;
import com.looksery.sdk.io.HierarchicalResourceResolver.NodeType;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class LensCoreResources {
    private static final Map<String, CopyOnWriteArrayList<ResolverContainer>> CHAINS = new HashMap();
    private static final int CONTENT_LENGTH_INDEX = 2;
    private static final boolean DEBUG = false;
    private static final int FD_INDEX = 0;
    private static final ResolverOperation<String[]> LIST_CHILD_NODES_OPERATION = new ResolverOperation<String[]>() {
        public String[] apply(ResourceResolver resourceResolver, Uri uri) {
            if (resourceResolver instanceof HierarchicalResourceResolver) {
                return ((HierarchicalResourceResolver) resourceResolver).childNamesForNode(uri);
            }
            StringBuilder stringBuilder = new StringBuilder("Resolver ");
            stringBuilder.append(resourceResolver);
            stringBuilder.append(" doesn't support tree operations");
            throw new IOException(stringBuilder.toString());
        }
    };
    private static final ResolverOperation<NodeType> NODE_TYPE_OPERATION = new ResolverOperation<NodeType>() {
        public NodeType apply(ResourceResolver resourceResolver, Uri uri) {
            if (resourceResolver instanceof HierarchicalResourceResolver) {
                return ((HierarchicalResourceResolver) resourceResolver).nodeType(uri);
            }
            StringBuilder stringBuilder = new StringBuilder("Resolver ");
            stringBuilder.append(resourceResolver);
            stringBuilder.append(" doesn't support tree operations");
            throw new IOException(stringBuilder.toString());
        }
    };
    private static final ResolverOperation<AssetFileDescriptor> OPEN_FD_OPERATION = new ResolverOperation<AssetFileDescriptor>() {
        public AssetFileDescriptor apply(ResourceResolver resourceResolver, Uri uri) {
            return resourceResolver.openResourceFd(uri);
        }
    };
    private static final ResolverOperation<InputStream> OPEN_OPERATION = new ResolverOperation<InputStream>() {
        public InputStream apply(ResourceResolver resourceResolver, Uri uri) {
            return resourceResolver.openResource(uri);
        }
    };
    private static final ResourceResolver RESOLVER_IMPL = new ResourceResolver() {
        public InputStream openResource(Uri uri) {
            return LensCoreResources.openResourceImpl(uri);
        }

        public AssetFileDescriptor openResourceFd(Uri uri) {
            return LensCoreResources.openResourceFdImpl(uri);
        }
    };
    private static final int RESOURCE_TYPE_DIRECTORY = NodeType.Directory.ordinal();
    private static final int RESOURCE_TYPE_REGULAR_FILE = NodeType.RegularFile.ordinal();
    private static final int RESOURCE_TYPE_UNKNOWN = -1;
    private static final int RESULT_VECTOR_ELEMENT_COUNT = 3;
    private static final int START_POSITION_INDEX = 1;
    private static final String TAG = "LensCoreResources";
    private static volatile DefaultResourceResolver defaultResourceResolver;
    private static volatile boolean isInitialized = false;
    private static volatile boolean tryHookPosixIo = true;

    interface ResolverOperation<T> {
        T apply(ResourceResolver resourceResolver, Uri uri);
    }

    public enum Chaining {
        HEAD,
        TAIL
    }

    static class ResolverContainer {
        final ResourceResolver resolver;

        private ResolverContainer(ResourceResolver resourceResolver) {
            this.resolver = resourceResolver;
        }

        /* synthetic */ ResolverContainer(ResourceResolver resourceResolver, AnonymousClass1 anonymousClass1) {
            this(resourceResolver);
        }
    }

    /* renamed from: com.looksery.sdk.io.LensCoreResources$7 */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$looksery$sdk$io$LensCoreResources$Chaining = new int[Chaining.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.looksery.sdk.io.LensCoreResources.Chaining.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$looksery$sdk$io$LensCoreResources$Chaining = r0;
            r0 = $SwitchMap$com$looksery$sdk$io$LensCoreResources$Chaining;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.looksery.sdk.io.LensCoreResources.Chaining.HEAD;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$looksery$sdk$io$LensCoreResources$Chaining;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.looksery.sdk.io.LensCoreResources.Chaining.TAIL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources$AnonymousClass7.<clinit>():void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0061 in {8, 10, 12, 14} preds:[]
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
    private static <R> R applyOperationToResolverChain(android.net.Uri r4, com.looksery.sdk.io.LensCoreResources.ResolverOperation<R> r5) {
        /*
        r0 = r4.getScheme();
        r0 = getChain(r0);
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x0044;
        r1 = 0;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0028;
        r1 = r0.next();
        r1 = (com.looksery.sdk.io.LensCoreResources.ResolverContainer) r1;
        r1 = r1.resolver;	 Catch:{ IOException -> 0x0026 }
        r4 = r5.apply(r1, r4);	 Catch:{ IOException -> 0x0026 }
        return r4;
        r1 = move-exception;
        goto L_0x0013;
        r0 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r3 = "Failed to apply operation ";
        r2.<init>(r3);
        r2.append(r5);
        r5 = " to ";
        r2.append(r5);
        r2.append(r4);
        r4 = r2.toString();
        r0.<init>(r4, r1);
        throw r0;
        r5 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r1 = "Empty chain for \"";
        r0.<init>(r1);
        r4 = r4.getScheme();
        r0.append(r4);
        r4 = "\"";
        r0.append(r4);
        r4 = r0.toString();
        r5.<init>(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources.applyOperationToResolverChain(android.net.Uri, com.looksery.sdk.io.LensCoreResources$ResolverOperation):java.lang.Object");
    }

    public static Closeable chainResolverForScheme(String str, ResourceResolver resourceResolver, Chaining chaining) {
        final CopyOnWriteArrayList chain = getChain(str);
        final ResolverContainer resolverContainer = new ResolverContainer(resourceResolver, null);
        synchronized (chain) {
            int i = AnonymousClass7.$SwitchMap$com$looksery$sdk$io$LensCoreResources$Chaining[chaining.ordinal()];
            if (i == 1) {
                chain.add(0, resolverContainer);
            } else if (i == 2) {
                chain.add(resolverContainer);
            }
        }
        return new Closeable() {
            public void close() {
                synchronized (chain) {
                    chain.remove(resolverContainer);
                }
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A:{SKIP, Catch:{ IOException -> 0x0065 }} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A:{SKIP, Catch:{ IOException -> 0x0065 }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    private static int describeResourceForNative(java.lang.String r6) {
        /*
        r6 = android.net.Uri.parse(r6);
        r0 = -1;
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0065 }
        r1.<init>();	 Catch:{ IOException -> 0x0065 }
        r2 = r6.getScheme();	 Catch:{ IOException -> 0x0065 }
        r1.append(r2);	 Catch:{ IOException -> 0x0065 }
        r2 = 58;
        r1.append(r2);	 Catch:{ IOException -> 0x0065 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0065 }
        r2 = r1.hashCode();	 Catch:{ IOException -> 0x0065 }
        r3 = -1408208054; // 0xffffffffac10734a float:-2.052763E-12 double:NaN;
        r4 = 2;
        r5 = 1;
        if (r2 == r3) goto L_0x0044;
    L_0x0025:
        r3 = 3496858; // 0x355b9a float:4.900142E-39 double:1.7276774E-317;
        if (r2 == r3) goto L_0x003a;
    L_0x002a:
        r3 = 97434174; // 0x5ceba3e float:1.9440561E-35 double:4.8138878E-316;
        if (r2 == r3) goto L_0x0030;
    L_0x002f:
        goto L_0x004e;
    L_0x0030:
        r2 = "file:";
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x0065 }
        if (r1 == 0) goto L_0x004e;
    L_0x0038:
        r1 = 0;
        goto L_0x004f;
    L_0x003a:
        r2 = "res:";
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x0065 }
        if (r1 == 0) goto L_0x004e;
    L_0x0042:
        r1 = 2;
        goto L_0x004f;
    L_0x0044:
        r2 = "asset:";
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x0065 }
        if (r1 == 0) goto L_0x004e;
    L_0x004c:
        r1 = 1;
        goto L_0x004f;
    L_0x004e:
        r1 = -1;
    L_0x004f:
        if (r1 == 0) goto L_0x005e;
    L_0x0051:
        if (r1 == r5) goto L_0x005e;
    L_0x0053:
        if (r1 == r4) goto L_0x005e;
    L_0x0055:
        r1 = NODE_TYPE_OPERATION;	 Catch:{ IOException -> 0x0065 }
        r6 = applyOperationToResolverChain(r6, r1);	 Catch:{ IOException -> 0x0065 }
        r6 = (com.looksery.sdk.io.HierarchicalResourceResolver.NodeType) r6;	 Catch:{ IOException -> 0x0065 }
        goto L_0x0066;
    L_0x005e:
        r1 = defaultResourceResolver;	 Catch:{ IOException -> 0x0065 }
        r6 = r1.nodeType(r6);	 Catch:{ IOException -> 0x0065 }
        goto L_0x0066;
    L_0x0065:
        r6 = 0;
    L_0x0066:
        if (r6 == 0) goto L_0x006d;
    L_0x0068:
        r6 = r6.ordinal();
        return r6;
    L_0x006d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources.describeResourceForNative(java.lang.String):int");
    }

    private static int[] detachDescriptor(AssetFileDescriptor assetFileDescriptor) {
        int[] iArr = new int[3];
        iArr[0] = assetFileDescriptor.getParcelFileDescriptor().detachFd();
        long startOffset = assetFileDescriptor.getStartOffset();
        long declaredLength = assetFileDescriptor.getDeclaredLength();
        try {
            assetFileDescriptor.close();
        } catch (IOException unused) {
        }
        if (startOffset < 0 || startOffset > 2147483647L || declaredLength > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder("offset and/or length values exceed supported range: offset: ");
            stringBuilder.append(startOffset);
            stringBuilder.append(", length: ");
            stringBuilder.append(declaredLength);
            throw new RuntimeException(stringBuilder.toString());
        } else if (declaredLength != -1 || startOffset == 0) {
            iArr[1] = (int) startOffset;
            iArr[2] = declaredLength == -1 ? -1 : (int) declaredLength;
            return iArr;
        } else {
            throw new RuntimeException("UNKNOWN_LENGTH requires offset to be 0L");
        }
    }

    private static CopyOnWriteArrayList<ResolverContainer> getChain(String str) {
        CopyOnWriteArrayList<ResolverContainer> copyOnWriteArrayList;
        synchronized (CHAINS) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) CHAINS.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                CHAINS.put(str, copyOnWriteArrayList);
            }
        }
        return copyOnWriteArrayList;
    }

    private static String[] getChildNodeNamesForNative(String str) {
        Uri parse = Uri.parse(str);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(parse.getScheme());
            stringBuilder.append(':');
            String stringBuilder2 = stringBuilder.toString();
            int i = -1;
            int hashCode = stringBuilder2.hashCode();
            if (hashCode != -1408208054) {
                if (hashCode != 3496858) {
                    if (hashCode == 97434174) {
                        if (stringBuilder2.equals("file:")) {
                            i = 0;
                        }
                    }
                } else if (stringBuilder2.equals(LensResource.SOURCE_ANDROID_RESOURCE)) {
                    i = 2;
                }
            } else if (stringBuilder2.equals("asset:")) {
                i = 1;
            }
            return (i == 0 || i == 1 || i == 2) ? defaultResourceResolver.childNamesForNode(parse) : (String[]) applyOperationToResolverChain(parse, LIST_CHILD_NODES_OPERATION);
        } catch (IOException unused) {
            return null;
        }
    }

    public static ResourceResolver getResolver() {
        return RESOLVER_IMPL;
    }

    public static synchronized void initializeOnce(Context context) {
        synchronized (LensCoreResources.class) {
            if (isInitialized) {
                return;
            }
            defaultResourceResolver = new DefaultResourceResolver(context.getAssets(), context.getResources());
            CompressedLensResolver compressedLensResolver = new CompressedLensResolver();
            chainResolverForScheme(compressedLensResolver.getScheme(), compressedLensResolver, Chaining.HEAD);
            nativeEnableNativeOpenResourceDelegate();
            if (tryHookPosixIo) {
                try {
                    nativeHookPosixIo(LSNativeLibraryLoader.resolveLibrariesPathnames(context));
                } catch (Exception e) {
                    Log.e(TAG, "initializeOnce: ", e);
                }
            }
            isInitialized = true;
        }
    }

    private static native void nativeEnableNativeOpenResourceDelegate();

    private static native void nativeHookPosixIo(String[] strArr);

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:8:?, code skipped:
            return r0;
     */
    private static java.lang.Object openForNative(java.lang.String r0) {
        /*
        r0 = android.net.Uri.parse(r0);
        r0 = openForNativeAsFd(r0);	 Catch:{ IOException -> 0x0009 }
        goto L_0x000f;
    L_0x0009:
        r0 = openForNativeAsInputStream(r0);	 Catch:{ IOException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources.openForNative(java.lang.String):java.lang.Object");
    }

    private static int[] openForNativeAsFd(Uri uri) {
        return detachDescriptor(openResourceFdImpl(uri));
    }

    private static InputStream openForNativeAsInputStream(Uri uri) {
        InputStream openResourceImpl = openResourceImpl(uri);
        if (openResourceImpl.markSupported()) {
            return openResourceImpl;
        }
        throw new IllegalStateException("Provided stream must be rewindable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A:{SKIP} */
    private static android.content.res.AssetFileDescriptor openResourceFdImpl(android.net.Uri r5) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r5.getScheme();
        r0.append(r1);
        r1 = 58;
        r0.append(r1);
        r0 = r0.toString();
        r1 = r0.hashCode();
        r2 = -1408208054; // 0xffffffffac10734a float:-2.052763E-12 double:NaN;
        r3 = 2;
        r4 = 1;
        if (r1 == r2) goto L_0x003f;
    L_0x0020:
        r2 = 3496858; // 0x355b9a float:4.900142E-39 double:1.7276774E-317;
        if (r1 == r2) goto L_0x0035;
    L_0x0025:
        r2 = 97434174; // 0x5ceba3e float:1.9440561E-35 double:4.8138878E-316;
        if (r1 == r2) goto L_0x002b;
    L_0x002a:
        goto L_0x0049;
    L_0x002b:
        r1 = "file:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0033:
        r0 = 0;
        goto L_0x004a;
    L_0x0035:
        r1 = "res:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x003d:
        r0 = 2;
        goto L_0x004a;
    L_0x003f:
        r1 = "asset:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0047:
        r0 = 1;
        goto L_0x004a;
    L_0x0049:
        r0 = -1;
    L_0x004a:
        if (r0 == 0) goto L_0x0059;
    L_0x004c:
        if (r0 == r4) goto L_0x0059;
    L_0x004e:
        if (r0 == r3) goto L_0x0059;
    L_0x0050:
        r0 = OPEN_FD_OPERATION;
        r5 = applyOperationToResolverChain(r5, r0);
        r5 = (android.content.res.AssetFileDescriptor) r5;
        return r5;
    L_0x0059:
        r0 = defaultResourceResolver;
        r5 = r0.openResourceFd(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources.openResourceFdImpl(android.net.Uri):android.content.res.AssetFileDescriptor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A:{SKIP} */
    private static java.io.InputStream openResourceImpl(android.net.Uri r5) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r5.getScheme();
        r0.append(r1);
        r1 = 58;
        r0.append(r1);
        r0 = r0.toString();
        r1 = r0.hashCode();
        r2 = -1408208054; // 0xffffffffac10734a float:-2.052763E-12 double:NaN;
        r3 = 2;
        r4 = 1;
        if (r1 == r2) goto L_0x003f;
    L_0x0020:
        r2 = 3496858; // 0x355b9a float:4.900142E-39 double:1.7276774E-317;
        if (r1 == r2) goto L_0x0035;
    L_0x0025:
        r2 = 97434174; // 0x5ceba3e float:1.9440561E-35 double:4.8138878E-316;
        if (r1 == r2) goto L_0x002b;
    L_0x002a:
        goto L_0x0049;
    L_0x002b:
        r1 = "file:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0033:
        r0 = 0;
        goto L_0x004a;
    L_0x0035:
        r1 = "res:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x003d:
        r0 = 2;
        goto L_0x004a;
    L_0x003f:
        r1 = "asset:";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0047:
        r0 = 1;
        goto L_0x004a;
    L_0x0049:
        r0 = -1;
    L_0x004a:
        if (r0 == 0) goto L_0x0059;
    L_0x004c:
        if (r0 == r4) goto L_0x0059;
    L_0x004e:
        if (r0 == r3) goto L_0x0059;
    L_0x0050:
        r0 = OPEN_OPERATION;
        r5 = applyOperationToResolverChain(r5, r0);
        r5 = (java.io.InputStream) r5;
        return r5;
    L_0x0059:
        r0 = defaultResourceResolver;
        r5 = r0.openResource(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.io.LensCoreResources.openResourceImpl(android.net.Uri):java.io.InputStream");
    }

    public static void registerResolverForScheme(String str, ResourceResolver resourceResolver) {
        chainResolverForScheme(str, resourceResolver, Chaining.HEAD);
    }

    public static void setPosixIoHookEnabled(boolean z) {
        tryHookPosixIo = z;
    }

    public static void unregisterResolverForScheme(String str) {
        getChain(str).clear();
    }
}
