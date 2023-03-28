package org.validation.secutity.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class EnableValidationTokenImporter implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        return new String[]{
                "org.validation.secutity.config.WebSecurityConfig"
        };
    }
}
