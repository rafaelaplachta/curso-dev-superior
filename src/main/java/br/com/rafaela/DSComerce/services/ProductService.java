package br.com.rafaela.DSComerce.services;

import br.com.rafaela.DSComerce.dto.ProductDto;
import br.com.rafaela.DSComerce.entities.Product;
import br.com.rafaela.DSComerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDto findById(Long id) {

        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDto dto = new ProductDto(product);

        return dto;

    }
}
