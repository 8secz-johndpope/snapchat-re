package defpackage;

import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/* renamed from: te */
public class te {
    private static /* synthetic */ boolean a = (te.class.desiredAssertionStatus() ^ 1);

    private static tm a(tk tkVar, tm tmVar, Node node, String str, boolean z) {
        sw swVar = sv.a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String a = swVar.a(namespaceURI);
            String str2 = "_dflt";
            if (a == null) {
                a = swVar.a(namespaceURI, node.getPrefix() != null ? node.getPrefix() : str2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append(node.getLocalName());
            String stringBuilder2 = stringBuilder.toString();
            ub ubVar = new ub();
            boolean z2 = false;
            if (z) {
                tmVar = tn.a(tkVar.a, namespaceURI, str2, true);
                tmVar.f = false;
                if (swVar.c(stringBuilder2) != null) {
                    tkVar.a.g = true;
                    tmVar.g = true;
                    z2 = true;
                }
            }
            boolean a2 = te.a(stringBuilder2);
            boolean equals = "rdf:value".equals(stringBuilder2);
            tm tmVar2 = new tm(stringBuilder2, str, ubVar);
            tmVar2.h = z2;
            if (equals) {
                tmVar.b(tmVar2);
            } else {
                tmVar.a(tmVar2);
            }
            if (equals) {
                if (z || !tmVar.i().f()) {
                    throw new ss("Misplaced rdf:value element", 202);
                }
                tmVar.i = true;
            }
            boolean g = tmVar.i().g();
            if (g && a2) {
                tmVar2.a = "[]";
            } else if (!g && a2) {
                throw new ss("Misplaced rdf:li element", 202);
            } else if (g && !a2) {
                throw new ss("Arrays cannot have arbitrary child names", 202);
            }
            return tmVar2;
        }
        throw new ss("XML namespace required for all elements and attributes", 202);
    }

    private static tm a(tm tmVar, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = th.a(str2);
        }
        tm tmVar2 = new tm(str, str2, null);
        tmVar.d(tmVar2);
        return tmVar2;
    }

    private static void a() {
        throw new ss("ParseTypeLiteral property element not allowed", 203);
    }

