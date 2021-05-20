package com.zugazagoitia.lyingMammoth.common.util.adapter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class InstantAdapterTest {

    @Test
    void toJson() {
        Moshi moshi = new Moshi.Builder().add(new InstantAdapter()).build();
        JsonAdapter<Instant> adapter = moshi.adapter(Instant.class);

        String instant = "2007-12-03T10:15:30Z";
        String instantJson = "\"2007-12-03T10:15:30Z\"";

        assertEquals(instantJson,adapter.toJson(Instant.parse(instant)));
    }

    @Test
    void fromJson() {
        Moshi moshi = new Moshi.Builder().add(new InstantAdapter()).build();
        JsonAdapter<Instant> adapter = moshi.adapter(Instant.class);

        String instant = "2007-12-03T10:15:30Z";
        String instantJson = "\"2007-12-03T10:15:30Z\"";

        try {
            assertEquals(Instant.parse(instant),adapter.fromJson(instantJson));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}