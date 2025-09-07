package com.jwctech.symmetricjwtspringboot.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_scope", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "scope")
    private Set<String> scope = new HashSet<>();

}
