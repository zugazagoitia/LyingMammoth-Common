package com.zugazagoitia.lyingMammoth.common.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private final Integer id;
	private String username;
	private transient String hashedPassword;
}
