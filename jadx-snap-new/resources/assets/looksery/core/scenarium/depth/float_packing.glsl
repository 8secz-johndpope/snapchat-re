//-----------------------------------------------------------------------
// Copyright (c) 2019 Snap Inc.
//-----------------------------------------------------------------------

vec2 encode2( float v ) {
    vec2 enc = fract(vec2(1.0, 255.0) * v);
    enc.x -= enc.y/255.0;
    return enc;
}

float decode2( vec2 rg ) {
    return dot( rg, vec2(1.0, 1.0/255.0) );
}

vec2 textureDecode2(sampler2D tex, vec2 coord) {
#if __VERSION__ >= 300
    vec4 p = texture(tex, coord);
#else
    vec4 p = texture2D(tex, coord);
#endif
    return vec2(decode2(p.rg), decode2(p.ba));
}
