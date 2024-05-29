package com.damaralucena.desafio_picpay.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String fullName;

  @CPF
  @Column(unique = true)
  private String cpf;

  @Email
  @Column(unique = true)
  private String email;

  @NotBlank
  private String password;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "wallet_type_id")
  private WalletType walletType;

}
