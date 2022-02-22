package com.freiberger.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freiberger.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
