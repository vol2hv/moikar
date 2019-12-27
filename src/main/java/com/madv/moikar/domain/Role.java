package com.madv.moikar.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_CLIENT ,ROLE_MANAGER, ROLE_TOP_MANAGER, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
