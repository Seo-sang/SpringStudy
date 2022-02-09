package webprj.service;

import java.sql.SQLException;
import java.util.List;

import webprj.entity.Notice;

public interface NoticeService {

	public List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	int getCount() throws ClassNotFoundException, SQLException;
	int insert(Notice notice) throws SQLException, ClassNotFoundException;
	int update(Notice notice) throws SQLException, ClassNotFoundException;
	int delete(int id) throws ClassNotFoundException, SQLException;

}
