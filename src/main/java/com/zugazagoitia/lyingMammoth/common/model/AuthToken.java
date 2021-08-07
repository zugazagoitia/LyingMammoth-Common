package com.zugazagoitia.lyingMammoth.common.model;

import lombok.Builder;
import lombok.Data;

import java.net.InetAddress;
import java.time.Instant;

@Data
@Builder
public class AuthToken {

	private transient User user;
	private String token;
	private Instant createdAt;
	private Instant lastActivityAt;
	private long lifetime; //in seconds
	private InetAddress ipAddress;
	private String agent; // User Agent / App that logs-in

	public void touch() {
		this.lastActivityAt = Instant.now();
	}
}
