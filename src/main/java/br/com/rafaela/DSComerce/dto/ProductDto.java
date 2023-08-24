package br.com.rafaela.DSComerce.dto;

import br.com.rafaela.DSComerce.entities.Category;
import br.com.rafaela.DSComerce.entities.OrderItem;
import br.com.rafaela.DSComerce.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    private Set<Category> categories = new HashSet<>();

    private Set<OrderItem> items = new HashSet<>();

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, Double price, String imgUrl, Set<Category> categories, Set<OrderItem> items) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
        this.categories = categories;
        this.items = items;
    }

    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public Set<OrderItem> getItems() {
        return items;
    }
}
