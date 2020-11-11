package com.pptaa.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pptaa.domain.BoardVO;
import com.pptaa.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("new title");
		board.setContent("new content");
		board.setWriter("new writer");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		
//		board.setTitle("new title select key");
//		board.setContent("new content select key");
//		board.setWriter("new writer select key");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(10);
		log.info(board);
	}
	
	@Test
	public void testDelete() {
		log.info("delete count : " + mapper.delete(100));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		
		board.setBno(15);
		board.setTitle("update title");
		board.setContent("update content");
		board.setWriter("update writer");
		
		log.info("update info : " + mapper.update(board));
	}
	
	@Test
	public void testPaging() {
		Criteria criteria = new Criteria();
		criteria.setAmount(10);
		criteria.setPageNum(4);
		List<BoardVO> list = mapper.getListWithPaging(criteria);
		
		list.forEach(board -> log.info(board));
	}
	
	
	
}
