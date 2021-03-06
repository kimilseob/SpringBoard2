package kr.co.service;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardService {

	public void write(BoardVO boardVO) throws Exception;
	
	//게시물 목록보기
	public List<BoardVO> list() throws Exception;
	
	//게시물 내용조회
	public BoardVO read(int bno) throws Exception;
	
	//게시물 수정
	public void update(BoardVO boardVO) throws Exception;
		
	//게시물 삭제
	public void delete(int bno) throws Exception;
}
