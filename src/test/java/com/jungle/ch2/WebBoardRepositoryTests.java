package com.jungle.ch2;

import com.jungle.ch2.domain.WebBoard;
import com.jungle.ch2.persistence.WebBoardRepository;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;

import java.util.stream.IntStream;

@SpringBootTest
@Log
@Commit
public class WebBoardRepositoryTests {

    @Autowired
    WebBoardRepository repo;

/*    @Test
    public void insertBoardDummies(){
        IntStream.range(0, 300).forEach(i ->{
            WebBoard board = new WebBoard();

            board.setTitle("Sample Board Title" + i);
            board.setContent("content Sample ..." + i + " of Board ");
            board.setWriter("user0" + (i % 10) );
            repo.save(board);
        });
    }*/

   /* @Test
    public void testList1(){
        Pageable pageable = PageRequest.of(0, 20, Sort.Direction.DESC, "bno");

        Page<WebBoard> result = (Page<WebBoard>) repo.findAll(

        );


    }*/
}
