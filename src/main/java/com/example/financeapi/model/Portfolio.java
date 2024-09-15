package com.example.financeapi.model;

import jakarta.persistence.*;
import lombok.*;
import com.example.financeapi.model.Crypto;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Entity
@Table(name = "portfolios")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    //List<Crypto> cryptoList;
    //List<Stock> stockList;
}
