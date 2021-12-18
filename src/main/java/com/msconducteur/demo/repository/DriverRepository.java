package com.msconducteur.demo.repository;
import com.msconducteur.demo.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DriverRepository extends JpaRepository<Driver,Long>  {
}
