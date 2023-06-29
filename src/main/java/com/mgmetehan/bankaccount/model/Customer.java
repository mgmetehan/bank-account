package com.mgmetehan.bankaccount.model;

import com.mgmetehan.bankaccount.core.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {
    private String name;
    private String surname;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Account> account = new HashSet<>();


    @Override
    public <T extends BaseEntity> void update(T entity) {

    }
}
