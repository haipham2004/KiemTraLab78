<%--
  Created by IntelliJ IDEA.
  User: Admin BVCN88 02
  Date: 2024-04-01
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
<form action="/hoa-don/update?id=${hd.idHoaDon}" method="post">
    <div class="mt-3">
        <lable>Ma</lable>
        <input type="text" name="maHoaDon" value="${hd.maHoaDon}">
    </div>

    <div class="mt-3">
        <lable>Tong tien hang</lable>
        <input type="text" name="tongTienHang" value="${hd.tongTienHang}">
    </div>

    <div class="mt-3">
        <lable>tienThua</lable>
        <input type="text" name="tienThua" value="${hd.tienThua}">
    </div>

    <div class="mt-3">
        <lable>ghiChu</lable>
        <input type="text" name="ghiChu" value="${hd.ghiChu}">
    </div>

    <div class="mt-3">
        <lable>maGiaoDich</lable>
        <input type="text" name="maGiaoDich" value="${hd.maGiaoDich}">
    </div>
<%--    <button type="submit">Update</button>--%>

    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
        update
    </button>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="exampleModalLabel">Haha</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Cos muon update khong
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit">Update</button>
                </div>
            </div>
        </div>
    </div>


</form>
</body>
</html>
