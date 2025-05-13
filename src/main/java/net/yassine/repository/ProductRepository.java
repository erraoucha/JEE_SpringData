package net.yassine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.yassine.jpa_demo.entities.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{

}
