/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package techTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FizzBuzzControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void fizzBuzzController_GET_noParam_ShouldFailWithBadRequest() throws Exception {

        this.mvc.perform(get("/fizzbuzz"))
                .andDo(print()).andExpect(status().isBadRequest());
    }

    @Test
    public void fizzBuzzController_GET_param_ShouldReturnValidContent() throws Exception {

        this.mvc.perform(get("/fizzbuzz").param("inputInteger", "1"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("1"));
    }

    @Test
    public void fizzBuzzController_GET_pathVariable_ShouldReturnValidContent() throws Exception {

        this.mvc.perform(get("/fizzbuzz/2"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("2"));
    }

    @Test
    public void fizzBuzzController_GET_pathVariableInvalid_ShouldFailWithBadRequest() throws Exception {

        this.mvc.perform(get("/fizzbuzz/X"))
                .andDo(print()).andExpect(status().isBadRequest());
    }

}
