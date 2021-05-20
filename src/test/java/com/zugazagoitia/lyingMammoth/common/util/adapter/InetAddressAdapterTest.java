package com.zugazagoitia.lyingMammoth.common.util.adapter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

class InetAddressAdapterTest {

    @Test
    void toJson() {
        Moshi moshi = new Moshi.Builder().add(new InetAddressAdapter()).build();
        JsonAdapter<InetAddress> adapter = moshi.adapter(InetAddress.class);
        try {
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            assertEquals("\"127.0.0.1\"",adapter.toJson(ip));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    @Test
    void fromJson() {
        Moshi moshi = new Moshi.Builder().add(new InetAddressAdapter()).build();
        JsonAdapter<InetAddress> adapter = moshi.adapter(InetAddress.class);
        try {
            String ip = "\"127.0.0.1\"";
            assertEquals(InetAddress.getByName("127.0.0.1"),adapter.fromJson(ip));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}