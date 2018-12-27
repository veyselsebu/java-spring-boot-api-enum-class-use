package com.infotech.app.repository;
import java.util.List;

import com.infotech.app.entities.EnumDeneme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnumDenemeRepository extends JpaRepository<EnumDeneme,Long> {
}
