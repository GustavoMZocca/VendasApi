package com.vendas.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vendas.api.models.Vendas;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long>{

}
