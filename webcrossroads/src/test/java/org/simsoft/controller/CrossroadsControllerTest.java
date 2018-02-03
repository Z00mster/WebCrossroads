package org.simsoft.controller;

import org.junit.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CrossroadsControllerTest extends ControllerTestBase {

    @Test
    public void testControllerGet() throws Exception {
        doGet("/").andExpect(status().isOk());
    }

}