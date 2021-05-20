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

package com.zugazagoitia.lyingMammoth.common.model.order;

public enum OrderType {

    PING(1),

    RESTART_CLIENT_APPLICATION(2),
    SHUTDOWN_CLIENT_APPLICATION(3),
    UNINSTALL_CLIENT_APPLICATION(4),

    SLEEP_CLIENT_SYSTEM(5),
    LOGOFF_CLIENT_SYSTEM(6),
    RESTART_CLIENT_SYSTEM(7),
    SHUTDOWN_CLIENT_SYSTEM(8),

    REMOTE_DESKTOP_START(9),

    REMOTE_MIC_START(10),

    REMOTE_CHAT_START(11),

    EXECUTE_CMD(12);


    private final int OrderType;

    OrderType(int OrderType) {
        this.OrderType = OrderType;
    }

    public int getOrderType() {
        return this.OrderType;
    }

}
