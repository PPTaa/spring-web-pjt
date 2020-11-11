package com.pptaa.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pptaa.domain.BoardVO;
import com.pptaa.domain.Criteria;
import com.pptaa.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

//	@Setter(onMethod_ = {@Autowired})
	@Autowired
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info("+++++++++++++++++++++"+service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		
		board.setContent("testRegister");
		board.setTitle("testRegister");
		board.setWriter("testRegister");
		
		service.register(board);
		
		log.info("생성된 게시물의 번호 " + board.getBno());
	}
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(1, 10)).forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1));
	}
	
	@Test
	public void testModify() {
		BoardVO board = service.get(3);
		if (board == null) {
			return;
		}
		board.setTitle("제목 수정했음");
		log.info("modify result : "+service.modify(board));
	}
	
	@Test
	public void testRemove() {
		log.info("remove result : "+service.remove(5));
	}
	
}
