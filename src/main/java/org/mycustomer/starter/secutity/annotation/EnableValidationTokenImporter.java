package org.mycustomer.starter.secutity.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class EnableValidationTokenImporter implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        return new String[]{
                "org.mycustomer.starter.secutity.WebSecurityConfig"
        };
    }
}
