<%--
  Created by IntelliJ IDEA.
  User: Admin BVCN88 02
  Date: 2024-04-01
  Time: 08:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<table class="table">
    <thead>
    <th>MaHD</th>
    <th>TongTH</th>
    <th>TienThua</th>
    <th>GhiChu</th>
    <th>MaGD</th>
    <td>TenKH</td>
    <th>Action</th>
    </thead>
    <tbody>
    <c:forEach items="${listHD}" var="h">
        <tr>
            <td>${h.maHoaDon}</td>
            <td>${h.tongTienHang}</td>
            <td>${h.tienThua}</td>
            <td>${h.ghiChu}</td>
            <td>${h.maGiaoDich}</td>
            <td>
                <c:forEach items="${listKH}" var="k">
                    <c:if test="${h.idKhachHang eq k.idKhachHang}">
                        ${k.tenKhachHang}
                    </c:if>
                </c:forEach>
            </td>
            <td>
<%--                <a href="/hoa-don/delete?id=${h.idHoaDon}">Remove</a>--%>
                <a href="/hoa-don/view-update?id=${h.idHoaDon}">Update</a>
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Remove
                </button>

                <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                Mi co muon xoa
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <a href="/hoa-don/delete?id=${h.idHoaDon}">Remove</a>
                            </div>
                        </div>
                    </div>
                </div>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
