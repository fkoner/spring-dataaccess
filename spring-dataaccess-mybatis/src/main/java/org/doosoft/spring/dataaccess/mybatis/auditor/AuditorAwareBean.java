package org.doosoft.spring.dataaccess.mybatis.auditor;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditorAwareBean implements AuditorAware<String> {

    public String getCurrentAuditor() {
            
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            
            String currentUser = null;
            
            if (authentication != null) {
                    currentUser = authentication.getName();
            } else {
                    currentUser = "admin";
            }
            
            return currentUser;
    }

}