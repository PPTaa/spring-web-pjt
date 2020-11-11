package com.pptaa.service;

import java.util.List;

import com.pptaa.domain.BoardVO;
import com.pptaa.domain.Criteria;

public interface BoardService {

	public void register(BoardVO board);
	public BoardVO get(int bno);
	public boolean modify(BoardVO board);
	public boolean remove(int bno);
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	public int getTotalCount(Criteria cri);
}
