package com.JohnnyCarvalho.loginandregisterpage.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JohnnyCarvalho.loginandregisterpage.models.UserDataModel;

@Repository
public interface UserDataRepository extends JpaRepository<UserDataModel, UUID> {

}
