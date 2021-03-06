/*-
 * #%L
 * jasmine-maven-plugin
 * %%
 * Copyright (C) 2010 - 2017 Justin Searls
 * %%
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
 * #L%
 */
package com.github.searls.jasmine.mojo;

import com.github.searls.jasmine.driver.WebDriverFactory;
import com.github.searls.jasmine.format.JasmineResultLogger;
import com.github.searls.jasmine.io.RelativizesFilePaths;
import com.github.searls.jasmine.runner.CreatesRunner;
import com.github.searls.jasmine.runner.SpecRunnerExecutor;
import com.github.searls.jasmine.server.ResourceHandlerConfigurator;
import org.eclipse.aether.RepositorySystem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Properties;

@ExtendWith(MockitoExtension.class)
public class TestMojoTest {

  @Mock
  private Properties properties;

  @Mock
  private RepositorySystem repositorySystem;

  @Mock
  private WebDriverFactory webDriverFactory;

  @Mock
  private RelativizesFilePaths relativizesFilePaths;

  @Mock
  private CreatesRunner createsRunner;

  @Mock
  private SpecRunnerExecutor specRunnerExecutor;

  @Mock
  private JasmineResultLogger jasmineResultLogger;

  @Mock
  private ResourceHandlerConfigurator resourceHandlerConfigurator;

  @InjectMocks
  private TestMojo mojo;

  @Test
  public void testExecuteIfSkipIsTrue() throws Exception {
    this.mojo.setSkipTests(true);
    this.mojo.execute();
  }
}
