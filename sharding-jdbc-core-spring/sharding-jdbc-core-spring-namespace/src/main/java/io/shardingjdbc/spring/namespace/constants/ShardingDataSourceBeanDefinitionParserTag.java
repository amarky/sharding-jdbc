/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package io.shardingjdbc.spring.namespace.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Sharding data source parser tag constants.
 * 
 * @author caohao
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ShardingDataSourceBeanDefinitionParserTag {
    
    public static final String ROOT_TAG = "data-source";
    
    public static final String SHARDING_RULE_CONFIG_TAG = "sharding-rule";
    
    public static final String CONFIG_MAP_TAG = "config-map";
    
    public static final String PROPS_TAG = "props";
    
    public static final String DATA_SOURCE_NAMES_TAG = "data-source-names";
    
    public static final String DEFAULT_DATA_SOURCE_NAME_TAG = "default-data-source-name";
    
    public static final String TABLE_RULES_TAG = "table-rules";
    
    public static final String TABLE_RULE_TAG = "table-rule";
    
    public static final String BINDING_TABLE_RULES_TAG = "binding-table-rules";
    
    public static final String BINDING_TABLE_RULE_TAG = "binding-table-rule";
    
    public static final String LOGIC_TABLE_ATTRIBUTE = "logic-table";
    
    public static final String LOGIC_TABLES_ATTRIBUTE = "logic-tables";
    
    public static final String ACTUAL_DATA_NODES_ATTRIBUTE = "actual-data-nodes";
    
    public static final String DATABASE_STRATEGY_REF_ATTRIBUTE = "database-strategy-ref";
    
    public static final String TABLE_STRATEGY_REF_ATTRIBUTE = "table-strategy-ref";
    
    public static final String DEFAULT_DATABASE_STRATEGY_REF_ATTRIBUTE = "default-database-strategy-ref";
    
    public static final String DEFAULT_TABLE_STRATEGY_REF_ATTRIBUTE = "default-table-strategy-ref";
    
    public static final String GENERATE_KEY_COLUMN = "generate-key-column";
    
    public static final String COLUMN_KEY_GENERATOR_CLASS = "column-key-generator-class";
    
    public static final String KEY_GENERATOR_CLASS = "key-generator-class";
    
    public static final String LOGIC_INDEX = "logic-index";
}
