

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.*;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("GBK");
        //��ȡ�û���������
        String id = request.getParameter("car_id");

        //��ȡUserDaoʵ��
        DBOperate opt = new DBOperate();
        
        ArrayList<Track> tl = opt.searchById(id);
        // �ж�user�Ƿ�Ϊ��
        if(tl != null){
        // ת����LoginSuccess.jspҳ��
        //  getRequestDispatcher()������ת��
        	request.getRequestDispatcher("Main.jsp").forward(request, response);
        }else{
        // ��¼ʧ��
            request.getRequestDispatcher("Main.jsp").forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
