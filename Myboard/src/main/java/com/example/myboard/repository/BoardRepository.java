package com.example.myboard.repository;

import com.example.myboard.domain.Board;
import com.example.myboard.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository<Entity 클래스, PK 타입>
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitleContaining(String Keyword);

    Board findByUser(User user);

}
