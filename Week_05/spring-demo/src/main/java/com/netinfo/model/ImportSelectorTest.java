package com.netinfo.model;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zy
 * @Description:
 * @Date 2020/11/18 14:59
 */
public class ImportSelectorTest implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.netinfo.model.Person3"};
    }
}
