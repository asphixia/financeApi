package com.example.financeapi.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@Setter
@ToString
@Entity
public class Crypto {
    String symbol;
    String name;
    int currentPrice;
}
