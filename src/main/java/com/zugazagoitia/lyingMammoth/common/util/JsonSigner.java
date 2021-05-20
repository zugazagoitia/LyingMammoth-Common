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


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class JsonSigner {

    private final KeyPair key;

    public JsonSigner(PublicKey pub, PrivateKey priv) {
        key = new KeyPair(pub, priv);
    }

    public String signJWS(String payload) {
        return Jwts.builder()
                .setPayload(encode(payload))
                .signWith(key.getPrivate(),SignatureAlgorithm.RS512)
                .compact();
    }

    public String encode(String raw) {
        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }
}
