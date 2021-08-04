/*******************************************************************************
 * Copyright (C) 2021 - Alberto Zugazagoitia
 * alberto (at) zugazagoitia.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option)any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 ******************************************************************************/

package com.zugazagoitia.lyingMammoth.common.util;


import io.jsonwebtoken.*;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Base64;

public class JsonSigner {

    private final KeyPair key;
    public static final SignatureAlgorithm algo = SignatureAlgorithm.RS512;
    public JsonSigner(PublicKey pub, PrivateKey priv) {
        key = new KeyPair(pub, priv);
    }

    public String signJWS(String payload) {
        return Jwts.builder()
                .setPayload(encode(payload))
                .signWith(key.getPrivate(),algo)
                .compact();
    }

    /**
     * Crear token JWT con la id de un usuario
     * @param userId La id de un usuario
     * @return token creado
     */
    public String createJWT(Integer userId){
        return Jwts.builder()
                .setIssuer("auth0")
                .claim("userid",userId)
                .signWith(key.getPrivate(),algo)
                .setExpiration(Date.valueOf(LocalDate.now().plus(1, ChronoUnit.YEARS)))
                .setIssuedAt(Date.valueOf(LocalDate.now()))
                .compact();
    }

    /**
     * Decodificar y verificar un token de JWT
     * @param token El token a comprobar
     * @return DecodedJWT si es correcto
     */
    public Jws<Claims> decodeJWT(String token) throws ExpiredJwtException,UnsupportedJwtException, MalformedJwtException, SecurityException, IllegalArgumentException{
        return Jwts.parserBuilder()
                .setSigningKey(key.getPublic())
                .requireIssuer("auth0")
                .build()
                .parseClaimsJws(token);
    }


    public String encode(String raw) {
        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }
}
