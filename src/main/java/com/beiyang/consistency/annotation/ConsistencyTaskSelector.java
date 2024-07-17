package com.beiyang.consistency.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 导入框架相关配置
 *
 * @author beiyangli88
 **/

public class ConsistencyTaskSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{ComponentScanConfig.class.getName()};
    }

}
