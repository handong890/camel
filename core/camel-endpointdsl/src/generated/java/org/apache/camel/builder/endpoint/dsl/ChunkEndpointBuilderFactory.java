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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transform messages using Chunk templating engine.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ChunkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Chunk component.
     */
    public interface ChunkEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedChunkEndpointBuilder advanced() {
            return (AdvancedChunkEndpointBuilder) this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder allowTemplateFromHeader(
                boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder allowTemplateFromHeader(
                String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Whether the context map is limited to only include the message body
         * and headers (default). However access to the current Exchange and
         * CamelContext can be enabled by turning this option off. Doing so
         * impose a potential security risk as this opens access to the full
         * power of CamelContext API.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ChunkEndpointBuilder contextMapBodyAndHeadersOnly(
                boolean contextMapBodyAndHeadersOnly) {
            doSetProperty("contextMapBodyAndHeadersOnly", contextMapBodyAndHeadersOnly);
            return this;
        }
        /**
         * Whether the context map is limited to only include the message body
         * and headers (default). However access to the current Exchange and
         * CamelContext can be enabled by turning this option off. Doing so
         * impose a potential security risk as this opens access to the full
         * power of CamelContext API.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ChunkEndpointBuilder contextMapBodyAndHeadersOnly(
                String contextMapBodyAndHeadersOnly) {
            doSetProperty("contextMapBodyAndHeadersOnly", contextMapBodyAndHeadersOnly);
            return this;
        }
        /**
         * Define the encoding of the body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * Define the file extension of the template.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder extension(String extension) {
            doSetProperty("extension", extension);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ChunkEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Define the themes folder to scan.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeFolder(String themeFolder) {
            doSetProperty("themeFolder", themeFolder);
            return this;
        }
        /**
         * Define the theme layer to elaborate.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeLayer(String themeLayer) {
            doSetProperty("themeLayer", themeLayer);
            return this;
        }
        /**
         * Define the themes subfolder to scan.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeSubfolder(String themeSubfolder) {
            doSetProperty("themeSubfolder", themeSubfolder);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Chunk component.
     */
    public interface AdvancedChunkEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ChunkEndpointBuilder basic() {
            return (ChunkEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedChunkEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedChunkEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedChunkEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedChunkEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface ChunkBuilders {
        /**
         * Chunk (camel-chunk)
         * Transform messages using Chunk templating engine.
         * 
         * Category: transformation
         * Since: 2.15
         * Maven coordinates: org.apache.camel:camel-chunk
         * 
         * Syntax: <code>chunk:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         */
        default ChunkEndpointBuilder chunk(String path) {
            return ChunkEndpointBuilderFactory.chunk(path);
        }
    }
    /**
     * Chunk (camel-chunk)
     * Transform messages using Chunk templating engine.
     * 
     * Category: transformation
     * Since: 2.15
     * Maven coordinates: org.apache.camel:camel-chunk
     * 
     * Syntax: <code>chunk:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the resource. You can prefix with: classpath, file, http, ref, or
     * bean. classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod.
     */
    static ChunkEndpointBuilder chunk(String path) {
        class ChunkEndpointBuilderImpl extends AbstractEndpointBuilder implements ChunkEndpointBuilder, AdvancedChunkEndpointBuilder {
            public ChunkEndpointBuilderImpl(String path) {
                super("chunk", path);
            }
        }
        return new ChunkEndpointBuilderImpl(path);
    }
}