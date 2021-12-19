package com.jungle.ch2.persistence;

import java.util.List;

import com.jungle.ch2.domain.QWebBoard;
import com.jungle.ch2.domain.WebBoard;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;


import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public interface WebBoardRepository extends CrudRepository<WebBoard, Long>, QuerydslPredicateExecutor<WebBoard> {

    public default Predicate makePredicate(String type, String keyword){

        BooleanBuilder builder = new BooleanBuilder();

        QWebBoard board = QWebBoard.webBoard;

        builder.and(board.bno.gt(0));

        if(type == null){
            return builder;
        }

        switch(type){
            case "t":
                builder.and(board.title.like("%" + keyword +"%"));
                break;
            case "c":
                builder.and(board.content.like("%" + keyword +"%"));
                break;
            case "w":
                builder.and(board.writer.like("%" + keyword +"%"));
                break;
        }

        return builder;
    }

}
