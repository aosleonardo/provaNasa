package br.com.teste.contaazul.contaazul.model;

import br.com.teste.contaazul.contaazul.ContaAzulApplicationTests;
import br.com.teste.contaazul.contaazul.controller.MarsController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.fail;

public class MarsControllerTest extends ContaAzulApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    private MarsController marsController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(marsController).build();
    }

    @Test
    public void testEndPointMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/mml")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testComandosInvalidosMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/m3l")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void testRetornoMarsController() throws Exception {
        MvcResult result =  this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/mml"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        if(!"(0,2,W)".equals(result.getResponse().getContentAsString())) {
            fail();
        }
    }

    @Test
    public void testLimiteTerrenoXMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/mmmmmmmmmmm")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void testLimiteTerrenoYMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/rmmmmmm")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void testLimiteNegativoTerrenoXMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/lmm")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void testLimiteNegativoTerrenoYMarsController() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/rest/mars/llmm")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

}
