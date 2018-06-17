package io.devhub.bts.repository;

import org.springframework.data.repository.CrudRepository;

import io.devhub.bts.model.Login;

public interface LoginRepository extends CrudRepository<Login, String>
{

}