    private static void a(tk tkVar, tm tmVar, Node node, boolean z) {
        Node item;
        tm a = te.a(tkVar, tmVar, node, null, z);
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            item = node.getAttributes().item(i2);
            String str = "xmlns";
            if (!(str.equals(item.getPrefix()) || (item.getPrefix() == null && str.equals(item.getNodeName())))) {
                String namespaceURI = item.getNamespaceURI();
                str = item.getLocalName();
                String str2 = "xml:lang";
                if (str2.equals(item.getNodeName())) {
                    te.a(a, str2, item.getNodeValue());
                } else if (!("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) && ("ID".equals(str) || "datatype".equals(str)))) {
                    throw new ss("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str3 = "";
        while (i < node.getChildNodes().getLength()) {
            item = node.getChildNodes().item(i);
            if (item.getNodeType() == (short) 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str3);
                stringBuilder.append(item.getNodeValue());
                str3 = stringBuilder.toString();
                i++;
            } else {
                throw new ss("Invalid child of literal property element", 202);
            }
        }
        a.b = str3;
    }

    static void a(tk tkVar, tm tmVar, Node node, boolean z, ua uaVar) {
        int b = te.b(node);
        if (b != 8 && b != 0) {
            throw new ss("Node element must be rdf:Description or typed node", 202);
        } else if (z && b == 0) {
            throw new ss("Top level typed node not allowed", 203);
        } else {
            int i = 0;
            for (b = 0; b < node.getAttributes().getLength(); b++) {
                Node item = node.getAttributes().item(b);
                String str = "xmlns";
                if (!(str.equals(item.getPrefix()) || (item.getPrefix() == null && str.equals(item.getNodeName())))) {
                    int b2 = te.b(item);
                    if (b2 == 0) {
                        te.a(tkVar, tmVar, item, item.getNodeValue(), z);
                    } else if (b2 != 6 && b2 != 2 && b2 != 3) {
                        throw new ss("Invalid nodeElement attribute", 202);
                    } else if (i <= 0) {
                        i++;
                        if (z && b2 == 3) {
                            if (tmVar.a == null || tmVar.a.length() <= 0) {
                                tmVar.a = item.getNodeValue();
                            } else if (!tmVar.a.equals(item.getNodeValue())) {
                                throw new ss("Mismatched top level rdf:about values", 203);
                            }
                        }
                    } else {
                        throw new ss("Mutally exclusive about, ID, nodeID attributes", 202);
                    }
                }
            }
            te.b(tkVar, tmVar, node, z, uaVar);
        }
    }

    private static void a(tm tmVar) {
        if (a || (tmVar.i().f() && tmVar.e())) {
            int i = 1;
            tm a = tmVar.a(1);
            if (!a) {
                if (!"rdf:value".equals(a.a)) {
                    throw new AssertionError();
                }
            }
            if (a.i().d()) {
                if (tmVar.i().d()) {
                    throw new ss("Redundant xml:lang for rdf:value element", 203);
                }
                tm b = a.b(1);
                a.e(b);
                tmVar.d(b);
            }
            while (i <= a.c()) {
                tmVar.d(a.b(i));
                i++;
            }
            for (i = 2; i <= tmVar.b(); i++) {
                tmVar.d(tmVar.a(i));
            }
            if (a || tmVar.i().f() || tmVar.i) {
                tmVar.i = false;
                tmVar.i().d(false);
                tmVar.i().a(a.i());
                tmVar.b = a.b;
                tmVar.d = null;
                Iterator f = a.f();
                while (f.hasNext()) {
                    tmVar.a((tm) f.next());
                }
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private static boolean a(int i) {
        return (i == 8 || te.b(i) || te.c(i)) ? false : true;
    }

    private static boolean a(String str) {
        boolean equals = "rdf:li".equals(str);
        if (!str.startsWith("rdf:_")) {
            return equals;
        }
        boolean z = true;
        for (int i = 5; i < str.length(); i++) {
            z = z && str.charAt(i) >= '0' && str.charAt(i) <= '9';
        }
        return z;
    }

    static boolean a(Node node) {
        if (node.getNodeType() != (short) 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static int b(Node node) {
        String localName = node.getLocalName();
        Object namespaceURI = node.getNamespaceURI();
        String str = "ID";
        String str2 = "about";
        String str3 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        if (namespaceURI == null && ((str2.equals(localName) || str.equals(localName)) && (node instanceof Attr) && str3.equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = str3;
        }
        if (str3.equals(namespaceURI)) {
            if ("li".equals(localName)) {
                return 9;
            }
            if ("parseType".equals(localName)) {
                return 4;
            }
            if ("Description".equals(localName)) {
                return 8;
            }
            if (str2.equals(localName)) {
                return 3;
            }
            if ("resource".equals(localName)) {
                return 5;
            }
            if ("RDF".equals(localName)) {
                return 1;
            }
            if (str.equals(localName)) {
                return 2;
            }
            if ("nodeID".equals(localName)) {
                return 6;
            }
            if ("datatype".equals(localName)) {
                return 7;
            }
            if ("aboutEach".equals(localName)) {
                return 10;
            }
            if ("aboutEachPrefix".equals(localName)) {
                return 11;
            }
            if ("bagID".equals(localName)) {
                return 12;
            }
        }
        return 0;
    }

    private static void b() {
        throw new ss("ParseTypeCollection property element not allowed", 203);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:89:0x015f in {10, 18, 20, 22, 26, 27, 29, 31, 37, 39, 42, 43, 47, 49, 52, 55, 56, 67, 73, 75, 76, 77, 79, 82, 83, 84, 85, 86, 88} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void b(defpackage.tk r16, defpackage.tm r17, org.w3c.dom.Node r18, boolean r19) {
        /*
        r0 = r16;
        r1 = r18.hasChildNodes();
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        if (r1 != 0) goto L_0x0157;
        r3 = 0;
        r7 = r3;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = 0;
        r9 = r18.getAttributes();
        r9 = r9.getLength();
        r10 = "Unrecognized attribute of empty property element";
        r11 = 6;
        r12 = 5;
        r13 = "xml:lang";
        r14 = 2;
        r15 = "xmlns";
        if (r3 >= r9) goto L_0x00b1;
        r9 = r18.getAttributes();
        r9 = r9.item(r3);
        r1 = r9.getPrefix();
        r1 = r15.equals(r1);
        if (r1 != 0) goto L_0x00ad;
        r1 = r9.getPrefix();
        if (r1 != 0) goto L_0x0046;
        r1 = r9.getNodeName();
        r1 = r15.equals(r1);
        if (r1 != 0) goto L_0x00ad;
        r1 = defpackage.te.b(r9);
        r15 = "Empty property element can't have both rdf:value and rdf:resource";
        if (r1 == 0) goto L_0x007d;
        if (r1 == r14) goto L_0x00ad;
        r13 = "Empty property element can't have both rdf:resource and rdf:nodeID";
        if (r1 == r12) goto L_0x0066;
        if (r1 != r11) goto L_0x0060;
        if (r5 != 0) goto L_0x005a;
        r8 = 1;
        goto L_0x00ad;
        r0 = new ss;
        r0.<init>(r13, r2);
        throw r0;
        r0 = new ss;
        r0.<init>(r10, r2);
        throw r0;
        if (r8 != 0) goto L_0x0077;
        if (r4 != 0) goto L_0x006f;
        if (r4 != 0) goto L_0x006d;
        r7 = r9;
        r5 = 1;
        goto L_0x00ad;
        r0 = new ss;
        r1 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r15, r1);
        throw r0;
        r0 = new ss;
        r0.<init>(r13, r2);
        throw r0;
        r1 = r9.getLocalName();
        r10 = "value";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x00a2;
        r1 = r9.getNamespaceURI();
        r10 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x00a2;
        if (r5 != 0) goto L_0x009a;
        r7 = r9;
        r4 = 1;
        goto L_0x00ad;
        r0 = new ss;
        r1 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r15, r1);
        throw r0;
        r1 = r9.getNodeName();
        r1 = r13.equals(r1);
        if (r1 != 0) goto L_0x00ad;
        r6 = 1;
        r3 = r3 + 1;
        goto L_0x0011;
        r1 = "";
        r3 = r17;
        r8 = r18;
        r9 = r19;
        r3 = defpackage.te.a(r0, r3, r8, r1, r9);
        if (r4 != 0) goto L_0x00cd;
        if (r5 == 0) goto L_0x00c2;
        goto L_0x00cd;
        if (r6 == 0) goto L_0x00df;
        r1 = r3.i();
        r5 = 1;
        r1.d(r5);
        goto L_0x00e0;
        r5 = 1;
        if (r7 == 0) goto L_0x00d4;
        r1 = r7.getNodeValue();
        r3.b = r1;
        if (r4 != 0) goto L_0x00df;
        r1 = r3.i();
        r1.a(r14, r5);
        r5 = 0;
        r1 = 0;
        r4 = r18.getAttributes();
        r4 = r4.getLength();
        if (r1 >= r4) goto L_0x0156;
        r4 = r18.getAttributes();
        r4 = r4.item(r1);
        if (r4 == r7) goto L_0x0152;
        r6 = r4.getPrefix();
        r6 = r15.equals(r6);
        if (r6 != 0) goto L_0x0152;
        r6 = r4.getPrefix();
        if (r6 != 0) goto L_0x010f;
        r6 = r4.getNodeName();
        r6 = r15.equals(r6);
        if (r6 != 0) goto L_0x0152;
        r6 = defpackage.te.b(r4);
        if (r6 == 0) goto L_0x012c;
        if (r6 == r14) goto L_0x0152;
        if (r6 == r12) goto L_0x0122;
        if (r6 != r11) goto L_0x011c;
        goto L_0x0152;
        r0 = new ss;
        r0.<init>(r10, r2);
        throw r0;
        r4 = r4.getNodeValue();
        r6 = "rdf:resource";
        defpackage.te.a(r3, r6, r4);
        goto L_0x0152;
        if (r5 != 0) goto L_0x0137;
        r6 = r4.getNodeName();
        r4 = r4.getNodeValue();
        goto L_0x0128;
        r6 = r4.getNodeName();
        r6 = r13.equals(r6);
        if (r6 == 0) goto L_0x0149;
        r4 = r4.getNodeValue();
        defpackage.te.a(r3, r13, r4);
        goto L_0x0152;
        r6 = r4.getNodeValue();
        r9 = 0;
        defpackage.te.a(r0, r3, r4, r6, r9);
        goto L_0x0153;
        r9 = 0;
        r1 = r1 + 1;
        goto L_0x00e1;
        return;
        r0 = new ss;
        r1 = "Nested content not allowed with rdf:resource or property attributes";
        r0.<init>(r1, r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.b(tk, tm, org.w3c.dom.Node, boolean):void");
    }

    private static void b(tk tkVar, tm tmVar, Node node, boolean z, ua uaVar) {
        int i = 0;
        while (i < node.getChildNodes().getLength()) {
            Node item = node.getChildNodes().item(i);
            if (!te.a(item)) {
                if (item.getNodeType() != (short) 1) {
                    throw new ss("Expected property element node not found", 202);
                } else if (!tmVar.i().o() || i <= tmVar.i().b) {
                    te.c(tkVar, tmVar, item, z, uaVar);
                } else {
                    return;
                }
            }
            i++;
        }
    }

    private static boolean b(int i) {
        return 10 <= i && i <= 12;
    }

    private static void c() {
        throw new ss("ParseTypeOther property element not allowed", 203);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:75:0x0121 in {10, 12, 13, 14, 19, 31, 32, 38, 43, 47, 51, 55, 57, 59, 67, 68, 70, 72, 74} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void c(defpackage.tk r9, defpackage.tm r10, org.w3c.dom.Node r11, boolean r12, defpackage.ua r13) {
        /*
        r0 = defpackage.te.b(r11);
        r0 = defpackage.te.a(r0);
        if (r0 == 0) goto L_0x0117;
        r0 = r11.getAttributes();
        r1 = 0;
        r2 = 0;
        r3 = r1;
        r1 = 0;
        r4 = r0.getLength();
        if (r1 >= r4) goto L_0x0049;
        r4 = r0.item(r1);
        r5 = r4.getPrefix();
        r6 = "xmlns";
        r5 = r6.equals(r5);
        if (r5 != 0) goto L_0x0038;
        r5 = r4.getPrefix();
        if (r5 != 0) goto L_0x0046;
        r5 = r4.getNodeName();
        r5 = r6.equals(r5);
        if (r5 == 0) goto L_0x0046;
        if (r3 != 0) goto L_0x003f;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r4.getNodeName();
        r3.add(r4);
        r1 = r1 + 1;
        goto L_0x0012;
        if (r3 == 0) goto L_0x005f;
        r1 = r3.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x005f;
        r3 = r1.next();
        r3 = (java.lang.String) r3;
        r0.removeNamedItem(r3);
        goto L_0x004f;
        r1 = r0.getLength();
        r3 = 3;
        if (r1 > r3) goto L_0x0113;
        r1 = 0;
        r4 = r0.getLength();
        if (r1 >= r4) goto L_0x00ea;
        r4 = r0.item(r1);
        r5 = r4.getLocalName();
        r6 = r4.getNamespaceURI();
        r7 = r4.getNodeValue();
        r4 = r4.getNodeName();
        r8 = "xml:lang";
        r4 = r8.equals(r4);
        r8 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        if (r4 == 0) goto L_0x009d;
        r4 = "ID";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x009a;
        r4 = r8.equals(r6);
        if (r4 == 0) goto L_0x009a;
        goto L_0x009d;
        r1 = r1 + 1;
        goto L_0x0067;
        r0 = "datatype";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x00af;
        r0 = r8.equals(r6);
        if (r0 == 0) goto L_0x00af;
        defpackage.te.a(r9, r10, r11, r12);
        return;
        r0 = "parseType";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x00e6;
        r0 = r8.equals(r6);
        if (r0 != 0) goto L_0x00be;
        goto L_0x00e6;
        r0 = "Literal";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x00ca;
        defpackage.te.a();
        return;
        r0 = "Resource";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x00d6;
        defpackage.te.e(r9, r10, r11, r12, r13);
        return;
        r9 = "Collection";
        r9 = r9.equals(r7);
        if (r9 == 0) goto L_0x00e2;
        defpackage.te.b();
        return;
        defpackage.te.c();
        return;
        defpackage.te.b(r9, r10, r11, r12);
        return;
        r0 = r11.hasChildNodes();
        if (r0 == 0) goto L_0x0113;
        r0 = r11.getChildNodes();
        r0 = r0.getLength();
        if (r2 >= r0) goto L_0x010f;
        r0 = r11.getChildNodes();
        r0 = r0.item(r2);
        r0 = r0.getNodeType();
        if (r0 == r3) goto L_0x010c;
        defpackage.te.d(r9, r10, r11, r12, r13);
        return;
        r2 = r2 + 1;
        goto L_0x00f0;
        defpackage.te.a(r9, r10, r11, r12);
        return;
        defpackage.te.b(r9, r10, r11, r12);
        return;
        r9 = new ss;
        r10 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r11 = "Invalid property element name";
        r9.<init>(r11, r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.c(tk, tm, org.w3c.dom.Node, boolean, ua):void");
    }

    private static boolean c(int i) {
        return i > 0 && i <= 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:76:0x018a in {3, 12, 15, 20, 22, 23, 36, 40, 44, 51, 53, 58, 61, 64, 65, 68, 70, 71, 73, 75} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void d(defpackage.tk r8, defpackage.tm r9, org.w3c.dom.Node r10, boolean r11, defpackage.ua r12) {
        /*
        if (r11 == 0) goto L_0x000f;
        r0 = r10.getNodeName();
        r1 = "iX:changes";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x000f;
        return;
        r0 = "";
        r9 = defpackage.te.a(r8, r9, r10, r0, r11);
        r11 = 0;
        r0 = 0;
        r1 = r10.getAttributes();
        r1 = r1.getLength();
        r2 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r3 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        if (r0 >= r1) goto L_0x007f;
        r1 = r10.getAttributes();
        r1 = r1.item(r0);
        r4 = r1.getPrefix();
        r5 = "xmlns";
        r4 = r5.equals(r4);
        if (r4 != 0) goto L_0x007c;
        r4 = r1.getPrefix();
        if (r4 != 0) goto L_0x0049;
        r4 = r1.getNodeName();
        r4 = r5.equals(r4);
        if (r4 != 0) goto L_0x007c;
        r4 = r1.getLocalName();
        r5 = r1.getNamespaceURI();
        r6 = r1.getNodeName();
        r7 = "xml:lang";
        r6 = r7.equals(r6);
        if (r6 == 0) goto L_0x0065;
        r1 = r1.getNodeValue();
        defpackage.te.a(r9, r7, r1);
        goto L_0x007c;
        r1 = "ID";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x0074;
        r1 = r2.equals(r5);
        if (r1 == 0) goto L_0x0074;
        goto L_0x007c;
        r8 = new ss;
        r9 = "Invalid attribute for resource property element";
        r8.<init>(r9, r3);
        throw r8;
        r0 = r0 + 1;
        goto L_0x0017;
        r0 = 0;
        r1 = 0;
        r4 = r10.getChildNodes();
        r4 = r4.getLength();
        if (r0 >= r4) goto L_0x017f;
        r4 = r10.getChildNodes();
        r4 = r4.item(r0);
        r5 = defpackage.te.a(r4);
        r6 = 1;
        if (r5 != 0) goto L_0x017b;
        r5 = r4.getNodeType();
        if (r5 != r6) goto L_0x0169;
        if (r1 != 0) goto L_0x0169;
        r1 = r4.getNamespaceURI();
        r1 = r2.equals(r1);
        r5 = r4.getLocalName();
        if (r1 == 0) goto L_0x00c0;
        r7 = "Bag";
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x00c0;
        r1 = r9.i();
        r1.h();
        goto L_0x012b;
        if (r1 == 0) goto L_0x00d6;
        r7 = "Seq";
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x00d6;
        r1 = r9.i();
        r1 = r1.h();
        r1.j();
        goto L_0x012b;
        if (r1 == 0) goto L_0x00f0;
        r7 = "Alt";
        r7 = r7.equals(r5);
        if (r7 == 0) goto L_0x00f0;
        r1 = r9.i();
        r1 = r1.h();
        r1 = r1.j();
        r1.l();
        goto L_0x012b;
        r7 = r9.i();
        r7.d(r6);
        if (r1 != 0) goto L_0x012b;
        r1 = "Description";
        r1 = r1.equals(r5);
        if (r1 != 0) goto L_0x012b;
        r1 = r4.getNamespaceURI();
        if (r1 == 0) goto L_0x0121;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r1);
        r1 = 58;
        r7.append(r1);
        r7.append(r5);
        r1 = r7.toString();
        r5 = "rdf:type";
        defpackage.te.a(r9, r5, r1);
        goto L_0x012b;
        r8 = new ss;
        r9 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r10 = "All XML elements must be in a namespace";
        r8.<init>(r10, r9);
        throw r8;
        r1 = r9.i();
        r1 = r1.g();
        if (r1 == 0) goto L_0x014f;
        r1 = r12.b;
        r1 = java.util.Collections.unmodifiableMap(r1);
        r5 = r9.a;
        r1 = r1.get(r5);
        r1 = (java.lang.Integer) r1;
        if (r1 == 0) goto L_0x014f;
        r5 = r9.i();
        r1 = r1.intValue();
        r5.b = r1;
        defpackage.te.a(r8, r9, r4, r11, r12);
        r1 = r9.i;
        if (r1 == 0) goto L_0x015a;
        defpackage.te.a(r9);
        goto L_0x0167;
        r1 = r9.i();
        r1 = r1.k();
        if (r1 == 0) goto L_0x0167;
        defpackage.tn.c(r9);
        r1 = 1;
        goto L_0x017b;
        if (r1 == 0) goto L_0x0173;
        r8 = new ss;
        r9 = "Invalid child of resource property element";
        r8.<init>(r9, r3);
        throw r8;
        r8 = new ss;
        r9 = "Children of resource property element must be XML elements";
        r8.<init>(r9, r3);
        throw r8;
        r0 = r0 + 1;
        goto L_0x0081;
        if (r1 == 0) goto L_0x0182;
        return;
        r8 = new ss;
        r9 = "Missing child of resource property element";
        r8.<init>(r9, r3);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.d(tk, tm, org.w3c.dom.Node, boolean, ua):void");
    }

    private static void e(tk tkVar, tm tmVar, Node node, boolean z, ua uaVar) {
        tmVar = te.a(tkVar, tmVar, node, "", z);
        tmVar.i().d(true);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            String str = "xmlns";
            if (!(str.equals(item.getPrefix()) || (item.getPrefix() == null && str.equals(item.getNodeName())))) {
                String localName = item.getLocalName();
                str = item.getNamespaceURI();
                String str2 = "xml:lang";
                if (str2.equals(item.getNodeName())) {
                    te.a(tmVar, str2, item.getNodeValue());
                } else if (!("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(str) && ("ID".equals(localName) || "parseType".equals(localName)))) {
                    throw new ss("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        te.b(tkVar, tmVar, node, false, uaVar);
        if (tmVar.i) {
            te.a(tmVar);
        }
    }
}
