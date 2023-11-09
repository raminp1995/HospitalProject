package com.hospital.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface IBaseRepository<E> extends JpaRepository<E, Long>
{
    E findByName(String name) throws Exception;
}
