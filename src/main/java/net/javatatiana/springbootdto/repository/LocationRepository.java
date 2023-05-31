package net.javatatiana.springbootdto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.javatatiana.springbootdto.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}