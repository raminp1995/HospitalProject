package com.hospital.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<E> extends JpaRepository<E, Long>
{
    E findByFirstName(String name) throws Exception;
}
