package com.pptaa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pptaa.domain.BoardVO;
import com.pptaa.domain.Criteria;

public interface BoardMapper {

//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	public BoardVO read(int bno);
	public int delete(int bno);
	public int update(BoardVO board);
	public int getTotalCount(Criteria cri);
}
