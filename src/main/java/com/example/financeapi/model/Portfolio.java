package com.example.financeapi.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@ToString
@Entity
public class Portfolio {
    List<Crypto> cryptoList;
    List<Stock> stockList;
}
