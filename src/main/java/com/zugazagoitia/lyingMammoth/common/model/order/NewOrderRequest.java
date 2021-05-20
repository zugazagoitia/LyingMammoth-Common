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

import lombok.Data;

@Data
public class NewOrderRequest {

    /**
     * The order's target slave
     * @param slaveId new Slave's id
     * @return current Slave's id
     */
    private int slaveId;

    /**
     * Order type
     * @param type new Order type
     * @return current Order type
     */
    private OrderType type;

    /**
     * The order's payload
     * @param payload new payload
     * @return current payload
     */
    private Payload payload;
}
