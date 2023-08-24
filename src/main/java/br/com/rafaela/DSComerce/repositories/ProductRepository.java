package br.com.rafaela.DSComerce.repositories;

import br.com.rafaela.DSComerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
