package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ChatModel;

@Repository
public interface ChatRepository extends JpaRepository<ChatModel,String> {

}
