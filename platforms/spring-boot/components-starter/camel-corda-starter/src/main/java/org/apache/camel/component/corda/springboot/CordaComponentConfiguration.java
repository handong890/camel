/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.corda.springboot;

import javax.annotation.Generated;
import net.corda.core.node.services.vault.PageSpecification;
import net.corda.core.node.services.vault.QueryCriteria;
import net.corda.core.node.services.vault.Sort;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The corda component uses corda-rpc to interact with corda nodes.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.corda")
public class CordaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the corda component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a shared configuration.
     */
    private CordaConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public CordaConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            CordaConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class CordaConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.corda.CordaConfiguration.class;
        /**
         * The url for the corda node
         */
        private String node;
        /**
         * Operation to use
         */
        private String operation;
        /**
         * Username for login
         */
        private String username;
        /**
         * Password for login
         */
        private String password;
        /**
         * Password for login
         */
        private String host;
        /**
         * Password for login
         */
        private Integer port;
        /**
         * Whether to process snapshots or not
         */
        private Boolean processSnapshot;
        /**
         * Whether to process snapshots or not
         */
        private Class flowLociClass;
        /**
         * Whether to process snapshots or not
         */
        private Object[] arguments;
        /**
         * Whether to process snapshots or not
         */
        private Class contractStateClass;
        /**
         * Whether to process snapshots or not
         */
        private QueryCriteria queryCriteria;
        /**
         * Whether to process snapshots or not
         */
        private PageSpecification pageSpecification;
        /**
         * Whether to process snapshots or not
         */
        private Sort sort;

        public String getNode() {
            return node;
        }

        public void setNode(String node) {
            this.node = node;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Boolean getProcessSnapshot() {
            return processSnapshot;
        }

        public void setProcessSnapshot(Boolean processSnapshot) {
            this.processSnapshot = processSnapshot;
        }

        public Class getFlowLociClass() {
            return flowLociClass;
        }

        public void setFlowLociClass(Class flowLociClass) {
            this.flowLociClass = flowLociClass;
        }

        public Object[] getArguments() {
            return arguments;
        }

        public void setArguments(Object[] arguments) {
            this.arguments = arguments;
        }

        public Class getContractStateClass() {
            return contractStateClass;
        }

        public void setContractStateClass(Class contractStateClass) {
            this.contractStateClass = contractStateClass;
        }

        public QueryCriteria getQueryCriteria() {
            return queryCriteria;
        }

        public void setQueryCriteria(QueryCriteria queryCriteria) {
            this.queryCriteria = queryCriteria;
        }

        public PageSpecification getPageSpecification() {
            return pageSpecification;
        }

        public void setPageSpecification(PageSpecification pageSpecification) {
            this.pageSpecification = pageSpecification;
        }

        public Sort getSort() {
            return sort;
        }

        public void setSort(Sort sort) {
            this.sort = sort;
        }
    }
}