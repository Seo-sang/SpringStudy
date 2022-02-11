package webprj.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import webprj.entity.Notice;
import webprj.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request) throws ClassNotFoundException, SQLException {
		String p = request.getParameter("p");
		System.out.println(p);
		//List<Notice> list = noticeService.getList(1,  "TITLE", "");
		
		return "notice.list";
	}

	@RequestMapping("detail")
	public String detail() {
		return "notice.dtail";
	}
}
//62°­