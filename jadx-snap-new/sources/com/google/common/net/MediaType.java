package com.google.common.net;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.ppy;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public final class MediaType {
    public static final MediaType AAC_AUDIO;
    public static final MediaType ANY_APPLICATION_TYPE;
    public static final MediaType ANY_AUDIO_TYPE;
    public static final MediaType ANY_IMAGE_TYPE;
    public static final MediaType ANY_TEXT_TYPE;
    public static final MediaType ANY_TYPE;
    public static final MediaType ANY_VIDEO_TYPE;
    public static final MediaType APPLE_MOBILE_CONFIG;
    public static final MediaType APPLE_PASSBOOK;
    public static final MediaType APPLICATION_BINARY;
    public static final MediaType APPLICATION_XML_UTF_8;
    public static final MediaType ATOM_UTF_8;
    public static final MediaType BASIC_AUDIO;
    public static final MediaType BMP;
    public static final MediaType BZIP2;
    public static final MediaType CACHE_MANIFEST_UTF_8;
    public static final MediaType CRW;
    public static final MediaType CSS_UTF_8;
    public static final MediaType CSV_UTF_8;
    public static final MediaType DART_UTF_8;
    public static final MediaType EOT;
    public static final MediaType EPUB;
    public static final MediaType FLV_VIDEO;
    public static final MediaType FORM_DATA;
    public static final MediaType GIF;
    public static final MediaType GZIP;
    public static final MediaType HAL_JSON;
    public static final MediaType HTML_UTF_8;
    public static final MediaType ICO;
    public static final MediaType I_CALENDAR_UTF_8;
    public static final MediaType JAVASCRIPT_UTF_8;
    public static final MediaType JPEG;
    public static final MediaType JSON_UTF_8;
    public static final MediaType KEY_ARCHIVE;
    public static final MediaType KML;
    public static final MediaType KMZ;
    private static final Map<MediaType, MediaType> KNOWN_TYPES = Maps.newHashMap();
    public static final MediaType L16_AUDIO;
    public static final MediaType L24_AUDIO;
    private static final CharMatcher LINEAR_WHITE_SPACE = CharMatcher.anyOf(" \t\r\n");
    public static final MediaType MANIFEST_JSON_UTF_8;
    public static final MediaType MBOX;
    public static final MediaType MICROSOFT_EXCEL;
    public static final MediaType MICROSOFT_POWERPOINT;
    public static final MediaType MICROSOFT_WORD;
    public static final MediaType MP4_AUDIO;
    public static final MediaType MP4_VIDEO;
    public static final MediaType MPEG_AUDIO;
    public static final MediaType MPEG_VIDEO;
    public static final MediaType NACL_APPLICATION;
    public static final MediaType NACL_PORTABLE_APPLICATION;
    public static final MediaType OCTET_STREAM;
    public static final MediaType OGG_AUDIO;
    public static final MediaType OGG_CONTAINER;
    public static final MediaType OGG_VIDEO;
    public static final MediaType OOXML_DOCUMENT;
    public static final MediaType OOXML_PRESENTATION;
    public static final MediaType OOXML_SHEET;
    public static final MediaType OPENDOCUMENT_GRAPHICS;
    public static final MediaType OPENDOCUMENT_PRESENTATION;
    public static final MediaType OPENDOCUMENT_SPREADSHEET;
    public static final MediaType OPENDOCUMENT_TEXT;
    private static final MapJoiner PARAMETER_JOINER = Joiner.on("; ").withKeyValueSeparator("=");
    public static final MediaType PDF;
    public static final MediaType PLAIN_TEXT_UTF_8;
    public static final MediaType PNG;
    public static final MediaType POSTSCRIPT;
    public static final MediaType PROTOBUF;
    public static final MediaType PSD;
    public static final MediaType QUICKTIME;
    private static final CharMatcher QUOTED_TEXT_MATCHER = CharMatcher.ascii().and(CharMatcher.noneOf("\"\\\r"));
    public static final MediaType RDF_XML_UTF_8;
    public static final MediaType RTF_UTF_8;
    public static final MediaType SFNT;
    public static final MediaType SHOCKWAVE_FLASH;
    public static final MediaType SKETCHUP;
    public static final MediaType SOAP_XML_UTF_8;
    public static final MediaType SVG_UTF_8;
    public static final MediaType TAR;
    public static final MediaType TEXT_JAVASCRIPT_UTF_8;
    public static final MediaType THREE_GPP2_VIDEO;
    public static final MediaType THREE_GPP_VIDEO;
    public static final MediaType TIFF;
    private static final CharMatcher TOKEN_MATCHER = CharMatcher.ascii().and(CharMatcher.javaIsoControl().negate()).and(CharMatcher.isNot(' ')).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));
    public static final MediaType TSV_UTF_8;
    private static final ImmutableListMultimap<String, String> UTF_8_CONSTANT_PARAMETERS = ImmutableListMultimap.of("charset", Ascii.toLowerCase(Charsets.UTF_8.name()));
    public static final MediaType VCARD_UTF_8;
    public static final MediaType VND_REAL_AUDIO;
    public static final MediaType VND_WAVE_AUDIO;
    public static final MediaType VORBIS_AUDIO;
    public static final MediaType VTT_UTF_8;
    public static final MediaType WAX_AUDIO;
    public static final MediaType WEBM_AUDIO;
    public static final MediaType WEBM_VIDEO;
    public static final MediaType WEBP;
    public static final MediaType WMA_AUDIO;
    public static final MediaType WML_UTF_8;
    public static final MediaType WMV;
    public static final MediaType WOFF;
    public static final MediaType WOFF2;
    public static final MediaType XHTML_UTF_8;
    public static final MediaType XML_UTF_8;
    public static final MediaType XRD_UTF_8;
    public static final MediaType ZIP;
    private int hashCode;
    private final ImmutableListMultimap<String, String> parameters;
    private Optional<Charset> parsedCharset;
    private final String subtype;
    private String toString;
    private final String type;

    static final class Tokenizer {
        final String input;
        int position = 0;

        Tokenizer(String str) {
            this.input = str;
        }

        /* Access modifiers changed, original: final */
        public final char consumeCharacter(char c) {
            Preconditions.checkState(hasMore());
            Preconditions.checkState(previewChar() == c);
            this.position++;
            return c;
        }

        /* Access modifiers changed, original: final */
        public final char consumeCharacter(CharMatcher charMatcher) {
            Preconditions.checkState(hasMore());
            char previewChar = previewChar();
            Preconditions.checkState(charMatcher.matches(previewChar));
            this.position++;
            return previewChar;
        }

        /* Access modifiers changed, original: final */
        public final String consumeToken(CharMatcher charMatcher) {
            int i = this.position;
            String consumeTokenIfPresent = consumeTokenIfPresent(charMatcher);
            Preconditions.checkState(this.position != i);
            return consumeTokenIfPresent;
        }

        /* Access modifiers changed, original: final */
        public final String consumeTokenIfPresent(CharMatcher charMatcher) {
            Preconditions.checkState(hasMore());
            int i = this.position;
            this.position = charMatcher.negate().indexIn(this.input, i);
            return hasMore() ? this.input.substring(i, this.position) : this.input.substring(i);
        }

        /* Access modifiers changed, original: final */
        public final boolean hasMore() {
            int i = this.position;
            return i >= 0 && i < this.input.length();
        }

        /* Access modifiers changed, original: final */
        public final char previewChar() {
            Preconditions.checkState(hasMore());
            return this.input.charAt(this.position);
        }
    }

    static {
        String str = EventType.ANY;
        ANY_TYPE = createConstant(str, str);
        String str2 = "text";
        ANY_TEXT_TYPE = createConstant(str2, str);
        String str3 = "image";
        ANY_IMAGE_TYPE = createConstant(str3, str);
        String str4 = "audio";
        ANY_AUDIO_TYPE = createConstant(str4, str);
        String str5 = Event.VIDEO;
        ANY_VIDEO_TYPE = createConstant(str5, str);
        String str6 = "application";
        ANY_APPLICATION_TYPE = createConstant(str6, str);
        CACHE_MANIFEST_UTF_8 = createConstantUtf8(str2, "cache-manifest");
        CSS_UTF_8 = createConstantUtf8(str2, "css");
        CSV_UTF_8 = createConstantUtf8(str2, "csv");
        HTML_UTF_8 = createConstantUtf8(str2, "html");
        I_CALENDAR_UTF_8 = createConstantUtf8(str2, "calendar");
        PLAIN_TEXT_UTF_8 = createConstantUtf8(str2, "plain");
        str = "javascript";
        TEXT_JAVASCRIPT_UTF_8 = createConstantUtf8(str2, str);
        TSV_UTF_8 = createConstantUtf8(str2, "tab-separated-values");
        VCARD_UTF_8 = createConstantUtf8(str2, "vcard");
        WML_UTF_8 = createConstantUtf8(str2, "vnd.wap.wml");
        String str7 = "xml";
        XML_UTF_8 = createConstantUtf8(str2, str7);
        VTT_UTF_8 = createConstantUtf8(str2, "vtt");
        BMP = createConstant(str3, "bmp");
        CRW = createConstant(str3, "x-canon-crw");
        GIF = createConstant(str3, "gif");
        ICO = createConstant(str3, "vnd.microsoft.icon");
        JPEG = createConstant(str3, "jpeg");
        PNG = createConstant(str3, "png");
        PSD = createConstant(str3, "vnd.adobe.photoshop");
        SVG_UTF_8 = createConstantUtf8(str3, "svg+xml");
        TIFF = createConstant(str3, "tiff");
        WEBP = createConstant(str3, "webp");
        str2 = "mp4";
        MP4_AUDIO = createConstant(str4, str2);
        str3 = "mpeg";
        MPEG_AUDIO = createConstant(str4, str3);
        String str8 = "ogg";
        OGG_AUDIO = createConstant(str4, str8);
        String str9 = "webm";
        WEBM_AUDIO = createConstant(str4, str9);
        L16_AUDIO = createConstant(str4, "l16");
        L24_AUDIO = createConstant(str4, "l24");
        BASIC_AUDIO = createConstant(str4, "basic");
        AAC_AUDIO = createConstant(str4, "aac");
        VORBIS_AUDIO = createConstant(str4, "vorbis");
        WMA_AUDIO = createConstant(str4, "x-ms-wma");
        WAX_AUDIO = createConstant(str4, "x-ms-wax");
        VND_REAL_AUDIO = createConstant(str4, "vnd.rn-realaudio");
        VND_WAVE_AUDIO = createConstant(str4, "vnd.wave");
        MP4_VIDEO = createConstant(str5, str2);
        MPEG_VIDEO = createConstant(str5, str3);
        OGG_VIDEO = createConstant(str5, str8);
        QUICKTIME = createConstant(str5, "quicktime");
        WEBM_VIDEO = createConstant(str5, str9);
        WMV = createConstant(str5, "x-ms-wmv");
        FLV_VIDEO = createConstant(str5, "x-flv");
        THREE_GPP_VIDEO = createConstant(str5, "3gpp");
        THREE_GPP2_VIDEO = createConstant(str5, "3gpp2");
        APPLICATION_XML_UTF_8 = createConstantUtf8(str6, str7);
        ATOM_UTF_8 = createConstantUtf8(str6, "atom+xml");
        BZIP2 = createConstant(str6, "x-bzip2");
        DART_UTF_8 = createConstantUtf8(str6, "dart");
        APPLE_PASSBOOK = createConstant(str6, "vnd.apple.pkpass");
        EOT = createConstant(str6, "vnd.ms-fontobject");
        EPUB = createConstant(str6, "epub+zip");
        FORM_DATA = createConstant(str6, "x-www-form-urlencoded");
        KEY_ARCHIVE = createConstant(str6, "pkcs12");
        APPLICATION_BINARY = createConstant(str6, "binary");
        GZIP = createConstant(str6, "x-gzip");
        HAL_JSON = createConstant(str6, "hal+json");
        JAVASCRIPT_UTF_8 = createConstantUtf8(str6, str);
        JSON_UTF_8 = createConstantUtf8(str6, "json");
        MANIFEST_JSON_UTF_8 = createConstantUtf8(str6, "manifest+json");
        KML = createConstant(str6, "vnd.google-earth.kml+xml");
        KMZ = createConstant(str6, "vnd.google-earth.kmz");
        MBOX = createConstant(str6, "mbox");
        APPLE_MOBILE_CONFIG = createConstant(str6, "x-apple-aspen-config");
        MICROSOFT_EXCEL = createConstant(str6, "vnd.ms-excel");
        MICROSOFT_POWERPOINT = createConstant(str6, "vnd.ms-powerpoint");
        MICROSOFT_WORD = createConstant(str6, "msword");
        NACL_APPLICATION = createConstant(str6, "x-nacl");
        NACL_PORTABLE_APPLICATION = createConstant(str6, "x-pnacl");
        OCTET_STREAM = createConstant(str6, "octet-stream");
        OGG_CONTAINER = createConstant(str6, str8);
        OOXML_DOCUMENT = createConstant(str6, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        OOXML_PRESENTATION = createConstant(str6, "vnd.openxmlformats-officedocument.presentationml.presentation");
        OOXML_SHEET = createConstant(str6, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        OPENDOCUMENT_GRAPHICS = createConstant(str6, "vnd.oasis.opendocument.graphics");
        OPENDOCUMENT_PRESENTATION = createConstant(str6, "vnd.oasis.opendocument.presentation");
        OPENDOCUMENT_SPREADSHEET = createConstant(str6, "vnd.oasis.opendocument.spreadsheet");
        OPENDOCUMENT_TEXT = createConstant(str6, "vnd.oasis.opendocument.text");
        PDF = createConstant(str6, "pdf");
        POSTSCRIPT = createConstant(str6, "postscript");
        PROTOBUF = createConstant(str6, "protobuf");
        RDF_XML_UTF_8 = createConstantUtf8(str6, "rdf+xml");
        RTF_UTF_8 = createConstantUtf8(str6, "rtf");
        SFNT = createConstant(str6, "font-sfnt");
        SHOCKWAVE_FLASH = createConstant(str6, "x-shockwave-flash");
        SKETCHUP = createConstant(str6, "vnd.sketchup.skp");
        SOAP_XML_UTF_8 = createConstantUtf8(str6, "soap+xml");
        TAR = createConstant(str6, "x-tar");
        WOFF = createConstant(str6, "font-woff");
        WOFF2 = createConstant(str6, "font-woff2");
        XHTML_UTF_8 = createConstantUtf8(str6, "xhtml+xml");
        XRD_UTF_8 = createConstantUtf8(str6, "xrd+xml");
        ZIP = createConstant(str6, "zip");
    }

    private MediaType(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
        this.type = str;
        this.subtype = str2;
        this.parameters = immutableListMultimap;
    }

    private static MediaType addKnownType(MediaType mediaType) {
        KNOWN_TYPES.put(mediaType, mediaType);
        return mediaType;
    }

    private String computeToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.type);
        stringBuilder.append('/');
        stringBuilder.append(this.subtype);
        if (!this.parameters.isEmpty()) {
            stringBuilder.append("; ");
            PARAMETER_JOINER.appendTo(stringBuilder, Multimaps.transformValues(this.parameters, new Function<String, String>() {
                public String apply(String str) {
                    return MediaType.TOKEN_MATCHER.matchesAllOf(str) ? str : MediaType.escapeAndQuote(str);
                }
            }).entries());
        }
        return stringBuilder.toString();
    }

    public static MediaType create(String str, String str2) {
        MediaType create = create(str, str2, ImmutableListMultimap.of());
        create.parsedCharset = Optional.absent();
        return create;
    }

    private static MediaType create(String str, String str2, Multimap<String, String> multimap) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(multimap);
        str = normalizeToken(str);
        str2 = normalizeToken(str2);
        String str3 = EventType.ANY;
        boolean z = !str3.equals(str) || str3.equals(str2);
        Preconditions.checkArgument(z, "A wildcard type cannot be used with a non-wildcard subtype");
        Builder builder = ImmutableListMultimap.builder();
        for (Entry entry : multimap.entries()) {
            Object normalizeToken = normalizeToken((String) entry.getKey());
            builder.put(normalizeToken, normalizeParameterValue(normalizeToken, (String) entry.getValue()));
        }
        MediaType mediaType = new MediaType(str, str2, builder.build());
        return (MediaType) MoreObjects.firstNonNull(KNOWN_TYPES.get(mediaType), mediaType);
    }

    private static MediaType createConstant(String str, String str2) {
        MediaType addKnownType = addKnownType(new MediaType(str, str2, ImmutableListMultimap.of()));
        addKnownType.parsedCharset = Optional.absent();
        return addKnownType;
    }

    private static MediaType createConstantUtf8(String str, String str2) {
        MediaType addKnownType = addKnownType(new MediaType(str, str2, UTF_8_CONSTANT_PARAMETERS));
        addKnownType.parsedCharset = Optional.of(Charsets.UTF_8);
        return addKnownType;
    }

    private static String escapeAndQuote(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length() + 16);
        stringBuilder.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 13 || charAt == '\\' || charAt == '\"') {
                stringBuilder.append('\\');
            }
            stringBuilder.append(charAt);
        }
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }

    private static String normalizeParameterValue(String str, String str2) {
        return "charset".equals(str) ? Ascii.toLowerCase(str2) : str2;
    }

    private static String normalizeToken(String str) {
        Preconditions.checkArgument(TOKEN_MATCHER.matchesAllOf(str));
        return Ascii.toLowerCase(str);
    }

    private Map<String, ImmutableMultiset<String>> parametersAsMap() {
        return Maps.transformValues(this.parameters.asMap(), new Function<Collection<String>, ImmutableMultiset<String>>() {
            public ImmutableMultiset<String> apply(Collection<String> collection) {
                return ImmutableMultiset.copyOf(collection);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x00a9 in {12, 13, 14, 15, 16, 18, 21} preds:[]
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
    public static com.google.common.net.MediaType parse(java.lang.String r9) {
        /*
        com.google.common.base.Preconditions.checkNotNull(r9);
        r0 = new com.google.common.net.MediaType$Tokenizer;
        r0.<init>(r9);
        r1 = TOKEN_MATCHER;	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r0.consumeToken(r1);	 Catch:{ IllegalStateException -> 0x008f }
        r2 = 47;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r2 = TOKEN_MATCHER;	 Catch:{ IllegalStateException -> 0x008f }
        r2 = r0.consumeToken(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r3 = com.google.common.collect.ImmutableListMultimap.builder();	 Catch:{ IllegalStateException -> 0x008f }
        r4 = r0.hasMore();	 Catch:{ IllegalStateException -> 0x008f }
        if (r4 == 0) goto L_0x0086;	 Catch:{ IllegalStateException -> 0x008f }
        r4 = LINEAR_WHITE_SPACE;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeTokenIfPresent(r4);	 Catch:{ IllegalStateException -> 0x008f }
        r4 = 59;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r4);	 Catch:{ IllegalStateException -> 0x008f }
        r4 = LINEAR_WHITE_SPACE;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeTokenIfPresent(r4);	 Catch:{ IllegalStateException -> 0x008f }
        r4 = TOKEN_MATCHER;	 Catch:{ IllegalStateException -> 0x008f }
        r4 = r0.consumeToken(r4);	 Catch:{ IllegalStateException -> 0x008f }
        r5 = 61;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r5);	 Catch:{ IllegalStateException -> 0x008f }
        r5 = r0.previewChar();	 Catch:{ IllegalStateException -> 0x008f }
        r6 = 34;	 Catch:{ IllegalStateException -> 0x008f }
        if (r6 != r5) goto L_0x007c;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r6);	 Catch:{ IllegalStateException -> 0x008f }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x008f }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x008f }
        r7 = r0.previewChar();	 Catch:{ IllegalStateException -> 0x008f }
        if (r6 == r7) goto L_0x0074;	 Catch:{ IllegalStateException -> 0x008f }
        r7 = r0.previewChar();	 Catch:{ IllegalStateException -> 0x008f }
        r8 = 92;	 Catch:{ IllegalStateException -> 0x008f }
        if (r8 != r7) goto L_0x006a;	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r8);	 Catch:{ IllegalStateException -> 0x008f }
        r7 = com.google.common.base.CharMatcher.ascii();	 Catch:{ IllegalStateException -> 0x008f }
        r7 = r0.consumeCharacter(r7);	 Catch:{ IllegalStateException -> 0x008f }
        r5.append(r7);	 Catch:{ IllegalStateException -> 0x008f }
        goto L_0x004d;	 Catch:{ IllegalStateException -> 0x008f }
        r7 = QUOTED_TEXT_MATCHER;	 Catch:{ IllegalStateException -> 0x008f }
        r7 = r0.consumeToken(r7);	 Catch:{ IllegalStateException -> 0x008f }
        r5.append(r7);	 Catch:{ IllegalStateException -> 0x008f }
        goto L_0x004d;	 Catch:{ IllegalStateException -> 0x008f }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x008f }
        r0.consumeCharacter(r6);	 Catch:{ IllegalStateException -> 0x008f }
        goto L_0x0082;	 Catch:{ IllegalStateException -> 0x008f }
        r5 = TOKEN_MATCHER;	 Catch:{ IllegalStateException -> 0x008f }
        r5 = r0.consumeToken(r5);	 Catch:{ IllegalStateException -> 0x008f }
        r3.put(r4, r5);	 Catch:{ IllegalStateException -> 0x008f }
        goto L_0x001d;	 Catch:{ IllegalStateException -> 0x008f }
        r0 = r3.build();	 Catch:{ IllegalStateException -> 0x008f }
        r9 = create(r1, r2, r0);	 Catch:{ IllegalStateException -> 0x008f }
        return r9;
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Could not parse '";
        r2.<init>(r3);
        r2.append(r9);
        r9 = "'";
        r2.append(r9);
        r9 = r2.toString();
        r1.<init>(r9, r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.MediaType.parse(java.lang.String):com.google.common.net.MediaType");
    }

    public final Optional<Charset> charset() {
        Optional<Charset> optional = this.parsedCharset;
        if (optional == null) {
            Optional<Charset> absent = Optional.absent();
            UnmodifiableIterator it = this.parameters.get((Object) "charset").iterator();
            Optional<Charset> optional2 = absent;
            String str = null;
            optional = optional2;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str == null) {
                    optional = Optional.of(Charset.forName(str2));
                    str = str2;
                } else if (!str.equals(str2)) {
                    StringBuilder stringBuilder = new StringBuilder("Multiple charset values defined: ");
                    stringBuilder.append(str);
                    stringBuilder.append(ppy.d);
                    stringBuilder.append(str2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.parsedCharset = optional;
        }
        return optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaType) {
            MediaType mediaType = (MediaType) obj;
            return this.type.equals(mediaType.type) && this.subtype.equals(mediaType.subtype) && parametersAsMap().equals(mediaType.parametersAsMap());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        i = Objects.hashCode(this.type, this.subtype, parametersAsMap());
        this.hashCode = i;
        return i;
    }

    public final boolean is(MediaType mediaType) {
        String str = mediaType.type;
        String str2 = EventType.ANY;
        return (str.equals(str2) || mediaType.type.equals(this.type)) && ((mediaType.subtype.equals(str2) || mediaType.subtype.equals(this.subtype)) && this.parameters.entries().containsAll(mediaType.parameters.entries()));
    }

    public final ImmutableListMultimap<String, String> parameters() {
        return this.parameters;
    }

    public final String subtype() {
        return this.subtype;
    }

    public final String toString() {
        String str = this.toString;
        if (str != null) {
            return str;
        }
        str = computeToString();
        this.toString = str;
        return str;
    }

    public final String type() {
        return this.type;
    }

    public final MediaType withParameters(Multimap<String, String> multimap) {
        return create(this.type, this.subtype, multimap);
    }
}
