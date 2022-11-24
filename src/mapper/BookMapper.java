package mapper;

import domain.BookVO;

import java.util.List;

public interface BookMapper {
    public List<BookVO> getList();

    public void insert(BookVO board);

    public void insertSelectKey(BookVO board);

    public BookVO read(int bno);

    public int delete(int bno);

    public int update(BookVO board);

}
