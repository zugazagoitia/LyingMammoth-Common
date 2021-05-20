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

package com.zugazagoitia.lyingMammoth.common.util.adapter;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.ToJson;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressAdapter {
    @ToJson
    String toJson(InetAddress ip) {
        return ip.getHostAddress();
    }

    @FromJson
    InetAddress fromJson(String ipString) {
        try {
            return InetAddress.getByName(ipString);
        } catch (UnknownHostException e) {
            throw new JsonDataException("Unknown ip: " + ipString);
        }
    }
}
