package com.example.PH39701_Lab5_6_0406.controller;

import com.example.PH39701_Lab5_6_0406.entity.HoaDon;
import com.example.PH39701_Lab5_6_0406.entity.KhachHang;
import com.example.PH39701_Lab5_6_0406.repository.HoaDonRepository;
import com.example.PH39701_Lab5_6_0406.repository.KhachHangRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HoaDonServlet", value = {
        "/hoa-don/hien-thi",
        "/hoa-don/view-update",
        "/hoa-don/delete",
        "/hoa-don/update"
})
public class HoaDonServlet extends HttpServlet {
    List<HoaDon> listHD = new ArrayList<>();
    HoaDonRepository repo = new HoaDonRepository();
    List<KhachHang> listKH = new ArrayList<>();
KhachHangRepository repo2=new KhachHangRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.HienThi(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdate(request, response);
        } else if (uri.contains("delete")) {
            this.Delete(request, response);
        }
    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("update")) {
            this.update(request, response);
        }
    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        HoaDon hd=repo.gtOnee(id);
        request.setAttribute("hd",hd);
        request.getRequestDispatcher("/view/Update.jsp").forward(request, response);

    }

    private void HienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listHD = repo.getAll();
        request.setAttribute("listHD", listHD);
        listKH=repo2.getAll();
        request.setAttribute("listKH", listKH);
        System.out.println("haha: "+listHD);
        request.getRequestDispatcher("/view/ListHoaDon.jsp").forward(request, response);
    }
    private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        HoaDon hd=repo.gtOnee(id);
        repo.delete(hd);
        response.sendRedirect("/hoa-don/hien-thi");
    }
    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ma=request.getParameter("maHoaDon");
        String tongTienHang=request.getParameter("tongTienHang");
        String tienThua=request.getParameter("tienThua");
        String ghiChu=request.getParameter("ghiChu");
        String maGiaoDich=request.getParameter("maGiaoDich");
        response.sendRedirect("/hoa-don/hien-thi");
    }
}
