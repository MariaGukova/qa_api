package com.qa.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@AllArgsConstructor
public enum Roles implements GrantedAuthority {
    Tester("Тестировщик"),
    Senior_Tester("Старший тестировщик"),
    Admin("Администратор");

    private final String name;

    @Override
    public String getAuthority() {
        return name();
    }
}
